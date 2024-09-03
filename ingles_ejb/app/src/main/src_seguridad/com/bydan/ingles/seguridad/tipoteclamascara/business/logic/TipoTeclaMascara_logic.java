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
package com.bydan.ingles.seguridad.tipoteclamascara.business.logic;


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
import com.bydan.ingles.seguridad.tipoteclamascara.util.*;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_util;
import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascara_param_return;
//import com.bydan.ingles.seguridad.tipoteclamascara.util.TipoTeclaMascaraParameterGeneral;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;
//import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic_add;
import com.bydan.ingles.seguridad.tipoteclamascara.business.data.*;
import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.business.data.Modulo_data;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class TipoTeclaMascara_logic  extends GeneralEntityLogic implements TipoTeclaMascara_logicI {
	static Logger logger = Logger.getLogger("TipoTeclaMascara_logic.class");	

	protected TipoTeclaMascara_data tipoteclamascaraDataAccess; 	
	protected TipoTeclaMascara tipoteclamascara;
	protected List<TipoTeclaMascara> tipoteclamascaras;
	protected Object tipoteclamascaraObject;	
	protected List<Object> tipoteclamascarasObject;
	
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
	
	
	
	
	
	
	public TipoTeclaMascara_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.tipoteclamascaraDataAccess = new TipoTeclaMascara_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			TipoTeclaMascara_data.ActualizarQueries();
			
			//this.tipoteclamascaraDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.tipoteclamascaras= new ArrayList<TipoTeclaMascara>();
			this.tipoteclamascara= new TipoTeclaMascara();
			
			this.tipoteclamascaraObject=new Object();
			this.tipoteclamascarasObject=new ArrayList<Object>();
				
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
			
			this.tipoteclamascaraDataAccess.setConnexionType(this.connexionType);
			this.tipoteclamascaraDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public TipoTeclaMascara_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.tipoteclamascaraDataAccess = new TipoTeclaMascara_data();
			this.tipoteclamascaras= new ArrayList<TipoTeclaMascara>();
			this.tipoteclamascara= new TipoTeclaMascara();
			this.tipoteclamascaraObject=new Object();
			this.tipoteclamascarasObject=new ArrayList<Object>();
			
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
			
			this.tipoteclamascaraDataAccess.setConnexionType(this.connexionType);
			this.tipoteclamascaraDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public TipoTeclaMascara getTipoTeclaMascara() throws Exception {	
		//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToGet(tipoteclamascara,this.datosCliente,this.arrDatoGeneral);
		//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToGet(tipoteclamascara,this.arrDatoGeneral);
		
		return tipoteclamascara;
	}
	
	public List<TipoTeclaMascara> getTipoTeclaMascaras() throws Exception {		
		if(this.tipoteclamascaras==null) {
			this.tipoteclamascaras= new ArrayList<TipoTeclaMascara>();
		}
		
		this.quitarsNulos();
		
		//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToGets(tipoteclamascaras,this.datosCliente,this.arrDatoGeneral);
		
		for (TipoTeclaMascara tipoteclamascaraLocal: tipoteclamascaras ) {
			//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToGet(tipoteclamascaraLocal,this.arrDatoGeneral);
		}
		
		return tipoteclamascaras;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.tipoteclamascaraDataAccess!=null) {
			this.tipoteclamascaraDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			tipoteclamascaraDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			tipoteclamascaraDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
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
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
        try {
			
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
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
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
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
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
        try {
			
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		tipoteclamascara = new  TipoTeclaMascara();
		  		  
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
		tipoteclamascara = new  TipoTeclaMascara();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =tipoteclamascaraDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipoteclamascara = new  TipoTeclaMascara();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=tipoteclamascaraDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipoteclamascara = new  TipoTeclaMascara();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =tipoteclamascaraDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipoteclamascara = new  TipoTeclaMascara();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=tipoteclamascaraDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		tipoteclamascara = new  TipoTeclaMascara();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =tipoteclamascaraDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		tipoteclamascara = new  TipoTeclaMascara();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=tipoteclamascaraDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
        try {			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		  		  
        try {
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		tipoteclamascara = new  TipoTeclaMascara();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipoteclamascara);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
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
		tipoteclamascara = new  TipoTeclaMascara();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascara=tipoteclamascaraDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(tipoteclamascara);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
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
		tipoteclamascaras = new  ArrayList<TipoTeclaMascara>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			tipoteclamascaras=tipoteclamascaraDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(tipoteclamascaras);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(TipoTeclaMascara tipoteclamascara) throws Exception {
		Boolean estaValidado=false;
		
		if(tipoteclamascara.getIsNew() || tipoteclamascara.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<TipoTeclaMascara> TipoTeclaMascaras) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascaras) {				
			estaValidadoObjeto=this.validarGuardar(tipoteclamascaraLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<TipoTeclaMascara> TipoTeclaMascaras) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipoteclamascaras)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(TipoTeclaMascara TipoTeclaMascara) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(tipoteclamascara)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(TipoTeclaMascara tipoteclamascara) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+tipoteclamascara.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"tipoteclamascara","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(TipoTeclaMascara_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(TipoTeclaMascara_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSave(this.tipoteclamascara,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToSave(this.tipoteclamascara,this.arrDatoGeneral);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipoteclamascara,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoTeclaMascara_util.permiteMantenimiento(this.tipoteclamascara) && this.validarGuardar(this.tipoteclamascara)) {
				TipoTeclaMascara_data.save(this.tipoteclamascara, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);				
			}

			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSaveAfter(this.tipoteclamascara,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.tipoteclamascara.getIsDeleted()) {
				this.tipoteclamascara=null;
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
			
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSave(this.tipoteclamascara,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToSave(this.tipoteclamascara,this.arrDatoGeneral);
			
			TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.tipoteclamascara,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(TipoTeclaMascara_util.permiteMantenimiento(this.tipoteclamascara) && this.validarGuardar(this.tipoteclamascara)) {			
				TipoTeclaMascara_data.save(this.tipoteclamascara, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.tipoteclamascara,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);				
			}
			
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSaveAfter(this.tipoteclamascara,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.tipoteclamascara.getIsDeleted()) {
				this.tipoteclamascara=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSaves(tipoteclamascaras,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosTipoTeclaMascara=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascaras) {		
				
				if(!TipoTeclaMascara_util.permiteMantenimiento(tipoteclamascaraLocal)) {
					continue;
				}
				
				//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToSave(tipoteclamascaraLocal,this.arrDatoGeneral);
	        	
				TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipoteclamascaraLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipoteclamascaraLocal)) {
					TipoTeclaMascara_data.save(tipoteclamascaraLocal, connexion);				
				} else {
					validadoTodosTipoTeclaMascara=false;
				}
			}
			
			if(!validadoTodosTipoTeclaMascara) {
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
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
			}
			
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSavesAfter(tipoteclamascaras,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSaves(tipoteclamascaras,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosTipoTeclaMascara=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(TipoTeclaMascara tipoteclamascaraLocal:tipoteclamascaras) {				
				if(!TipoTeclaMascara_util.permiteMantenimiento(tipoteclamascaraLocal)) {
					continue;
				}
				
				//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToSave(tipoteclamascaraLocal,this.arrDatoGeneral);
	        	
				TipoTeclaMascara_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),tipoteclamascaraLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(tipoteclamascaraLocal)) {				
					TipoTeclaMascara_data.save(tipoteclamascaraLocal, connexion);				
				} else {
					validadoTodosTipoTeclaMascara=false;
				}
			}
			
			if(!validadoTodosTipoTeclaMascara) {
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
				
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascaras);
			}

			//TipoTeclaMascara_logic_add.checkTipoTeclaMascaraToSavesAfter(tipoteclamascaras,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoTeclaMascara_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara_param_return tipoteclamascaraParameterGeneral)throws Exception {
		 try {	
			TipoTeclaMascara_param_return tipoteclamascaraReturnGeneral=new TipoTeclaMascara_param_return();
	
			
			return tipoteclamascaraReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public TipoTeclaMascara_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara_param_return tipoteclamascaraParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			TipoTeclaMascara_param_return tipoteclamascaraReturnGeneral=new TipoTeclaMascara_param_return();
	
			
			this.connexion.commit();
			
			return tipoteclamascaraReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoTeclaMascara_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,TipoTeclaMascara_param_return tipoteclamascaraParameterGeneral,Boolean isEsNuevoTipoTeclaMascara,ArrayList<Classe> clases)throws Exception {
		 try {	
			TipoTeclaMascara_param_return tipoteclamascaraReturnGeneral=new TipoTeclaMascara_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipoteclamascaraReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return tipoteclamascaraReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public TipoTeclaMascara_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<TipoTeclaMascara> tipoteclamascaras,TipoTeclaMascara tipoteclamascara,TipoTeclaMascara_param_return tipoteclamascaraParameterGeneral,Boolean isEsNuevoTipoTeclaMascara,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			TipoTeclaMascara_param_return tipoteclamascaraReturnGeneral=new TipoTeclaMascara_param_return();
	
			tipoteclamascaraReturnGeneral.setTipoTeclaMascara(tipoteclamascara);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				tipoteclamascaraReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return tipoteclamascaraReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public TipoTeclaMascara_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,TipoTeclaMascara_param_return tipoteclamascaraParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,TipoTeclaMascara.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			TipoTeclaMascara_param_return tipoteclamascaraReturnGeneral=new TipoTeclaMascara_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.tipoteclamascaras=new ArrayList<TipoTeclaMascara>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.tipoteclamascara=new TipoTeclaMascara();
				
				
				if(conColumnasBase) {this.tipoteclamascara.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.tipoteclamascara.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.tipoteclamascara.setcodigo(arrColumnas[iColumn++]);
				this.tipoteclamascara.setnombre(arrColumnas[iColumn++]);
				
				this.tipoteclamascaras.add(this.tipoteclamascara);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			tipoteclamascaraReturnGeneral.setConRetornoEstaProcesado(true);
			tipoteclamascaraReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return tipoteclamascaraReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<TipoTeclaMascara> tipoteclamascarasAux= new ArrayList<TipoTeclaMascara>();
		
		for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras) {
			if(!tipoteclamascara.getIsDeleted()) {
				tipoteclamascarasAux.add(tipoteclamascara);
			}
		}
		
		tipoteclamascaras=tipoteclamascarasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<TipoTeclaMascara> tipoteclamascarasAux= new ArrayList<TipoTeclaMascara>();
		
		for(TipoTeclaMascara tipoteclamascara : this.tipoteclamascaras) {
			if(tipoteclamascara==null) {
				tipoteclamascarasAux.add(tipoteclamascara);
			}
		}
		
		//this.tipoteclamascaras=tipoteclamascarasAux;
		
		this.tipoteclamascaras.removeAll(tipoteclamascarasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(tipoteclamascara.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((tipoteclamascara.getIsDeleted() || (tipoteclamascara.getIsChanged()&&!tipoteclamascara.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=tipoteclamascaraDataAccess.getSetVersionRow(connexion,tipoteclamascara.getId());
				
				if(!tipoteclamascara.getVersionRow().equals(timestamp)) {	
					tipoteclamascara.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				tipoteclamascara.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(tipoteclamascara.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((tipoteclamascara.getIsDeleted() || (tipoteclamascara.getIsChanged()&&!tipoteclamascara.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=tipoteclamascaraDataAccess.getSetVersionRow(connexion,tipoteclamascara.getId());
			
			try {							
				if(!tipoteclamascara.getVersionRow().equals(timestamp)) {	
					tipoteclamascara.setVersionRow(timestamp);
				}
				
				tipoteclamascara.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(tipoteclamascaras!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(tipoteclamascaraAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipoteclamascaraAux.getIsDeleted() || (tipoteclamascaraAux.getIsChanged()&&!tipoteclamascaraAux.getIsNew())) {
						
						timestamp=tipoteclamascaraDataAccess.getSetVersionRow(connexion,tipoteclamascaraAux.getId());
						
						if(!tipoteclamascara.getVersionRow().equals(timestamp)) {	
							tipoteclamascaraAux.setVersionRow(timestamp);
						}
								
						tipoteclamascaraAux.setIsChangedAuxiliar(false);														
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
		if(tipoteclamascaras!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascaras) {
					if(tipoteclamascaraAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(tipoteclamascaraAux.getIsDeleted() || (tipoteclamascaraAux.getIsChanged()&&!tipoteclamascaraAux.getIsNew())) {
						
						timestamp=tipoteclamascaraDataAccess.getSetVersionRow(connexion,tipoteclamascaraAux.getId());
						
						if(!tipoteclamascaraAux.getVersionRow().equals(timestamp)) {	
							tipoteclamascaraAux.setVersionRow(timestamp);
						}
						
													
						tipoteclamascaraAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	
	public void deepLoad(TipoTeclaMascara tipoteclamascara,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//TipoTeclaMascara_logic_add.updateTipoTeclaMascaraToGet(tipoteclamascara,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(TipoTeclaMascara tipoteclamascara,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoTeclaMascara.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(tipoteclamascara,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoTeclaMascara_util.refrescarFKsDescripciones(tipoteclamascara);
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
			this.deepLoad(this.tipoteclamascara,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				TipoTeclaMascara_util.refrescarFKsDescripciones(this.tipoteclamascara);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(TipoTeclaMascara.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(tipoteclamascaras!=null) {
				for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras) {
					this.deepLoad(tipoteclamascara,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					TipoTeclaMascara_util.refrescarFKsDescripciones(tipoteclamascaras);
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
			if(tipoteclamascaras!=null) {
				for(TipoTeclaMascara tipoteclamascara:tipoteclamascaras) {
					this.deepLoad(tipoteclamascara,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					TipoTeclaMascara_util.refrescarFKsDescripciones(tipoteclamascaras);
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
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(TipoTeclaMascara_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoTeclaMascaraDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,TipoTeclaMascara tipoteclamascara,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(TipoTeclaMascara_util.IS_CON_AUDITORIA) {
				if(tipoteclamascara.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoTeclaMascaraDataAccess.TABLENAME, tipoteclamascara.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoTeclaMascara_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoTeclaMascara_logic.registrarAuditoriaDetalles(connexion,tipoteclamascara,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(tipoteclamascara.getIsDeleted()) {
					/*if(!tipoteclamascara.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,TipoTeclaMascaraDataAccess.TABLENAME, tipoteclamascara.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////TipoTeclaMascara_logic.registrarAuditoriaDetalles(connexion,tipoteclamascara,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoTeclaMascaraDataAccess.TABLENAME, tipoteclamascara.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(tipoteclamascara.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,TipoTeclaMascaraDataAccess.TABLENAME, tipoteclamascara.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(TipoTeclaMascara_util.IS_CON_AUDITORIA_DETALLE) {
						////TipoTeclaMascara_logic.registrarAuditoriaDetalles(connexion,tipoteclamascara,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,TipoTeclaMascara tipoteclamascara)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(tipoteclamascara.getIsNew()||!tipoteclamascara.getcodigo().equals(tipoteclamascara.getTipoTeclaMascaraOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(tipoteclamascara.getTipoTeclaMascaraOriginal().getcodigo()!=null)
				{
					strValorActual=tipoteclamascara.getTipoTeclaMascaraOriginal().getcodigo();
				}
				if(tipoteclamascara.getcodigo()!=null)
				{
					strValorNuevo=tipoteclamascara.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),TipoTeclaMascaraConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(tipoteclamascara.getIsNew()||!tipoteclamascara.getnombre().equals(tipoteclamascara.getTipoTeclaMascaraOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(tipoteclamascara.getTipoTeclaMascaraOriginal().getnombre()!=null)
				{
					strValorActual=tipoteclamascara.getTipoTeclaMascaraOriginal().getnombre();
				}
				if(tipoteclamascara.getnombre()!=null)
				{
					strValorNuevo=tipoteclamascara.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),TipoTeclaMascaraConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoTeclaMascara_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=TipoTeclaMascara_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	

	public void setTipoTeclaMascara(TipoTeclaMascara newTipoTeclaMascara) {
		this.tipoteclamascara = newTipoTeclaMascara;
	}
	
	public TipoTeclaMascara_data getTipoTeclaMascaraDataAccess() {
		return tipoteclamascaraDataAccess;
	}
	
	public void setTipoTeclaMascaraDataAccess(TipoTeclaMascara_data newtipoteclamascaraDataAccess) {
		this.tipoteclamascaraDataAccess = newtipoteclamascaraDataAccess;
	}

	public void setTipoTeclaMascaras(List<TipoTeclaMascara> newTipoTeclaMascaras) {
		this.tipoteclamascaras = newTipoTeclaMascaras;
	}
	
	public Object getTipoTeclaMascaraObject() {	
		this.tipoteclamascaraObject=this.tipoteclamascaraDataAccess.getEntityObject();
		return this.tipoteclamascaraObject;
	}
		
	public void setTipoTeclaMascaraObject(Object newTipoTeclaMascaraObject) {
		this.tipoteclamascaraObject = newTipoTeclaMascaraObject;
	}
	
	public List<Object> getTipoTeclaMascarasObject() {		
		this.tipoteclamascarasObject=this.tipoteclamascaraDataAccess.getEntitiesObject();
		return this.tipoteclamascarasObject;
	}
		
	public void setTipoTeclaMascarasObject(List<Object> newTipoTeclaMascarasObject) {
		this.tipoteclamascarasObject = newTipoTeclaMascarasObject;
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
