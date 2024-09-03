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
package com.bydan.ingles.seguridad.perfil.business.logic;


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
import com.bydan.ingles.seguridad.perfil.util.*;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;
import com.bydan.ingles.seguridad.perfil.util.Perfil_param_return;
//import com.bydan.ingles.seguridad.perfil.util.PerfilParameterGeneral;
import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
//import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic_add;
import com.bydan.ingles.seguridad.perfil.business.data.*;
import com.bydan.ingles.seguridad.perfil.business.entity.*;

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


import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.business.data.PerfilAccion_data;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;
import com.bydan.ingles.seguridad.perfilaccion.util.PerfilAccion_util;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.data.PerfilCampo_data;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.data.Accion_data;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;
import com.bydan.ingles.seguridad.accion.util.Accion_util;

import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.business.data.PerfilOpcion_data;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;
import com.bydan.ingles.seguridad.perfilopcion.util.PerfilOpcion_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.data.PerfilUsuario_data;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;
import com.bydan.ingles.seguridad.campo.util.Campo_util;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Perfil_logic  extends GeneralEntityLogic implements Perfil_logicI {
	static Logger logger = Logger.getLogger("Perfil_logic.class");	

	protected Perfil_data perfilDataAccess; 	
	protected Perfil perfil;
	protected List<Perfil> perfils;
	protected Object perfilObject;	
	protected List<Object> perfilsObject;
	
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
	
	
	
	
	
	
	public Perfil_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.perfilDataAccess = new Perfil_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Perfil_data.ActualizarQueries();
			
			//this.perfilDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.perfils= new ArrayList<Perfil>();
			this.perfil= new Perfil();
			
			this.perfilObject=new Object();
			this.perfilsObject=new ArrayList<Object>();
				
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
			
			this.perfilDataAccess.setConnexionType(this.connexionType);
			this.perfilDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Perfil_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.perfilDataAccess = new Perfil_data();
			this.perfils= new ArrayList<Perfil>();
			this.perfil= new Perfil();
			this.perfilObject=new Object();
			this.perfilsObject=new ArrayList<Object>();
			
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
			
			this.perfilDataAccess.setConnexionType(this.connexionType);
			this.perfilDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Perfil getPerfil() throws Exception {	
		//Perfil_logic_add.checkPerfilToGet(perfil,this.datosCliente,this.arrDatoGeneral);
		//Perfil_logic_add.updatePerfilToGet(perfil,this.arrDatoGeneral);
		
		return perfil;
	}
	
	public List<Perfil> getPerfils() throws Exception {		
		if(this.perfils==null) {
			this.perfils= new ArrayList<Perfil>();
		}
		
		this.quitarsNulos();
		
		//Perfil_logic_add.checkPerfilToGets(perfils,this.datosCliente,this.arrDatoGeneral);
		
		for (Perfil perfilLocal: perfils ) {
			//Perfil_logic_add.updatePerfilToGet(perfilLocal,this.arrDatoGeneral);
		}
		
		return perfils;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.perfilDataAccess!=null) {
			this.perfilDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			perfilDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			perfilDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		perfil = new  Perfil();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfil=perfilDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
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
		perfil = new  Perfil();
		  		  
        try {
			
			perfil=perfilDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		perfil = new  Perfil();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfil=perfilDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
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
		perfil = new  Perfil();
		  		  
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
		perfil = new  Perfil();
		  		  
        try {
			
			perfil=perfilDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		perfil = new  Perfil();
		  		  
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
		perfil = new  Perfil();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =perfilDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfil = new  Perfil();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=perfilDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfil = new  Perfil();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =perfilDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfil = new  Perfil();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=perfilDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfil = new  Perfil();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =perfilDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfil = new  Perfil();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=perfilDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfils = new  ArrayList<Perfil>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		  		  
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
		perfils = new  ArrayList<Perfil>();
		  		  
        try {			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		perfils = new  ArrayList<Perfil>();
		  		  
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
		perfils = new  ArrayList<Perfil>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		  		  
        try {
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		perfil = new  Perfil();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfil=perfilDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfil);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
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
		perfil = new  Perfil();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfil=perfilDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfil);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfil);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfils = new  ArrayList<Perfil>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		  		  
        try {
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		perfils = new  ArrayList<Perfil>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
		perfils = new  ArrayList<Perfil>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfils);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Perfil perfil) throws Exception {
		Boolean estaValidado=false;
		
		if(perfil.getIsNew() || perfil.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Perfil> Perfils) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Perfil perfilLocal:perfils) {				
			estaValidadoObjeto=this.validarGuardar(perfilLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Perfil> Perfils) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfils)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Perfil Perfil) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfil)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Perfil perfil) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+perfil.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"perfil","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Perfil_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Perfil_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Perfil_logic_add.checkPerfilToSave(this.perfil,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Perfil_logic_add.updatePerfilToSave(this.perfil,this.arrDatoGeneral);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfil,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Perfil_util.permiteMantenimiento(this.perfil) && this.validarGuardar(this.perfil)) {
				Perfil_data.save(this.perfil, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Perfil_util.refrescarFKsDescripciones(this.perfil);				
			}

			//Perfil_logic_add.checkPerfilToSaveAfter(this.perfil,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.perfil.getIsDeleted()) {
				this.perfil=null;
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
			
			//Perfil_logic_add.checkPerfilToSave(this.perfil,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Perfil_logic_add.updatePerfilToSave(this.perfil,this.arrDatoGeneral);
			
			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfil,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Perfil_util.permiteMantenimiento(this.perfil) && this.validarGuardar(this.perfil)) {			
				Perfil_data.save(this.perfil, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Perfil_util.refrescarFKsDescripciones(this.perfil);				
			}
			
			//Perfil_logic_add.checkPerfilToSaveAfter(this.perfil,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.perfil.getIsDeleted()) {
				this.perfil=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Perfil_logic_add.checkPerfilToSaves(perfils,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPerfil=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Perfil perfilLocal:perfils) {		
				
				if(!Perfil_util.permiteMantenimiento(perfilLocal)) {
					continue;
				}
				
				//Perfil_logic_add.updatePerfilToSave(perfilLocal,this.arrDatoGeneral);
	        	
				Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilLocal)) {
					Perfil_data.save(perfilLocal, connexion);				
				} else {
					validadoTodosPerfil=false;
				}
			}
			
			if(!validadoTodosPerfil) {
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
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}
			
			//Perfil_logic_add.checkPerfilToSavesAfter(perfils,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Perfil_logic_add.checkPerfilToSaves(perfils,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPerfil=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Perfil perfilLocal:perfils) {				
				if(!Perfil_util.permiteMantenimiento(perfilLocal)) {
					continue;
				}
				
				//Perfil_logic_add.updatePerfilToSave(perfilLocal,this.arrDatoGeneral);
	        	
				Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilLocal)) {				
					Perfil_data.save(perfilLocal, connexion);				
				} else {
					validadoTodosPerfil=false;
				}
			}
			
			if(!validadoTodosPerfil) {
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
				
				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}

			//Perfil_logic_add.checkPerfilToSavesAfter(perfils,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Perfil_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Perfil> perfils,Perfil_param_return perfilParameterGeneral)throws Exception {
		 try {	
			Perfil_param_return perfilReturnGeneral=new Perfil_param_return();
	
			
			return perfilReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Perfil_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Perfil> perfils,Perfil_param_return perfilParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Perfil_param_return perfilReturnGeneral=new Perfil_param_return();
	
			
			this.connexion.commit();
			
			return perfilReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Perfil_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Perfil> perfils,Perfil perfil,Perfil_param_return perfilParameterGeneral,Boolean isEsNuevoPerfil,ArrayList<Classe> clases)throws Exception {
		 try {	
			Perfil_param_return perfilReturnGeneral=new Perfil_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return perfilReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Perfil_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Perfil> perfils,Perfil perfil,Perfil_param_return perfilParameterGeneral,Boolean isEsNuevoPerfil,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Perfil_param_return perfilReturnGeneral=new Perfil_param_return();
	
			perfilReturnGeneral.setPerfil(perfil);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return perfilReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Perfil_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Perfil_param_return perfilParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Perfil_param_return perfilReturnGeneral=new Perfil_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.perfils=new ArrayList<Perfil>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.perfil=new Perfil();
				
				
				if(conColumnasBase) {this.perfil.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.perfil.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.perfil.setcodigo(arrColumnas[iColumn++]);
				this.perfil.setnombre(arrColumnas[iColumn++]);
			this.perfil.setnombre2(arrColumnas[iColumn++]);
				this.perfil.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.perfils.add(this.perfil);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			perfilReturnGeneral.setConRetornoEstaProcesado(true);
			perfilReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return perfilReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Perfil> perfilsAux= new ArrayList<Perfil>();
		
		for(Perfil perfil:perfils) {
			if(!perfil.getIsDeleted()) {
				perfilsAux.add(perfil);
			}
		}
		
		perfils=perfilsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Perfil> perfilsAux= new ArrayList<Perfil>();
		
		for(Perfil perfil : this.perfils) {
			if(perfil==null) {
				perfilsAux.add(perfil);
			}
		}
		
		//this.perfils=perfilsAux;
		
		this.perfils.removeAll(perfilsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(perfil.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((perfil.getIsDeleted() || (perfil.getIsChanged()&&!perfil.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=perfilDataAccess.getSetVersionRow(connexion,perfil.getId());
				
				if(!perfil.getVersionRow().equals(timestamp)) {	
					perfil.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				perfil.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(perfil.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((perfil.getIsDeleted() || (perfil.getIsChanged()&&!perfil.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=perfilDataAccess.getSetVersionRow(connexion,perfil.getId());
			
			try {							
				if(!perfil.getVersionRow().equals(timestamp)) {	
					perfil.setVersionRow(timestamp);
				}
				
				perfil.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(perfils!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Perfil perfilAux:perfils) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(perfilAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilAux.getIsDeleted() || (perfilAux.getIsChanged()&&!perfilAux.getIsNew())) {
						
						timestamp=perfilDataAccess.getSetVersionRow(connexion,perfilAux.getId());
						
						if(!perfil.getVersionRow().equals(timestamp)) {	
							perfilAux.setVersionRow(timestamp);
						}
								
						perfilAux.setIsChangedAuxiliar(false);														
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
		if(perfils!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Perfil perfilAux:perfils) {
					if(perfilAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilAux.getIsDeleted() || (perfilAux.getIsChanged()&&!perfilAux.getIsNew())) {
						
						timestamp=perfilDataAccess.getSetVersionRow(connexion,perfilAux.getId());
						
						if(!perfilAux.getVersionRow().equals(timestamp)) {	
							perfilAux.setVersionRow(timestamp);
						}
						
													
						perfilAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Perfil_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalSistema) throws Exception {
		Perfil_param_return  perfil_return =new Perfil_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-cargarCombosLoteForeignKeyPerfilWithConnection");
			
			this.connexion.begin();
			
			perfil_return =new Perfil_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			perfil_return.setsistemasFK(sistemasForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return perfil_return;
	}
	
	public Perfil_param_return cargarCombosLoteFK(String finalQueryGlobalSistema) throws Exception {
		Perfil_param_return  perfil_return =new Perfil_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			perfil_return =new Perfil_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			perfil_return.setsistemasFK(sistemasForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return perfil_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			PerfilOpcion_logic perfilopcionLogic=new PerfilOpcion_logic();
			PerfilUsuario_logic perfilusuarioLogic=new PerfilUsuario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyPerfilWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(PerfilOpcion.class));
			classes.add(new Classe(PerfilUsuario.class));
											
			

			perfilopcionLogic.setConnexion(this.getConnexion());
			perfilopcionLogic.setDatosCliente(this.datosCliente);
			perfilopcionLogic.setIsConRefrescarForeignKeys(true);

			perfilusuarioLogic.setConnexion(this.getConnexion());
			perfilusuarioLogic.setDatosCliente(this.datosCliente);
			perfilusuarioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Perfil perfil:this.perfils) {
				

				classes=new ArrayList<Classe>();
				classes=PerfilOpcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilopcionLogic.setPerfilOpcions(perfil.perfilopcions);
				perfilopcionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=PerfilUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilusuarioLogic.setPerfilUsuarios(perfil.perfilusuarios);
				perfilusuarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Perfil perfil,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Perfil_logic_add.updatePerfilToGet(perfil,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
		perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));
		perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));
		perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));
		perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));

				if(this.isConDeep) {
					Opcion_logic opcionLogic= new Opcion_logic(this.connexion);
					opcionLogic.setOpcions(perfil.getOpcions());
					ArrayList<Classe> classesLocal=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					opcionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Opcion_util.refrescarFKsDescripciones(opcionLogic.getOpcions());
					perfil.setOpcions(opcionLogic.getOpcions());
				}

				continue;
			}

			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));

				if(this.isConDeep) {
					Usuario_logic usuarioLogic= new Usuario_logic(this.connexion);
					usuarioLogic.setUsuarios(perfil.getUsuarios());
					ArrayList<Classe> classesLocal=Usuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					usuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Usuario_util.refrescarFKsDescripciones(usuarioLogic.getUsuarios());
					perfil.setUsuarios(usuarioLogic.getUsuarios());
				}

				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));

				if(this.isConDeep) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(this.connexion);
					perfilusuarioLogic.setPerfilUsuarios(perfil.getPerfilUsuarios());
					ArrayList<Classe> classesLocal=PerfilUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilUsuario_util.refrescarFKsDescripciones(perfilusuarioLogic.getPerfilUsuarios());
					perfil.setPerfilUsuarios(perfilusuarioLogic.getPerfilUsuarios());
				}

				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));

				if(this.isConDeep) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(this.connexion);
					perfilopcionLogic.setPerfilOpcions(perfil.getPerfilOpcions());
					ArrayList<Classe> classesLocal=PerfilOpcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilopcionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilOpcion_util.refrescarFKsDescripciones(perfilopcionLogic.getPerfilOpcions());
					perfil.setPerfilOpcions(perfilopcionLogic.getPerfilOpcions());
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
			perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
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
			perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Usuario.class));
			perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilUsuario.class));
			perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));
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
			perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(perfil.getSistema(),isDeep,deepLoadType,clases);
				

		perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));

		for(Opcion opcion:perfil.getOpcions()) {
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
		}

		perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));

		for(Usuario usuario:perfil.getUsuarios()) {
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(usuario,isDeep,deepLoadType,clases);
		}

		perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));

		for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
			PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
			perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
		}

		perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));

		for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
			PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
			perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepLoad(perfil.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));

				for(Opcion opcion:perfil.getOpcions()) {
					Opcion_logic opcionLogic= new Opcion_logic(connexion);
					opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));

				for(Usuario usuario:perfil.getUsuarios()) {
					Usuario_logic usuarioLogic= new Usuario_logic(connexion);
					usuarioLogic.deepLoad(usuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));

				for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
					perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));

				for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
					perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
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
			perfil.setSistema(perfilDataAccess.getSistema(connexion,perfil));
			Sistema_logic sistemaLogic= new Sistema_logic(connexion);
			sistemaLogic.deepLoad(perfil.getSistema(),isDeep,deepLoadType,clases);
				
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
			perfil.setOpcions(perfilDataAccess.getOpcions(connexion,perfil));

			for(Opcion opcion:perfil.getOpcions()) {
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Usuario.class));
			perfil.setUsuarios(perfilDataAccess.getUsuarios(connexion,perfil));

			for(Usuario usuario:perfil.getUsuarios()) {
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(usuario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(PerfilUsuario.class));
			perfil.setPerfilUsuarios(perfilDataAccess.getPerfilUsuarios(connexion,perfil));

			for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
				PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
				perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
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
			perfil.setPerfilOpcions(perfilDataAccess.getPerfilOpcions(connexion,perfil));

			for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
				PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
				perfilopcionLogic.deepLoad(perfilopcion,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Perfil perfil,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Perfil_logic_add.updatePerfilToSave(perfil,this.arrDatoGeneral);
			
Perfil_data.save(perfil, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(perfil.getSistema(),connexion);

		for(Opcion opcion:perfil.getOpcions()) {
			Opcion_data.save(opcion,connexion);
		}

		for(Usuario usuario:perfil.getUsuarios()) {
			Usuario_data.save(usuario,connexion);
		}

		for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
			perfilusuario.setid_perfil(perfil.getId());
			PerfilUsuario_data.save(perfilusuario,connexion);
		}

		for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
			perfilopcion.setid_perfil(perfil.getId());
			PerfilOpcion_data.save(perfilopcion,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(perfil.getSistema(),connexion);
				continue;
			}


			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcion:perfil.getOpcions()) {
					Opcion_data.save(opcion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Usuario usuario:perfil.getUsuarios()) {
					Usuario_data.save(usuario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
					perfilusuario.setid_perfil(perfil.getId());
					PerfilUsuario_data.save(perfilusuario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
					perfilopcion.setid_perfil(perfil.getId());
					PerfilOpcion_data.save(perfilopcion,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(perfil.getSistema(),connexion);
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(perfil.getSistema(),isDeep,deepLoadType,clases);
				

		for(Opcion opcion:perfil.getOpcions()) {
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			Opcion_data.save(opcion,connexion);
			opcionLogic.deepSave(opcion,isDeep,deepLoadType,clases);
		}

		for(Usuario usuario:perfil.getUsuarios()) {
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			Usuario_data.save(usuario,connexion);
			usuarioLogic.deepSave(usuario,isDeep,deepLoadType,clases);
		}

		for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
			PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
			perfilusuario.setid_perfil(perfil.getId());
			PerfilUsuario_data.save(perfilusuario,connexion);
			perfilusuarioLogic.deepSave(perfilusuario,isDeep,deepLoadType,clases);
		}

		for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
			PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
			perfilopcion.setid_perfil(perfil.getId());
			PerfilOpcion_data.save(perfilopcion,connexion);
			perfilopcionLogic.deepSave(perfilopcion,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(perfil.getSistema(),connexion);
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepSave(perfil.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcion:perfil.getOpcions()) {
					Opcion_logic opcionLogic= new Opcion_logic(connexion);
					Opcion_data.save(opcion,connexion);
					opcionLogic.deepSave(opcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Usuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Usuario usuario:perfil.getUsuarios()) {
					Usuario_logic usuarioLogic= new Usuario_logic(connexion);
					Usuario_data.save(usuario,connexion);
					usuarioLogic.deepSave(usuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilUsuario perfilusuario:perfil.getPerfilUsuarios()) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
					perfilusuario.setid_perfil(perfil.getId());
					PerfilUsuario_data.save(perfilusuario,connexion);
					perfilusuarioLogic.deepSave(perfilusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(PerfilOpcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilOpcion perfilopcion:perfil.getPerfilOpcions()) {
					PerfilOpcion_logic perfilopcionLogic= new PerfilOpcion_logic(connexion);
					perfilopcion.setid_perfil(perfil.getId());
					PerfilOpcion_data.save(perfilopcion,connexion);
					perfilopcionLogic.deepSave(perfilopcion,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Perfil.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(perfil,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Perfil_util.refrescarFKsDescripciones(perfil);
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
			this.deepLoad(this.perfil,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Perfil_util.refrescarFKsDescripciones(this.perfil);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Perfil.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(perfils!=null) {
				for(Perfil perfil:perfils) {
					this.deepLoad(perfil,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Perfil_util.refrescarFKsDescripciones(perfils);
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
			if(perfils!=null) {
				for(Perfil perfil:perfils) {
					this.deepLoad(perfil,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Perfil_util.refrescarFKsDescripciones(perfils);
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
			this.getNewConnexionToDeep(Perfil.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(perfil,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Perfil.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(perfils!=null) {
				for(Perfil perfil:perfils) {
					this.deepSave(perfil,isDeep,deepLoadType,clases);
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
			if(perfils!=null) {
				for(Perfil perfil:perfils) {
					this.deepSave(perfil,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorNombreWithConnection(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Perfil_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombre(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Perfil_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorNombre2WithConnection(String sFinalQuery,Pagination pagination,String nombre2)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre2= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre2.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre2+"%",Perfil_util.NOMBRE2,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre2);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre2","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombre2(String sFinalQuery,Pagination pagination,String nombre2)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre2= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre2.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre2+"%",Perfil_util.NOMBRE2,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre2);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre2","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Perfil_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
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
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Perfil_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Perfil_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfils=perfilDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Perfil_util.refrescarFKsDescripciones(this.perfils);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorIdSistemaPorNombreWithConnection(Long id_sistema,String nombre)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Perfil.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Perfil_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Perfil_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			perfil=perfilDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Perfil_util.refrescarFKsDescripciones(this.perfil);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorIdSistemaPorNombre(Long id_sistema,String nombre)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Perfil_util.IDSISTEMA,ParameterTypeOperator.AND);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Perfil_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			perfil=perfilDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.perfil,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Perfil_util.refrescarFKsDescripciones(this.perfil);
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
			if(Perfil_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Perfil perfil,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Perfil_util.IS_CON_AUDITORIA) {
				if(perfil.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilDataAccess.TABLENAME, perfil.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Perfil_util.IS_CON_AUDITORIA_DETALLE) {
						//Perfil_logic.registrarAuditoriaDetalles(connexion,perfil,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(perfil.getIsDeleted()) {
					/*if(!perfil.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PerfilDataAccess.TABLENAME, perfil.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Perfil_logic.registrarAuditoriaDetalles(connexion,perfil,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilDataAccess.TABLENAME, perfil.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(perfil.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilDataAccess.TABLENAME, perfil.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Perfil_util.IS_CON_AUDITORIA_DETALLE) {
						//Perfil_logic.registrarAuditoriaDetalles(connexion,perfil,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Perfil perfil)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(perfil.getIsNew()||!perfil.getid_sistema().equals(perfil.getPerfilOriginal().getid_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfil.getPerfilOriginal().getid_sistema()!=null)
				{
					strValorActual=perfil.getPerfilOriginal().getid_sistema().toString();
				}
				if(perfil.getid_sistema()!=null)
				{
					strValorNuevo=perfil.getid_sistema().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilConstantesFunciones.IDSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(perfil.getIsNew()||!perfil.getcodigo().equals(perfil.getPerfilOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfil.getPerfilOriginal().getcodigo()!=null)
				{
					strValorActual=perfil.getPerfilOriginal().getcodigo();
				}
				if(perfil.getcodigo()!=null)
				{
					strValorNuevo=perfil.getcodigo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(perfil.getIsNew()||!perfil.getnombre().equals(perfil.getPerfilOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfil.getPerfilOriginal().getnombre()!=null)
				{
					strValorActual=perfil.getPerfilOriginal().getnombre();
				}
				if(perfil.getnombre()!=null)
				{
					strValorNuevo=perfil.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(perfil.getIsNew()||!perfil.getnombre2().equals(perfil.getPerfilOriginal().getnombre2()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfil.getPerfilOriginal().getnombre2()!=null)
				{
					strValorActual=perfil.getPerfilOriginal().getnombre2();
				}
				if(perfil.getnombre2()!=null)
				{
					strValorNuevo=perfil.getnombre2() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilConstantesFunciones.NOMBRE2,strValorActual,strValorNuevo);
			}	
			
			if(perfil.getIsNew()||!perfil.getestado().equals(perfil.getPerfilOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfil.getPerfilOriginal().getestado()!=null)
				{
					strValorActual=perfil.getPerfilOriginal().getestado().toString();
				}
				if(perfil.getestado()!=null)
				{
					strValorNuevo=perfil.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Perfil perfil,List<PerfilUsuario> perfilusuarios,List<PerfilOpcion> perfilopcions) throws Exception {

		if(!perfil.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfil,perfilusuarios,perfilopcions,true);
		}
	}

	public void saveRelaciones(Perfil perfil,List<PerfilUsuario> perfilusuarios,List<PerfilOpcion> perfilopcions)throws Exception {

		if(!perfil.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfil,perfilusuarios,perfilopcions,false);
		}
	}

	public void saveRelacionesBase(Perfil perfil,List<PerfilUsuario> perfilusuarios,List<PerfilOpcion> perfilopcions,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Perfil-saveRelacionesWithConnection");}
	
			perfil.setPerfilUsuarios(perfilusuarios);
			perfil.setPerfilOpcions(perfilopcions);

			this.setPerfil(perfil);

			if(true) {

				//Perfil_logic_add.updateRelacionesToSave(perfil,this);

				if((perfil.getIsNew()||perfil.getIsChanged())&&!perfil.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(perfilusuarios,perfilopcions);

				} else if(perfil.getIsDeleted()) {
					this.saveRelacionesDetalles(perfilusuarios,perfilopcions);
					this.save();
				}

				//Perfil_logic_add.updateRelacionesToSaveAfter(perfil,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			PerfilUsuario_util.InicializarGeneralEntityAuxiliares(perfilusuarios,true,true);
			PerfilOpcion_util.InicializarGeneralEntityAuxiliares(perfilopcions,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<PerfilUsuario> perfilusuarios,List<PerfilOpcion> perfilopcions)throws Exception {
		try {
	

			Long idPerfilActual=this.getPerfil().getId();

			PerfilUsuario_logic perfilusuarioLogic_Desde_Perfil=new PerfilUsuario_logic();
			perfilusuarioLogic_Desde_Perfil.setPerfilUsuarios(perfilusuarios);

			perfilusuarioLogic_Desde_Perfil.setConnexion(this.getConnexion());
			perfilusuarioLogic_Desde_Perfil.setDatosCliente(this.datosCliente);

			for(PerfilUsuario perfilusuario_Desde_Perfil:perfilusuarioLogic_Desde_Perfil.getPerfilUsuarios()) {
				perfilusuario_Desde_Perfil.setid_perfil(idPerfilActual);
			}

			perfilusuarioLogic_Desde_Perfil.saves();

			PerfilOpcion_logic perfilopcionLogic_Desde_Perfil=new PerfilOpcion_logic();
			perfilopcionLogic_Desde_Perfil.setPerfilOpcions(perfilopcions);

			perfilopcionLogic_Desde_Perfil.setConnexion(this.getConnexion());
			perfilopcionLogic_Desde_Perfil.setDatosCliente(this.datosCliente);

			for(PerfilOpcion perfilopcion_Desde_Perfil:perfilopcionLogic_Desde_Perfil.getPerfilOpcions()) {
				perfilopcion_Desde_Perfil.setid_perfil(idPerfilActual);
			}

			perfilopcionLogic_Desde_Perfil.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Perfil_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Perfil_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPerfil(Perfil newPerfil) {
		this.perfil = newPerfil;
	}
	
	public Perfil_data getPerfilDataAccess() {
		return perfilDataAccess;
	}
	
	public void setPerfilDataAccess(Perfil_data newperfilDataAccess) {
		this.perfilDataAccess = newperfilDataAccess;
	}

	public void setPerfils(List<Perfil> newPerfils) {
		this.perfils = newPerfils;
	}
	
	public Object getPerfilObject() {	
		this.perfilObject=this.perfilDataAccess.getEntityObject();
		return this.perfilObject;
	}
		
	public void setPerfilObject(Object newPerfilObject) {
		this.perfilObject = newPerfilObject;
	}
	
	public List<Object> getPerfilsObject() {		
		this.perfilsObject=this.perfilDataAccess.getEntitiesObject();
		return this.perfilsObject;
	}
		
	public void setPerfilsObject(List<Object> newPerfilsObject) {
		this.perfilsObject = newPerfilsObject;
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
