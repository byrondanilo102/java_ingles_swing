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
package com.bydan.ingles.seguridad.opcion.business.logic;


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
import com.bydan.ingles.seguridad.opcion.util.*;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;
import com.bydan.ingles.seguridad.opcion.util.Opcion_param_return;
//import com.bydan.ingles.seguridad.opcion.util.OpcionParameterGeneral;
import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
//import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic_add;
import com.bydan.ingles.seguridad.opcion.business.data.*;
import com.bydan.ingles.seguridad.opcion.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.business.data.PerfilOpcion_data;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.campo.util.Campo_util;

//REL DETALLES


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;










@SuppressWarnings({"unused"})
public class Opcion_logic  extends GeneralEntityLogic implements Opcion_logicI {
	static Logger logger = Logger.getLogger("Opcion_logic.class");	

	protected Opcion_data opcionDataAccess; 	
	protected Opcion opcion;
	protected List<Opcion> opcions;
	protected Object opcionObject;	
	protected List<Object> opcionsObject;
	
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
	
	
	
	
	
	
	public Opcion_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.opcionDataAccess = new Opcion_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Opcion_data.ActualizarQueries();
			
			//this.opcionDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.opcions= new ArrayList<Opcion>();
			this.opcion= new Opcion();
			
			this.opcionObject=new Object();
			this.opcionsObject=new ArrayList<Object>();
				
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
			
			this.opcionDataAccess.setConnexionType(this.connexionType);
			this.opcionDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Opcion_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.opcionDataAccess = new Opcion_data();
			this.opcions= new ArrayList<Opcion>();
			this.opcion= new Opcion();
			this.opcionObject=new Object();
			this.opcionsObject=new ArrayList<Object>();
			
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
			
			this.opcionDataAccess.setConnexionType(this.connexionType);
			this.opcionDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Opcion getOpcion() throws Exception {	
		//Opcion_logic_add.checkOpcionToGet(opcion,this.datosCliente,this.arrDatoGeneral);
		//Opcion_logic_add.updateOpcionToGet(opcion,this.arrDatoGeneral);
		
		return opcion;
	}
	
	public List<Opcion> getOpcions() throws Exception {		
		if(this.opcions==null) {
			this.opcions= new ArrayList<Opcion>();
		}
		
		this.quitarsNulos();
		
		//Opcion_logic_add.checkOpcionToGets(opcions,this.datosCliente,this.arrDatoGeneral);
		
		for (Opcion opcionLocal: opcions ) {
			//Opcion_logic_add.updateOpcionToGet(opcionLocal,this.arrDatoGeneral);
		}
		
		return opcions;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.opcionDataAccess!=null) {
			this.opcionDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			opcionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			opcionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		opcion = new  Opcion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			opcion=opcionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
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
		opcion = new  Opcion();
		  		  
        try {
			
			opcion=opcionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		opcion = new  Opcion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			opcion=opcionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
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
		opcion = new  Opcion();
		  		  
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
		opcion = new  Opcion();
		  		  
        try {
			
			opcion=opcionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		opcion = new  Opcion();
		  		  
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
		opcion = new  Opcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =opcionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		opcion = new  Opcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=opcionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		opcion = new  Opcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =opcionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		opcion = new  Opcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=opcionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		opcion = new  Opcion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =opcionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		opcion = new  Opcion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=opcionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		opcions = new  ArrayList<Opcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		  		  
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
		opcions = new  ArrayList<Opcion>();
		  		  
        try {			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		opcions = new  ArrayList<Opcion>();
		  		  
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
		opcions = new  ArrayList<Opcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		  		  
        try {
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		opcion = new  Opcion();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcion=opcionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(opcion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
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
		opcion = new  Opcion();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcion=opcionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(opcion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		opcions = new  ArrayList<Opcion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		  		  
        try {
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		opcions = new  ArrayList<Opcion>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
		opcions = new  ArrayList<Opcion>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(opcions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Opcion opcion) throws Exception {
		Boolean estaValidado=false;
		
		if(opcion.getIsNew() || opcion.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Opcion> Opcions) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Opcion opcionLocal:opcions) {				
			estaValidadoObjeto=this.validarGuardar(opcionLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Opcion> Opcions) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(opcions)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Opcion Opcion) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(opcion)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Opcion opcion) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+opcion.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"opcion","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Opcion_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Opcion_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Opcion_logic_add.checkOpcionToSave(this.opcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Opcion_logic_add.updateOpcionToSave(this.opcion,this.arrDatoGeneral);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.opcion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Opcion_util.permiteMantenimiento(this.opcion) && this.validarGuardar(this.opcion)) {
				Opcion_data.save(this.opcion, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Opcion_util.refrescarFKsDescripciones(this.opcion);				
			}

			//Opcion_logic_add.checkOpcionToSaveAfter(this.opcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.opcion.getIsDeleted()) {
				this.opcion=null;
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
			
			//Opcion_logic_add.checkOpcionToSave(this.opcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Opcion_logic_add.updateOpcionToSave(this.opcion,this.arrDatoGeneral);
			
			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.opcion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Opcion_util.permiteMantenimiento(this.opcion) && this.validarGuardar(this.opcion)) {			
				Opcion_data.save(this.opcion, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Opcion_util.refrescarFKsDescripciones(this.opcion);				
			}
			
			//Opcion_logic_add.checkOpcionToSaveAfter(this.opcion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.opcion.getIsDeleted()) {
				this.opcion=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Opcion_logic_add.checkOpcionToSaves(opcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosOpcion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Opcion opcionLocal:opcions) {		
				
				if(!Opcion_util.permiteMantenimiento(opcionLocal)) {
					continue;
				}
				
				//Opcion_logic_add.updateOpcionToSave(opcionLocal,this.arrDatoGeneral);
	        	
				Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),opcionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(opcionLocal)) {
					Opcion_data.save(opcionLocal, connexion);				
				} else {
					validadoTodosOpcion=false;
				}
			}
			
			if(!validadoTodosOpcion) {
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
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}
			
			//Opcion_logic_add.checkOpcionToSavesAfter(opcions,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Opcion_logic_add.checkOpcionToSaves(opcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosOpcion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Opcion opcionLocal:opcions) {				
				if(!Opcion_util.permiteMantenimiento(opcionLocal)) {
					continue;
				}
				
				//Opcion_logic_add.updateOpcionToSave(opcionLocal,this.arrDatoGeneral);
	        	
				Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),opcionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(opcionLocal)) {				
					Opcion_data.save(opcionLocal, connexion);				
				} else {
					validadoTodosOpcion=false;
				}
			}
			
			if(!validadoTodosOpcion) {
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
				
				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}

			//Opcion_logic_add.checkOpcionToSavesAfter(opcions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Opcion_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Opcion> opcions,Opcion_param_return opcionParameterGeneral)throws Exception {
		 try {	
			Opcion_param_return opcionReturnGeneral=new Opcion_param_return();
	
			
			return opcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Opcion_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Opcion> opcions,Opcion_param_return opcionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Opcion_param_return opcionReturnGeneral=new Opcion_param_return();
	
			
			this.connexion.commit();
			
			return opcionReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Opcion_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Opcion> opcions,Opcion opcion,Opcion_param_return opcionParameterGeneral,Boolean isEsNuevoOpcion,ArrayList<Classe> clases)throws Exception {
		 try {	
			Opcion_param_return opcionReturnGeneral=new Opcion_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				opcionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return opcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Opcion_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Opcion> opcions,Opcion opcion,Opcion_param_return opcionParameterGeneral,Boolean isEsNuevoOpcion,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Opcion_param_return opcionReturnGeneral=new Opcion_param_return();
	
			opcionReturnGeneral.setOpcion(opcion);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				opcionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return opcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Opcion_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Opcion_param_return opcionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Opcion_param_return opcionReturnGeneral=new Opcion_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.opcions=new ArrayList<Opcion>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.opcion=new Opcion();
				
				
				if(conColumnasBase) {this.opcion.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.opcion.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.opcion.setcodigo(arrColumnas[iColumn++]);
				this.opcion.setnombre(arrColumnas[iColumn++]);
				this.opcion.setposicion(Short.parseShort(arrColumnas[iColumn++]));
				this.opcion.seticon_name(arrColumnas[iColumn++]);
				this.opcion.setnombre_clase(arrColumnas[iColumn++]);
				this.opcion.setmodulo(arrColumnas[iColumn++]);
				this.opcion.setsub_modulo(arrColumnas[iColumn++]);
			this.opcion.setpaquete(arrColumnas[iColumn++]);
				this.opcion.setes_para_menu(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.opcion.setes_guardar_relaciones(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.opcion.setcon_mostrar_acciones_campo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.opcion.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.opcions.add(this.opcion);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			opcionReturnGeneral.setConRetornoEstaProcesado(true);
			opcionReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return opcionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Opcion> opcionsAux= new ArrayList<Opcion>();
		
		for(Opcion opcion:opcions) {
			if(!opcion.getIsDeleted()) {
				opcionsAux.add(opcion);
			}
		}
		
		opcions=opcionsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Opcion> opcionsAux= new ArrayList<Opcion>();
		
		for(Opcion opcion : this.opcions) {
			if(opcion==null) {
				opcionsAux.add(opcion);
			}
		}
		
		//this.opcions=opcionsAux;
		
		this.opcions.removeAll(opcionsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(opcion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((opcion.getIsDeleted() || (opcion.getIsChanged()&&!opcion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=opcionDataAccess.getSetVersionRow(connexion,opcion.getId());
				
				if(!opcion.getVersionRow().equals(timestamp)) {	
					opcion.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				opcion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(opcion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((opcion.getIsDeleted() || (opcion.getIsChanged()&&!opcion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=opcionDataAccess.getSetVersionRow(connexion,opcion.getId());
			
			try {							
				if(!opcion.getVersionRow().equals(timestamp)) {	
					opcion.setVersionRow(timestamp);
				}
				
				opcion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(opcions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Opcion opcionAux:opcions) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(opcionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(opcionAux.getIsDeleted() || (opcionAux.getIsChanged()&&!opcionAux.getIsNew())) {
						
						timestamp=opcionDataAccess.getSetVersionRow(connexion,opcionAux.getId());
						
						if(!opcion.getVersionRow().equals(timestamp)) {	
							opcionAux.setVersionRow(timestamp);
						}
								
						opcionAux.setIsChangedAuxiliar(false);														
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
		if(opcions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Opcion opcionAux:opcions) {
					if(opcionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(opcionAux.getIsDeleted() || (opcionAux.getIsChanged()&&!opcionAux.getIsNew())) {
						
						timestamp=opcionDataAccess.getSetVersionRow(connexion,opcionAux.getId());
						
						if(!opcionAux.getVersionRow().equals(timestamp)) {	
							opcionAux.setVersionRow(timestamp);
						}
						
													
						opcionAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Opcion_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalSistema,String finalQueryGlobalOpcion) throws Exception {
		Opcion_param_return  opcion_return =new Opcion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-cargarCombosLoteForeignKeyOpcionWithConnection");
			
			this.connexion.begin();
			
			opcion_return =new Opcion_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			opcion_return.setsistemasFK(sistemasForeignKey);


			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			opcion_return.setopcionsFK(opcionsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return opcion_return;
	}
	
	public Opcion_param_return cargarCombosLoteFK(String finalQueryGlobalSistema,String finalQueryGlobalOpcion) throws Exception {
		Opcion_param_return  opcion_return =new Opcion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			opcion_return =new Opcion_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			opcion_return.setsistemasFK(sistemasForeignKey);


			List<Opcion> opcionsForeignKey=new ArrayList<Opcion>();
			Opcion_logic opcionLogic=new Opcion_logic();
			opcionLogic.setConnexion(this.connexion);
			opcionLogic.getOpcionDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				opcionLogic.getTodos(finalQueryGlobalOpcion,new Pagination());
				opcionsForeignKey=opcionLogic.getOpcions();
			}

			opcion_return.setopcionsFK(opcionsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return opcion_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			PerfilOpcion_logic perfilopcionLogic=new PerfilOpcion_logic();
			Opcion_logic opcionLogic=new Opcion_logic();
			Accion_logic accionLogic=new Accion_logic();
			Campo_logic campoLogic=new Campo_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyOpcionWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(PerfilOpcion.class));
			classes.add(new Classe(Opcion.class));
			classes.add(new Classe(Accion.class));
			classes.add(new Classe(Campo.class));
											
			

			perfilopcionLogic.setConnexion(this.getConnexion());
			perfilopcionLogic.setDatosCliente(this.datosCliente);
			perfilopcionLogic.setIsConRefrescarForeignKeys(true);

			opcionLogic.setConnexion(this.getConnexion());
			opcionLogic.setDatosCliente(this.datosCliente);
			opcionLogic.setIsConRefrescarForeignKeys(true);

			accionLogic.setConnexion(this.getConnexion());
			accionLogic.setDatosCliente(this.datosCliente);
			accionLogic.setIsConRefrescarForeignKeys(true);

			campoLogic.setConnexion(this.getConnexion());
			campoLogic.setDatosCliente(this.datosCliente);
			campoLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Opcion opcion:this.opcions) {
				

				classes=new ArrayList<Classe>();
				classes=PerfilOpcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilopcionLogic.setPerfilOpcions(opcion.perfilopcions);
				perfilopcionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				opcionLogic.setOpcions(opcion.opcions);
				opcionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Accion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				accionLogic.setAccions(opcion.accions);
				accionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Campo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				campoLogic.setCampos(opcion.campos);
				campoLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Opcion opcion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Opcion_logic_add.updateOpcionToGet(opcion,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
		opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
		opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));
		opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));
		opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));
		opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));
		opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));

				if(this.isConDeep) {
					Perfil_logic perfilLogic= new Perfil_logic(this.connexion);
					perfilLogic.setPerfils(opcion.getPerfils());
					ArrayList<Classe> classesLocal=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Perfil_util.refrescarFKsDescripciones(perfilLogic.getPerfils());
					opcion.setPerfils(perfilLogic.getPerfils());
				}

				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));

				if(this.isConDeep) {
					Opcion_logic opcionLogic= new Opcion_logic(this.connexion);
					opcionLogic.setOpcions(opcion.getOpcions());
					ArrayList<Classe> classesLocal=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					opcionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Opcion_util.refrescarFKsDescripciones(opcionLogic.getOpcions());
					opcion.setOpcions(opcionLogic.getOpcions());
				}

				continue;
			}

			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));

				if(this.isConDeep) {
					Accion_logic accionLogic= new Accion_logic(this.connexion);
					accionLogic.setAccions(opcion.getAccions());
					ArrayList<Classe> classesLocal=Accion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					accionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Accion_util.refrescarFKsDescripciones(accionLogic.getAccions());
					opcion.setAccions(accionLogic.getAccions());
				}

				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));

				if(this.isConDeep) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(this.connexion);
					perfilopcionLogic.setPerfilOpcions(opcion.getPerfilOpcions());
					ArrayList<Classe> classesLocal=PerfilOpcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilopcionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilOpcion_util.refrescarFKsDescripciones(perfilopcionLogic.getPerfilOpcions());
					opcion.setPerfilOpcions(perfilopcionLogic.getPerfilOpcions());
				}

				continue;
			}

			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));

				if(this.isConDeep) {
					Campo_logic campoLogic= new Campo_logic(this.connexion);
					campoLogic.setCampos(opcion.getCampos());
					ArrayList<Classe> classesLocal=Campo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					campoLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Campo_util.refrescarFKsDescripciones(campoLogic.getCampos());
					opcion.setCampos(campoLogic.getCampos());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
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
			opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Opcion.class));
			opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Accion.class));
			opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilOpcion.class));
			opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Campo.class));
			opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(opcion.getSistema(),isDeep,deepLoadType,clases);
				
		opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(opcion.getOpcion(),isDeep,deepLoadType,clases);
				

		opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));

		for(Perfil perfil:opcion.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
		}

		opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));

		for(Opcion opcionRecursivo:opcion.getOpcions()) {
			Opcion_logic opcionRecursivoLogic= new Opcion_logic(connexion);
			opcionRecursivoLogic.deepLoad(opcionRecursivo,isDeep,deepLoadType,clases);
		}

		opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));

		for(Accion accion:opcion.getAccions()) {
			Accion_logic accionLogic= new Accion_logic(connexion);
			accionLogic.deepLoad(accion,isDeep,deepLoadType,clases);
		}

		opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));

		for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
			PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
			perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
		}

		opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));

		for(Campo campo:opcion.getCampos()) {
			Campo_logic campoLogic= new Campo_logic(connexion);
			campoLogic.deepLoad(campo,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepLoad(opcion.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(opcion.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));

				for(Perfil perfil:opcion.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));

				for(Opcion opcionRecursivo:opcion.getOpcions()) {
					Opcion_logic opcionRecursivoLogic= new Opcion_logic(connexion);
					opcionRecursivoLogic.deepLoad(opcionRecursivo,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));

				for(Accion accion:opcion.getAccions()) {
					Accion_logic accionLogic= new Accion_logic(connexion);
					accionLogic.deepLoad(accion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));

				for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
					perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));

				for(Campo campo:opcion.getCampos()) {
					Campo_logic campoLogic= new Campo_logic(connexion);
					campoLogic.deepLoad(campo,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			opcion.setSistema(opcionDataAccess.getSistema(connexion,opcion));
			Sistema_logic sistemaLogic= new Sistema_logic(connexion);
			sistemaLogic.deepLoad(opcion.getSistema(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			opcion.setOpcion(opcionDataAccess.getOpcion(connexion,opcion));
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(opcion.getOpcion(),isDeep,deepLoadType,clases);
				
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
			opcion.setPerfils(opcionDataAccess.getPerfils(connexion,opcion));

			for(Perfil perfil:opcion.getPerfils()) {
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Opcion.class));
			opcion.setOpcions(opcionDataAccess.getOpcions(connexion,opcion));

			for(Opcion opcionRecursivo:opcion.getOpcions()) {
				Opcion_logic opcionRecursivoLogic= new Opcion_logic(connexion);
				opcionRecursivoLogic.deepLoad(opcionRecursivo,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Accion.class));
			opcion.setAccions(opcionDataAccess.getAccions(connexion,opcion));

			for(Accion accion:opcion.getAccions()) {
				Accion_logic accionLogic= new Accion_logic(connexion);
				accionLogic.deepLoad(accion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilOpcion.class));
			opcion.setPerfilOpcions(opcionDataAccess.getPerfilOpcions(connexion,opcion));

			for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
				PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
				perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Campo.class));
			opcion.setCampos(opcionDataAccess.getCampos(connexion,opcion));

			for(Campo campo:opcion.getCampos()) {
				Campo_logic campoLogic= new Campo_logic(connexion);
				campoLogic.deepLoad(campo,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Opcion opcion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Opcion_logic_add.updateOpcionToSave(opcion,this.arrDatoGeneral);
			
Opcion_data.save(opcion, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(opcion.getSistema(),connexion);

		Opcion_data.save(opcion.getOpcion(),connexion);

		for(Perfil perfil:opcion.getPerfils()) {
			Perfil_data.save(perfil,connexion);
		}

		for(Opcion opcionRecursivo:opcion.getOpcions()) {
			opcionRecursivo.setid_opcion(opcion.getId());
			Opcion_data.save(opcionRecursivo,connexion);
		}

		for(Accion accion:opcion.getAccions()) {
			accion.setid_opcion(opcion.getId());
			Accion_data.save(accion,connexion);
		}

		for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
			perfilopcion.setid_opcion(opcion.getId());
			PerfilOpcion_data.save(perfilopcion,connexion);
		}

		for(Campo campo:opcion.getCampos()) {
			campo.setid_opcion(opcion.getId());
			Campo_data.save(campo,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(opcion.getSistema(),connexion);
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(opcion.getOpcion(),connexion);
				continue;
			}


			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:opcion.getPerfils()) {
					Perfil_data.save(perfil,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcionRecursivo:opcion.getOpcions()) {
					opcionRecursivo.setid_opcion(opcion.getId());
					Opcion_data.save(opcionRecursivo,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Accion accion:opcion.getAccions()) {
					accion.setid_opcion(opcion.getId());
					Accion_data.save(accion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
					perfilopcion.setid_opcion(opcion.getId());
					PerfilOpcion_data.save(perfilopcion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Campo campo:opcion.getCampos()) {
					campo.setid_opcion(opcion.getId());
					Campo_data.save(campo,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(opcion.getSistema(),connexion);
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(opcion.getSistema(),isDeep,deepLoadType,clases);
				

		Opcion_data.save(opcion.getOpcion(),connexion);
		Opcion_logic opcionLogic= new Opcion_logic(connexion);
		opcionLogic.deepLoad(opcion.getOpcion(),isDeep,deepLoadType,clases);
				

		for(Perfil perfil:opcion.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			Perfil_data.save(perfil,connexion);
			perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
		}

		for(Opcion opcionRecursivo:opcion.getOpcions()) {
			Opcion_logic opcionRecursivoLogic= new Opcion_logic(connexion);
			opcionRecursivo.setid_opcion(opcion.getId());
			Opcion_data.save(opcionRecursivo,connexion);
			opcionRecursivoLogic.deepSave(opcionRecursivo,isDeep,deepLoadType,clases);
		}

		for(Accion accion:opcion.getAccions()) {
			Accion_logic accionLogic= new Accion_logic(connexion);
			accion.setid_opcion(opcion.getId());
			Accion_data.save(accion,connexion);
			accionLogic.deepSave(accion,isDeep,deepLoadType,clases);
		}

		for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
			PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
			perfilopcion.setid_opcion(opcion.getId());
			PerfilOpcion_data.save(perfilopcion,connexion);
			perfilopcionLogic.deepSave(perfilopcion,isDeep,deepLoadType,clases);
		}

		for(Campo campo:opcion.getCampos()) {
			Campo_logic campoLogic= new Campo_logic(connexion);
			campo.setid_opcion(opcion.getId());
			Campo_data.save(campo,connexion);
			campoLogic.deepSave(campo,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(opcion.getSistema(),connexion);
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepSave(opcion.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Opcion.class)) {
				Opcion_data.save(opcion.getOpcion(),connexion);
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepSave(opcion.getOpcion(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:opcion.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					Perfil_data.save(perfil,connexion);
					perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcionRecursivo:opcion.getOpcions()) {
					Opcion_logic opcionRecursivoLogic= new Opcion_logic(connexion);
					opcionRecursivo.setid_opcion(opcion.getId());
					Opcion_data.save(opcionRecursivo,connexion);
					opcionRecursivoLogic.deepSave(opcionRecursivo,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Accion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Accion accion:opcion.getAccions()) {
					Accion_logic accionLogic= new Accion_logic(connexion);
					accion.setid_opcion(opcion.getId());
					Accion_data.save(accion,connexion);
					accionLogic.deepSave(accion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilOpcion perfilopcion:opcion.getPerfilOpcions()) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
					perfilopcion.setid_opcion(opcion.getId());
					PerfilOpcion_data.save(perfilopcion,connexion);
					perfilopcionLogic.deepSave(perfilopcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Campo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Campo campo:opcion.getCampos()) {
					Campo_logic campoLogic= new Campo_logic(connexion);
					campo.setid_opcion(opcion.getId());
					Campo_data.save(campo,connexion);
					campoLogic.deepSave(campo,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Opcion.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(opcion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Opcion_util.refrescarFKsDescripciones(opcion);
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
			this.deepLoad(this.opcion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Opcion_util.refrescarFKsDescripciones(this.opcion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Opcion.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(opcions!=null) {
				for(Opcion opcion:opcions) {
					this.deepLoad(opcion,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Opcion_util.refrescarFKsDescripciones(opcions);
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
			if(opcions!=null) {
				for(Opcion opcion:opcions) {
					this.deepLoad(opcion,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Opcion_util.refrescarFKsDescripciones(opcions);
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
			this.getNewConnexionToDeep(Opcion.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(opcion,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Opcion.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(opcions!=null) {
				for(Opcion opcion:opcions) {
					this.deepSave(opcion,isDeep,deepLoadType,clases);
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
			if(opcions!=null) {
				for(Opcion opcion:opcions) {
					this.deepSave(opcion,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorIdSistemaPorIdOpcionWithConnection(String sFinalQuery,Pagination pagination,Long id_sistema,Long id_opcion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdSistemaPorIdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdSistemaPorIdOpcion(String sFinalQuery,Pagination pagination,Long id_sistema,Long id_opcion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdSistemaPorIdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorIdSistemaPorNombreWithConnection(String sFinalQuery,Pagination pagination,Long id_sistema,String nombre)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Opcion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdSistemaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorIdSistemaPorNombre(String sFinalQuery,Pagination pagination,Long id_sistema,String nombre)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Opcion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorIdSistemaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
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
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdOpcion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdSistemaWithConnection(String sFinalQuery,Pagination pagination,Long id_sistema)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdSistema(String sFinalQuery,Pagination pagination,Long id_sistema)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Opcion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			opcions=opcionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Opcion_util.refrescarFKsDescripciones(this.opcions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorIdSistemaPorIdOpcionPorNombreWithConnection(Long id_sistema,Long id_opcion,String nombre)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Opcion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Opcion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			opcion=opcionDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Opcion_util.refrescarFKsDescripciones(this.opcion);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorIdSistemaPorIdOpcionPorNombre(Long id_sistema,Long id_opcion,String nombre)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Opcion_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralidOpcion= new ParameterSelectionGeneral();
			parameterSelectionGeneralidOpcion.setParameterSelectionGeneralEqual(ParameterType.LONG,id_opcion,Opcion_util.IDOPCION,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidOpcion);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Opcion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			opcion=opcionDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.opcion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Opcion_util.refrescarFKsDescripciones(this.opcion);
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
			if(Opcion_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,OpcionDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Opcion opcion,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Opcion_util.IS_CON_AUDITORIA) {
				if(opcion.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,OpcionDataAccess.TABLENAME, opcion.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Opcion_util.IS_CON_AUDITORIA_DETALLE) {
						//Opcion_logic.registrarAuditoriaDetalles(connexion,opcion,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(opcion.getIsDeleted()) {
					/*if(!opcion.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,OpcionDataAccess.TABLENAME, opcion.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Opcion_logic.registrarAuditoriaDetalles(connexion,opcion,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,OpcionDataAccess.TABLENAME, opcion.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(opcion.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,OpcionDataAccess.TABLENAME, opcion.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Opcion_util.IS_CON_AUDITORIA_DETALLE) {
						//Opcion_logic.registrarAuditoriaDetalles(connexion,opcion,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Opcion opcion)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(opcion.getIsNew()||!opcion.getid_sistema().equals(opcion.getOpcionOriginal().getid_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getid_sistema()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getid_sistema().toString();
				}
				if(opcion.getid_sistema()!=null)
				{
					strValorNuevo=opcion.getid_sistema().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.IDSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getid_opcion().equals(opcion.getOpcionOriginal().getid_opcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getid_opcion()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getid_opcion().toString();
				}
				if(opcion.getid_opcion()!=null)
				{
					strValorNuevo=opcion.getid_opcion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.IDOPCION,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getcodigo().equals(opcion.getOpcionOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getcodigo()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getcodigo();
				}
				if(opcion.getcodigo()!=null)
				{
					strValorNuevo=opcion.getcodigo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getnombre().equals(opcion.getOpcionOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getnombre()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getnombre();
				}
				if(opcion.getnombre()!=null)
				{
					strValorNuevo=opcion.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getposicion().equals(opcion.getOpcionOriginal().getposicion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getposicion()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getposicion().toString();
				}
				if(opcion.getposicion()!=null)
				{
					strValorNuevo=opcion.getposicion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.POSICION,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.geticon_name().equals(opcion.getOpcionOriginal().geticon_name()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().geticon_name()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().geticon_name();
				}
				if(opcion.geticon_name()!=null)
				{
					strValorNuevo=opcion.geticon_name() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.ICONNAME,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getnombre_clase().equals(opcion.getOpcionOriginal().getnombre_clase()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getnombre_clase()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getnombre_clase();
				}
				if(opcion.getnombre_clase()!=null)
				{
					strValorNuevo=opcion.getnombre_clase() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.NOMBRECLASE,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getmodulo().equals(opcion.getOpcionOriginal().getmodulo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getmodulo()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getmodulo();
				}
				if(opcion.getmodulo()!=null)
				{
					strValorNuevo=opcion.getmodulo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.MODULO,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getsub_modulo().equals(opcion.getOpcionOriginal().getsub_modulo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getsub_modulo()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getsub_modulo();
				}
				if(opcion.getsub_modulo()!=null)
				{
					strValorNuevo=opcion.getsub_modulo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.SUBMODULO,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getpaquete().equals(opcion.getOpcionOriginal().getpaquete()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getpaquete()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getpaquete();
				}
				if(opcion.getpaquete()!=null)
				{
					strValorNuevo=opcion.getpaquete() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.PAQUETE,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getes_para_menu().equals(opcion.getOpcionOriginal().getes_para_menu()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getes_para_menu()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getes_para_menu().toString();
				}
				if(opcion.getes_para_menu()!=null)
				{
					strValorNuevo=opcion.getes_para_menu().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.ESPARAMENU,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getes_guardar_relaciones().equals(opcion.getOpcionOriginal().getes_guardar_relaciones()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getes_guardar_relaciones()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getes_guardar_relaciones().toString();
				}
				if(opcion.getes_guardar_relaciones()!=null)
				{
					strValorNuevo=opcion.getes_guardar_relaciones().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.ESGUARDARRELACIONES,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getcon_mostrar_acciones_campo().equals(opcion.getOpcionOriginal().getcon_mostrar_acciones_campo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getcon_mostrar_acciones_campo()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getcon_mostrar_acciones_campo().toString();
				}
				if(opcion.getcon_mostrar_acciones_campo()!=null)
				{
					strValorNuevo=opcion.getcon_mostrar_acciones_campo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.CONMOSTRARACCIONESCAMPO,strValorActual,strValorNuevo);
			}	
			
			if(opcion.getIsNew()||!opcion.getestado().equals(opcion.getOpcionOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(opcion.getOpcionOriginal().getestado()!=null)
				{
					strValorActual=opcion.getOpcionOriginal().getestado().toString();
				}
				if(opcion.getestado()!=null)
				{
					strValorNuevo=opcion.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),OpcionConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Opcion opcion,List<Opcion> opcions,List<Accion> accions,List<PerfilOpcion> perfilopcions,List<Campo> campos) throws Exception {

		if(!opcion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(opcion,opcions,accions,perfilopcions,campos,true);
		}
	}

	public void saveRelaciones(Opcion opcion,List<Opcion> opcions,List<Accion> accions,List<PerfilOpcion> perfilopcions,List<Campo> campos)throws Exception {

		if(!opcion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(opcion,opcions,accions,perfilopcions,campos,false);
		}
	}

	public void saveRelacionesBase(Opcion opcion,List<Opcion> opcions,List<Accion> accions,List<PerfilOpcion> perfilopcions,List<Campo> campos,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Opcion-saveRelacionesWithConnection");}
	
			opcion.setOpcions(opcions);
			opcion.setAccions(accions);
			opcion.setPerfilOpcions(perfilopcions);
			opcion.setCampos(campos);

			this.setOpcion(opcion);

			if(true) {

				//Opcion_logic_add.updateRelacionesToSave(opcion,this);

				if((opcion.getIsNew()||opcion.getIsChanged())&&!opcion.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(opcions,accions,perfilopcions,campos);

				} else if(opcion.getIsDeleted()) {
					this.saveRelacionesDetalles(opcions,accions,perfilopcions,campos);
					this.save();
				}

				//Opcion_logic_add.updateRelacionesToSaveAfter(opcion,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			Opcion_util.InicializarGeneralEntityAuxiliares(opcions,true,true);
			Accion_util.InicializarGeneralEntityAuxiliares(accions,true,true);
			PerfilOpcion_util.InicializarGeneralEntityAuxiliares(perfilopcions,true,true);
			Campo_util.InicializarGeneralEntityAuxiliares(campos,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<Opcion> opcions,List<Accion> accions,List<PerfilOpcion> perfilopcions,List<Campo> campos)throws Exception {
		try {
	

			Long idOpcionActual=this.getOpcion().getId();

			Opcion_logic opcionLogicHijos_Desde_Opcion=new Opcion_logic();
			opcionLogicHijos_Desde_Opcion.setOpcions(opcions);

			opcionLogicHijos_Desde_Opcion.setConnexion(this.getConnexion());
			opcionLogicHijos_Desde_Opcion.setDatosCliente(this.datosCliente);

			for(Opcion opcionHijos_Desde_Opcion:opcionLogicHijos_Desde_Opcion.getOpcions()) {
				opcionHijos_Desde_Opcion.setid_opcion(idOpcionActual);

				opcionLogicHijos_Desde_Opcion.setOpcion(opcionHijos_Desde_Opcion);
				opcionLogicHijos_Desde_Opcion.save();
			}


			Accion_logic accionLogic_Desde_Opcion=new Accion_logic();
			accionLogic_Desde_Opcion.setAccions(accions);

			accionLogic_Desde_Opcion.setConnexion(this.getConnexion());
			accionLogic_Desde_Opcion.setDatosCliente(this.datosCliente);

			for(Accion accion_Desde_Opcion:accionLogic_Desde_Opcion.getAccions()) {
				accion_Desde_Opcion.setid_opcion(idOpcionActual);

				accionLogic_Desde_Opcion.setAccion(accion_Desde_Opcion);
				accionLogic_Desde_Opcion.save();

				Long idAccionActual=accion_Desde_Opcion.getId();

				PerfilAccion_logic perfilaccionLogic_Desde_Accion=new PerfilAccion_logic();

				if(accion_Desde_Opcion.getPerfilAccions()==null){
					accion_Desde_Opcion.setPerfilAccions(new ArrayList<PerfilAccion>());
				}

				perfilaccionLogic_Desde_Accion.setPerfilAccions(accion_Desde_Opcion.getPerfilAccions());

				perfilaccionLogic_Desde_Accion.setConnexion(this.getConnexion());
				perfilaccionLogic_Desde_Accion.setDatosCliente(this.datosCliente);

				for(PerfilAccion perfilaccion_Desde_Accion:perfilaccionLogic_Desde_Accion.getPerfilAccions()) {
					perfilaccion_Desde_Accion.setid_accion(idAccionActual);
				}

				perfilaccionLogic_Desde_Accion.saves();
			}


			PerfilOpcion_logic perfilopcionLogic_Desde_Opcion=new PerfilOpcion_logic();
			perfilopcionLogic_Desde_Opcion.setPerfilOpcions(perfilopcions);

			perfilopcionLogic_Desde_Opcion.setConnexion(this.getConnexion());
			perfilopcionLogic_Desde_Opcion.setDatosCliente(this.datosCliente);

			for(PerfilOpcion perfilopcion_Desde_Opcion:perfilopcionLogic_Desde_Opcion.getPerfilOpcions()) {
				perfilopcion_Desde_Opcion.setid_opcion(idOpcionActual);
			}

			perfilopcionLogic_Desde_Opcion.saves();

			Campo_logic campoLogic_Desde_Opcion=new Campo_logic();
			campoLogic_Desde_Opcion.setCampos(campos);

			campoLogic_Desde_Opcion.setConnexion(this.getConnexion());
			campoLogic_Desde_Opcion.setDatosCliente(this.datosCliente);

			for(Campo campo_Desde_Opcion:campoLogic_Desde_Opcion.getCampos()) {
				campo_Desde_Opcion.setid_opcion(idOpcionActual);

				campoLogic_Desde_Opcion.setCampo(campo_Desde_Opcion);
				campoLogic_Desde_Opcion.save();

				Long idCampoActual=campo_Desde_Opcion.getId();

				PerfilCampo_logic perfilcampoLogic_Desde_Campo=new PerfilCampo_logic();

				if(campo_Desde_Opcion.getPerfilCampos()==null){
					campo_Desde_Opcion.setPerfilCampos(new ArrayList<PerfilCampo>());
				}

				perfilcampoLogic_Desde_Campo.setPerfilCampos(campo_Desde_Opcion.getPerfilCampos());

				perfilcampoLogic_Desde_Campo.setConnexion(this.getConnexion());
				perfilcampoLogic_Desde_Campo.setDatosCliente(this.datosCliente);

				for(PerfilCampo perfilcampo_Desde_Campo:perfilcampoLogic_Desde_Campo.getPerfilCampos()) {
					perfilcampo_Desde_Campo.setid_campo(idCampoActual);
				}

				perfilcampoLogic_Desde_Campo.saves();
			}


		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Opcion_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Opcion_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setOpcion(Opcion newOpcion) {
		this.opcion = newOpcion;
	}
	
	public Opcion_data getOpcionDataAccess() {
		return opcionDataAccess;
	}
	
	public void setOpcionDataAccess(Opcion_data newopcionDataAccess) {
		this.opcionDataAccess = newopcionDataAccess;
	}

	public void setOpcions(List<Opcion> newOpcions) {
		this.opcions = newOpcions;
	}
	
	public Object getOpcionObject() {	
		this.opcionObject=this.opcionDataAccess.getEntityObject();
		return this.opcionObject;
	}
		
	public void setOpcionObject(Object newOpcionObject) {
		this.opcionObject = newOpcionObject;
	}
	
	public List<Object> getOpcionsObject() {		
		this.opcionsObject=this.opcionDataAccess.getEntitiesObject();
		return this.opcionsObject;
	}
		
	public void setOpcionsObject(List<Object> newOpcionsObject) {
		this.opcionsObject = newOpcionsObject;
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
