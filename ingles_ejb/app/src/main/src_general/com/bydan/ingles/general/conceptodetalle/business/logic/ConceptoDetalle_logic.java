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
package com.bydan.ingles.general.conceptodetalle.business.logic;


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
import com.bydan.ingles.general.conceptodetalle.util.*;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_param_return;
//import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalleParameterGeneral;
import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
//import com.bydan.ingles.general.conceptodetalle.business.logic.ConceptoDetalle_logic_add;
import com.bydan.ingles.general.conceptodetalle.business.data.*;
import com.bydan.ingles.general.conceptodetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.general.concepto.business.entity.Concepto;
import com.bydan.ingles.general.concepto.business.data.Concepto_data;
import com.bydan.ingles.general.concepto.business.logic.Concepto_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class ConceptoDetalle_logic  extends GeneralEntityLogic implements ConceptoDetalle_logicI {
	static Logger logger = Logger.getLogger("ConceptoDetalle_logic.class");	

	protected ConceptoDetalle_data conceptodetalleDataAccess; 	
	protected ConceptoDetalle conceptodetalle;
	protected List<ConceptoDetalle> conceptodetalles;
	protected Object conceptodetalleObject;	
	protected List<Object> conceptodetallesObject;
	
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
	
	
	
	
	
	
	public ConceptoDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.conceptodetalleDataAccess = new ConceptoDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			ConceptoDetalle_data.ActualizarQueries();
			
			//this.conceptodetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.conceptodetalles= new ArrayList<ConceptoDetalle>();
			this.conceptodetalle= new ConceptoDetalle();
			
			this.conceptodetalleObject=new Object();
			this.conceptodetallesObject=new ArrayList<Object>();
				
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
			
			this.conceptodetalleDataAccess.setConnexionType(this.connexionType);
			this.conceptodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public ConceptoDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.conceptodetalleDataAccess = new ConceptoDetalle_data();
			this.conceptodetalles= new ArrayList<ConceptoDetalle>();
			this.conceptodetalle= new ConceptoDetalle();
			this.conceptodetalleObject=new Object();
			this.conceptodetallesObject=new ArrayList<Object>();
			
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
			
			this.conceptodetalleDataAccess.setConnexionType(this.connexionType);
			this.conceptodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public ConceptoDetalle getConceptoDetalle() throws Exception {	
		//ConceptoDetalle_logic_add.checkConceptoDetalleToGet(conceptodetalle,this.datosCliente,this.arrDatoGeneral);
		//ConceptoDetalle_logic_add.updateConceptoDetalleToGet(conceptodetalle,this.arrDatoGeneral);
		
		return conceptodetalle;
	}
	
	public List<ConceptoDetalle> getConceptoDetalles() throws Exception {		
		if(this.conceptodetalles==null) {
			this.conceptodetalles= new ArrayList<ConceptoDetalle>();
		}
		
		this.quitarsNulos();
		
		//ConceptoDetalle_logic_add.checkConceptoDetalleToGets(conceptodetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (ConceptoDetalle conceptodetalleLocal: conceptodetalles ) {
			//ConceptoDetalle_logic_add.updateConceptoDetalleToGet(conceptodetalleLocal,this.arrDatoGeneral);
		}
		
		return conceptodetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.conceptodetalleDataAccess!=null) {
			this.conceptodetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			conceptodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			conceptodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		conceptodetalle = new  ConceptoDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
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
		conceptodetalle = new  ConceptoDetalle();
		  		  
        try {
			
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		conceptodetalle = new  ConceptoDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
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
		conceptodetalle = new  ConceptoDetalle();
		  		  
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
		conceptodetalle = new  ConceptoDetalle();
		  		  
        try {
			
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		conceptodetalle = new  ConceptoDetalle();
		  		  
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
		conceptodetalle = new  ConceptoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =conceptodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		conceptodetalle = new  ConceptoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=conceptodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		conceptodetalle = new  ConceptoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =conceptodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		conceptodetalle = new  ConceptoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=conceptodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		conceptodetalle = new  ConceptoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =conceptodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		conceptodetalle = new  ConceptoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=conceptodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		conceptodetalle = new  ConceptoDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
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
		conceptodetalle = new  ConceptoDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalle=conceptodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		  		  
        try {
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
		conceptodetalles = new  ArrayList<ConceptoDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(conceptodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(ConceptoDetalle conceptodetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(conceptodetalle.getIsNew() || conceptodetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<ConceptoDetalle> ConceptoDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(ConceptoDetalle conceptodetalleLocal:conceptodetalles) {				
			estaValidadoObjeto=this.validarGuardar(conceptodetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<ConceptoDetalle> ConceptoDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(conceptodetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(ConceptoDetalle ConceptoDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(conceptodetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(ConceptoDetalle conceptodetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+conceptodetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"conceptodetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(ConceptoDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(ConceptoDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSave(this.conceptodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ConceptoDetalle_logic_add.updateConceptoDetalleToSave(this.conceptodetalle,this.arrDatoGeneral);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.conceptodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ConceptoDetalle_util.permiteMantenimiento(this.conceptodetalle) && this.validarGuardar(this.conceptodetalle)) {
				ConceptoDetalle_data.save(this.conceptodetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);				
			}

			//ConceptoDetalle_logic_add.checkConceptoDetalleToSaveAfter(this.conceptodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.conceptodetalle.getIsDeleted()) {
				this.conceptodetalle=null;
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
			
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSave(this.conceptodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ConceptoDetalle_logic_add.updateConceptoDetalleToSave(this.conceptodetalle,this.arrDatoGeneral);
			
			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.conceptodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ConceptoDetalle_util.permiteMantenimiento(this.conceptodetalle) && this.validarGuardar(this.conceptodetalle)) {			
				ConceptoDetalle_data.save(this.conceptodetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.conceptodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);				
			}
			
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSaveAfter(this.conceptodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.conceptodetalle.getIsDeleted()) {
				this.conceptodetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSaves(conceptodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosConceptoDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ConceptoDetalle conceptodetalleLocal:conceptodetalles) {		
				
				if(!ConceptoDetalle_util.permiteMantenimiento(conceptodetalleLocal)) {
					continue;
				}
				
				//ConceptoDetalle_logic_add.updateConceptoDetalleToSave(conceptodetalleLocal,this.arrDatoGeneral);
	        	
				ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),conceptodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(conceptodetalleLocal)) {
					ConceptoDetalle_data.save(conceptodetalleLocal, connexion);				
				} else {
					validadoTodosConceptoDetalle=false;
				}
			}
			
			if(!validadoTodosConceptoDetalle) {
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
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}
			
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSavesAfter(conceptodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//ConceptoDetalle_logic_add.checkConceptoDetalleToSaves(conceptodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosConceptoDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ConceptoDetalle conceptodetalleLocal:conceptodetalles) {				
				if(!ConceptoDetalle_util.permiteMantenimiento(conceptodetalleLocal)) {
					continue;
				}
				
				//ConceptoDetalle_logic_add.updateConceptoDetalleToSave(conceptodetalleLocal,this.arrDatoGeneral);
	        	
				ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),conceptodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(conceptodetalleLocal)) {				
					ConceptoDetalle_data.save(conceptodetalleLocal, connexion);				
				} else {
					validadoTodosConceptoDetalle=false;
				}
			}
			
			if(!validadoTodosConceptoDetalle) {
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
				
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}

			//ConceptoDetalle_logic_add.checkConceptoDetalleToSavesAfter(conceptodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ConceptoDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ConceptoDetalle> conceptodetalles,ConceptoDetalle_param_return conceptodetalleParameterGeneral)throws Exception {
		 try {	
			ConceptoDetalle_param_return conceptodetalleReturnGeneral=new ConceptoDetalle_param_return();
	
			
			return conceptodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ConceptoDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ConceptoDetalle> conceptodetalles,ConceptoDetalle_param_return conceptodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			ConceptoDetalle_param_return conceptodetalleReturnGeneral=new ConceptoDetalle_param_return();
	
			
			this.connexion.commit();
			
			return conceptodetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ConceptoDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,ConceptoDetalle_param_return conceptodetalleParameterGeneral,Boolean isEsNuevoConceptoDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			ConceptoDetalle_param_return conceptodetalleReturnGeneral=new ConceptoDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				conceptodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return conceptodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public ConceptoDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ConceptoDetalle> conceptodetalles,ConceptoDetalle conceptodetalle,ConceptoDetalle_param_return conceptodetalleParameterGeneral,Boolean isEsNuevoConceptoDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			ConceptoDetalle_param_return conceptodetalleReturnGeneral=new ConceptoDetalle_param_return();
	
			conceptodetalleReturnGeneral.setConceptoDetalle(conceptodetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				conceptodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return conceptodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ConceptoDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,ConceptoDetalle_param_return conceptodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			ConceptoDetalle_param_return conceptodetalleReturnGeneral=new ConceptoDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.conceptodetalles=new ArrayList<ConceptoDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.conceptodetalle=new ConceptoDetalle();
				
				
				if(conColumnasBase) {this.conceptodetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.conceptodetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.conceptodetalle.setidea(arrColumnas[iColumn++]);
				this.conceptodetalle.settraduccion(arrColumnas[iColumn++]);
				this.conceptodetalle.setpronunciacion(arrColumnas[iColumn++]);
				
				this.conceptodetalles.add(this.conceptodetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			conceptodetalleReturnGeneral.setConRetornoEstaProcesado(true);
			conceptodetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return conceptodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<ConceptoDetalle> conceptodetallesAux= new ArrayList<ConceptoDetalle>();
		
		for(ConceptoDetalle conceptodetalle:conceptodetalles) {
			if(!conceptodetalle.getIsDeleted()) {
				conceptodetallesAux.add(conceptodetalle);
			}
		}
		
		conceptodetalles=conceptodetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<ConceptoDetalle> conceptodetallesAux= new ArrayList<ConceptoDetalle>();
		
		for(ConceptoDetalle conceptodetalle : this.conceptodetalles) {
			if(conceptodetalle==null) {
				conceptodetallesAux.add(conceptodetalle);
			}
		}
		
		//this.conceptodetalles=conceptodetallesAux;
		
		this.conceptodetalles.removeAll(conceptodetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(conceptodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((conceptodetalle.getIsDeleted() || (conceptodetalle.getIsChanged()&&!conceptodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=conceptodetalleDataAccess.getSetVersionRow(connexion,conceptodetalle.getId());
				
				if(!conceptodetalle.getVersionRow().equals(timestamp)) {	
					conceptodetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				conceptodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(conceptodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((conceptodetalle.getIsDeleted() || (conceptodetalle.getIsChanged()&&!conceptodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=conceptodetalleDataAccess.getSetVersionRow(connexion,conceptodetalle.getId());
			
			try {							
				if(!conceptodetalle.getVersionRow().equals(timestamp)) {	
					conceptodetalle.setVersionRow(timestamp);
				}
				
				conceptodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(conceptodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(ConceptoDetalle conceptodetalleAux:conceptodetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(conceptodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(conceptodetalleAux.getIsDeleted() || (conceptodetalleAux.getIsChanged()&&!conceptodetalleAux.getIsNew())) {
						
						timestamp=conceptodetalleDataAccess.getSetVersionRow(connexion,conceptodetalleAux.getId());
						
						if(!conceptodetalle.getVersionRow().equals(timestamp)) {	
							conceptodetalleAux.setVersionRow(timestamp);
						}
								
						conceptodetalleAux.setIsChangedAuxiliar(false);														
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
		if(conceptodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(ConceptoDetalle conceptodetalleAux:conceptodetalles) {
					if(conceptodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(conceptodetalleAux.getIsDeleted() || (conceptodetalleAux.getIsChanged()&&!conceptodetalleAux.getIsNew())) {
						
						timestamp=conceptodetalleDataAccess.getSetVersionRow(connexion,conceptodetalleAux.getId());
						
						if(!conceptodetalleAux.getVersionRow().equals(timestamp)) {	
							conceptodetalleAux.setVersionRow(timestamp);
						}
						
													
						conceptodetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public ConceptoDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalConcepto) throws Exception {
		ConceptoDetalle_param_return  conceptodetalle_return =new ConceptoDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyConceptoDetalleWithConnection");
			
			this.connexion.begin();
			
			conceptodetalle_return =new ConceptoDetalle_param_return();
			
			

			List<Concepto> conceptosForeignKey=new ArrayList<Concepto>();
			Concepto_logic conceptoLogic=new Concepto_logic();
			conceptoLogic.setConnexion(this.connexion);
			conceptoLogic.getConceptoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalConcepto.equals("NONE")) {
				conceptoLogic.getTodos(finalQueryGlobalConcepto,new Pagination());
				conceptosForeignKey=conceptoLogic.getConceptos();
			}

			conceptodetalle_return.setconceptosFK(conceptosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return conceptodetalle_return;
	}
	
	public ConceptoDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalConcepto) throws Exception {
		ConceptoDetalle_param_return  conceptodetalle_return =new ConceptoDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			conceptodetalle_return =new ConceptoDetalle_param_return();
			
			

			List<Concepto> conceptosForeignKey=new ArrayList<Concepto>();
			Concepto_logic conceptoLogic=new Concepto_logic();
			conceptoLogic.setConnexion(this.connexion);
			conceptoLogic.getConceptoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalConcepto.equals("NONE")) {
				conceptoLogic.getTodos(finalQueryGlobalConcepto,new Pagination());
				conceptosForeignKey=conceptoLogic.getConceptos();
			}

			conceptodetalle_return.setconceptosFK(conceptosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return conceptodetalle_return;
	}
	
	
	public void deepLoad(ConceptoDetalle conceptodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//ConceptoDetalle_logic_add.updateConceptoDetalleToGet(conceptodetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
		Concepto_logic conceptoLogic= new Concepto_logic(connexion);
		conceptoLogic.deepLoad(conceptodetalle.getConcepto(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
				Concepto_logic conceptoLogic= new Concepto_logic(connexion);
				conceptoLogic.deepLoad(conceptodetalle.getConcepto(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			conceptodetalle.setConcepto(conceptodetalleDataAccess.getConcepto(connexion,conceptodetalle));
			Concepto_logic conceptoLogic= new Concepto_logic(connexion);
			conceptoLogic.deepLoad(conceptodetalle.getConcepto(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(ConceptoDetalle conceptodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//ConceptoDetalle_logic_add.updateConceptoDetalleToSave(conceptodetalle,this.arrDatoGeneral);
			
ConceptoDetalle_data.save(conceptodetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Concepto_data.save(conceptodetalle.getConcepto(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				Concepto_data.save(conceptodetalle.getConcepto(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Concepto_data.save(conceptodetalle.getConcepto(),connexion);
		Concepto_logic conceptoLogic= new Concepto_logic(connexion);
		conceptoLogic.deepLoad(conceptodetalle.getConcepto(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Concepto.class)) {
				Concepto_data.save(conceptodetalle.getConcepto(),connexion);
				Concepto_logic conceptoLogic= new Concepto_logic(connexion);
				conceptoLogic.deepSave(conceptodetalle.getConcepto(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(ConceptoDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ConceptoDetalle_util.refrescarFKsDescripciones(conceptodetalle);
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
			this.deepLoad(this.conceptodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ConceptoDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(conceptodetalles!=null) {
				for(ConceptoDetalle conceptodetalle:conceptodetalles) {
					this.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					ConceptoDetalle_util.refrescarFKsDescripciones(conceptodetalles);
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
			if(conceptodetalles!=null) {
				for(ConceptoDetalle conceptodetalle:conceptodetalles) {
					this.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					ConceptoDetalle_util.refrescarFKsDescripciones(conceptodetalles);
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
			this.getNewConnexionToDeep(ConceptoDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(conceptodetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(ConceptoDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(conceptodetalles!=null) {
				for(ConceptoDetalle conceptodetalle:conceptodetalles) {
					this.deepSave(conceptodetalle,isDeep,deepLoadType,clases);
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
			if(conceptodetalles!=null) {
				for(ConceptoDetalle conceptodetalle:conceptodetalles) {
					this.deepSave(conceptodetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdConceptoWithConnection(String sFinalQuery,Pagination pagination,Long id_concepto)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ConceptoDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidConcepto= new ParameterSelectionGeneral();
			parameterSelectionGeneralidConcepto.setParameterSelectionGeneralEqual(ParameterType.LONG,id_concepto,ConceptoDetalle_util.IDCONCEPTO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidConcepto);

			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdConcepto","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdConcepto(String sFinalQuery,Pagination pagination,Long id_concepto)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidConcepto= new ParameterSelectionGeneral();
			parameterSelectionGeneralidConcepto.setParameterSelectionGeneralEqual(ParameterType.LONG,id_concepto,ConceptoDetalle_util.IDCONCEPTO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidConcepto);

			ConceptoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdConcepto","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptodetalles=conceptodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ConceptoDetalle_util.refrescarFKsDescripciones(this.conceptodetalles);
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
			if(ConceptoDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,ConceptoDetalle conceptodetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ConceptoDetalle_util.IS_CON_AUDITORIA) {
				if(conceptodetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDetalleDataAccess.TABLENAME, conceptodetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ConceptoDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////ConceptoDetalle_logic.registrarAuditoriaDetalles(connexion,conceptodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(conceptodetalle.getIsDeleted()) {
					/*if(!conceptodetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ConceptoDetalleDataAccess.TABLENAME, conceptodetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////ConceptoDetalle_logic.registrarAuditoriaDetalles(connexion,conceptodetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDetalleDataAccess.TABLENAME, conceptodetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(conceptodetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDetalleDataAccess.TABLENAME, conceptodetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ConceptoDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////ConceptoDetalle_logic.registrarAuditoriaDetalles(connexion,conceptodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,ConceptoDetalle conceptodetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(conceptodetalle.getIsNew()||!conceptodetalle.getid_concepto().equals(conceptodetalle.getConceptoDetalleOriginal().getid_concepto()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(conceptodetalle.getConceptoDetalleOriginal().getid_concepto()!=null)
				{
					strValorActual=conceptodetalle.getConceptoDetalleOriginal().getid_concepto().toString();
				}
				if(conceptodetalle.getid_concepto()!=null)
				{
					strValorNuevo=conceptodetalle.getid_concepto().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoDetalleConstantesFunciones.IDCONCEPTO,strValorActual,strValorNuevo);
			}	
			
			if(conceptodetalle.getIsNew()||!conceptodetalle.getidea().equals(conceptodetalle.getConceptoDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(conceptodetalle.getConceptoDetalleOriginal().getidea()!=null)
				{
					strValorActual=conceptodetalle.getConceptoDetalleOriginal().getidea();
				}
				if(conceptodetalle.getidea()!=null)
				{
					strValorNuevo=conceptodetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(conceptodetalle.getIsNew()||!conceptodetalle.gettraduccion().equals(conceptodetalle.getConceptoDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(conceptodetalle.getConceptoDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=conceptodetalle.getConceptoDetalleOriginal().gettraduccion();
				}
				if(conceptodetalle.gettraduccion()!=null)
				{
					strValorNuevo=conceptodetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(conceptodetalle.getIsNew()||!conceptodetalle.getpronunciacion().equals(conceptodetalle.getConceptoDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(conceptodetalle.getConceptoDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=conceptodetalle.getConceptoDetalleOriginal().getpronunciacion();
				}
				if(conceptodetalle.getpronunciacion()!=null)
				{
					strValorNuevo=conceptodetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(ConceptoDetalle conceptodetalle) throws Exception {

		if(!conceptodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(conceptodetalle,true);
		}
	}

	public void saveRelaciones(ConceptoDetalle conceptodetalle)throws Exception {

		if(!conceptodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(conceptodetalle,false);
		}
	}

	public void saveRelacionesBase(ConceptoDetalle conceptodetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("ConceptoDetalle-saveRelacionesWithConnection");}
	

			this.setConceptoDetalle(conceptodetalle);

			if(true) {

				//ConceptoDetalle_logic_add.updateRelacionesToSave(conceptodetalle,this);

				if((conceptodetalle.getIsNew()||conceptodetalle.getIsChanged())&&!conceptodetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(conceptodetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//ConceptoDetalle_logic_add.updateRelacionesToSaveAfter(conceptodetalle,this);

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
			ArrayList<Classe> classes=ConceptoDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ConceptoDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setConceptoDetalle(ConceptoDetalle newConceptoDetalle) {
		this.conceptodetalle = newConceptoDetalle;
	}
	
	public ConceptoDetalle_data getConceptoDetalleDataAccess() {
		return conceptodetalleDataAccess;
	}
	
	public void setConceptoDetalleDataAccess(ConceptoDetalle_data newconceptodetalleDataAccess) {
		this.conceptodetalleDataAccess = newconceptodetalleDataAccess;
	}

	public void setConceptoDetalles(List<ConceptoDetalle> newConceptoDetalles) {
		this.conceptodetalles = newConceptoDetalles;
	}
	
	public Object getConceptoDetalleObject() {	
		this.conceptodetalleObject=this.conceptodetalleDataAccess.getEntityObject();
		return this.conceptodetalleObject;
	}
		
	public void setConceptoDetalleObject(Object newConceptoDetalleObject) {
		this.conceptodetalleObject = newConceptoDetalleObject;
	}
	
	public List<Object> getConceptoDetallesObject() {		
		this.conceptodetallesObject=this.conceptodetalleDataAccess.getEntitiesObject();
		return this.conceptodetallesObject;
	}
		
	public void setConceptoDetallesObject(List<Object> newConceptoDetallesObject) {
		this.conceptodetallesObject = newConceptoDetallesObject;
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
