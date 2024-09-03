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
package com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic;


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
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_param_return;
//import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalleParameterGeneral;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
//import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic_add;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.*;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.VerboCompuesto_data;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class VerboCompuestoDetalle_logic  extends GeneralEntityLogic implements VerboCompuestoDetalle_logicI {
	static Logger logger = Logger.getLogger("VerboCompuestoDetalle_logic.class");	

	protected VerboCompuestoDetalle_data verbocompuestodetalleDataAccess; 	
	protected VerboCompuestoDetalle verbocompuestodetalle;
	protected List<VerboCompuestoDetalle> verbocompuestodetalles;
	protected Object verbocompuestodetalleObject;	
	protected List<Object> verbocompuestodetallesObject;
	
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
	
	
	
	
	
	
	public VerboCompuestoDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.verbocompuestodetalleDataAccess = new VerboCompuestoDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			VerboCompuestoDetalle_data.ActualizarQueries();
			
			//this.verbocompuestodetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
			this.verbocompuestodetalle= new VerboCompuestoDetalle();
			
			this.verbocompuestodetalleObject=new Object();
			this.verbocompuestodetallesObject=new ArrayList<Object>();
				
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
			
			this.verbocompuestodetalleDataAccess.setConnexionType(this.connexionType);
			this.verbocompuestodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public VerboCompuestoDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.verbocompuestodetalleDataAccess = new VerboCompuestoDetalle_data();
			this.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
			this.verbocompuestodetalle= new VerboCompuestoDetalle();
			this.verbocompuestodetalleObject=new Object();
			this.verbocompuestodetallesObject=new ArrayList<Object>();
			
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
			
			this.verbocompuestodetalleDataAccess.setConnexionType(this.connexionType);
			this.verbocompuestodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public VerboCompuestoDetalle getVerboCompuestoDetalle() throws Exception {	
		//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToGet(verbocompuestodetalle,this.datosCliente,this.arrDatoGeneral);
		//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToGet(verbocompuestodetalle,this.arrDatoGeneral);
		
		return verbocompuestodetalle;
	}
	
	public List<VerboCompuestoDetalle> getVerboCompuestoDetalles() throws Exception {		
		if(this.verbocompuestodetalles==null) {
			this.verbocompuestodetalles= new ArrayList<VerboCompuestoDetalle>();
		}
		
		this.quitarsNulos();
		
		//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToGets(verbocompuestodetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (VerboCompuestoDetalle verbocompuestodetalleLocal: verbocompuestodetalles ) {
			//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToGet(verbocompuestodetalleLocal,this.arrDatoGeneral);
		}
		
		return verbocompuestodetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.verbocompuestodetalleDataAccess!=null) {
			this.verbocompuestodetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			verbocompuestodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			verbocompuestodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
        try {
			
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
        try {
			
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  		  
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =verbocompuestodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=verbocompuestodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =verbocompuestodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=verbocompuestodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =verbocompuestodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=verbocompuestodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
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
		verbocompuestodetalle = new  VerboCompuestoDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalle=verbocompuestodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		  		  
        try {
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
		verbocompuestodetalles = new  ArrayList<VerboCompuestoDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verbocompuestodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(VerboCompuestoDetalle verbocompuestodetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(verbocompuestodetalle.getIsNew() || verbocompuestodetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<VerboCompuestoDetalle> VerboCompuestoDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(VerboCompuestoDetalle verbocompuestodetalleLocal:verbocompuestodetalles) {				
			estaValidadoObjeto=this.validarGuardar(verbocompuestodetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<VerboCompuestoDetalle> VerboCompuestoDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verbocompuestodetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(VerboCompuestoDetalle VerboCompuestoDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verbocompuestodetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(VerboCompuestoDetalle verbocompuestodetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+verbocompuestodetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"verbocompuestodetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(VerboCompuestoDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(VerboCompuestoDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSave(this.verbocompuestodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToSave(this.verbocompuestodetalle,this.arrDatoGeneral);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verbocompuestodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboCompuestoDetalle_util.permiteMantenimiento(this.verbocompuestodetalle) && this.validarGuardar(this.verbocompuestodetalle)) {
				VerboCompuestoDetalle_data.save(this.verbocompuestodetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);				
			}

			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSaveAfter(this.verbocompuestodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.verbocompuestodetalle.getIsDeleted()) {
				this.verbocompuestodetalle=null;
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
			
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSave(this.verbocompuestodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToSave(this.verbocompuestodetalle,this.arrDatoGeneral);
			
			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verbocompuestodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboCompuestoDetalle_util.permiteMantenimiento(this.verbocompuestodetalle) && this.validarGuardar(this.verbocompuestodetalle)) {			
				VerboCompuestoDetalle_data.save(this.verbocompuestodetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verbocompuestodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);				
			}
			
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSaveAfter(this.verbocompuestodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.verbocompuestodetalle.getIsDeleted()) {
				this.verbocompuestodetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSaves(verbocompuestodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVerboCompuestoDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboCompuestoDetalle verbocompuestodetalleLocal:verbocompuestodetalles) {		
				
				if(!VerboCompuestoDetalle_util.permiteMantenimiento(verbocompuestodetalleLocal)) {
					continue;
				}
				
				//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToSave(verbocompuestodetalleLocal,this.arrDatoGeneral);
	        	
				VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verbocompuestodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verbocompuestodetalleLocal)) {
					VerboCompuestoDetalle_data.save(verbocompuestodetalleLocal, connexion);				
				} else {
					validadoTodosVerboCompuestoDetalle=false;
				}
			}
			
			if(!validadoTodosVerboCompuestoDetalle) {
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
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}
			
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSavesAfter(verbocompuestodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSaves(verbocompuestodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVerboCompuestoDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboCompuestoDetalle verbocompuestodetalleLocal:verbocompuestodetalles) {				
				if(!VerboCompuestoDetalle_util.permiteMantenimiento(verbocompuestodetalleLocal)) {
					continue;
				}
				
				//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToSave(verbocompuestodetalleLocal,this.arrDatoGeneral);
	        	
				VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verbocompuestodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verbocompuestodetalleLocal)) {				
					VerboCompuestoDetalle_data.save(verbocompuestodetalleLocal, connexion);				
				} else {
					validadoTodosVerboCompuestoDetalle=false;
				}
			}
			
			if(!validadoTodosVerboCompuestoDetalle) {
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
				
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}

			//VerboCompuestoDetalle_logic_add.checkVerboCompuestoDetalleToSavesAfter(verbocompuestodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboCompuestoDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboCompuestoDetalle> verbocompuestodetalles,VerboCompuestoDetalle_param_return verbocompuestodetalleParameterGeneral)throws Exception {
		 try {	
			VerboCompuestoDetalle_param_return verbocompuestodetalleReturnGeneral=new VerboCompuestoDetalle_param_return();
	
			
			return verbocompuestodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboCompuestoDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboCompuestoDetalle> verbocompuestodetalles,VerboCompuestoDetalle_param_return verbocompuestodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuestoDetalle_param_return verbocompuestodetalleReturnGeneral=new VerboCompuestoDetalle_param_return();
	
			
			this.connexion.commit();
			
			return verbocompuestodetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboCompuestoDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboCompuestoDetalle> verbocompuestodetalles,VerboCompuestoDetalle verbocompuestodetalle,VerboCompuestoDetalle_param_return verbocompuestodetalleParameterGeneral,Boolean isEsNuevoVerboCompuestoDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			VerboCompuestoDetalle_param_return verbocompuestodetalleReturnGeneral=new VerboCompuestoDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verbocompuestodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return verbocompuestodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public VerboCompuestoDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboCompuestoDetalle> verbocompuestodetalles,VerboCompuestoDetalle verbocompuestodetalle,VerboCompuestoDetalle_param_return verbocompuestodetalleParameterGeneral,Boolean isEsNuevoVerboCompuestoDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuestoDetalle_param_return verbocompuestodetalleReturnGeneral=new VerboCompuestoDetalle_param_return();
	
			verbocompuestodetalleReturnGeneral.setVerboCompuestoDetalle(verbocompuestodetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verbocompuestodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return verbocompuestodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboCompuestoDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,VerboCompuestoDetalle_param_return verbocompuestodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuestoDetalle_param_return verbocompuestodetalleReturnGeneral=new VerboCompuestoDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.verbocompuestodetalles=new ArrayList<VerboCompuestoDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.verbocompuestodetalle=new VerboCompuestoDetalle();
				
				
				if(conColumnasBase) {this.verbocompuestodetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.verbocompuestodetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.verbocompuestodetalle.setidea(arrColumnas[iColumn++]);
				this.verbocompuestodetalle.settraduccion(arrColumnas[iColumn++]);
				this.verbocompuestodetalle.setpronunciacion(arrColumnas[iColumn++]);
				this.verbocompuestodetalle.setdescripcion(arrColumnas[iColumn++]);
				
				this.verbocompuestodetalles.add(this.verbocompuestodetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			verbocompuestodetalleReturnGeneral.setConRetornoEstaProcesado(true);
			verbocompuestodetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return verbocompuestodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<VerboCompuestoDetalle> verbocompuestodetallesAux= new ArrayList<VerboCompuestoDetalle>();
		
		for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuestodetalles) {
			if(!verbocompuestodetalle.getIsDeleted()) {
				verbocompuestodetallesAux.add(verbocompuestodetalle);
			}
		}
		
		verbocompuestodetalles=verbocompuestodetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<VerboCompuestoDetalle> verbocompuestodetallesAux= new ArrayList<VerboCompuestoDetalle>();
		
		for(VerboCompuestoDetalle verbocompuestodetalle : this.verbocompuestodetalles) {
			if(verbocompuestodetalle==null) {
				verbocompuestodetallesAux.add(verbocompuestodetalle);
			}
		}
		
		//this.verbocompuestodetalles=verbocompuestodetallesAux;
		
		this.verbocompuestodetalles.removeAll(verbocompuestodetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(verbocompuestodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((verbocompuestodetalle.getIsDeleted() || (verbocompuestodetalle.getIsChanged()&&!verbocompuestodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=verbocompuestodetalleDataAccess.getSetVersionRow(connexion,verbocompuestodetalle.getId());
				
				if(!verbocompuestodetalle.getVersionRow().equals(timestamp)) {	
					verbocompuestodetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				verbocompuestodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(verbocompuestodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((verbocompuestodetalle.getIsDeleted() || (verbocompuestodetalle.getIsChanged()&&!verbocompuestodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=verbocompuestodetalleDataAccess.getSetVersionRow(connexion,verbocompuestodetalle.getId());
			
			try {							
				if(!verbocompuestodetalle.getVersionRow().equals(timestamp)) {	
					verbocompuestodetalle.setVersionRow(timestamp);
				}
				
				verbocompuestodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(verbocompuestodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(VerboCompuestoDetalle verbocompuestodetalleAux:verbocompuestodetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(verbocompuestodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verbocompuestodetalleAux.getIsDeleted() || (verbocompuestodetalleAux.getIsChanged()&&!verbocompuestodetalleAux.getIsNew())) {
						
						timestamp=verbocompuestodetalleDataAccess.getSetVersionRow(connexion,verbocompuestodetalleAux.getId());
						
						if(!verbocompuestodetalle.getVersionRow().equals(timestamp)) {	
							verbocompuestodetalleAux.setVersionRow(timestamp);
						}
								
						verbocompuestodetalleAux.setIsChangedAuxiliar(false);														
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
		if(verbocompuestodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(VerboCompuestoDetalle verbocompuestodetalleAux:verbocompuestodetalles) {
					if(verbocompuestodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verbocompuestodetalleAux.getIsDeleted() || (verbocompuestodetalleAux.getIsChanged()&&!verbocompuestodetalleAux.getIsNew())) {
						
						timestamp=verbocompuestodetalleDataAccess.getSetVersionRow(connexion,verbocompuestodetalleAux.getId());
						
						if(!verbocompuestodetalleAux.getVersionRow().equals(timestamp)) {	
							verbocompuestodetalleAux.setVersionRow(timestamp);
						}
						
													
						verbocompuestodetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public VerboCompuestoDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalVerboCompuesto,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VerboCompuestoDetalle_param_return  verbocompuestodetalle_return =new VerboCompuestoDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyVerboCompuestoDetalleWithConnection");
			
			this.connexion.begin();
			
			verbocompuestodetalle_return =new VerboCompuestoDetalle_param_return();
			
			

			List<VerboCompuesto> verbocompuestosForeignKey=new ArrayList<VerboCompuesto>();
			VerboCompuesto_logic verbocompuestoLogic=new VerboCompuesto_logic();
			verbocompuestoLogic.setConnexion(this.connexion);
			verbocompuestoLogic.getVerboCompuestoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVerboCompuesto.equals("NONE")) {
				verbocompuestoLogic.getTodos(finalQueryGlobalVerboCompuesto,new Pagination());
				verbocompuestosForeignKey=verbocompuestoLogic.getVerboCompuestos();
			}

			verbocompuestodetalle_return.setverbocompuestosFK(verbocompuestosForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			verbocompuestodetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return verbocompuestodetalle_return;
	}
	
	public VerboCompuestoDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalVerboCompuesto,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VerboCompuestoDetalle_param_return  verbocompuestodetalle_return =new VerboCompuestoDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			verbocompuestodetalle_return =new VerboCompuestoDetalle_param_return();
			
			

			List<VerboCompuesto> verbocompuestosForeignKey=new ArrayList<VerboCompuesto>();
			VerboCompuesto_logic verbocompuestoLogic=new VerboCompuesto_logic();
			verbocompuestoLogic.setConnexion(this.connexion);
			verbocompuestoLogic.getVerboCompuestoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVerboCompuesto.equals("NONE")) {
				verbocompuestoLogic.getTodos(finalQueryGlobalVerboCompuesto,new Pagination());
				verbocompuestosForeignKey=verbocompuestoLogic.getVerboCompuestos();
			}

			verbocompuestodetalle_return.setverbocompuestosFK(verbocompuestosForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			verbocompuestodetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return verbocompuestodetalle_return;
	}
	
	
	public void deepLoad(VerboCompuestoDetalle verbocompuestodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToGet(verbocompuestodetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
		verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
		VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
		verbocompuestoLogic.deepLoad(verbocompuestodetalle.getVerboCompuesto(),isDeep,deepLoadType,clases);
				
		verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(verbocompuestodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
				VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
				verbocompuestoLogic.deepLoad(verbocompuestodetalle.getVerboCompuesto(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepLoad(verbocompuestodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuestodetalle.setVerboCompuesto(verbocompuestodetalleDataAccess.getVerboCompuesto(connexion,verbocompuestodetalle));
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuestoLogic.deepLoad(verbocompuestodetalle.getVerboCompuesto(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuestodetalle.setTipoGrammarDetalle(verbocompuestodetalleDataAccess.getTipoGrammarDetalle(connexion,verbocompuestodetalle));
			TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
			tipogrammardetalleLogic.deepLoad(verbocompuestodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(VerboCompuestoDetalle verbocompuestodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//VerboCompuestoDetalle_logic_add.updateVerboCompuestoDetalleToSave(verbocompuestodetalle,this.arrDatoGeneral);
			
VerboCompuestoDetalle_data.save(verbocompuestodetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		VerboCompuesto_data.save(verbocompuestodetalle.getVerboCompuesto(),connexion);

		TipoGrammarDetalle_data.save(verbocompuestodetalle.getTipoGrammarDetalle(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				VerboCompuesto_data.save(verbocompuestodetalle.getVerboCompuesto(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(verbocompuestodetalle.getTipoGrammarDetalle(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		VerboCompuesto_data.save(verbocompuestodetalle.getVerboCompuesto(),connexion);
		VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
		verbocompuestoLogic.deepLoad(verbocompuestodetalle.getVerboCompuesto(),isDeep,deepLoadType,clases);
				

		TipoGrammarDetalle_data.save(verbocompuestodetalle.getTipoGrammarDetalle(),connexion);
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(verbocompuestodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)) {
				VerboCompuesto_data.save(verbocompuestodetalle.getVerboCompuesto(),connexion);
				VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
				verbocompuestoLogic.deepSave(verbocompuestodetalle.getVerboCompuesto(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(verbocompuestodetalle.getTipoGrammarDetalle(),connexion);
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepSave(verbocompuestodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(VerboCompuestoDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(verbocompuestodetalle);
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
			this.deepLoad(this.verbocompuestodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(VerboCompuestoDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(verbocompuestodetalles!=null) {
				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuestodetalles) {
					this.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					VerboCompuestoDetalle_util.refrescarFKsDescripciones(verbocompuestodetalles);
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
			if(verbocompuestodetalles!=null) {
				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuestodetalles) {
					this.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					VerboCompuestoDetalle_util.refrescarFKsDescripciones(verbocompuestodetalles);
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
			this.getNewConnexionToDeep(VerboCompuestoDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(verbocompuestodetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(VerboCompuestoDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(verbocompuestodetalles!=null) {
				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuestodetalles) {
					this.deepSave(verbocompuestodetalle,isDeep,deepLoadType,clases);
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
			if(verbocompuestodetalles!=null) {
				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuestodetalles) {
					this.deepSave(verbocompuestodetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdTipoGrammarDetalleWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VerboCompuestoDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoGrammarDetalle(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VerboCompuestoDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdVerboCompuestoWithConnection(String sFinalQuery,Pagination pagination,Long id_verbo_compuesto)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuestoDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVerboCompuesto= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVerboCompuesto.setParameterSelectionGeneralEqual(ParameterType.LONG,id_verbo_compuesto,VerboCompuestoDetalle_util.IDVERBOCOMPUESTO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVerboCompuesto);

			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVerboCompuesto","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdVerboCompuesto(String sFinalQuery,Pagination pagination,Long id_verbo_compuesto)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVerboCompuesto= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVerboCompuesto.setParameterSelectionGeneralEqual(ParameterType.LONG,id_verbo_compuesto,VerboCompuestoDetalle_util.IDVERBOCOMPUESTO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVerboCompuesto);

			VerboCompuestoDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVerboCompuesto","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestodetalles=verbocompuestodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuestoDetalle_util.refrescarFKsDescripciones(this.verbocompuestodetalles);
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
			if(VerboCompuestoDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,VerboCompuestoDetalle verbocompuestodetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(VerboCompuestoDetalle_util.IS_CON_AUDITORIA) {
				if(verbocompuestodetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDetalleDataAccess.TABLENAME, verbocompuestodetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboCompuestoDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboCompuestoDetalle_logic.registrarAuditoriaDetalles(connexion,verbocompuestodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(verbocompuestodetalle.getIsDeleted()) {
					/*if(!verbocompuestodetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VerboCompuestoDetalleDataAccess.TABLENAME, verbocompuestodetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////VerboCompuestoDetalle_logic.registrarAuditoriaDetalles(connexion,verbocompuestodetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDetalleDataAccess.TABLENAME, verbocompuestodetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(verbocompuestodetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDetalleDataAccess.TABLENAME, verbocompuestodetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboCompuestoDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboCompuestoDetalle_logic.registrarAuditoriaDetalles(connexion,verbocompuestodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,VerboCompuestoDetalle verbocompuestodetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.getid_verbo_compuesto().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_verbo_compuesto()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_verbo_compuesto()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_verbo_compuesto().toString();
				}
				if(verbocompuestodetalle.getid_verbo_compuesto()!=null)
				{
					strValorNuevo=verbocompuestodetalle.getid_verbo_compuesto().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.IDVERBOCOMPUESTO,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.getid_tipo_grammar_detalle().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_tipo_grammar_detalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_tipo_grammar_detalle()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getid_tipo_grammar_detalle().toString();
				}
				if(verbocompuestodetalle.getid_tipo_grammar_detalle()!=null)
				{
					strValorNuevo=verbocompuestodetalle.getid_tipo_grammar_detalle().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.IDTIPOGRAMMARDETALLE,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.getidea().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getidea()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getidea();
				}
				if(verbocompuestodetalle.getidea()!=null)
				{
					strValorNuevo=verbocompuestodetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.gettraduccion().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().gettraduccion();
				}
				if(verbocompuestodetalle.gettraduccion()!=null)
				{
					strValorNuevo=verbocompuestodetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.getpronunciacion().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getpronunciacion();
				}
				if(verbocompuestodetalle.getpronunciacion()!=null)
				{
					strValorNuevo=verbocompuestodetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuestodetalle.getIsNew()||!verbocompuestodetalle.getdescripcion().equals(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getdescripcion()!=null)
				{
					strValorActual=verbocompuestodetalle.getVerboCompuestoDetalleOriginal().getdescripcion();
				}
				if(verbocompuestodetalle.getdescripcion()!=null)
				{
					strValorNuevo=verbocompuestodetalle.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoDetalleConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(VerboCompuestoDetalle verbocompuestodetalle) throws Exception {

		if(!verbocompuestodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verbocompuestodetalle,true);
		}
	}

	public void saveRelaciones(VerboCompuestoDetalle verbocompuestodetalle)throws Exception {

		if(!verbocompuestodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verbocompuestodetalle,false);
		}
	}

	public void saveRelacionesBase(VerboCompuestoDetalle verbocompuestodetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("VerboCompuestoDetalle-saveRelacionesWithConnection");}
	

			this.setVerboCompuestoDetalle(verbocompuestodetalle);

			if(true) {

				//VerboCompuestoDetalle_logic_add.updateRelacionesToSave(verbocompuestodetalle,this);

				if((verbocompuestodetalle.getIsNew()||verbocompuestodetalle.getIsChanged())&&!verbocompuestodetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(verbocompuestodetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//VerboCompuestoDetalle_logic_add.updateRelacionesToSaveAfter(verbocompuestodetalle,this);

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
			ArrayList<Classe> classes=VerboCompuestoDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboCompuestoDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVerboCompuestoDetalle(VerboCompuestoDetalle newVerboCompuestoDetalle) {
		this.verbocompuestodetalle = newVerboCompuestoDetalle;
	}
	
	public VerboCompuestoDetalle_data getVerboCompuestoDetalleDataAccess() {
		return verbocompuestodetalleDataAccess;
	}
	
	public void setVerboCompuestoDetalleDataAccess(VerboCompuestoDetalle_data newverbocompuestodetalleDataAccess) {
		this.verbocompuestodetalleDataAccess = newverbocompuestodetalleDataAccess;
	}

	public void setVerboCompuestoDetalles(List<VerboCompuestoDetalle> newVerboCompuestoDetalles) {
		this.verbocompuestodetalles = newVerboCompuestoDetalles;
	}
	
	public Object getVerboCompuestoDetalleObject() {	
		this.verbocompuestodetalleObject=this.verbocompuestodetalleDataAccess.getEntityObject();
		return this.verbocompuestodetalleObject;
	}
		
	public void setVerboCompuestoDetalleObject(Object newVerboCompuestoDetalleObject) {
		this.verbocompuestodetalleObject = newVerboCompuestoDetalleObject;
	}
	
	public List<Object> getVerboCompuestoDetallesObject() {		
		this.verbocompuestodetallesObject=this.verbocompuestodetalleDataAccess.getEntitiesObject();
		return this.verbocompuestodetallesObject;
	}
		
	public void setVerboCompuestoDetallesObject(List<Object> newVerboCompuestoDetallesObject) {
		this.verbocompuestodetallesObject = newVerboCompuestoDetallesObject;
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
