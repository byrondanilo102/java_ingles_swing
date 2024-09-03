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
package com.bydan.ingles.gramatica.verboirregulardetalle.business.logic;


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
import com.bydan.ingles.gramatica.verboirregulardetalle.util.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_param_return;
//import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalleParameterGeneral;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
//import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic_add;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.*;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.business.data.VerboIrregular_data;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class VerboIrregularDetalle_logic  extends GeneralEntityLogic implements VerboIrregularDetalle_logicI {
	static Logger logger = Logger.getLogger("VerboIrregularDetalle_logic.class");	

	protected VerboIrregularDetalle_data verboirregulardetalleDataAccess; 	
	protected VerboIrregularDetalle verboirregulardetalle;
	protected List<VerboIrregularDetalle> verboirregulardetalles;
	protected Object verboirregulardetalleObject;	
	protected List<Object> verboirregulardetallesObject;
	
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
	
	
	
	
	
	
	public VerboIrregularDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.verboirregulardetalleDataAccess = new VerboIrregularDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			VerboIrregularDetalle_data.ActualizarQueries();
			
			//this.verboirregulardetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();
			this.verboirregulardetalle= new VerboIrregularDetalle();
			
			this.verboirregulardetalleObject=new Object();
			this.verboirregulardetallesObject=new ArrayList<Object>();
				
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
			
			this.verboirregulardetalleDataAccess.setConnexionType(this.connexionType);
			this.verboirregulardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public VerboIrregularDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.verboirregulardetalleDataAccess = new VerboIrregularDetalle_data();
			this.verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();
			this.verboirregulardetalle= new VerboIrregularDetalle();
			this.verboirregulardetalleObject=new Object();
			this.verboirregulardetallesObject=new ArrayList<Object>();
			
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
			
			this.verboirregulardetalleDataAccess.setConnexionType(this.connexionType);
			this.verboirregulardetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public VerboIrregularDetalle getVerboIrregularDetalle() throws Exception {	
		//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToGet(verboirregulardetalle,this.datosCliente,this.arrDatoGeneral);
		//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToGet(verboirregulardetalle,this.arrDatoGeneral);
		
		return verboirregulardetalle;
	}
	
	public List<VerboIrregularDetalle> getVerboIrregularDetalles() throws Exception {		
		if(this.verboirregulardetalles==null) {
			this.verboirregulardetalles= new ArrayList<VerboIrregularDetalle>();
		}
		
		this.quitarsNulos();
		
		//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToGets(verboirregulardetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (VerboIrregularDetalle verboirregulardetalleLocal: verboirregulardetalles ) {
			//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToGet(verboirregulardetalleLocal,this.arrDatoGeneral);
		}
		
		return verboirregulardetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.verboirregulardetalleDataAccess!=null) {
			this.verboirregulardetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			verboirregulardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			verboirregulardetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
        try {
			
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
        try {
			
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		verboirregulardetalle = new  VerboIrregularDetalle();
		  		  
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =verboirregulardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=verboirregulardetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verboirregulardetalle = new  VerboIrregularDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =verboirregulardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=verboirregulardetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verboirregulardetalle = new  VerboIrregularDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =verboirregulardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=verboirregulardetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		verboirregulardetalle = new  VerboIrregularDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
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
		verboirregulardetalle = new  VerboIrregularDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalle=verboirregulardetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		  		  
        try {
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
		verboirregulardetalles = new  ArrayList<VerboIrregularDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verboirregulardetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(VerboIrregularDetalle verboirregulardetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(verboirregulardetalle.getIsNew() || verboirregulardetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<VerboIrregularDetalle> VerboIrregularDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(VerboIrregularDetalle verboirregulardetalleLocal:verboirregulardetalles) {				
			estaValidadoObjeto=this.validarGuardar(verboirregulardetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<VerboIrregularDetalle> VerboIrregularDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verboirregulardetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(VerboIrregularDetalle VerboIrregularDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verboirregulardetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(VerboIrregularDetalle verboirregulardetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+verboirregulardetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"verboirregulardetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(VerboIrregularDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(VerboIrregularDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSave(this.verboirregulardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToSave(this.verboirregulardetalle,this.arrDatoGeneral);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verboirregulardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboIrregularDetalle_util.permiteMantenimiento(this.verboirregulardetalle) && this.validarGuardar(this.verboirregulardetalle)) {
				VerboIrregularDetalle_data.save(this.verboirregulardetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);				
			}

			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSaveAfter(this.verboirregulardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.verboirregulardetalle.getIsDeleted()) {
				this.verboirregulardetalle=null;
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
			
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSave(this.verboirregulardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToSave(this.verboirregulardetalle,this.arrDatoGeneral);
			
			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verboirregulardetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboIrregularDetalle_util.permiteMantenimiento(this.verboirregulardetalle) && this.validarGuardar(this.verboirregulardetalle)) {			
				VerboIrregularDetalle_data.save(this.verboirregulardetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verboirregulardetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);				
			}
			
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSaveAfter(this.verboirregulardetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.verboirregulardetalle.getIsDeleted()) {
				this.verboirregulardetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSaves(verboirregulardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVerboIrregularDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboIrregularDetalle verboirregulardetalleLocal:verboirregulardetalles) {		
				
				if(!VerboIrregularDetalle_util.permiteMantenimiento(verboirregulardetalleLocal)) {
					continue;
				}
				
				//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToSave(verboirregulardetalleLocal,this.arrDatoGeneral);
	        	
				VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verboirregulardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verboirregulardetalleLocal)) {
					VerboIrregularDetalle_data.save(verboirregulardetalleLocal, connexion);				
				} else {
					validadoTodosVerboIrregularDetalle=false;
				}
			}
			
			if(!validadoTodosVerboIrregularDetalle) {
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
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}
			
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSavesAfter(verboirregulardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSaves(verboirregulardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVerboIrregularDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboIrregularDetalle verboirregulardetalleLocal:verboirregulardetalles) {				
				if(!VerboIrregularDetalle_util.permiteMantenimiento(verboirregulardetalleLocal)) {
					continue;
				}
				
				//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToSave(verboirregulardetalleLocal,this.arrDatoGeneral);
	        	
				VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verboirregulardetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verboirregulardetalleLocal)) {				
					VerboIrregularDetalle_data.save(verboirregulardetalleLocal, connexion);				
				} else {
					validadoTodosVerboIrregularDetalle=false;
				}
			}
			
			if(!validadoTodosVerboIrregularDetalle) {
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
				
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}

			//VerboIrregularDetalle_logic_add.checkVerboIrregularDetalleToSavesAfter(verboirregulardetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboIrregularDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle_param_return verboirregulardetalleParameterGeneral)throws Exception {
		 try {	
			VerboIrregularDetalle_param_return verboirregulardetalleReturnGeneral=new VerboIrregularDetalle_param_return();
	
			
			return verboirregulardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboIrregularDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle_param_return verboirregulardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregularDetalle_param_return verboirregulardetalleReturnGeneral=new VerboIrregularDetalle_param_return();
	
			
			this.connexion.commit();
			
			return verboirregulardetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboIrregularDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,VerboIrregularDetalle_param_return verboirregulardetalleParameterGeneral,Boolean isEsNuevoVerboIrregularDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			VerboIrregularDetalle_param_return verboirregulardetalleReturnGeneral=new VerboIrregularDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verboirregulardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return verboirregulardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public VerboIrregularDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboIrregularDetalle> verboirregulardetalles,VerboIrregularDetalle verboirregulardetalle,VerboIrregularDetalle_param_return verboirregulardetalleParameterGeneral,Boolean isEsNuevoVerboIrregularDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregularDetalle_param_return verboirregulardetalleReturnGeneral=new VerboIrregularDetalle_param_return();
	
			verboirregulardetalleReturnGeneral.setVerboIrregularDetalle(verboirregulardetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verboirregulardetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return verboirregulardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboIrregularDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,VerboIrregularDetalle_param_return verboirregulardetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregularDetalle_param_return verboirregulardetalleReturnGeneral=new VerboIrregularDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.verboirregulardetalles=new ArrayList<VerboIrregularDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.verboirregulardetalle=new VerboIrregularDetalle();
				
				
				if(conColumnasBase) {this.verboirregulardetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.verboirregulardetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.verboirregulardetalle.setidea(arrColumnas[iColumn++]);
				this.verboirregulardetalle.settraduccion(arrColumnas[iColumn++]);
				this.verboirregulardetalle.setpronunciacion(arrColumnas[iColumn++]);
				this.verboirregulardetalle.setdescripcion(arrColumnas[iColumn++]);
				
				this.verboirregulardetalles.add(this.verboirregulardetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			verboirregulardetalleReturnGeneral.setConRetornoEstaProcesado(true);
			verboirregulardetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return verboirregulardetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<VerboIrregularDetalle> verboirregulardetallesAux= new ArrayList<VerboIrregularDetalle>();
		
		for(VerboIrregularDetalle verboirregulardetalle:verboirregulardetalles) {
			if(!verboirregulardetalle.getIsDeleted()) {
				verboirregulardetallesAux.add(verboirregulardetalle);
			}
		}
		
		verboirregulardetalles=verboirregulardetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<VerboIrregularDetalle> verboirregulardetallesAux= new ArrayList<VerboIrregularDetalle>();
		
		for(VerboIrregularDetalle verboirregulardetalle : this.verboirregulardetalles) {
			if(verboirregulardetalle==null) {
				verboirregulardetallesAux.add(verboirregulardetalle);
			}
		}
		
		//this.verboirregulardetalles=verboirregulardetallesAux;
		
		this.verboirregulardetalles.removeAll(verboirregulardetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(verboirregulardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((verboirregulardetalle.getIsDeleted() || (verboirregulardetalle.getIsChanged()&&!verboirregulardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=verboirregulardetalleDataAccess.getSetVersionRow(connexion,verboirregulardetalle.getId());
				
				if(!verboirregulardetalle.getVersionRow().equals(timestamp)) {	
					verboirregulardetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				verboirregulardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(verboirregulardetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((verboirregulardetalle.getIsDeleted() || (verboirregulardetalle.getIsChanged()&&!verboirregulardetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=verboirregulardetalleDataAccess.getSetVersionRow(connexion,verboirregulardetalle.getId());
			
			try {							
				if(!verboirregulardetalle.getVersionRow().equals(timestamp)) {	
					verboirregulardetalle.setVersionRow(timestamp);
				}
				
				verboirregulardetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(verboirregulardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(VerboIrregularDetalle verboirregulardetalleAux:verboirregulardetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(verboirregulardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verboirregulardetalleAux.getIsDeleted() || (verboirregulardetalleAux.getIsChanged()&&!verboirregulardetalleAux.getIsNew())) {
						
						timestamp=verboirregulardetalleDataAccess.getSetVersionRow(connexion,verboirregulardetalleAux.getId());
						
						if(!verboirregulardetalle.getVersionRow().equals(timestamp)) {	
							verboirregulardetalleAux.setVersionRow(timestamp);
						}
								
						verboirregulardetalleAux.setIsChangedAuxiliar(false);														
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
		if(verboirregulardetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(VerboIrregularDetalle verboirregulardetalleAux:verboirregulardetalles) {
					if(verboirregulardetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verboirregulardetalleAux.getIsDeleted() || (verboirregulardetalleAux.getIsChanged()&&!verboirregulardetalleAux.getIsNew())) {
						
						timestamp=verboirregulardetalleDataAccess.getSetVersionRow(connexion,verboirregulardetalleAux.getId());
						
						if(!verboirregulardetalleAux.getVersionRow().equals(timestamp)) {	
							verboirregulardetalleAux.setVersionRow(timestamp);
						}
						
													
						verboirregulardetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public VerboIrregularDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalVerboIrregular,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VerboIrregularDetalle_param_return  verboirregulardetalle_return =new VerboIrregularDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyVerboIrregularDetalleWithConnection");
			
			this.connexion.begin();
			
			verboirregulardetalle_return =new VerboIrregularDetalle_param_return();
			
			

			List<VerboIrregular> verboirregularsForeignKey=new ArrayList<VerboIrregular>();
			VerboIrregular_logic verboirregularLogic=new VerboIrregular_logic();
			verboirregularLogic.setConnexion(this.connexion);
			verboirregularLogic.getVerboIrregularDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVerboIrregular.equals("NONE")) {
				verboirregularLogic.getTodos(finalQueryGlobalVerboIrregular,new Pagination());
				verboirregularsForeignKey=verboirregularLogic.getVerboIrregulars();
			}

			verboirregulardetalle_return.setverboirregularsFK(verboirregularsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			verboirregulardetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return verboirregulardetalle_return;
	}
	
	public VerboIrregularDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalVerboIrregular,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VerboIrregularDetalle_param_return  verboirregulardetalle_return =new VerboIrregularDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			verboirregulardetalle_return =new VerboIrregularDetalle_param_return();
			
			

			List<VerboIrregular> verboirregularsForeignKey=new ArrayList<VerboIrregular>();
			VerboIrregular_logic verboirregularLogic=new VerboIrregular_logic();
			verboirregularLogic.setConnexion(this.connexion);
			verboirregularLogic.getVerboIrregularDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVerboIrregular.equals("NONE")) {
				verboirregularLogic.getTodos(finalQueryGlobalVerboIrregular,new Pagination());
				verboirregularsForeignKey=verboirregularLogic.getVerboIrregulars();
			}

			verboirregulardetalle_return.setverboirregularsFK(verboirregularsForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			verboirregulardetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return verboirregulardetalle_return;
	}
	
	
	public void deepLoad(VerboIrregularDetalle verboirregulardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToGet(verboirregulardetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
		verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
		VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
		verboirregularLogic.deepLoad(verboirregulardetalle.getVerboIrregular(),isDeep,deepLoadType,clases);
				
		verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(verboirregulardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
				VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
				verboirregularLogic.deepLoad(verboirregulardetalle.getVerboIrregular(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepLoad(verboirregulardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregulardetalle.setVerboIrregular(verboirregulardetalleDataAccess.getVerboIrregular(connexion,verboirregulardetalle));
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregularLogic.deepLoad(verboirregulardetalle.getVerboIrregular(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregulardetalle.setTipoGrammarDetalle(verboirregulardetalleDataAccess.getTipoGrammarDetalle(connexion,verboirregulardetalle));
			TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
			tipogrammardetalleLogic.deepLoad(verboirregulardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(VerboIrregularDetalle verboirregulardetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//VerboIrregularDetalle_logic_add.updateVerboIrregularDetalleToSave(verboirregulardetalle,this.arrDatoGeneral);
			
VerboIrregularDetalle_data.save(verboirregulardetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		VerboIrregular_data.save(verboirregulardetalle.getVerboIrregular(),connexion);

		TipoGrammarDetalle_data.save(verboirregulardetalle.getTipoGrammarDetalle(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				VerboIrregular_data.save(verboirregulardetalle.getVerboIrregular(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(verboirregulardetalle.getTipoGrammarDetalle(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		VerboIrregular_data.save(verboirregulardetalle.getVerboIrregular(),connexion);
		VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
		verboirregularLogic.deepLoad(verboirregulardetalle.getVerboIrregular(),isDeep,deepLoadType,clases);
				

		TipoGrammarDetalle_data.save(verboirregulardetalle.getTipoGrammarDetalle(),connexion);
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(verboirregulardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)) {
				VerboIrregular_data.save(verboirregulardetalle.getVerboIrregular(),connexion);
				VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
				verboirregularLogic.deepSave(verboirregulardetalle.getVerboIrregular(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(verboirregulardetalle.getTipoGrammarDetalle(),connexion);
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepSave(verboirregulardetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(VerboIrregularDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboIrregularDetalle_util.refrescarFKsDescripciones(verboirregulardetalle);
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
			this.deepLoad(this.verboirregulardetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(VerboIrregularDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(verboirregulardetalles!=null) {
				for(VerboIrregularDetalle verboirregulardetalle:verboirregulardetalles) {
					this.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					VerboIrregularDetalle_util.refrescarFKsDescripciones(verboirregulardetalles);
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
			if(verboirregulardetalles!=null) {
				for(VerboIrregularDetalle verboirregulardetalle:verboirregulardetalles) {
					this.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					VerboIrregularDetalle_util.refrescarFKsDescripciones(verboirregulardetalles);
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
			this.getNewConnexionToDeep(VerboIrregularDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(verboirregulardetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(VerboIrregularDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(verboirregulardetalles!=null) {
				for(VerboIrregularDetalle verboirregulardetalle:verboirregulardetalles) {
					this.deepSave(verboirregulardetalle,isDeep,deepLoadType,clases);
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
			if(verboirregulardetalles!=null) {
				for(VerboIrregularDetalle verboirregulardetalle:verboirregulardetalles) {
					this.deepSave(verboirregulardetalle,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VerboIrregularDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdVerboIrregularWithConnection(String sFinalQuery,Pagination pagination,Long id_verbo_irregular)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregularDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVerboIrregular= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVerboIrregular.setParameterSelectionGeneralEqual(ParameterType.LONG,id_verbo_irregular,VerboIrregularDetalle_util.IDVERBOIRREGULAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVerboIrregular);

			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVerboIrregular","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdVerboIrregular(String sFinalQuery,Pagination pagination,Long id_verbo_irregular)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVerboIrregular= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVerboIrregular.setParameterSelectionGeneralEqual(ParameterType.LONG,id_verbo_irregular,VerboIrregularDetalle_util.IDVERBOIRREGULAR,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVerboIrregular);

			VerboIrregularDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVerboIrregular","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulardetalles=verboirregulardetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregularDetalle_util.refrescarFKsDescripciones(this.verboirregulardetalles);
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
			if(VerboIrregularDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,VerboIrregularDetalle verboirregulardetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(VerboIrregularDetalle_util.IS_CON_AUDITORIA) {
				if(verboirregulardetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDetalleDataAccess.TABLENAME, verboirregulardetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboIrregularDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboIrregularDetalle_logic.registrarAuditoriaDetalles(connexion,verboirregulardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(verboirregulardetalle.getIsDeleted()) {
					/*if(!verboirregulardetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VerboIrregularDetalleDataAccess.TABLENAME, verboirregulardetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////VerboIrregularDetalle_logic.registrarAuditoriaDetalles(connexion,verboirregulardetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDetalleDataAccess.TABLENAME, verboirregulardetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(verboirregulardetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDetalleDataAccess.TABLENAME, verboirregulardetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboIrregularDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboIrregularDetalle_logic.registrarAuditoriaDetalles(connexion,verboirregulardetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,VerboIrregularDetalle verboirregulardetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.getid_verbo_irregular().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_verbo_irregular()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_verbo_irregular()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_verbo_irregular().toString();
				}
				if(verboirregulardetalle.getid_verbo_irregular()!=null)
				{
					strValorNuevo=verboirregulardetalle.getid_verbo_irregular().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.IDVERBOIRREGULAR,strValorActual,strValorNuevo);
			}	
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.getid_tipo_grammar_detalle().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_tipo_grammar_detalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_tipo_grammar_detalle()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().getid_tipo_grammar_detalle().toString();
				}
				if(verboirregulardetalle.getid_tipo_grammar_detalle()!=null)
				{
					strValorNuevo=verboirregulardetalle.getid_tipo_grammar_detalle().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.IDTIPOGRAMMARDETALLE,strValorActual,strValorNuevo);
			}	
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.getidea().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().getidea()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().getidea();
				}
				if(verboirregulardetalle.getidea()!=null)
				{
					strValorNuevo=verboirregulardetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.gettraduccion().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().gettraduccion();
				}
				if(verboirregulardetalle.gettraduccion()!=null)
				{
					strValorNuevo=verboirregulardetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.getpronunciacion().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().getpronunciacion();
				}
				if(verboirregulardetalle.getpronunciacion()!=null)
				{
					strValorNuevo=verboirregulardetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
			
			if(verboirregulardetalle.getIsNew()||!verboirregulardetalle.getdescripcion().equals(verboirregulardetalle.getVerboIrregularDetalleOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregulardetalle.getVerboIrregularDetalleOriginal().getdescripcion()!=null)
				{
					strValorActual=verboirregulardetalle.getVerboIrregularDetalleOriginal().getdescripcion();
				}
				if(verboirregulardetalle.getdescripcion()!=null)
				{
					strValorNuevo=verboirregulardetalle.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularDetalleConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(VerboIrregularDetalle verboirregulardetalle) throws Exception {

		if(!verboirregulardetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verboirregulardetalle,true);
		}
	}

	public void saveRelaciones(VerboIrregularDetalle verboirregulardetalle)throws Exception {

		if(!verboirregulardetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verboirregulardetalle,false);
		}
	}

	public void saveRelacionesBase(VerboIrregularDetalle verboirregulardetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("VerboIrregularDetalle-saveRelacionesWithConnection");}
	

			this.setVerboIrregularDetalle(verboirregulardetalle);

			if(true) {

				//VerboIrregularDetalle_logic_add.updateRelacionesToSave(verboirregulardetalle,this);

				if((verboirregulardetalle.getIsNew()||verboirregulardetalle.getIsChanged())&&!verboirregulardetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(verboirregulardetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//VerboIrregularDetalle_logic_add.updateRelacionesToSaveAfter(verboirregulardetalle,this);

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
			ArrayList<Classe> classes=VerboIrregularDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboIrregularDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVerboIrregularDetalle(VerboIrregularDetalle newVerboIrregularDetalle) {
		this.verboirregulardetalle = newVerboIrregularDetalle;
	}
	
	public VerboIrregularDetalle_data getVerboIrregularDetalleDataAccess() {
		return verboirregulardetalleDataAccess;
	}
	
	public void setVerboIrregularDetalleDataAccess(VerboIrregularDetalle_data newverboirregulardetalleDataAccess) {
		this.verboirregulardetalleDataAccess = newverboirregulardetalleDataAccess;
	}

	public void setVerboIrregularDetalles(List<VerboIrregularDetalle> newVerboIrregularDetalles) {
		this.verboirregulardetalles = newVerboIrregularDetalles;
	}
	
	public Object getVerboIrregularDetalleObject() {	
		this.verboirregulardetalleObject=this.verboirregulardetalleDataAccess.getEntityObject();
		return this.verboirregulardetalleObject;
	}
		
	public void setVerboIrregularDetalleObject(Object newVerboIrregularDetalleObject) {
		this.verboirregulardetalleObject = newVerboIrregularDetalleObject;
	}
	
	public List<Object> getVerboIrregularDetallesObject() {		
		this.verboirregulardetallesObject=this.verboirregulardetalleDataAccess.getEntitiesObject();
		return this.verboirregulardetallesObject;
	}
		
	public void setVerboIrregularDetallesObject(List<Object> newVerboIrregularDetallesObject) {
		this.verboirregulardetallesObject = newVerboIrregularDetallesObject;
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
