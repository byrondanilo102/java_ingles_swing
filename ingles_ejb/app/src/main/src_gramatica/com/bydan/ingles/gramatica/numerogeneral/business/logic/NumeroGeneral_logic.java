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
package com.bydan.ingles.gramatica.numerogeneral.business.logic;


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
import com.bydan.ingles.gramatica.numerogeneral.util.*;
import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneral_util;
import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneral_param_return;
//import com.bydan.ingles.gramatica.numerogeneral.util.NumeroGeneralParameterGeneral;
import com.bydan.ingles.gramatica.numerogeneral.business.entity.NumeroGeneral;
//import com.bydan.ingles.gramatica.numerogeneral.business.logic.NumeroGeneral_logic_add;
import com.bydan.ingles.gramatica.numerogeneral.business.data.*;
import com.bydan.ingles.gramatica.numerogeneral.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class NumeroGeneral_logic  extends GeneralEntityLogic implements NumeroGeneral_logicI {
	static Logger logger = Logger.getLogger("NumeroGeneral_logic.class");	

	protected NumeroGeneral_data numerogeneralDataAccess; 	
	protected NumeroGeneral numerogeneral;
	protected List<NumeroGeneral> numerogenerals;
	protected Object numerogeneralObject;	
	protected List<Object> numerogeneralsObject;
	
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
	
	
	
	
	
	
	public NumeroGeneral_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.numerogeneralDataAccess = new NumeroGeneral_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			NumeroGeneral_data.ActualizarQueries();
			
			//this.numerogeneralDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.numerogenerals= new ArrayList<NumeroGeneral>();
			this.numerogeneral= new NumeroGeneral();
			
			this.numerogeneralObject=new Object();
			this.numerogeneralsObject=new ArrayList<Object>();
				
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
			
			this.numerogeneralDataAccess.setConnexionType(this.connexionType);
			this.numerogeneralDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public NumeroGeneral_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.numerogeneralDataAccess = new NumeroGeneral_data();
			this.numerogenerals= new ArrayList<NumeroGeneral>();
			this.numerogeneral= new NumeroGeneral();
			this.numerogeneralObject=new Object();
			this.numerogeneralsObject=new ArrayList<Object>();
			
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
			
			this.numerogeneralDataAccess.setConnexionType(this.connexionType);
			this.numerogeneralDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public NumeroGeneral getNumeroGeneral() throws Exception {	
		//NumeroGeneral_logic_add.checkNumeroGeneralToGet(numerogeneral,this.datosCliente,this.arrDatoGeneral);
		//NumeroGeneral_logic_add.updateNumeroGeneralToGet(numerogeneral,this.arrDatoGeneral);
		
		return numerogeneral;
	}
	
	public List<NumeroGeneral> getNumeroGenerals() throws Exception {		
		if(this.numerogenerals==null) {
			this.numerogenerals= new ArrayList<NumeroGeneral>();
		}
		
		this.quitarsNulos();
		
		//NumeroGeneral_logic_add.checkNumeroGeneralToGets(numerogenerals,this.datosCliente,this.arrDatoGeneral);
		
		for (NumeroGeneral numerogeneralLocal: numerogenerals ) {
			//NumeroGeneral_logic_add.updateNumeroGeneralToGet(numerogeneralLocal,this.arrDatoGeneral);
		}
		
		return numerogenerals;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.numerogeneralDataAccess!=null) {
			this.numerogeneralDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			numerogeneralDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			numerogeneralDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		numerogeneral = new  NumeroGeneral();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			numerogeneral=numerogeneralDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
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
		numerogeneral = new  NumeroGeneral();
		  		  
        try {
			
			numerogeneral=numerogeneralDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		numerogeneral = new  NumeroGeneral();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			numerogeneral=numerogeneralDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
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
		numerogeneral = new  NumeroGeneral();
		  		  
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
		numerogeneral = new  NumeroGeneral();
		  		  
        try {
			
			numerogeneral=numerogeneralDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		numerogeneral = new  NumeroGeneral();
		  		  
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
		numerogeneral = new  NumeroGeneral();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =numerogeneralDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		numerogeneral = new  NumeroGeneral();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=numerogeneralDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		numerogeneral = new  NumeroGeneral();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =numerogeneralDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		numerogeneral = new  NumeroGeneral();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=numerogeneralDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		numerogeneral = new  NumeroGeneral();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =numerogeneralDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		numerogeneral = new  NumeroGeneral();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=numerogeneralDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		numerogeneral = new  NumeroGeneral();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogeneral=numerogeneralDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(numerogeneral);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
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
		numerogeneral = new  NumeroGeneral();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogeneral=numerogeneralDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(numerogeneral);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		  		  
        try {
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		numerogenerals = new  ArrayList<NumeroGeneral>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
		numerogenerals = new  ArrayList<NumeroGeneral>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			numerogenerals=numerogeneralDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(numerogenerals);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(NumeroGeneral numerogeneral) throws Exception {
		Boolean estaValidado=false;
		
		if(numerogeneral.getIsNew() || numerogeneral.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<NumeroGeneral> NumeroGenerals) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(NumeroGeneral numerogeneralLocal:numerogenerals) {				
			estaValidadoObjeto=this.validarGuardar(numerogeneralLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<NumeroGeneral> NumeroGenerals) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(numerogenerals)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(NumeroGeneral NumeroGeneral) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(numerogeneral)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(NumeroGeneral numerogeneral) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+numerogeneral.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"numerogeneral","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(NumeroGeneral_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(NumeroGeneral_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//NumeroGeneral_logic_add.checkNumeroGeneralToSave(this.numerogeneral,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//NumeroGeneral_logic_add.updateNumeroGeneralToSave(this.numerogeneral,this.arrDatoGeneral);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.numerogeneral,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(NumeroGeneral_util.permiteMantenimiento(this.numerogeneral) && this.validarGuardar(this.numerogeneral)) {
				NumeroGeneral_data.save(this.numerogeneral, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);				
			}

			//NumeroGeneral_logic_add.checkNumeroGeneralToSaveAfter(this.numerogeneral,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.numerogeneral.getIsDeleted()) {
				this.numerogeneral=null;
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
			
			//NumeroGeneral_logic_add.checkNumeroGeneralToSave(this.numerogeneral,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//NumeroGeneral_logic_add.updateNumeroGeneralToSave(this.numerogeneral,this.arrDatoGeneral);
			
			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.numerogeneral,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(NumeroGeneral_util.permiteMantenimiento(this.numerogeneral) && this.validarGuardar(this.numerogeneral)) {			
				NumeroGeneral_data.save(this.numerogeneral, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.numerogeneral,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);				
			}
			
			//NumeroGeneral_logic_add.checkNumeroGeneralToSaveAfter(this.numerogeneral,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.numerogeneral.getIsDeleted()) {
				this.numerogeneral=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//NumeroGeneral_logic_add.checkNumeroGeneralToSaves(numerogenerals,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosNumeroGeneral=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(NumeroGeneral numerogeneralLocal:numerogenerals) {		
				
				if(!NumeroGeneral_util.permiteMantenimiento(numerogeneralLocal)) {
					continue;
				}
				
				//NumeroGeneral_logic_add.updateNumeroGeneralToSave(numerogeneralLocal,this.arrDatoGeneral);
	        	
				NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),numerogeneralLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(numerogeneralLocal)) {
					NumeroGeneral_data.save(numerogeneralLocal, connexion);				
				} else {
					validadoTodosNumeroGeneral=false;
				}
			}
			
			if(!validadoTodosNumeroGeneral) {
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
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}
			
			//NumeroGeneral_logic_add.checkNumeroGeneralToSavesAfter(numerogenerals,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//NumeroGeneral_logic_add.checkNumeroGeneralToSaves(numerogenerals,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosNumeroGeneral=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(NumeroGeneral numerogeneralLocal:numerogenerals) {				
				if(!NumeroGeneral_util.permiteMantenimiento(numerogeneralLocal)) {
					continue;
				}
				
				//NumeroGeneral_logic_add.updateNumeroGeneralToSave(numerogeneralLocal,this.arrDatoGeneral);
	        	
				NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),numerogeneralLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(numerogeneralLocal)) {				
					NumeroGeneral_data.save(numerogeneralLocal, connexion);				
				} else {
					validadoTodosNumeroGeneral=false;
				}
			}
			
			if(!validadoTodosNumeroGeneral) {
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
				
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}

			//NumeroGeneral_logic_add.checkNumeroGeneralToSavesAfter(numerogenerals,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public NumeroGeneral_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<NumeroGeneral> numerogenerals,NumeroGeneral_param_return numerogeneralParameterGeneral)throws Exception {
		 try {	
			NumeroGeneral_param_return numerogeneralReturnGeneral=new NumeroGeneral_param_return();
	
			
			return numerogeneralReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public NumeroGeneral_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<NumeroGeneral> numerogenerals,NumeroGeneral_param_return numerogeneralParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			NumeroGeneral_param_return numerogeneralReturnGeneral=new NumeroGeneral_param_return();
	
			
			this.connexion.commit();
			
			return numerogeneralReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public NumeroGeneral_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,NumeroGeneral_param_return numerogeneralParameterGeneral,Boolean isEsNuevoNumeroGeneral,ArrayList<Classe> clases)throws Exception {
		 try {	
			NumeroGeneral_param_return numerogeneralReturnGeneral=new NumeroGeneral_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				numerogeneralReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return numerogeneralReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public NumeroGeneral_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<NumeroGeneral> numerogenerals,NumeroGeneral numerogeneral,NumeroGeneral_param_return numerogeneralParameterGeneral,Boolean isEsNuevoNumeroGeneral,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			NumeroGeneral_param_return numerogeneralReturnGeneral=new NumeroGeneral_param_return();
	
			numerogeneralReturnGeneral.setNumeroGeneral(numerogeneral);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				numerogeneralReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return numerogeneralReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public NumeroGeneral_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,NumeroGeneral_param_return numerogeneralParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			NumeroGeneral_param_return numerogeneralReturnGeneral=new NumeroGeneral_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.numerogenerals=new ArrayList<NumeroGeneral>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.numerogeneral=new NumeroGeneral();
				
				
				if(conColumnasBase) {this.numerogeneral.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.numerogeneral.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.numerogeneral.setnumero(arrColumnas[iColumn++]);
				this.numerogeneral.setnombre(arrColumnas[iColumn++]);
				this.numerogeneral.settraduccion(arrColumnas[iColumn++]);
				this.numerogeneral.setpronunciacion(arrColumnas[iColumn++]);
				
				this.numerogenerals.add(this.numerogeneral);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			numerogeneralReturnGeneral.setConRetornoEstaProcesado(true);
			numerogeneralReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return numerogeneralReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<NumeroGeneral> numerogeneralsAux= new ArrayList<NumeroGeneral>();
		
		for(NumeroGeneral numerogeneral:numerogenerals) {
			if(!numerogeneral.getIsDeleted()) {
				numerogeneralsAux.add(numerogeneral);
			}
		}
		
		numerogenerals=numerogeneralsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<NumeroGeneral> numerogeneralsAux= new ArrayList<NumeroGeneral>();
		
		for(NumeroGeneral numerogeneral : this.numerogenerals) {
			if(numerogeneral==null) {
				numerogeneralsAux.add(numerogeneral);
			}
		}
		
		//this.numerogenerals=numerogeneralsAux;
		
		this.numerogenerals.removeAll(numerogeneralsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(numerogeneral.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((numerogeneral.getIsDeleted() || (numerogeneral.getIsChanged()&&!numerogeneral.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=numerogeneralDataAccess.getSetVersionRow(connexion,numerogeneral.getId());
				
				if(!numerogeneral.getVersionRow().equals(timestamp)) {	
					numerogeneral.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				numerogeneral.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(numerogeneral.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((numerogeneral.getIsDeleted() || (numerogeneral.getIsChanged()&&!numerogeneral.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=numerogeneralDataAccess.getSetVersionRow(connexion,numerogeneral.getId());
			
			try {							
				if(!numerogeneral.getVersionRow().equals(timestamp)) {	
					numerogeneral.setVersionRow(timestamp);
				}
				
				numerogeneral.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(numerogenerals!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(NumeroGeneral numerogeneralAux:numerogenerals) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(numerogeneralAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(numerogeneralAux.getIsDeleted() || (numerogeneralAux.getIsChanged()&&!numerogeneralAux.getIsNew())) {
						
						timestamp=numerogeneralDataAccess.getSetVersionRow(connexion,numerogeneralAux.getId());
						
						if(!numerogeneral.getVersionRow().equals(timestamp)) {	
							numerogeneralAux.setVersionRow(timestamp);
						}
								
						numerogeneralAux.setIsChangedAuxiliar(false);														
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
		if(numerogenerals!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(NumeroGeneral numerogeneralAux:numerogenerals) {
					if(numerogeneralAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(numerogeneralAux.getIsDeleted() || (numerogeneralAux.getIsChanged()&&!numerogeneralAux.getIsNew())) {
						
						timestamp=numerogeneralDataAccess.getSetVersionRow(connexion,numerogeneralAux.getId());
						
						if(!numerogeneralAux.getVersionRow().equals(timestamp)) {	
							numerogeneralAux.setVersionRow(timestamp);
						}
						
													
						numerogeneralAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	
	public void deepLoad(NumeroGeneral numerogeneral,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		
		
		try {
			//NumeroGeneral_logic_add.updateNumeroGeneralToGet(numerogeneral,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(NumeroGeneral numerogeneral,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
				
		try {
			//NumeroGeneral_logic_add.updateNumeroGeneralToSave(numerogeneral,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(NumeroGeneral.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(numerogeneral,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				NumeroGeneral_util.refrescarFKsDescripciones(numerogeneral);
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
			this.deepLoad(this.numerogeneral,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogeneral);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(NumeroGeneral.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(numerogenerals!=null) {
				for(NumeroGeneral numerogeneral:numerogenerals) {
					this.deepLoad(numerogeneral,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					NumeroGeneral_util.refrescarFKsDescripciones(numerogenerals);
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
			if(numerogenerals!=null) {
				for(NumeroGeneral numerogeneral:numerogenerals) {
					this.deepLoad(numerogeneral,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					NumeroGeneral_util.refrescarFKsDescripciones(numerogenerals);
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
			this.getNewConnexionToDeep(NumeroGeneral.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(numerogeneral,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(NumeroGeneral.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(numerogenerals!=null) {
				for(NumeroGeneral numerogeneral:numerogenerals) {
					this.deepSave(numerogeneral,isDeep,deepLoadType,clases);
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
			if(numerogenerals!=null) {
				for(NumeroGeneral numerogeneral:numerogenerals) {
					this.deepSave(numerogeneral,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorNumeroWithConnection(String sFinalQuery,Pagination pagination,String numero)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,NumeroGeneral.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNumero= new ParameterSelectionGeneral();
			parameterSelectionGeneralNumero.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+numero+"%",NumeroGeneral_util.NUMERO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNumero);

			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNumero","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			numerogenerals=numerogeneralDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNumero(String sFinalQuery,Pagination pagination,String numero)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNumero= new ParameterSelectionGeneral();
			parameterSelectionGeneralNumero.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+numero+"%",NumeroGeneral_util.NUMERO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNumero);

			NumeroGeneral_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNumero","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			numerogenerals=numerogeneralDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				NumeroGeneral_util.refrescarFKsDescripciones(this.numerogenerals);
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
			if(NumeroGeneral_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,NumeroGeneralDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,NumeroGeneral numerogeneral,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(NumeroGeneral_util.IS_CON_AUDITORIA) {
				if(numerogeneral.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NumeroGeneralDataAccess.TABLENAME, numerogeneral.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(NumeroGeneral_util.IS_CON_AUDITORIA_DETALLE) {
						////NumeroGeneral_logic.registrarAuditoriaDetalles(connexion,numerogeneral,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(numerogeneral.getIsDeleted()) {
					/*if(!numerogeneral.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,NumeroGeneralDataAccess.TABLENAME, numerogeneral.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////NumeroGeneral_logic.registrarAuditoriaDetalles(connexion,numerogeneral,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NumeroGeneralDataAccess.TABLENAME, numerogeneral.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(numerogeneral.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NumeroGeneralDataAccess.TABLENAME, numerogeneral.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(NumeroGeneral_util.IS_CON_AUDITORIA_DETALLE) {
						////NumeroGeneral_logic.registrarAuditoriaDetalles(connexion,numerogeneral,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,NumeroGeneral numerogeneral)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(numerogeneral.getIsNew()||!numerogeneral.getnumero().equals(numerogeneral.getNumeroGeneralOriginal().getnumero()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(numerogeneral.getNumeroGeneralOriginal().getnumero()!=null)
				{
					strValorActual=numerogeneral.getNumeroGeneralOriginal().getnumero();
				}
				if(numerogeneral.getnumero()!=null)
				{
					strValorNuevo=numerogeneral.getnumero() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),NumeroGeneralConstantesFunciones.NUMERO,strValorActual,strValorNuevo);
			}	
			
			if(numerogeneral.getIsNew()||!numerogeneral.getnombre().equals(numerogeneral.getNumeroGeneralOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(numerogeneral.getNumeroGeneralOriginal().getnombre()!=null)
				{
					strValorActual=numerogeneral.getNumeroGeneralOriginal().getnombre();
				}
				if(numerogeneral.getnombre()!=null)
				{
					strValorNuevo=numerogeneral.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),NumeroGeneralConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(numerogeneral.getIsNew()||!numerogeneral.gettraduccion().equals(numerogeneral.getNumeroGeneralOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(numerogeneral.getNumeroGeneralOriginal().gettraduccion()!=null)
				{
					strValorActual=numerogeneral.getNumeroGeneralOriginal().gettraduccion();
				}
				if(numerogeneral.gettraduccion()!=null)
				{
					strValorNuevo=numerogeneral.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),NumeroGeneralConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(numerogeneral.getIsNew()||!numerogeneral.getpronunciacion().equals(numerogeneral.getNumeroGeneralOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(numerogeneral.getNumeroGeneralOriginal().getpronunciacion()!=null)
				{
					strValorActual=numerogeneral.getNumeroGeneralOriginal().getpronunciacion();
				}
				if(numerogeneral.getpronunciacion()!=null)
				{
					strValorNuevo=numerogeneral.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),NumeroGeneralConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(NumeroGeneral numerogeneral) throws Exception {

		if(!numerogeneral.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(numerogeneral,true);
		}
	}

	public void saveRelaciones(NumeroGeneral numerogeneral)throws Exception {

		if(!numerogeneral.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(numerogeneral,false);
		}
	}

	public void saveRelacionesBase(NumeroGeneral numerogeneral,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("NumeroGeneral-saveRelacionesWithConnection");}
	

			this.setNumeroGeneral(numerogeneral);

			if(true) {

				//NumeroGeneral_logic_add.updateRelacionesToSave(numerogeneral,this);

				if((numerogeneral.getIsNew()||numerogeneral.getIsChanged())&&!numerogeneral.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(numerogeneral.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//NumeroGeneral_logic_add.updateRelacionesToSaveAfter(numerogeneral,this);

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
			ArrayList<Classe> classes=NumeroGeneral_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=NumeroGeneral_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setNumeroGeneral(NumeroGeneral newNumeroGeneral) {
		this.numerogeneral = newNumeroGeneral;
	}
	
	public NumeroGeneral_data getNumeroGeneralDataAccess() {
		return numerogeneralDataAccess;
	}
	
	public void setNumeroGeneralDataAccess(NumeroGeneral_data newnumerogeneralDataAccess) {
		this.numerogeneralDataAccess = newnumerogeneralDataAccess;
	}

	public void setNumeroGenerals(List<NumeroGeneral> newNumeroGenerals) {
		this.numerogenerals = newNumeroGenerals;
	}
	
	public Object getNumeroGeneralObject() {	
		this.numerogeneralObject=this.numerogeneralDataAccess.getEntityObject();
		return this.numerogeneralObject;
	}
		
	public void setNumeroGeneralObject(Object newNumeroGeneralObject) {
		this.numerogeneralObject = newNumeroGeneralObject;
	}
	
	public List<Object> getNumeroGeneralsObject() {		
		this.numerogeneralsObject=this.numerogeneralDataAccess.getEntitiesObject();
		return this.numerogeneralsObject;
	}
		
	public void setNumeroGeneralsObject(List<Object> newNumeroGeneralsObject) {
		this.numerogeneralsObject = newNumeroGeneralsObject;
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
