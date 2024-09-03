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
package com.bydan.ingles.seguridad.sistema.business.logic;


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
import com.bydan.ingles.seguridad.sistema.util.*;
import com.bydan.ingles.seguridad.sistema.util.Sistema_util;
import com.bydan.ingles.seguridad.sistema.util.Sistema_param_return;
//import com.bydan.ingles.seguridad.sistema.util.SistemaParameterGeneral;
import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic_add;
import com.bydan.ingles.seguridad.sistema.business.data.*;
import com.bydan.ingles.seguridad.sistema.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.opcion.business.data.Opcion_data;
import com.bydan.ingles.seguridad.opcion.business.logic.Opcion_logic;
import com.bydan.ingles.seguridad.opcion.util.Opcion_util;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.business.data.Paquete_data;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;
import com.bydan.ingles.seguridad.paquete.util.Paquete_util;

import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.modulo.business.data.Modulo_data;
import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;

//REL DETALLES


import com.bydan.ingles.seguridad.perfilopcion.business.entity.PerfilOpcion;
import com.bydan.ingles.seguridad.perfilopcion.business.logic.PerfilOpcion_logic;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;

import com.bydan.ingles.seguridad.accion.business.entity.Accion;
import com.bydan.ingles.seguridad.accion.business.logic.Accion_logic;

import com.bydan.ingles.seguridad.perfilaccion.business.entity.PerfilAccion;
import com.bydan.ingles.seguridad.perfilaccion.business.logic.PerfilAccion_logic;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;

import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic;










@SuppressWarnings({"unused"})
public class Sistema_logic  extends GeneralEntityLogic implements Sistema_logicI {
	static Logger logger = Logger.getLogger("Sistema_logic.class");	

	protected Sistema_data sistemaDataAccess; 	
	protected Sistema sistema;
	protected List<Sistema> sistemas;
	protected Object sistemaObject;	
	protected List<Object> sistemasObject;
	
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
	
	
	protected Sistema_logic_add sistemaLogicAdditional=null;
	
	public Sistema_logic_add getSistemaLogicAdditional() {
		return this.sistemaLogicAdditional;
	}
	
	public void setSistemaLogicAdditional(Sistema_logic_add sistemaLogicAdditional) {
		try {
			this.sistemaLogicAdditional=sistemaLogicAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	
	
	public Sistema_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.sistemaDataAccess = new Sistema_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Sistema_data.ActualizarQueries();
			
			//this.sistemaDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.sistemas= new ArrayList<Sistema>();
			this.sistema= new Sistema();
			
			this.sistemaObject=new Object();
			this.sistemasObject=new ArrayList<Object>();
				
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
			
			this.sistemaDataAccess.setConnexionType(this.connexionType);
			this.sistemaDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Sistema_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.sistemaDataAccess = new Sistema_data();
			this.sistemas= new ArrayList<Sistema>();
			this.sistema= new Sistema();
			this.sistemaObject=new Object();
			this.sistemasObject=new ArrayList<Object>();
			
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
			
			this.sistemaDataAccess.setConnexionType(this.connexionType);
			this.sistemaDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Sistema getSistema() throws Exception {	
		Sistema_logic_add.checkSistemaToGet(sistema,this.datosCliente,this.arrDatoGeneral);
		Sistema_logic_add.updateSistemaToGet(sistema,this.arrDatoGeneral);
		
		return sistema;
	}
	
	public List<Sistema> getSistemas() throws Exception {		
		if(this.sistemas==null) {
			this.sistemas= new ArrayList<Sistema>();
		}
		
		this.quitarsNulos();
		
		Sistema_logic_add.checkSistemaToGets(sistemas,this.datosCliente,this.arrDatoGeneral);
		
		for (Sistema sistemaLocal: sistemas ) {
			Sistema_logic_add.updateSistemaToGet(sistemaLocal,this.arrDatoGeneral);
		}
		
		return sistemas;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.sistemaDataAccess!=null) {
			this.sistemaDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			sistemaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			sistemaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		sistema = new  Sistema();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			sistema=sistemaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
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
		sistema = new  Sistema();
		  		  
        try {
			
			sistema=sistemaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		sistema = new  Sistema();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			sistema=sistemaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
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
		sistema = new  Sistema();
		  		  
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
		sistema = new  Sistema();
		  		  
        try {
			
			sistema=sistemaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		sistema = new  Sistema();
		  		  
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
		sistema = new  Sistema();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =sistemaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		sistema = new  Sistema();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=sistemaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		sistema = new  Sistema();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =sistemaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		sistema = new  Sistema();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=sistemaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		sistema = new  Sistema();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =sistemaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		sistema = new  Sistema();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=sistemaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		  		  
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
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		sistemas = new  ArrayList<Sistema>();
		  		  
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
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		sistema = new  Sistema();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistema=sistemaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(sistema);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
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
		sistema = new  Sistema();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistema=sistemaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(sistema);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		  		  
        try {
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		sistemas = new  ArrayList<Sistema>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
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
		sistemas = new  ArrayList<Sistema>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			sistemas=sistemaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(sistemas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Sistema sistema) throws Exception {
		Boolean estaValidado=false;
		
		if(sistema.getIsNew() || sistema.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Sistema> Sistemas) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Sistema sistemaLocal:sistemas) {				
			estaValidadoObjeto=this.validarGuardar(sistemaLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Sistema> Sistemas) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(sistemas)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Sistema Sistema) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(sistema)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Sistema sistema) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+sistema.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"sistema","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Sistema_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Sistema_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			Sistema_logic_add.checkSistemaToSave(this.sistema,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Sistema_logic_add.updateSistemaToSave(this.sistema,this.arrDatoGeneral);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.sistema,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Sistema_util.permiteMantenimiento(this.sistema) && this.validarGuardar(this.sistema)) {
				Sistema_data.save(this.sistema, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Sistema_util.refrescarFKsDescripciones(this.sistema);				
			}

			Sistema_logic_add.checkSistemaToSaveAfter(this.sistema,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.sistema.getIsDeleted()) {
				this.sistema=null;
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
			
			Sistema_logic_add.checkSistemaToSave(this.sistema,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Sistema_logic_add.updateSistemaToSave(this.sistema,this.arrDatoGeneral);
			
			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.sistema,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Sistema_util.permiteMantenimiento(this.sistema) && this.validarGuardar(this.sistema)) {			
				Sistema_data.save(this.sistema, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Sistema_util.refrescarFKsDescripciones(this.sistema);				
			}
			
			Sistema_logic_add.checkSistemaToSaveAfter(this.sistema,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.sistema.getIsDeleted()) {
				this.sistema=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			Sistema_logic_add.checkSistemaToSaves(sistemas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosSistema=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Sistema sistemaLocal:sistemas) {		
				
				if(!Sistema_util.permiteMantenimiento(sistemaLocal)) {
					continue;
				}
				
				Sistema_logic_add.updateSistemaToSave(sistemaLocal,this.arrDatoGeneral);
	        	
				Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),sistemaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(sistemaLocal)) {
					Sistema_data.save(sistemaLocal, connexion);				
				} else {
					validadoTodosSistema=false;
				}
			}
			
			if(!validadoTodosSistema) {
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
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}
			
			Sistema_logic_add.checkSistemaToSavesAfter(sistemas,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			Sistema_logic_add.checkSistemaToSaves(sistemas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosSistema=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Sistema sistemaLocal:sistemas) {				
				if(!Sistema_util.permiteMantenimiento(sistemaLocal)) {
					continue;
				}
				
				Sistema_logic_add.updateSistemaToSave(sistemaLocal,this.arrDatoGeneral);
	        	
				Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),sistemaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(sistemaLocal)) {				
					Sistema_data.save(sistemaLocal, connexion);				
				} else {
					validadoTodosSistema=false;
				}
			}
			
			if(!validadoTodosSistema) {
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
				
				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}

			Sistema_logic_add.checkSistemaToSavesAfter(sistemas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Sistema_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Sistema> sistemas,Sistema_param_return sistemaParameterGeneral)throws Exception {
		 try {	
			Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
	
			Sistema_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,sistemas,sistemaParameterGeneral,sistemaReturnGeneral);
			
			return sistemaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Sistema_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Sistema> sistemas,Sistema_param_return sistemaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
	
			Sistema_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,sistemas,sistemaParameterGeneral,sistemaReturnGeneral);
			
			this.connexion.commit();
			
			return sistemaReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Sistema_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Sistema> sistemas,Sistema sistema,Sistema_param_return sistemaParameterGeneral,Boolean isEsNuevoSistema,ArrayList<Classe> clases)throws Exception {
		 try {	
			Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				sistemaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			Sistema_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,sistemas,sistema,sistemaParameterGeneral,sistemaReturnGeneral,isEsNuevoSistema,clases);
			
			return sistemaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Sistema_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Sistema> sistemas,Sistema sistema,Sistema_param_return sistemaParameterGeneral,Boolean isEsNuevoSistema,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
	
			sistemaReturnGeneral.setSistema(sistema);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				sistemaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			Sistema_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,sistemas,sistema,sistemaParameterGeneral,sistemaReturnGeneral,isEsNuevoSistema,clases);
			
			this.connexion.commit();
			
			return sistemaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Sistema_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Sistema_param_return sistemaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Sistema_param_return sistemaReturnGeneral=new Sistema_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.sistemas=new ArrayList<Sistema>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.sistema=new Sistema();
				
				
				if(conColumnasBase) {this.sistema.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.sistema.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.sistema.setcodigo(arrColumnas[iColumn++]);
				this.sistema.setnombre_principal(arrColumnas[iColumn++]);
				this.sistema.setnombre_secundario(arrColumnas[iColumn++]);
				this.sistema.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.sistemas.add(this.sistema);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			sistemaReturnGeneral.setConRetornoEstaProcesado(true);
			sistemaReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return sistemaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Sistema> sistemasAux= new ArrayList<Sistema>();
		
		for(Sistema sistema:sistemas) {
			if(!sistema.getIsDeleted()) {
				sistemasAux.add(sistema);
			}
		}
		
		sistemas=sistemasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Sistema> sistemasAux= new ArrayList<Sistema>();
		
		for(Sistema sistema : this.sistemas) {
			if(sistema==null) {
				sistemasAux.add(sistema);
			}
		}
		
		//this.sistemas=sistemasAux;
		
		this.sistemas.removeAll(sistemasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(sistema.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((sistema.getIsDeleted() || (sistema.getIsChanged()&&!sistema.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=sistemaDataAccess.getSetVersionRow(connexion,sistema.getId());
				
				if(!sistema.getVersionRow().equals(timestamp)) {	
					sistema.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				sistema.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(sistema.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((sistema.getIsDeleted() || (sistema.getIsChanged()&&!sistema.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=sistemaDataAccess.getSetVersionRow(connexion,sistema.getId());
			
			try {							
				if(!sistema.getVersionRow().equals(timestamp)) {	
					sistema.setVersionRow(timestamp);
				}
				
				sistema.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(sistemas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Sistema sistemaAux:sistemas) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(sistemaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(sistemaAux.getIsDeleted() || (sistemaAux.getIsChanged()&&!sistemaAux.getIsNew())) {
						
						timestamp=sistemaDataAccess.getSetVersionRow(connexion,sistemaAux.getId());
						
						if(!sistema.getVersionRow().equals(timestamp)) {	
							sistemaAux.setVersionRow(timestamp);
						}
								
						sistemaAux.setIsChangedAuxiliar(false);														
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
		if(sistemas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Sistema sistemaAux:sistemas) {
					if(sistemaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(sistemaAux.getIsDeleted() || (sistemaAux.getIsChanged()&&!sistemaAux.getIsNew())) {
						
						timestamp=sistemaDataAccess.getSetVersionRow(connexion,sistemaAux.getId());
						
						if(!sistemaAux.getVersionRow().equals(timestamp)) {	
							sistemaAux.setVersionRow(timestamp);
						}
						
													
						sistemaAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			Perfil_logic perfilLogic=new Perfil_logic();
			Opcion_logic opcionLogic=new Opcion_logic();
			Paquete_logic paqueteLogic=new Paquete_logic();
			Modulo_logic moduloLogic=new Modulo_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-cargarRelacionesLoteForeignKeySistemaWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(Perfil.class));
			classes.add(new Classe(Opcion.class));
			classes.add(new Classe(Paquete.class));
			classes.add(new Classe(Modulo.class));
											
			

			perfilLogic.setConnexion(this.getConnexion());
			perfilLogic.setDatosCliente(this.datosCliente);
			perfilLogic.setIsConRefrescarForeignKeys(true);

			opcionLogic.setConnexion(this.getConnexion());
			opcionLogic.setDatosCliente(this.datosCliente);
			opcionLogic.setIsConRefrescarForeignKeys(true);

			paqueteLogic.setConnexion(this.getConnexion());
			paqueteLogic.setDatosCliente(this.datosCliente);
			paqueteLogic.setIsConRefrescarForeignKeys(true);

			moduloLogic.setConnexion(this.getConnexion());
			moduloLogic.setDatosCliente(this.datosCliente);
			moduloLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Sistema sistema:this.sistemas) {
				

				classes=new ArrayList<Classe>();
				classes=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilLogic.setPerfils(sistema.perfils);
				perfilLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				opcionLogic.setOpcions(sistema.opcions);
				opcionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Paquete_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				paqueteLogic.setPaquetes(sistema.paquetes);
				paqueteLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Modulo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				moduloLogic.setModulos(sistema.modulos);
				moduloLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Sistema sistema,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			Sistema_logic_add.updateSistemaToGet(sistema,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));
		sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));
		sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));
		sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));

				if(this.isConDeep) {
					Perfil_logic perfilLogic= new Perfil_logic(this.connexion);
					perfilLogic.setPerfils(sistema.getPerfils());
					ArrayList<Classe> classesLocal=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Perfil_util.refrescarFKsDescripciones(perfilLogic.getPerfils());
					sistema.setPerfils(perfilLogic.getPerfils());
				}

				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));

				if(this.isConDeep) {
					Opcion_logic opcionLogic= new Opcion_logic(this.connexion);
					opcionLogic.setOpcions(sistema.getOpcions());
					ArrayList<Classe> classesLocal=Opcion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					opcionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Opcion_util.refrescarFKsDescripciones(opcionLogic.getOpcions());
					sistema.setOpcions(opcionLogic.getOpcions());
				}

				continue;
			}

			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));

				if(this.isConDeep) {
					Paquete_logic paqueteLogic= new Paquete_logic(this.connexion);
					paqueteLogic.setPaquetes(sistema.getPaquetes());
					ArrayList<Classe> classesLocal=Paquete_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					paqueteLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Paquete_util.refrescarFKsDescripciones(paqueteLogic.getPaquetes());
					sistema.setPaquetes(paqueteLogic.getPaquetes());
				}

				continue;
			}

			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));

				if(this.isConDeep) {
					Modulo_logic moduloLogic= new Modulo_logic(this.connexion);
					moduloLogic.setModulos(sistema.getModulos());
					ArrayList<Classe> classesLocal=Modulo_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					moduloLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Modulo_util.refrescarFKsDescripciones(moduloLogic.getModulos());
					sistema.setModulos(moduloLogic.getModulos());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


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
			sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));
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
			sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Paquete.class));
			sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Modulo.class));
			sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));

		for(Perfil perfil:sistema.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
		}

		sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));

		for(Opcion opcion:sistema.getOpcions()) {
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
		}

		sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));

		for(Paquete paquete:sistema.getPaquetes()) {
			Paquete_logic paqueteLogic= new Paquete_logic(connexion);
			paqueteLogic.deepLoad(paquete,isDeep,deepLoadType,clases);
		}

		sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));

		for(Modulo modulo:sistema.getModulos()) {
			Modulo_logic moduloLogic= new Modulo_logic(connexion);
			moduloLogic.deepLoad(modulo,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));

				for(Perfil perfil:sistema.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));

				for(Opcion opcion:sistema.getOpcions()) {
					Opcion_logic opcionLogic= new Opcion_logic(connexion);
					opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));

				for(Paquete paquete:sistema.getPaquetes()) {
					Paquete_logic paqueteLogic= new Paquete_logic(connexion);
					paqueteLogic.deepLoad(paquete,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));

				for(Modulo modulo:sistema.getModulos()) {
					Modulo_logic moduloLogic= new Modulo_logic(connexion);
					moduloLogic.deepLoad(modulo,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


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
			sistema.setPerfils(sistemaDataAccess.getPerfils(connexion,sistema));

			for(Perfil perfil:sistema.getPerfils()) {
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
			sistema.setOpcions(sistemaDataAccess.getOpcions(connexion,sistema));

			for(Opcion opcion:sistema.getOpcions()) {
				Opcion_logic opcionLogic= new Opcion_logic(connexion);
				opcionLogic.deepLoad(opcion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Paquete.class));
			sistema.setPaquetes(sistemaDataAccess.getPaquetes(connexion,sistema));

			for(Paquete paquete:sistema.getPaquetes()) {
				Paquete_logic paqueteLogic= new Paquete_logic(connexion);
				paqueteLogic.deepLoad(paquete,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Modulo.class));
			sistema.setModulos(sistemaDataAccess.getModulos(connexion,sistema));

			for(Modulo modulo:sistema.getModulos()) {
				Modulo_logic moduloLogic= new Modulo_logic(connexion);
				moduloLogic.deepLoad(modulo,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Sistema sistema,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			Sistema_logic_add.updateSistemaToSave(sistema,this.arrDatoGeneral);
			
Sistema_data.save(sistema, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(Perfil perfil:sistema.getPerfils()) {
			perfil.setid_sistema(sistema.getId());
			Perfil_data.save(perfil,connexion);
		}

		for(Opcion opcion:sistema.getOpcions()) {
			opcion.setid_sistema(sistema.getId());
			Opcion_data.save(opcion,connexion);
		}

		for(Paquete paquete:sistema.getPaquetes()) {
			paquete.setid_sistema(sistema.getId());
			Paquete_data.save(paquete,connexion);
		}

		for(Modulo modulo:sistema.getModulos()) {
			modulo.setid_sistema(sistema.getId());
			Modulo_data.save(modulo,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:sistema.getPerfils()) {
					perfil.setid_sistema(sistema.getId());
					Perfil_data.save(perfil,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcion:sistema.getOpcions()) {
					opcion.setid_sistema(sistema.getId());
					Opcion_data.save(opcion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Paquete paquete:sistema.getPaquetes()) {
					paquete.setid_sistema(sistema.getId());
					Paquete_data.save(paquete,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Modulo modulo:sistema.getModulos()) {
					modulo.setid_sistema(sistema.getId());
					Modulo_data.save(modulo,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(Perfil perfil:sistema.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfil.setid_sistema(sistema.getId());
			Perfil_data.save(perfil,connexion);
			perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
		}

		for(Opcion opcion:sistema.getOpcions()) {
			Opcion_logic opcionLogic= new Opcion_logic(connexion);
			opcion.setid_sistema(sistema.getId());
			Opcion_data.save(opcion,connexion);
			opcionLogic.deepSave(opcion,isDeep,deepLoadType,clases);
		}

		for(Paquete paquete:sistema.getPaquetes()) {
			Paquete_logic paqueteLogic= new Paquete_logic(connexion);
			paquete.setid_sistema(sistema.getId());
			Paquete_data.save(paquete,connexion);
			paqueteLogic.deepSave(paquete,isDeep,deepLoadType,clases);
		}

		for(Modulo modulo:sistema.getModulos()) {
			Modulo_logic moduloLogic= new Modulo_logic(connexion);
			modulo.setid_sistema(sistema.getId());
			Modulo_data.save(modulo,connexion);
			moduloLogic.deepSave(modulo,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:sistema.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfil.setid_sistema(sistema.getId());
					Perfil_data.save(perfil,connexion);
					perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Opcion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Opcion opcion:sistema.getOpcions()) {
					Opcion_logic opcionLogic= new Opcion_logic(connexion);
					opcion.setid_sistema(sistema.getId());
					Opcion_data.save(opcion,connexion);
					opcionLogic.deepSave(opcion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Paquete.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Paquete paquete:sistema.getPaquetes()) {
					Paquete_logic paqueteLogic= new Paquete_logic(connexion);
					paquete.setid_sistema(sistema.getId());
					Paquete_data.save(paquete,connexion);
					paqueteLogic.deepSave(paquete,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Modulo.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Modulo modulo:sistema.getModulos()) {
					Modulo_logic moduloLogic= new Modulo_logic(connexion);
					modulo.setid_sistema(sistema.getId());
					Modulo_data.save(modulo,connexion);
					moduloLogic.deepSave(modulo,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Sistema.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(sistema,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Sistema_util.refrescarFKsDescripciones(sistema);
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
			this.deepLoad(this.sistema,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Sistema.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(sistemas!=null) {
				for(Sistema sistema:sistemas) {
					this.deepLoad(sistema,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Sistema_util.refrescarFKsDescripciones(sistemas);
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
			if(sistemas!=null) {
				for(Sistema sistema:sistemas) {
					this.deepLoad(sistema,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Sistema_util.refrescarFKsDescripciones(sistemas);
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
			this.getNewConnexionToDeep(Sistema.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(sistema,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Sistema.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(sistemas!=null) {
				for(Sistema sistema:sistemas) {
					this.deepSave(sistema,isDeep,deepLoadType,clases);
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
			if(sistemas!=null) {
				for(Sistema sistema:sistemas) {
					this.deepSave(sistema,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorNombrePrincipalWithConnection(String sFinalQuery,Pagination pagination,String nombre_principal)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombrePrincipal= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePrincipal.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_principal+"%",Sistema_util.NOMBREPRINCIPAL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePrincipal);

			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombrePrincipal","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			sistemas=sistemaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorNombrePrincipal(String sFinalQuery,Pagination pagination,String nombre_principal)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombrePrincipal= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePrincipal.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre_principal+"%",Sistema_util.NOMBREPRINCIPAL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePrincipal);

			Sistema_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombrePrincipal","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			sistemas=sistemaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Sistema_util.refrescarFKsDescripciones(this.sistemas);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorCodigoWithConnection(String codigo)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo,Sistema_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			sistema=sistemaDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorCodigo(String codigo)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo,Sistema_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			sistema=sistemaDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorNombrePrincipalWithConnection(String nombre_principal)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Sistema.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralNombrePrincipal= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePrincipal.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre_principal,Sistema_util.NOMBREPRINCIPAL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePrincipal);

			sistema=sistemaDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Sistema_util.refrescarFKsDescripciones(this.sistema);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorNombrePrincipal(String nombre_principal)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralNombrePrincipal= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombrePrincipal.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre_principal,Sistema_util.NOMBREPRINCIPAL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombrePrincipal);

			sistema=sistemaDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.sistema,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Sistema_util.refrescarFKsDescripciones(this.sistema);
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
			if(Sistema_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,SistemaDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Sistema sistema,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Sistema_util.IS_CON_AUDITORIA) {
				if(sistema.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SistemaDataAccess.TABLENAME, sistema.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Sistema_util.IS_CON_AUDITORIA_DETALLE) {
						//Sistema_logic.registrarAuditoriaDetalles(connexion,sistema,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(sistema.getIsDeleted()) {
					/*if(!sistema.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,SistemaDataAccess.TABLENAME, sistema.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Sistema_logic.registrarAuditoriaDetalles(connexion,sistema,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SistemaDataAccess.TABLENAME, sistema.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(sistema.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SistemaDataAccess.TABLENAME, sistema.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Sistema_util.IS_CON_AUDITORIA_DETALLE) {
						//Sistema_logic.registrarAuditoriaDetalles(connexion,sistema,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Sistema sistema)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(sistema.getIsNew()||!sistema.getcodigo().equals(sistema.getSistemaOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(sistema.getSistemaOriginal().getcodigo()!=null)
				{
					strValorActual=sistema.getSistemaOriginal().getcodigo();
				}
				if(sistema.getcodigo()!=null)
				{
					strValorNuevo=sistema.getcodigo() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SistemaConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(sistema.getIsNew()||!sistema.getnombre_principal().equals(sistema.getSistemaOriginal().getnombre_principal()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(sistema.getSistemaOriginal().getnombre_principal()!=null)
				{
					strValorActual=sistema.getSistemaOriginal().getnombre_principal();
				}
				if(sistema.getnombre_principal()!=null)
				{
					strValorNuevo=sistema.getnombre_principal() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SistemaConstantesFunciones.NOMBREPRINCIPAL,strValorActual,strValorNuevo);
			}	
			
			if(sistema.getIsNew()||!sistema.getnombre_secundario().equals(sistema.getSistemaOriginal().getnombre_secundario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(sistema.getSistemaOriginal().getnombre_secundario()!=null)
				{
					strValorActual=sistema.getSistemaOriginal().getnombre_secundario();
				}
				if(sistema.getnombre_secundario()!=null)
				{
					strValorNuevo=sistema.getnombre_secundario() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SistemaConstantesFunciones.NOMBRESECUNDARIO,strValorActual,strValorNuevo);
			}	
			
			if(sistema.getIsNew()||!sistema.getestado().equals(sistema.getSistemaOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(sistema.getSistemaOriginal().getestado()!=null)
				{
					strValorActual=sistema.getSistemaOriginal().getestado().toString();
				}
				if(sistema.getestado()!=null)
				{
					strValorNuevo=sistema.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SistemaConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Sistema sistema,List<Perfil> perfils,List<Opcion> opcions,List<Paquete> paquetes,List<Modulo> modulos) throws Exception {

		if(!sistema.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(sistema,perfils,opcions,paquetes,modulos,true);
		}
	}

	public void saveRelaciones(Sistema sistema,List<Perfil> perfils,List<Opcion> opcions,List<Paquete> paquetes,List<Modulo> modulos)throws Exception {

		if(!sistema.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(sistema,perfils,opcions,paquetes,modulos,false);
		}
	}

	public void saveRelacionesBase(Sistema sistema,List<Perfil> perfils,List<Opcion> opcions,List<Paquete> paquetes,List<Modulo> modulos,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Sistema-saveRelacionesWithConnection");}
	
			sistema.setPerfils(perfils);
			sistema.setOpcions(opcions);
			sistema.setPaquetes(paquetes);
			sistema.setModulos(modulos);

			this.setSistema(sistema);

			if(Sistema_logic_add.validarSaveRelaciones(sistema,this)) {

				Sistema_logic_add.updateRelacionesToSave(sistema,this);

				if((sistema.getIsNew()||sistema.getIsChanged())&&!sistema.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(perfils,opcions,paquetes,modulos);

				} else if(sistema.getIsDeleted()) {
					this.saveRelacionesDetalles(perfils,opcions,paquetes,modulos);
					this.save();
				}

				Sistema_logic_add.updateRelacionesToSaveAfter(sistema,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			Perfil_util.InicializarGeneralEntityAuxiliares(perfils,true,true);
			Opcion_util.InicializarGeneralEntityAuxiliares(opcions,true,true);
			Paquete_util.InicializarGeneralEntityAuxiliares(paquetes,true,true);
			Modulo_util.InicializarGeneralEntityAuxiliares(modulos,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<Perfil> perfils,List<Opcion> opcions,List<Paquete> paquetes,List<Modulo> modulos)throws Exception {
		try {
	

			Long idSistemaActual=this.getSistema().getId();

			Perfil_logic perfilLogic_Desde_Sistema=new Perfil_logic();
			perfilLogic_Desde_Sistema.setPerfils(perfils);

			perfilLogic_Desde_Sistema.setConnexion(this.getConnexion());
			perfilLogic_Desde_Sistema.setDatosCliente(this.datosCliente);

			for(Perfil perfil_Desde_Sistema:perfilLogic_Desde_Sistema.getPerfils()) {
				perfil_Desde_Sistema.setid_sistema(idSistemaActual);

				perfilLogic_Desde_Sistema.setPerfil(perfil_Desde_Sistema);
				perfilLogic_Desde_Sistema.save();

				Long idPerfilActual=perfil_Desde_Sistema.getId();

				PerfilUsuario_logic perfilusuarioLogic_Desde_Perfil=new PerfilUsuario_logic();

				if(perfil_Desde_Sistema.getPerfilUsuarios()==null){
					perfil_Desde_Sistema.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
				}

				perfilusuarioLogic_Desde_Perfil.setPerfilUsuarios(perfil_Desde_Sistema.getPerfilUsuarios());

				perfilusuarioLogic_Desde_Perfil.setConnexion(this.getConnexion());
				perfilusuarioLogic_Desde_Perfil.setDatosCliente(this.datosCliente);

				for(PerfilUsuario perfilusuario_Desde_Perfil:perfilusuarioLogic_Desde_Perfil.getPerfilUsuarios()) {
					perfilusuario_Desde_Perfil.setid_perfil(idPerfilActual);
				}

				perfilusuarioLogic_Desde_Perfil.saves();

				PerfilOpcion_logic perfilopcionLogic_Desde_Perfil=new PerfilOpcion_logic();

				if(perfil_Desde_Sistema.getPerfilOpcions()==null){
					perfil_Desde_Sistema.setPerfilOpcions(new ArrayList<PerfilOpcion>());
				}

				perfilopcionLogic_Desde_Perfil.setPerfilOpcions(perfil_Desde_Sistema.getPerfilOpcions());

				perfilopcionLogic_Desde_Perfil.setConnexion(this.getConnexion());
				perfilopcionLogic_Desde_Perfil.setDatosCliente(this.datosCliente);

				for(PerfilOpcion perfilopcion_Desde_Perfil:perfilopcionLogic_Desde_Perfil.getPerfilOpcions()) {
					perfilopcion_Desde_Perfil.setid_perfil(idPerfilActual);
				}

				perfilopcionLogic_Desde_Perfil.saves();
			}


			Opcion_logic opcionLogic_Desde_Sistema=new Opcion_logic();
			opcionLogic_Desde_Sistema.setOpcions(opcions);

			opcionLogic_Desde_Sistema.setConnexion(this.getConnexion());
			opcionLogic_Desde_Sistema.setDatosCliente(this.datosCliente);

			for(Opcion opcion_Desde_Sistema:opcionLogic_Desde_Sistema.getOpcions()) {
				opcion_Desde_Sistema.setid_sistema(idSistemaActual);

				opcionLogic_Desde_Sistema.setOpcion(opcion_Desde_Sistema);
				opcionLogic_Desde_Sistema.save();

				Long idOpcionActual=opcion_Desde_Sistema.getId();

				Opcion_logic opcionLogicHijos_Desde_Opcion=new Opcion_logic();

				if(opcion_Desde_Sistema.getOpcions()==null){
					opcion_Desde_Sistema.setOpcions(new ArrayList<Opcion>());
				}

				opcionLogicHijos_Desde_Opcion.setOpcions(opcion_Desde_Sistema.getOpcions());

				opcionLogicHijos_Desde_Opcion.setConnexion(this.getConnexion());
				opcionLogicHijos_Desde_Opcion.setDatosCliente(this.datosCliente);

				for(Opcion opcionHijos_Desde_Opcion:opcionLogicHijos_Desde_Opcion.getOpcions()) {
					opcionHijos_Desde_Opcion.setid_opcion(idOpcionActual);

					opcionLogicHijos_Desde_Opcion.setOpcion(opcionHijos_Desde_Opcion);
					opcionLogicHijos_Desde_Opcion.save();
				}


				Accion_logic accionLogic_Desde_Opcion=new Accion_logic();

				if(opcion_Desde_Sistema.getAccions()==null){
					opcion_Desde_Sistema.setAccions(new ArrayList<Accion>());
				}

				accionLogic_Desde_Opcion.setAccions(opcion_Desde_Sistema.getAccions());

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

				if(opcion_Desde_Sistema.getPerfilOpcions()==null){
					opcion_Desde_Sistema.setPerfilOpcions(new ArrayList<PerfilOpcion>());
				}

				perfilopcionLogic_Desde_Opcion.setPerfilOpcions(opcion_Desde_Sistema.getPerfilOpcions());

				perfilopcionLogic_Desde_Opcion.setConnexion(this.getConnexion());
				perfilopcionLogic_Desde_Opcion.setDatosCliente(this.datosCliente);

				for(PerfilOpcion perfilopcion_Desde_Opcion:perfilopcionLogic_Desde_Opcion.getPerfilOpcions()) {
					perfilopcion_Desde_Opcion.setid_opcion(idOpcionActual);
				}

				perfilopcionLogic_Desde_Opcion.saves();

				Campo_logic campoLogic_Desde_Opcion=new Campo_logic();

				if(opcion_Desde_Sistema.getCampos()==null){
					opcion_Desde_Sistema.setCampos(new ArrayList<Campo>());
				}

				campoLogic_Desde_Opcion.setCampos(opcion_Desde_Sistema.getCampos());

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

			}


			Paquete_logic paqueteLogic_Desde_Sistema=new Paquete_logic();
			paqueteLogic_Desde_Sistema.setPaquetes(paquetes);

			paqueteLogic_Desde_Sistema.setConnexion(this.getConnexion());
			paqueteLogic_Desde_Sistema.setDatosCliente(this.datosCliente);

			for(Paquete paquete_Desde_Sistema:paqueteLogic_Desde_Sistema.getPaquetes()) {
				paquete_Desde_Sistema.setid_sistema(idSistemaActual);
			}

			paqueteLogic_Desde_Sistema.saves();

			Modulo_logic moduloLogic_Desde_Sistema=new Modulo_logic();
			moduloLogic_Desde_Sistema.setModulos(modulos);

			moduloLogic_Desde_Sistema.setConnexion(this.getConnexion());
			moduloLogic_Desde_Sistema.setDatosCliente(this.datosCliente);

			for(Modulo modulo_Desde_Sistema:moduloLogic_Desde_Sistema.getModulos()) {
				modulo_Desde_Sistema.setid_sistema(idSistemaActual);
			}

			moduloLogic_Desde_Sistema.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Sistema_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Sistema_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setSistema(Sistema newSistema) {
		this.sistema = newSistema;
	}
	
	public Sistema_data getSistemaDataAccess() {
		return sistemaDataAccess;
	}
	
	public void setSistemaDataAccess(Sistema_data newsistemaDataAccess) {
		this.sistemaDataAccess = newsistemaDataAccess;
	}

	public void setSistemas(List<Sistema> newSistemas) {
		this.sistemas = newSistemas;
	}
	
	public Object getSistemaObject() {	
		this.sistemaObject=this.sistemaDataAccess.getEntityObject();
		return this.sistemaObject;
	}
		
	public void setSistemaObject(Object newSistemaObject) {
		this.sistemaObject = newSistemaObject;
	}
	
	public List<Object> getSistemasObject() {		
		this.sistemasObject=this.sistemaDataAccess.getEntitiesObject();
		return this.sistemasObject;
	}
		
	public void setSistemasObject(List<Object> newSistemasObject) {
		this.sistemasObject = newSistemasObject;
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
