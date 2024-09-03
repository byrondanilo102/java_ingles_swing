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
package com.bydan.ingles.seguridad.perfilopcion.business.logic;


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
import com.bydan.ingles.seguridad.perfilopcion.util.*;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_param_return;
//import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcionParameterGeneral;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
//import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic_add;
import com.bydan.ingles.seguridad.perfilopcion.business.data.*;
import com.bydan.ingles.seguridad.perfilopcion.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class PerfilOpcion_logic  extends GeneralEntityLogic implements PerfilOpcion_logicI {
	static Logger logger = Logger.getLogger("PerfilOpcion_logic.class");	

	protected PerfilOpcion_data perfilopcionDataAccess; 	
	protected PerfilOpcion perfilopcion;
	protected List<PerfilOpcion> perfilopcions;
	protected Object perfilopcionObject;	
	protected List<Object> perfilopcionsObject;
	
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
	
	
	
	
	
	
	public PerfilOpcion_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.perfilopcionDataAccess = new PerfilOpcion_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			PerfilOpcion_data.ActualizarQueries();
			
			//this.perfilopcionDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.perfilopcions= new ArrayList<PerfilOpcion>();
			this.perfilopcion= new PerfilOpcion();
			
			this.perfilopcionObject=new Object();
			this.perfilopcionsObject=new ArrayList<Object>();
				
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
			
			this.perfilopcionDataAccess.setConnexionType(this.connexionType);
			this.perfilopcionDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public PerfilOpcion_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.perfilopcionDataAccess = new PerfilOpcion_data();
			this.perfilopcions= new ArrayList<PerfilOpcion>();
			this.perfilopcion= new PerfilOpcion();
			this.perfilopcionObject=new Object();
			this.perfilopcionsObject=new ArrayList<Object>();
			
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
			
			this.perfilopcionDataAccess.setConnexionType(this.connexionType);
			this.perfilopcionDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public PerfilOpcion getPerfilOpcion() throws Exception {	
		//PerfilOpcion_logic_add.checkPerfilOpcionToGet(perfilopcion,this.datosCliente,this.arrDatoGeneral);
		//PerfilOpcion_logic_add.updatePerfilOpcionToGet(perfilopcion,this.arrDatoGeneral);
		
		return perfilopcion;
	}
	
	public List<PerfilOpcion> getPerfilOpcions() throws Exception {		
		if(this.perfilopcions==null) {
			this.perfilopcions= new ArrayList<PerfilOpcion>();
		}
		
		this.quitarsNulos();
		
		//PerfilOpcion_logic_add.checkPerfilOpcionToGets(perfilopcions,this.datosCliente,this.arrDatoGeneral);
		
		for (PerfilOpcion perfilopcionLocal: perfilopcions ) {
			//PerfilOpcion_logic_add.updatePerfilOpcionToGet(perfilopcionLocal,this.arrDatoGeneral);
		}
		
		return perfilopcions;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.perfilopcionDataAccess!=null) {
			this.perfilopcionDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			perfilopcionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			perfilopcionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		perfilopcion = new  PerfilOpcion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilopcion=perfilopcionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
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
		perfilopcion = new  PerfilOpcion();
		  		  
        try {
			
			perfilopcion=perfilopcionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		perfilopcion = new  PerfilOpcion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilopcion=perfilopcionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
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
		perfilopcion = new  PerfilOpcion();
		  		  
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
		perfilopcion = new  PerfilOpcion();
		  		  
        try {
			
			perfilopcion=perfilopcionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		perfilopcion = new  PerfilOpcion();
		  		  
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
		perfilopcion = new  PerfilOpcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =perfilopcionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilopcion = new  PerfilOpcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=perfilopcionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilopcion = new  PerfilOpcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =perfilopcionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilopcion = new  PerfilOpcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=perfilopcionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilopcion = new  PerfilOpcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =perfilopcionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilopcion = new  PerfilOpcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=perfilopcionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		perfilopcion = new  PerfilOpcion();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcion=perfilopcionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilopcion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
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
		perfilopcion = new  PerfilOpcion();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcion=perfilopcionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilopcion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		  		  
        try {
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		perfilopcions = new  ArrayList<PerfilOpcion>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
		perfilopcions = new  ArrayList<PerfilOpcion>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilopcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(PerfilOpcion perfilopcion) throws Exception {
		Boolean estaValidado=false;
		
		if(perfilopcion.getIsNew() || perfilopcion.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<PerfilOpcion> PerfilOpcions) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(PerfilOpcion perfilopcionLocal:perfilopcions) {				
			estaValidadoObjeto=this.validarGuardar(perfilopcionLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<PerfilOpcion> PerfilOpcions) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilopcions)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(PerfilOpcion PerfilOpcion) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilopcion)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(PerfilOpcion perfilopcion) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+perfilopcion.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"perfilopcion","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(PerfilOpcion_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(PerfilOpcion_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//PerfilOpcion_logic_add.checkPerfilOpcionToSave(this.perfilopcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilOpcion_logic_add.updatePerfilOpcionToSave(this.perfilopcion,this.arrDatoGeneral);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilopcion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilOpcion_util.permiteMantenimiento(this.perfilopcion) && this.validarGuardar(this.perfilopcion)) {
				PerfilOpcion_data.save(this.perfilopcion, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);				
			}

			//PerfilOpcion_logic_add.checkPerfilOpcionToSaveAfter(this.perfilopcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.perfilopcion.getIsDeleted()) {
				this.perfilopcion=null;
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
			
			//PerfilOpcion_logic_add.checkPerfilOpcionToSave(this.perfilopcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilOpcion_logic_add.updatePerfilOpcionToSave(this.perfilopcion,this.arrDatoGeneral);
			
			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilopcion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilOpcion_util.permiteMantenimiento(this.perfilopcion) && this.validarGuardar(this.perfilopcion)) {			
				PerfilOpcion_data.save(this.perfilopcion, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);				
			}
			
			//PerfilOpcion_logic_add.checkPerfilOpcionToSaveAfter(this.perfilopcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.perfilopcion.getIsDeleted()) {
				this.perfilopcion=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//PerfilOpcion_logic_add.checkPerfilOpcionToSaves(perfilopcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPerfilOpcion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilOpcion perfilopcionLocal:perfilopcions) {		
				
				if(!PerfilOpcion_util.permiteMantenimiento(perfilopcionLocal)) {
					continue;
				}
				
				//PerfilOpcion_logic_add.updatePerfilOpcionToSave(perfilopcionLocal,this.arrDatoGeneral);
	        	
				PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilopcionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilopcionLocal)) {
					PerfilOpcion_data.save(perfilopcionLocal, connexion);				
				} else {
					validadoTodosPerfilOpcion=false;
				}
			}
			
			if(!validadoTodosPerfilOpcion) {
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
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}
			
			//PerfilOpcion_logic_add.checkPerfilOpcionToSavesAfter(perfilopcions,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//PerfilOpcion_logic_add.checkPerfilOpcionToSaves(perfilopcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPerfilOpcion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilOpcion perfilopcionLocal:perfilopcions) {				
				if(!PerfilOpcion_util.permiteMantenimiento(perfilopcionLocal)) {
					continue;
				}
				
				//PerfilOpcion_logic_add.updatePerfilOpcionToSave(perfilopcionLocal,this.arrDatoGeneral);
	        	
				PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilopcionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilopcionLocal)) {				
					PerfilOpcion_data.save(perfilopcionLocal, connexion);				
				} else {
					validadoTodosPerfilOpcion=false;
				}
			}
			
			if(!validadoTodosPerfilOpcion) {
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
				
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}

			//PerfilOpcion_logic_add.checkPerfilOpcionToSavesAfter(perfilopcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilOpcion_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilOpcion> perfilopcions,PerfilOpcion_param_return perfilopcionParameterGeneral)throws Exception {
		 try {	
			PerfilOpcion_param_return perfilopcionReturnGeneral=new PerfilOpcion_param_return();
	
			
			return perfilopcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilOpcion_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilOpcion> perfilopcions,PerfilOpcion_param_return perfilopcionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilOpcion_param_return perfilopcionReturnGeneral=new PerfilOpcion_param_return();
	
			
			this.connexion.commit();
			
			return perfilopcionReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilOpcion_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,PerfilOpcion_param_return perfilopcionParameterGeneral,Boolean isEsNuevoPerfilOpcion,ArrayList<Classe> clases)throws Exception {
		 try {	
			PerfilOpcion_param_return perfilopcionReturnGeneral=new PerfilOpcion_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilopcionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return perfilopcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public PerfilOpcion_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilOpcion> perfilopcions,PerfilOpcion perfilopcion,PerfilOpcion_param_return perfilopcionParameterGeneral,Boolean isEsNuevoPerfilOpcion,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			PerfilOpcion_param_return perfilopcionReturnGeneral=new PerfilOpcion_param_return();
	
			perfilopcionReturnGeneral.setPerfilOpcion(perfilopcion);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilopcionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return perfilopcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilOpcion_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,PerfilOpcion_param_return perfilopcionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilOpcion_param_return perfilopcionReturnGeneral=new PerfilOpcion_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.perfilopcions=new ArrayList<PerfilOpcion>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.perfilopcion=new PerfilOpcion();
				
				
				if(conColumnasBase) {this.perfilopcion.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.perfilopcion.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.perfilopcion.settodo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setingreso(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setmodificacion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.seteliminacion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setguardar_cambios(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setconsulta(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setbusqueda(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setreporte(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setorden(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setpaginacion_medio(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setpaginacion_alto(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setpaginacion_todo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setduplicar(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setcopiar(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilopcion.setcon_precargar(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.perfilopcions.add(this.perfilopcion);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			perfilopcionReturnGeneral.setConRetornoEstaProcesado(true);
			perfilopcionReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return perfilopcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<PerfilOpcion> perfilopcionsAux= new ArrayList<PerfilOpcion>();
		
		for(PerfilOpcion perfilopcion:perfilopcions) {
			if(!perfilopcion.getIsDeleted()) {
				perfilopcionsAux.add(perfilopcion);
			}
		}
		
		perfilopcions=perfilopcionsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<PerfilOpcion> perfilopcionsAux= new ArrayList<PerfilOpcion>();
		
		for(PerfilOpcion perfilopcion : this.perfilopcions) {
			if(perfilopcion==null) {
				perfilopcionsAux.add(perfilopcion);
			}
		}
		
		//this.perfilopcions=perfilopcionsAux;
		
		this.perfilopcions.removeAll(perfilopcionsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(perfilopcion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((perfilopcion.getIsDeleted() || (perfilopcion.getIsChanged()&&!perfilopcion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=perfilopcionDataAccess.getSetVersionRow(connexion,perfilopcion.getId());
				
				if(!perfilopcion.getVersionRow().equals(timestamp)) {	
					perfilopcion.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				perfilopcion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(perfilopcion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((perfilopcion.getIsDeleted() || (perfilopcion.getIsChanged()&&!perfilopcion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=perfilopcionDataAccess.getSetVersionRow(connexion,perfilopcion.getId());
			
			try {							
				if(!perfilopcion.getVersionRow().equals(timestamp)) {	
					perfilopcion.setVersionRow(timestamp);
				}
				
				perfilopcion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(perfilopcions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(PerfilOpcion perfilopcionAux:perfilopcions) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(perfilopcionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilopcionAux.getIsDeleted() || (perfilopcionAux.getIsChanged()&&!perfilopcionAux.getIsNew())) {
						
						timestamp=perfilopcionDataAccess.getSetVersionRow(connexion,perfilopcionAux.getId());
						
						if(!perfilopcion.getVersionRow().equals(timestamp)) {	
							perfilopcionAux.setVersionRow(timestamp);
						}
								
						perfilopcionAux.setIsChangedAuxiliar(false);														
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
		if(perfilopcions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(PerfilOpcion perfilopcionAux:perfilopcions) {
					if(perfilopcionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilopcionAux.getIsDeleted() || (perfilopcionAux.getIsChanged()&&!perfilopcionAux.getIsNew())) {
						
						timestamp=perfilopcionDataAccess.getSetVersionRow(connexion,perfilopcionAux.getId());
						
						if(!perfilopcionAux.getVersionRow().equals(timestamp)) {	
							perfilopcionAux.setVersionRow(timestamp);
						}
						
													
						perfilopcionAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public PerfilOpcion_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalPerfil,String finalQueryGlobalOpcion) throws Exception {
		PerfilOpcion_param_return  perfilopcion_return =new PerfilOpcion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-cargarCombosLoteForeignKeyPerfilOpcionWithConnection");
			
			this.connexion.begin();
			
			perfilopcion_return =new PerfilOpcion_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilopcion_return.setperfilsFK(perfilsForeignKey);


			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			perfilopcion_return.setopcionsFK(opcionsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return perfilopcion_return;
	}
	
	public PerfilOpcion_param_return cargarCombosLoteFK(String finalQueryGlobalPerfil,String finalQueryGlobalOpcion) throws Exception {
		PerfilOpcion_param_return  perfilopcion_return =new PerfilOpcion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			perfilopcion_return =new PerfilOpcion_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilopcion_return.setperfilsFK(perfilsForeignKey);


			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			perfilopcion_return.setopcionsFK(opcionsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return perfilopcion_return;
	}
	
	
	public void deepLoad(PerfilOpcion perfilopcion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//PerfilOpcion_logic_add.updatePerfilOpcionToGet(perfilopcion,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
		perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
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
			perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilopcion.getPerfil(),isDeep,deepLoadType,clases);
				
		perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(perfilopcion.getOpcion(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfilopcion.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(perfilopcion.getOpcion(),isDeep,deepLoadType,clases);				
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
			perfilopcion.setPerfil(perfilopcionDataAccess.getPerfil(connexion,perfilopcion));
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfilopcion.getPerfil(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilopcion.setOpcion(perfilopcionDataAccess.getOpcion(connexion,perfilopcion));
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(perfilopcion.getOpcion(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(PerfilOpcion perfilopcion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//PerfilOpcion_logic_add.updatePerfilOpcionToSave(perfilopcion,this.arrDatoGeneral);
			
PerfilOpcion_data.save(perfilopcion, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilopcion.getPerfil(),connexion);

		Opcion_data.save(perfilopcion.getOpcion(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilopcion.getPerfil(),connexion);
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(perfilopcion.getOpcion(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilopcion.getPerfil(),connexion);
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilopcion.getPerfil(),isDeep,deepLoadType,clases);
				

		Opcion_data.save(perfilopcion.getOpcion(),connexion);
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(perfilopcion.getOpcion(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilopcion.getPerfil(),connexion);
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepSave(perfilopcion.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(perfilopcion.getOpcion(),connexion);
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepSave(perfilopcion.getOpcion(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(PerfilOpcion.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(perfilopcion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilOpcion_util.refrescarFKsDescripciones(perfilopcion);
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
			this.deepLoad(this.perfilopcion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PerfilOpcion.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(perfilopcions!=null) {
				for(PerfilOpcion perfilopcion:perfilopcions) {
					this.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					PerfilOpcion_util.refrescarFKsDescripciones(perfilopcions);
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
			if(perfilopcions!=null) {
				for(PerfilOpcion perfilopcion:perfilopcions) {
					this.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					PerfilOpcion_util.refrescarFKsDescripciones(perfilopcions);
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
			this.getNewConnexionToDeep(PerfilOpcion.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(perfilopcion,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(PerfilOpcion.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(perfilopcions!=null) {
				for(PerfilOpcion perfilopcion:perfilopcions) {
					this.deepSave(perfilopcion,isDeep,deepLoadType,clases);
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
			if(perfilopcions!=null) {
				for(PerfilOpcion perfilopcion:perfilopcions) {
					this.deepSave(perfilopcion,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdPerfilPorIdOpcionWithConnection(String sFinalQuery,Pagination pagination,Long id_perfil,Long id_opcion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdPerfilPorIdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdPerfilPorIdOpcion(String sFinalQuery,Pagination pagination,Long id_perfil,Long id_opcion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdPerfilPorIdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdOpcionWithConnection(String sFinalQuery,Pagination pagination,Long id_opcion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
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
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilOpcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilopcions=perfilopcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorIdPerfilPorIdOpcionWithConnection(Long id_perfil,Long id_opcion)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilOpcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			perfilopcion=perfilopcionDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorIdPerfilPorIdOpcion(Long id_perfil,Long id_opcion)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilOpcion_util.IDPERFIL,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,PerfilOpcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			perfilopcion=perfilopcionDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.perfilopcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				PerfilOpcion_util.refrescarFKsDescripciones(this.perfilopcion);
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
			if(PerfilOpcion_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilOpcionDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,PerfilOpcion perfilopcion,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PerfilOpcion_util.IS_CON_AUDITORIA) {
				if(perfilopcion.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilOpcionDataAccess.TABLENAME, perfilopcion.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilOpcion_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilOpcion_logic.registrarAuditoriaDetalles(connexion,perfilopcion,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(perfilopcion.getIsDeleted()) {
					/*if(!perfilopcion.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PerfilOpcionDataAccess.TABLENAME, perfilopcion.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//PerfilOpcion_logic.registrarAuditoriaDetalles(connexion,perfilopcion,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilOpcionDataAccess.TABLENAME, perfilopcion.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(perfilopcion.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilOpcionDataAccess.TABLENAME, perfilopcion.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilOpcion_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilOpcion_logic.registrarAuditoriaDetalles(connexion,perfilopcion,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,PerfilOpcion perfilopcion)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(perfilopcion.getIsNew()||!perfilopcion.getid_perfil().equals(perfilopcion.getPerfilOpcionOriginal().getid_perfil()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getid_perfil()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getid_perfil().toString();
				}
				if(perfilopcion.getid_perfil()!=null)
				{
					strValorNuevo=perfilopcion.getid_perfil().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.IDPERFIL,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getid_opcion().equals(perfilopcion.getPerfilOpcionOriginal().getid_opcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getid_opcion()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getid_opcion().toString();
				}
				if(perfilopcion.getid_opcion()!=null)
				{
					strValorNuevo=perfilopcion.getid_opcion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.IDOPCION,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.gettodo().equals(perfilopcion.getPerfilOpcionOriginal().gettodo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().gettodo()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().gettodo().toString();
				}
				if(perfilopcion.gettodo()!=null)
				{
					strValorNuevo=perfilopcion.gettodo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.TODO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getingreso().equals(perfilopcion.getPerfilOpcionOriginal().getingreso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getingreso()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getingreso().toString();
				}
				if(perfilopcion.getingreso()!=null)
				{
					strValorNuevo=perfilopcion.getingreso().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.INGRESO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getmodificacion().equals(perfilopcion.getPerfilOpcionOriginal().getmodificacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getmodificacion()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getmodificacion().toString();
				}
				if(perfilopcion.getmodificacion()!=null)
				{
					strValorNuevo=perfilopcion.getmodificacion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.MODIFICACION,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.geteliminacion().equals(perfilopcion.getPerfilOpcionOriginal().geteliminacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().geteliminacion()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().geteliminacion().toString();
				}
				if(perfilopcion.geteliminacion()!=null)
				{
					strValorNuevo=perfilopcion.geteliminacion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.ELIMINACION,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getguardar_cambios().equals(perfilopcion.getPerfilOpcionOriginal().getguardar_cambios()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getguardar_cambios()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getguardar_cambios().toString();
				}
				if(perfilopcion.getguardar_cambios()!=null)
				{
					strValorNuevo=perfilopcion.getguardar_cambios().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.GUARDARCAMBIOS,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getconsulta().equals(perfilopcion.getPerfilOpcionOriginal().getconsulta()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getconsulta()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getconsulta().toString();
				}
				if(perfilopcion.getconsulta()!=null)
				{
					strValorNuevo=perfilopcion.getconsulta().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.CONSULTA,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getbusqueda().equals(perfilopcion.getPerfilOpcionOriginal().getbusqueda()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getbusqueda()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getbusqueda().toString();
				}
				if(perfilopcion.getbusqueda()!=null)
				{
					strValorNuevo=perfilopcion.getbusqueda().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.BUSQUEDA,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getreporte().equals(perfilopcion.getPerfilOpcionOriginal().getreporte()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getreporte()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getreporte().toString();
				}
				if(perfilopcion.getreporte()!=null)
				{
					strValorNuevo=perfilopcion.getreporte().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.REPORTE,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getestado().equals(perfilopcion.getPerfilOpcionOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getestado()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getestado().toString();
				}
				if(perfilopcion.getestado()!=null)
				{
					strValorNuevo=perfilopcion.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getorden().equals(perfilopcion.getPerfilOpcionOriginal().getorden()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getorden()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getorden().toString();
				}
				if(perfilopcion.getorden()!=null)
				{
					strValorNuevo=perfilopcion.getorden().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.ORDEN,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getpaginacion_medio().equals(perfilopcion.getPerfilOpcionOriginal().getpaginacion_medio()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getpaginacion_medio()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getpaginacion_medio().toString();
				}
				if(perfilopcion.getpaginacion_medio()!=null)
				{
					strValorNuevo=perfilopcion.getpaginacion_medio().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.PAGINACIONMEDIO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getpaginacion_alto().equals(perfilopcion.getPerfilOpcionOriginal().getpaginacion_alto()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getpaginacion_alto()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getpaginacion_alto().toString();
				}
				if(perfilopcion.getpaginacion_alto()!=null)
				{
					strValorNuevo=perfilopcion.getpaginacion_alto().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.PAGINACIONALTO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getpaginacion_todo().equals(perfilopcion.getPerfilOpcionOriginal().getpaginacion_todo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getpaginacion_todo()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getpaginacion_todo().toString();
				}
				if(perfilopcion.getpaginacion_todo()!=null)
				{
					strValorNuevo=perfilopcion.getpaginacion_todo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.PAGINACIONTODO,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getduplicar().equals(perfilopcion.getPerfilOpcionOriginal().getduplicar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getduplicar()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getduplicar().toString();
				}
				if(perfilopcion.getduplicar()!=null)
				{
					strValorNuevo=perfilopcion.getduplicar().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.DUPLICAR,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getcopiar().equals(perfilopcion.getPerfilOpcionOriginal().getcopiar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getcopiar()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getcopiar().toString();
				}
				if(perfilopcion.getcopiar()!=null)
				{
					strValorNuevo=perfilopcion.getcopiar().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.COPIAR,strValorActual,strValorNuevo);
			}	
			
			if(perfilopcion.getIsNew()||!perfilopcion.getcon_precargar().equals(perfilopcion.getPerfilOpcionOriginal().getcon_precargar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilopcion.getPerfilOpcionOriginal().getcon_precargar()!=null)
				{
					strValorActual=perfilopcion.getPerfilOpcionOriginal().getcon_precargar().toString();
				}
				if(perfilopcion.getcon_precargar()!=null)
				{
					strValorNuevo=perfilopcion.getcon_precargar().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilOpcionConstantesFunciones.CONPRECARGAR,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(PerfilOpcion perfilopcion) throws Exception {

		if(!perfilopcion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilopcion,true);
		}
	}

	public void saveRelaciones(PerfilOpcion perfilopcion)throws Exception {

		if(!perfilopcion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilopcion,false);
		}
	}

	public void saveRelacionesBase(PerfilOpcion perfilopcion,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("PerfilOpcion-saveRelacionesWithConnection");}
	

			this.setPerfilOpcion(perfilopcion);

			if(true) {

				//PerfilOpcion_logic_add.updateRelacionesToSave(perfilopcion,this);

				if((perfilopcion.getIsNew()||perfilopcion.getIsChanged())&&!perfilopcion.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(perfilopcion.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//PerfilOpcion_logic_add.updateRelacionesToSaveAfter(perfilopcion,this);

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
			ArrayList<Classe> classes=PerfilOpcion_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PerfilOpcion_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPerfilOpcion(PerfilOpcion newPerfilOpcion) {
		this.perfilopcion = newPerfilOpcion;
	}
	
	public PerfilOpcion_data getPerfilOpcionDataAccess() {
		return perfilopcionDataAccess;
	}
	
	public void setPerfilOpcionDataAccess(PerfilOpcion_data newperfilopcionDataAccess) {
		this.perfilopcionDataAccess = newperfilopcionDataAccess;
	}

	public void setPerfilOpcions(List<PerfilOpcion> newPerfilOpcions) {
		this.perfilopcions = newPerfilOpcions;
	}
	
	public Object getPerfilOpcionObject() {	
		this.perfilopcionObject=this.perfilopcionDataAccess.getEntityObject();
		return this.perfilopcionObject;
	}
		
	public void setPerfilOpcionObject(Object newPerfilOpcionObject) {
		this.perfilopcionObject = newPerfilOpcionObject;
	}
	
	public List<Object> getPerfilOpcionsObject() {		
		this.perfilopcionsObject=this.perfilopcionDataAccess.getEntitiesObject();
		return this.perfilopcionsObject;
	}
		
	public void setPerfilOpcionsObject(List<Object> newPerfilOpcionsObject) {
		this.perfilopcionsObject = newPerfilOpcionsObject;
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
