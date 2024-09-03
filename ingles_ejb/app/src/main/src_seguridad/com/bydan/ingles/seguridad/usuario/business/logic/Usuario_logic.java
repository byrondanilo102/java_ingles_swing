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
package com.bydan.ingles.seguridad.usuario.business.logic;


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
import com.bydan.ingles.seguridad.usuario.util.*;
import com.bydan.ingles.seguridad.usuario.util.Usuario_util;
import com.bydan.ingles.seguridad.usuario.util.Usuario_param_return;
//import com.bydan.ingles.seguridad.usuario.util.UsuarioParameterGeneral;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic_add;
import com.bydan.ingles.seguridad.usuario.business.data.*;
import com.bydan.ingles.seguridad.usuario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.seguridad.historialcambioclave.business.entity.HistorialCambioClave;
import com.bydan.ingles.seguridad.historialcambioclave.business.data.HistorialCambioClave_data;
import com.bydan.ingles.seguridad.historialcambioclave.business.logic.HistorialCambioClave_logic;
import com.bydan.ingles.seguridad.historialcambioclave.util.HistorialCambioClave_util;

import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.data.ResumenUsuario_data;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;

import com.bydan.ingles.seguridad.auditoria.business.entity.Auditoria;
import com.bydan.ingles.seguridad.auditoria.business.data.Auditoria_data;
import com.bydan.ingles.seguridad.auditoria.business.logic.Auditoria_logic;
import com.bydan.ingles.seguridad.auditoria.util.Auditoria_util;

import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;
import com.bydan.ingles.seguridad.perfil.util.Perfil_util;

import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.data.ParametroGeneralUsuario_data;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;

import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
import com.bydan.ingles.seguridad.perfilusuario.business.data.PerfilUsuario_data;
import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

//REL DETALLES


import com.bydan.ingles.seguridad.auditoriadetalle.business.entity.AuditoriaDetalle;
import com.bydan.ingles.seguridad.auditoriadetalle.business.logic.AuditoriaDetalle_logic;










@SuppressWarnings({"unused"})
public class Usuario_logic  extends GeneralEntityLogic implements Usuario_logicI {
	static Logger logger = Logger.getLogger("Usuario_logic.class");	

	protected Usuario_data usuarioDataAccess; 	
	protected Usuario usuario;
	protected List<Usuario> usuarios;
	protected Object usuarioObject;	
	protected List<Object> usuariosObject;
	
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
	
	
	protected Usuario_logic_add usuarioLogicAdditional=null;
	
	public Usuario_logic_add getUsuarioLogicAdditional() {
		return this.usuarioLogicAdditional;
	}
	
	public void setUsuarioLogicAdditional(Usuario_logic_add usuarioLogicAdditional) {
		try {
			this.usuarioLogicAdditional=usuarioLogicAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	
	
	public Usuario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.usuarioDataAccess = new Usuario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Usuario_data.ActualizarQueries();
			
			//this.usuarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.usuarios= new ArrayList<Usuario>();
			this.usuario= new Usuario();
			
			this.usuarioObject=new Object();
			this.usuariosObject=new ArrayList<Object>();
				
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
			
			this.usuarioDataAccess.setConnexionType(this.connexionType);
			this.usuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Usuario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.usuarioDataAccess = new Usuario_data();
			this.usuarios= new ArrayList<Usuario>();
			this.usuario= new Usuario();
			this.usuarioObject=new Object();
			this.usuariosObject=new ArrayList<Object>();
			
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
			
			this.usuarioDataAccess.setConnexionType(this.connexionType);
			this.usuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Usuario getUsuario() throws Exception {	
		Usuario_logic_add.checkUsuarioToGet(usuario,this.datosCliente,this.arrDatoGeneral);
		Usuario_logic_add.updateUsuarioToGet(usuario,this.arrDatoGeneral);
		
		return usuario;
	}
	
	public List<Usuario> getUsuarios() throws Exception {		
		if(this.usuarios==null) {
			this.usuarios= new ArrayList<Usuario>();
		}
		
		this.quitarsNulos();
		
		Usuario_logic_add.checkUsuarioToGets(usuarios,this.datosCliente,this.arrDatoGeneral);
		
		for (Usuario usuarioLocal: usuarios ) {
			Usuario_logic_add.updateUsuarioToGet(usuarioLocal,this.arrDatoGeneral);
		}
		
		return usuarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.usuarioDataAccess!=null) {
			this.usuarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			usuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			usuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		usuario = new  Usuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			usuario=usuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
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
		usuario = new  Usuario();
		  		  
        try {
			
			usuario=usuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		usuario = new  Usuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			usuario=usuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
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
		usuario = new  Usuario();
		  		  
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
		usuario = new  Usuario();
		  		  
        try {
			
			usuario=usuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		usuario = new  Usuario();
		  		  
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
		usuario = new  Usuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =usuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		usuario = new  Usuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=usuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		usuario = new  Usuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =usuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		usuario = new  Usuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=usuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		usuario = new  Usuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =usuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		usuario = new  Usuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=usuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		  		  
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
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		usuarios = new  ArrayList<Usuario>();
		  		  
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
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		usuario = new  Usuario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuario=usuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(usuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
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
		usuario = new  Usuario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuario=usuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(usuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		  		  
        try {
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		usuarios = new  ArrayList<Usuario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
		usuarios = new  ArrayList<Usuario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(usuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Usuario usuario) throws Exception {
		Boolean estaValidado=false;
		
		if(usuario.getIsNew() || usuario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Usuario> Usuarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Usuario usuarioLocal:usuarios) {				
			estaValidadoObjeto=this.validarGuardar(usuarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Usuario> Usuarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(usuarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Usuario Usuario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(usuario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Usuario usuario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+usuario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"usuario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Usuario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Usuario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			Usuario_logic_add.checkUsuarioToSave(this.usuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Usuario_logic_add.updateUsuarioToSave(this.usuario,this.arrDatoGeneral);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.usuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Usuario_util.permiteMantenimiento(this.usuario) && this.validarGuardar(this.usuario)) {
				Usuario_data.save(this.usuario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Usuario_util.refrescarFKsDescripciones(this.usuario);				
			}

			Usuario_logic_add.checkUsuarioToSaveAfter(this.usuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.usuario.getIsDeleted()) {
				this.usuario=null;
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
			
			Usuario_logic_add.checkUsuarioToSave(this.usuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Usuario_logic_add.updateUsuarioToSave(this.usuario,this.arrDatoGeneral);
			
			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.usuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Usuario_util.permiteMantenimiento(this.usuario) && this.validarGuardar(this.usuario)) {			
				Usuario_data.save(this.usuario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Usuario_util.refrescarFKsDescripciones(this.usuario);				
			}
			
			Usuario_logic_add.checkUsuarioToSaveAfter(this.usuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.usuario.getIsDeleted()) {
				this.usuario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			Usuario_logic_add.checkUsuarioToSaves(usuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Usuario usuarioLocal:usuarios) {		
				
				if(!Usuario_util.permiteMantenimiento(usuarioLocal)) {
					continue;
				}
				
				Usuario_logic_add.updateUsuarioToSave(usuarioLocal,this.arrDatoGeneral);
	        	
				Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),usuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(usuarioLocal)) {
					Usuario_data.save(usuarioLocal, connexion);				
				} else {
					validadoTodosUsuario=false;
				}
			}
			
			if(!validadoTodosUsuario) {
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
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}
			
			Usuario_logic_add.checkUsuarioToSavesAfter(usuarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			Usuario_logic_add.checkUsuarioToSaves(usuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Usuario usuarioLocal:usuarios) {				
				if(!Usuario_util.permiteMantenimiento(usuarioLocal)) {
					continue;
				}
				
				Usuario_logic_add.updateUsuarioToSave(usuarioLocal,this.arrDatoGeneral);
	        	
				Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),usuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(usuarioLocal)) {				
					Usuario_data.save(usuarioLocal, connexion);				
				} else {
					validadoTodosUsuario=false;
				}
			}
			
			if(!validadoTodosUsuario) {
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
				
				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}

			Usuario_logic_add.checkUsuarioToSavesAfter(usuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Usuario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Usuario> usuarios,Usuario_param_return usuarioParameterGeneral)throws Exception {
		 try {	
			Usuario_param_return usuarioReturnGeneral=new Usuario_param_return();
	
			Usuario_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,usuarios,usuarioParameterGeneral,usuarioReturnGeneral);
			
			return usuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Usuario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Usuario> usuarios,Usuario_param_return usuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Usuario_param_return usuarioReturnGeneral=new Usuario_param_return();
	
			Usuario_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,usuarios,usuarioParameterGeneral,usuarioReturnGeneral);
			
			this.connexion.commit();
			
			return usuarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Usuario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Usuario> usuarios,Usuario usuario,Usuario_param_return usuarioParameterGeneral,Boolean isEsNuevoUsuario,ArrayList<Classe> clases)throws Exception {
		 try {	
			Usuario_param_return usuarioReturnGeneral=new Usuario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				usuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			Usuario_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,usuarios,usuario,usuarioParameterGeneral,usuarioReturnGeneral,isEsNuevoUsuario,clases);
			
			return usuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Usuario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Usuario> usuarios,Usuario usuario,Usuario_param_return usuarioParameterGeneral,Boolean isEsNuevoUsuario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Usuario_param_return usuarioReturnGeneral=new Usuario_param_return();
	
			usuarioReturnGeneral.setUsuario(usuario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				usuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			Usuario_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,usuarios,usuario,usuarioParameterGeneral,usuarioReturnGeneral,isEsNuevoUsuario,clases);
			
			this.connexion.commit();
			
			return usuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Usuario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Usuario_param_return usuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Usuario_param_return usuarioReturnGeneral=new Usuario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.usuarios=new ArrayList<Usuario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.usuario=new Usuario();
				
				
				if(conColumnasBase) {this.usuario.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.usuario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.usuario.setuser_name(arrColumnas[iColumn++]);
			this.usuario.setclave(arrColumnas[iColumn++]);
			this.usuario.setconfirmar_clave(arrColumnas[iColumn++]);
				this.usuario.setnombre(arrColumnas[iColumn++]);
				this.usuario.setcodigo_alterno(arrColumnas[iColumn++]);
				this.usuario.settipo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.usuario.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.usuarios.add(this.usuario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			usuarioReturnGeneral.setConRetornoEstaProcesado(true);
			usuarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return usuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Usuario> usuariosAux= new ArrayList<Usuario>();
		
		for(Usuario usuario:usuarios) {
			if(!usuario.getIsDeleted()) {
				usuariosAux.add(usuario);
			}
		}
		
		usuarios=usuariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Usuario> usuariosAux= new ArrayList<Usuario>();
		
		for(Usuario usuario : this.usuarios) {
			if(usuario==null) {
				usuariosAux.add(usuario);
			}
		}
		
		//this.usuarios=usuariosAux;
		
		this.usuarios.removeAll(usuariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(usuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((usuario.getIsDeleted() || (usuario.getIsChanged()&&!usuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=usuarioDataAccess.getSetVersionRow(connexion,usuario.getId());
				
				if(!usuario.getVersionRow().equals(timestamp)) {	
					usuario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				usuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(usuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((usuario.getIsDeleted() || (usuario.getIsChanged()&&!usuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=usuarioDataAccess.getSetVersionRow(connexion,usuario.getId());
			
			try {							
				if(!usuario.getVersionRow().equals(timestamp)) {	
					usuario.setVersionRow(timestamp);
				}
				
				usuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(usuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Usuario usuarioAux:usuarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(usuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(usuarioAux.getIsDeleted() || (usuarioAux.getIsChanged()&&!usuarioAux.getIsNew())) {
						
						timestamp=usuarioDataAccess.getSetVersionRow(connexion,usuarioAux.getId());
						
						if(!usuario.getVersionRow().equals(timestamp)) {	
							usuarioAux.setVersionRow(timestamp);
						}
								
						usuarioAux.setIsChangedAuxiliar(false);														
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
		if(usuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Usuario usuarioAux:usuarios) {
					if(usuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(usuarioAux.getIsDeleted() || (usuarioAux.getIsChanged()&&!usuarioAux.getIsNew())) {
						
						timestamp=usuarioDataAccess.getSetVersionRow(connexion,usuarioAux.getId());
						
						if(!usuarioAux.getVersionRow().equals(timestamp)) {	
							usuarioAux.setVersionRow(timestamp);
						}
						
													
						usuarioAux.setIsChangedAuxiliar(false);														
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
		
		
			HistorialCambioClave_logic historialcambioclaveLogic=new HistorialCambioClave_logic();
			ResumenUsuario_logic resumenusuarioLogic=new ResumenUsuario_logic();
			Auditoria_logic auditoriaLogic=new Auditoria_logic();
			PerfilUsuario_logic perfilusuarioLogic=new PerfilUsuario_logic();
			ParametroGeneralUsuario_logic parametrogeneralusuarioLogic=new ParametroGeneralUsuario_logic();
			DatoGeneralUsuario_logic datogeneralusuarioLogic=new DatoGeneralUsuario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyUsuarioWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(HistorialCambioClave.class));
			classes.add(new Classe(ResumenUsuario.class));
			classes.add(new Classe(Auditoria.class));
			classes.add(new Classe(PerfilUsuario.class));
			classes.add(new Classe(ParametroGeneralUsuario.class));
			classes.add(new Classe(DatoGeneralUsuario.class));
											
			

			historialcambioclaveLogic.setConnexion(this.getConnexion());
			historialcambioclaveLogic.setDatosCliente(this.datosCliente);
			historialcambioclaveLogic.setIsConRefrescarForeignKeys(true);

			resumenusuarioLogic.setConnexion(this.getConnexion());
			resumenusuarioLogic.setDatosCliente(this.datosCliente);
			resumenusuarioLogic.setIsConRefrescarForeignKeys(true);

			auditoriaLogic.setConnexion(this.getConnexion());
			auditoriaLogic.setDatosCliente(this.datosCliente);
			auditoriaLogic.setIsConRefrescarForeignKeys(true);

			perfilusuarioLogic.setConnexion(this.getConnexion());
			perfilusuarioLogic.setDatosCliente(this.datosCliente);
			perfilusuarioLogic.setIsConRefrescarForeignKeys(true);

			parametrogeneralusuarioLogic.setConnexion(this.getConnexion());
			parametrogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			parametrogeneralusuarioLogic.setIsConRefrescarForeignKeys(true);

			datogeneralusuarioLogic.setConnexion(this.getConnexion());
			datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Usuario usuario:this.usuarios) {
				

				classes=new ArrayList<Classe>();
				classes=HistorialCambioClave_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				historialcambioclaveLogic.setHistorialCambioClaves(usuario.historialcambioclaves);
				historialcambioclaveLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=ResumenUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				resumenusuarioLogic.setResumenUsuarios(usuario.resumenusuarios);
				resumenusuarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Auditoria_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				auditoriaLogic.setAuditorias(usuario.auditorias);
				auditoriaLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=PerfilUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				perfilusuarioLogic.setPerfilUsuarios(usuario.perfilusuarios);
				perfilusuarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=ParametroGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				parametrogeneralusuarioLogic.setParametroGeneralUsuario(usuario.parametrogeneralusuario);
				parametrogeneralusuarioLogic.deepLoad(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				datogeneralusuarioLogic.setDatoGeneralUsuario(usuario.datogeneralusuario);
				datogeneralusuarioLogic.deepLoad(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Usuario usuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			Usuario_logic_add.updateUsuarioToGet(usuario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));
		usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));
		usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));
		usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));
		usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));
		usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));
		usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));

				if(this.isConDeep) {
					HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(this.connexion);
					historialcambioclaveLogic.setHistorialCambioClaves(usuario.getHistorialCambioClaves());
					ArrayList<Classe> classesLocal=HistorialCambioClave_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					historialcambioclaveLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					HistorialCambioClave_util.refrescarFKsDescripciones(historialcambioclaveLogic.getHistorialCambioClaves());
					usuario.setHistorialCambioClaves(historialcambioclaveLogic.getHistorialCambioClaves());
				}

				continue;
			}

			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));

				if(this.isConDeep) {
					ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(this.connexion);
					resumenusuarioLogic.setResumenUsuarios(usuario.getResumenUsuarios());
					ArrayList<Classe> classesLocal=ResumenUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					resumenusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					ResumenUsuario_util.refrescarFKsDescripciones(resumenusuarioLogic.getResumenUsuarios());
					usuario.setResumenUsuarios(resumenusuarioLogic.getResumenUsuarios());
				}

				continue;
			}

			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));

				if(this.isConDeep) {
					Auditoria_logic auditoriaLogic= new Auditoria_logic(this.connexion);
					auditoriaLogic.setAuditorias(usuario.getAuditorias());
					ArrayList<Classe> classesLocal=Auditoria_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					auditoriaLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Auditoria_util.refrescarFKsDescripciones(auditoriaLogic.getAuditorias());
					usuario.setAuditorias(auditoriaLogic.getAuditorias());
				}

				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));

				if(this.isConDeep) {
					Perfil_logic perfilLogic= new Perfil_logic(this.connexion);
					perfilLogic.setPerfils(usuario.getPerfils());
					ArrayList<Classe> classesLocal=Perfil_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Perfil_util.refrescarFKsDescripciones(perfilLogic.getPerfils());
					usuario.setPerfils(perfilLogic.getPerfils());
				}

				continue;
			}

			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));

				if(this.isConDeep) {
					ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(this.connexion);
					parametrogeneralusuarioLogic.setParametroGeneralUsuario(usuario.getParametroGeneralUsuario());
					ArrayList<Classe> classesLocal=ParametroGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					parametrogeneralusuarioLogic.deepLoad(false,DeepLoadType.INCLUDE, classesLocal,"");
					ParametroGeneralUsuario_util.refrescarFKsDescripciones(parametrogeneralusuarioLogic.getParametroGeneralUsuario());
					usuario.setParametroGeneralUsuario(parametrogeneralusuarioLogic.getParametroGeneralUsuario());
				}

				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));

				if(this.isConDeep) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(this.connexion);
					perfilusuarioLogic.setPerfilUsuarios(usuario.getPerfilUsuarios());
					ArrayList<Classe> classesLocal=PerfilUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					perfilusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					PerfilUsuario_util.refrescarFKsDescripciones(perfilusuarioLogic.getPerfilUsuarios());
					usuario.setPerfilUsuarios(perfilusuarioLogic.getPerfilUsuarios());
				}

				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));

				if(this.isConDeep) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(this.connexion);
					datogeneralusuarioLogic.setDatoGeneralUsuario(usuario.getDatoGeneralUsuario());
					ArrayList<Classe> classesLocal=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					datogeneralusuarioLogic.deepLoad(false,DeepLoadType.INCLUDE, classesLocal,"");
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarioLogic.getDatoGeneralUsuario());
					usuario.setDatoGeneralUsuario(datogeneralusuarioLogic.getDatoGeneralUsuario());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(HistorialCambioClave.class));
			usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ResumenUsuario.class));
			usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Auditoria.class));
			usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));
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
			usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ParametroGeneralUsuario.class));
			usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));
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
			usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(DatoGeneralUsuario.class));
			usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));

		for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
			HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(connexion);
			historialcambioclaveLogic.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);
		}

		usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));

		for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
			ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(connexion);
			resumenusuarioLogic.deepLoad(resumenusuario,isDeep,deepLoadType,clases);
		}

		usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));

		for(Auditoria auditoria:usuario.getAuditorias()) {
			Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
			auditoriaLogic.deepLoad(auditoria,isDeep,deepLoadType,clases);
		}

		usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));

		for(Perfil perfil:usuario.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
		}
					usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));

						ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(connexion);

					parametrogeneralusuarioLogic.deepLoad(usuario.getParametroGeneralUsuario(),isDeep,deepLoadType,clases);

		usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));

		for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
			PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
			perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
		}
					usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));

						DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);

					datogeneralusuarioLogic.deepLoad(usuario.getDatoGeneralUsuario(),isDeep,deepLoadType,clases);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));

				for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
					HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(connexion);
					historialcambioclaveLogic.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));

				for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
					ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(connexion);
					resumenusuarioLogic.deepLoad(resumenusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));

				for(Auditoria auditoria:usuario.getAuditorias()) {
					Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
					auditoriaLogic.deepLoad(auditoria,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));

				for(Perfil perfil:usuario.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));

				ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(connexion);

				parametrogeneralusuarioLogic.deepLoad(usuario.getParametroGeneralUsuario(),isDeep,deepLoadType,clases);
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));

				for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
					perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));

				DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);

				datogeneralusuarioLogic.deepLoad(usuario.getDatoGeneralUsuario(),isDeep,deepLoadType,clases);
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(HistorialCambioClave.class));
			usuario.setHistorialCambioClaves(usuarioDataAccess.getHistorialCambioClaves(connexion,usuario));

			for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
				HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(connexion);
				historialcambioclaveLogic.deepLoad(historialcambioclave,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ResumenUsuario.class));
			usuario.setResumenUsuarios(usuarioDataAccess.getResumenUsuarios(connexion,usuario));

			for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
				ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(connexion);
				resumenusuarioLogic.deepLoad(resumenusuario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Auditoria.class));
			usuario.setAuditorias(usuarioDataAccess.getAuditorias(connexion,usuario));

			for(Auditoria auditoria:usuario.getAuditorias()) {
				Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
				auditoriaLogic.deepLoad(auditoria,isDeep,deepLoadType,clases);
			}
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
			usuario.setPerfils(usuarioDataAccess.getPerfils(connexion,usuario));

			for(Perfil perfil:usuario.getPerfils()) {
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfil,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
				clases.add(new Classe(ParametroGeneralUsuario.class));
				usuario.setParametroGeneralUsuario(usuarioDataAccess.getParametroGeneralUsuario(connexion,usuario));

					ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(connexion);

				parametrogeneralusuarioLogic.deepLoad(usuario.getParametroGeneralUsuario(),isDeep,deepLoadType,clases);
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
			usuario.setPerfilUsuarios(usuarioDataAccess.getPerfilUsuarios(connexion,usuario));

			for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
				PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
				perfilusuarioLogic.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
				clases.add(new Classe(DatoGeneralUsuario.class));
				usuario.setDatoGeneralUsuario(usuarioDataAccess.getDatoGeneralUsuario(connexion,usuario));

					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);

				datogeneralusuarioLogic.deepLoad(usuario.getDatoGeneralUsuario(),isDeep,deepLoadType,clases);
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Usuario usuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			Usuario_logic_add.updateUsuarioToSave(usuario,this.arrDatoGeneral);
			
Usuario_data.save(usuario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
			historialcambioclave.setid_usuario(usuario.getId());
			HistorialCambioClave_data.save(historialcambioclave,connexion);
		}

		for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
			resumenusuario.setid_usuario(usuario.getId());
			ResumenUsuario_data.save(resumenusuario,connexion);
		}

		for(Auditoria auditoria:usuario.getAuditorias()) {
			auditoria.setid_usuario(usuario.getId());
			Auditoria_data.save(auditoria,connexion);
		}

		for(Perfil perfil:usuario.getPerfils()) {
			Perfil_data.save(perfil,connexion);
		}

			usuario.getParametroGeneralUsuario().setId(usuario.getId());
		ParametroGeneralUsuario_data.save(usuario.getParametroGeneralUsuario(),connexion);

		for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
			perfilusuario.setid_usuario(usuario.getId());
			PerfilUsuario_data.save(perfilusuario,connexion);
		}

			usuario.getDatoGeneralUsuario().setId(usuario.getId());
		DatoGeneralUsuario_data.save(usuario.getDatoGeneralUsuario(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
					historialcambioclave.setid_usuario(usuario.getId());
					HistorialCambioClave_data.save(historialcambioclave,connexion);
				}
				continue;
			}

			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
					resumenusuario.setid_usuario(usuario.getId());
					ResumenUsuario_data.save(resumenusuario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Auditoria auditoria:usuario.getAuditorias()) {
					auditoria.setid_usuario(usuario.getId());
					Auditoria_data.save(auditoria,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:usuario.getPerfils()) {
					Perfil_data.save(perfil,connexion);
				}
				continue;
			}

			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				usuario.getParametroGeneralUsuario().setId(usuario.getId());
		ParametroGeneralUsuario_data.save(usuario.getParametroGeneralUsuario(),connexion);
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
					perfilusuario.setid_usuario(usuario.getId());
					PerfilUsuario_data.save(perfilusuario,connexion);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				usuario.getDatoGeneralUsuario().setId(usuario.getId());
		DatoGeneralUsuario_data.save(usuario.getDatoGeneralUsuario(),connexion);
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
			HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(connexion);
			historialcambioclave.setid_usuario(usuario.getId());
			HistorialCambioClave_data.save(historialcambioclave,connexion);
			historialcambioclaveLogic.deepSave(historialcambioclave,isDeep,deepLoadType,clases);
		}

		for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
			ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(connexion);
			resumenusuario.setid_usuario(usuario.getId());
			ResumenUsuario_data.save(resumenusuario,connexion);
			resumenusuarioLogic.deepSave(resumenusuario,isDeep,deepLoadType,clases);
		}

		for(Auditoria auditoria:usuario.getAuditorias()) {
			Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
			auditoria.setid_usuario(usuario.getId());
			Auditoria_data.save(auditoria,connexion);
			auditoriaLogic.deepSave(auditoria,isDeep,deepLoadType,clases);
		}

		for(Perfil perfil:usuario.getPerfils()) {
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			Perfil_data.save(perfil,connexion);
			perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
		}
					ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(connexion);

				usuario.getParametroGeneralUsuario().setId(usuario.getId());
					ParametroGeneralUsuario_data.save(usuario.getParametroGeneralUsuario(),connexion);
					parametrogeneralusuarioLogic.deepSave(usuario.getParametroGeneralUsuario(),isDeep,deepLoadType,clases);

		for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
			PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
			perfilusuario.setid_usuario(usuario.getId());
			PerfilUsuario_data.save(perfilusuario,connexion);
			perfilusuarioLogic.deepSave(perfilusuario,isDeep,deepLoadType,clases);
		}
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);

				usuario.getDatoGeneralUsuario().setId(usuario.getId());
					DatoGeneralUsuario_data.save(usuario.getDatoGeneralUsuario(),connexion);
					datogeneralusuarioLogic.deepSave(usuario.getDatoGeneralUsuario(),isDeep,deepLoadType,clases);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(HistorialCambioClave.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(HistorialCambioClave historialcambioclave:usuario.getHistorialCambioClaves()) {
					HistorialCambioClave_logic historialcambioclaveLogic= new HistorialCambioClave_logic(connexion);
					historialcambioclave.setid_usuario(usuario.getId());
					HistorialCambioClave_data.save(historialcambioclave,connexion);
					historialcambioclaveLogic.deepSave(historialcambioclave,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(ResumenUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ResumenUsuario resumenusuario:usuario.getResumenUsuarios()) {
					ResumenUsuario_logic resumenusuarioLogic= new ResumenUsuario_logic(connexion);
					resumenusuario.setid_usuario(usuario.getId());
					ResumenUsuario_data.save(resumenusuario,connexion);
					resumenusuarioLogic.deepSave(resumenusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Auditoria.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Auditoria auditoria:usuario.getAuditorias()) {
					Auditoria_logic auditoriaLogic= new Auditoria_logic(connexion);
					auditoria.setid_usuario(usuario.getId());
					Auditoria_data.save(auditoria,connexion);
					auditoriaLogic.deepSave(auditoria,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Perfil.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Perfil perfil:usuario.getPerfils()) {
					Perfil_logic perfilLogic= new Perfil_logic(connexion);
					Perfil_data.save(perfil,connexion);
					perfilLogic.deepSave(perfil,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(ParametroGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
					ParametroGeneralUsuario_logic parametrogeneralusuarioLogic= new ParametroGeneralUsuario_logic(connexion);

				usuario.getParametroGeneralUsuario().setId(usuario.getId());
					ParametroGeneralUsuario_data.save(usuario.getParametroGeneralUsuario(),connexion);
					parametrogeneralusuarioLogic.deepSave(usuario.getParametroGeneralUsuario(),isDeep,deepLoadType,clases);
				continue;
			}

			if(clas.clas.equals(PerfilUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(PerfilUsuario perfilusuario:usuario.getPerfilUsuarios()) {
					PerfilUsuario_logic perfilusuarioLogic= new PerfilUsuario_logic(connexion);
					perfilusuario.setid_usuario(usuario.getId());
					PerfilUsuario_data.save(perfilusuario,connexion);
					perfilusuarioLogic.deepSave(perfilusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);

				usuario.getDatoGeneralUsuario().setId(usuario.getId());
					DatoGeneralUsuario_data.save(usuario.getDatoGeneralUsuario(),connexion);
					datogeneralusuarioLogic.deepSave(usuario.getDatoGeneralUsuario(),isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Usuario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(usuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Usuario_util.refrescarFKsDescripciones(usuario);
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
			this.deepLoad(this.usuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Usuario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(usuarios!=null) {
				for(Usuario usuario:usuarios) {
					this.deepLoad(usuario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Usuario_util.refrescarFKsDescripciones(usuarios);
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
			if(usuarios!=null) {
				for(Usuario usuario:usuarios) {
					this.deepLoad(usuario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Usuario_util.refrescarFKsDescripciones(usuarios);
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
			this.getNewConnexionToDeep(Usuario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(usuario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Usuario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(usuarios!=null) {
				for(Usuario usuario:usuarios) {
					this.deepSave(usuario,isDeep,deepLoadType,clases);
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
			if(usuarios!=null) {
				for(Usuario usuario:usuarios) {
					this.deepSave(usuario,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Usuario_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Usuario_util.refrescarFKsDescripciones(this.usuarios);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Usuario_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorUserNameWithConnection(String sFinalQuery,Pagination pagination,String user_name)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralUserName= new ParameterSelectionGeneral();
			parameterSelectionGeneralUserName.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+user_name+"%",Usuario_util.USERNAME,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUserName);

			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorUserName","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorUserName(String sFinalQuery,Pagination pagination,String user_name)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralUserName= new ParameterSelectionGeneral();
			parameterSelectionGeneralUserName.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+user_name+"%",Usuario_util.USERNAME,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUserName);

			Usuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorUserName","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			usuarios=usuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Usuario_util.refrescarFKsDescripciones(this.usuarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorCodigoAlternoWithConnection(String codigo_alterno)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigoAlterno= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigoAlterno.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo_alterno,Usuario_util.CODIGOALTERNO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigoAlterno);

			usuario=usuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorCodigoAlterno(String codigo_alterno)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigoAlterno= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigoAlterno.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo_alterno,Usuario_util.CODIGOALTERNO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigoAlterno);

			usuario=usuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorUserNameWithConnection(String user_name)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Usuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralUserName= new ParameterSelectionGeneral();
			parameterSelectionGeneralUserName.setParameterSelectionGeneralEqual(ParameterType.STRING,user_name,Usuario_util.USERNAME,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUserName);

			usuario=usuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Usuario_util.refrescarFKsDescripciones(this.usuario);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorUserName(String user_name)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralUserName= new ParameterSelectionGeneral();
			parameterSelectionGeneralUserName.setParameterSelectionGeneralEqual(ParameterType.STRING,user_name,Usuario_util.USERNAME,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralUserName);

			usuario=usuarioDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.usuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Usuario_util.refrescarFKsDescripciones(this.usuario);
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
			if(Usuario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,UsuarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Usuario usuario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Usuario_util.IS_CON_AUDITORIA) {
				if(usuario.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,UsuarioDataAccess.TABLENAME, usuario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Usuario_util.IS_CON_AUDITORIA_DETALLE) {
						//Usuario_logic.registrarAuditoriaDetalles(connexion,usuario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(usuario.getIsDeleted()) {
					/*if(!usuario.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,UsuarioDataAccess.TABLENAME, usuario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//Usuario_logic.registrarAuditoriaDetalles(connexion,usuario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,UsuarioDataAccess.TABLENAME, usuario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(usuario.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,UsuarioDataAccess.TABLENAME, usuario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Usuario_util.IS_CON_AUDITORIA_DETALLE) {
						//Usuario_logic.registrarAuditoriaDetalles(connexion,usuario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Usuario usuario)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(usuario.getIsNew()||!usuario.getuser_name().equals(usuario.getUsuarioOriginal().getuser_name()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getuser_name()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getuser_name();
				}
				if(usuario.getuser_name()!=null)
				{
					strValorNuevo=usuario.getuser_name() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.USERNAME,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.getclave().equals(usuario.getUsuarioOriginal().getclave()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getclave()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getclave();
				}
				if(usuario.getclave()!=null)
				{
					strValorNuevo=usuario.getclave() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.CLAVE,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.getconfirmar_clave().equals(usuario.getUsuarioOriginal().getconfirmar_clave()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getconfirmar_clave()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getconfirmar_clave();
				}
				if(usuario.getconfirmar_clave()!=null)
				{
					strValorNuevo=usuario.getconfirmar_clave() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.CONFIRMARCLAVE,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.getnombre().equals(usuario.getUsuarioOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getnombre()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getnombre();
				}
				if(usuario.getnombre()!=null)
				{
					strValorNuevo=usuario.getnombre() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.getcodigo_alterno().equals(usuario.getUsuarioOriginal().getcodigo_alterno()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getcodigo_alterno()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getcodigo_alterno();
				}
				if(usuario.getcodigo_alterno()!=null)
				{
					strValorNuevo=usuario.getcodigo_alterno() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.CODIGOALTERNO,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.gettipo().equals(usuario.getUsuarioOriginal().gettipo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().gettipo()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().gettipo().toString();
				}
				if(usuario.gettipo()!=null)
				{
					strValorNuevo=usuario.gettipo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.TIPO,strValorActual,strValorNuevo);
			}	
			
			if(usuario.getIsNew()||!usuario.getestado().equals(usuario.getUsuarioOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(usuario.getUsuarioOriginal().getestado()!=null)
				{
					strValorActual=usuario.getUsuarioOriginal().getestado().toString();
				}
				if(usuario.getestado()!=null)
				{
					strValorNuevo=usuario.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),UsuarioConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Usuario usuario,List<HistorialCambioClave> historialcambioclaves,List<ResumenUsuario> resumenusuarios,List<Auditoria> auditorias,ParametroGeneralUsuario parametrogeneralusuario,List<PerfilUsuario> perfilusuarios,DatoGeneralUsuario datogeneralusuario) throws Exception {

		if(!usuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(usuario,historialcambioclaves,resumenusuarios,auditorias,parametrogeneralusuario,perfilusuarios,datogeneralusuario,true);
		}
	}

	public void saveRelaciones(Usuario usuario,List<HistorialCambioClave> historialcambioclaves,List<ResumenUsuario> resumenusuarios,List<Auditoria> auditorias,ParametroGeneralUsuario parametrogeneralusuario,List<PerfilUsuario> perfilusuarios,DatoGeneralUsuario datogeneralusuario)throws Exception {

		if(!usuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(usuario,historialcambioclaves,resumenusuarios,auditorias,parametrogeneralusuario,perfilusuarios,datogeneralusuario,false);
		}
	}

	public void saveRelacionesBase(Usuario usuario,List<HistorialCambioClave> historialcambioclaves,List<ResumenUsuario> resumenusuarios,List<Auditoria> auditorias,ParametroGeneralUsuario parametrogeneralusuario,List<PerfilUsuario> perfilusuarios,DatoGeneralUsuario datogeneralusuario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Usuario-saveRelacionesWithConnection");}
	
			usuario.setHistorialCambioClaves(historialcambioclaves);
			usuario.setResumenUsuarios(resumenusuarios);
			usuario.setAuditorias(auditorias);
			usuario.setParametroGeneralUsuario(parametrogeneralusuario);
			usuario.setPerfilUsuarios(perfilusuarios);
			usuario.setDatoGeneralUsuario(datogeneralusuario);

			this.setUsuario(usuario);

			if(Usuario_logic_add.validarSaveRelaciones(usuario,this)) {

				Usuario_logic_add.updateRelacionesToSave(usuario,this);

				if((usuario.getIsNew()||usuario.getIsChanged())&&!usuario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(historialcambioclaves,resumenusuarios,auditorias,parametrogeneralusuario,perfilusuarios,datogeneralusuario);

				} else if(usuario.getIsDeleted()) {
					this.saveRelacionesDetalles(historialcambioclaves,resumenusuarios,auditorias,parametrogeneralusuario,perfilusuarios,datogeneralusuario);
					this.save();
				}

				Usuario_logic_add.updateRelacionesToSaveAfter(usuario,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			HistorialCambioClave_util.InicializarGeneralEntityAuxiliares(historialcambioclaves,true,true);
			ResumenUsuario_util.InicializarGeneralEntityAuxiliares(resumenusuarios,true,true);
			Auditoria_util.InicializarGeneralEntityAuxiliares(auditorias,true,true);
		ParametroGeneralUsuario_util.InicializarGeneralEntityAuxiliares(parametrogeneralusuario,true,true);
			PerfilUsuario_util.InicializarGeneralEntityAuxiliares(perfilusuarios,true,true);
		DatoGeneralUsuario_util.InicializarGeneralEntityAuxiliares(datogeneralusuario,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<HistorialCambioClave> historialcambioclaves,List<ResumenUsuario> resumenusuarios,List<Auditoria> auditorias,ParametroGeneralUsuario parametrogeneralusuario,List<PerfilUsuario> perfilusuarios,DatoGeneralUsuario datogeneralusuario)throws Exception {
		try {
	

			Long idUsuarioActual=this.getUsuario().getId();

			HistorialCambioClave_logic historialcambioclaveLogic_Desde_Usuario=new HistorialCambioClave_logic();
			historialcambioclaveLogic_Desde_Usuario.setHistorialCambioClaves(historialcambioclaves);

			historialcambioclaveLogic_Desde_Usuario.setConnexion(this.getConnexion());
			historialcambioclaveLogic_Desde_Usuario.setDatosCliente(this.datosCliente);

			for(HistorialCambioClave historialcambioclave_Desde_Usuario:historialcambioclaveLogic_Desde_Usuario.getHistorialCambioClaves()) {
				historialcambioclave_Desde_Usuario.setid_usuario(idUsuarioActual);
			}

			historialcambioclaveLogic_Desde_Usuario.saves();

			ResumenUsuario_logic resumenusuarioLogic_Desde_Usuario=new ResumenUsuario_logic();
			resumenusuarioLogic_Desde_Usuario.setResumenUsuarios(resumenusuarios);

			resumenusuarioLogic_Desde_Usuario.setConnexion(this.getConnexion());
			resumenusuarioLogic_Desde_Usuario.setDatosCliente(this.datosCliente);

			for(ResumenUsuario resumenusuario_Desde_Usuario:resumenusuarioLogic_Desde_Usuario.getResumenUsuarios()) {
				resumenusuario_Desde_Usuario.setid_usuario(idUsuarioActual);
			}

			resumenusuarioLogic_Desde_Usuario.saves();

			Auditoria_logic auditoriaLogic_Desde_Usuario=new Auditoria_logic();
			auditoriaLogic_Desde_Usuario.setAuditorias(auditorias);

			auditoriaLogic_Desde_Usuario.setConnexion(this.getConnexion());
			auditoriaLogic_Desde_Usuario.setDatosCliente(this.datosCliente);

			for(Auditoria auditoria_Desde_Usuario:auditoriaLogic_Desde_Usuario.getAuditorias()) {
				auditoria_Desde_Usuario.setid_usuario(idUsuarioActual);

				auditoriaLogic_Desde_Usuario.setAuditoria(auditoria_Desde_Usuario);
				auditoriaLogic_Desde_Usuario.save();

				Long idAuditoriaActual=auditoria_Desde_Usuario.getId();

				AuditoriaDetalle_logic auditoriadetalleLogic_Desde_Auditoria=new AuditoriaDetalle_logic();

				if(auditoria_Desde_Usuario.getAuditoriaDetalles()==null){
					auditoria_Desde_Usuario.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
				}

				auditoriadetalleLogic_Desde_Auditoria.setAuditoriaDetalles(auditoria_Desde_Usuario.getAuditoriaDetalles());

				auditoriadetalleLogic_Desde_Auditoria.setConnexion(this.getConnexion());
				auditoriadetalleLogic_Desde_Auditoria.setDatosCliente(this.datosCliente);

				for(AuditoriaDetalle auditoriadetalle_Desde_Auditoria:auditoriadetalleLogic_Desde_Auditoria.getAuditoriaDetalles()) {
					auditoriadetalle_Desde_Auditoria.setid_auditoria(idAuditoriaActual);
				}

				auditoriadetalleLogic_Desde_Auditoria.saves();
			}


			ParametroGeneralUsuario_logic parametrogeneralusuarioLogic_Desde_Usuario=new ParametroGeneralUsuario_logic();
			parametrogeneralusuarioLogic_Desde_Usuario.setParametroGeneralUsuario(parametrogeneralusuario);

			if(parametrogeneralusuarioLogic_Desde_Usuario.getParametroGeneralUsuario()!=null) {
			parametrogeneralusuarioLogic_Desde_Usuario.getParametroGeneralUsuario().setId(idUsuarioActual);
			}

			parametrogeneralusuarioLogic_Desde_Usuario.setConnexion(this.getConnexion());
			parametrogeneralusuarioLogic_Desde_Usuario.setDatosCliente(this.datosCliente);
			parametrogeneralusuarioLogic_Desde_Usuario.save();

			PerfilUsuario_logic perfilusuarioLogic_Desde_Usuario=new PerfilUsuario_logic();
			perfilusuarioLogic_Desde_Usuario.setPerfilUsuarios(perfilusuarios);

			perfilusuarioLogic_Desde_Usuario.setConnexion(this.getConnexion());
			perfilusuarioLogic_Desde_Usuario.setDatosCliente(this.datosCliente);

			for(PerfilUsuario perfilusuario_Desde_Usuario:perfilusuarioLogic_Desde_Usuario.getPerfilUsuarios()) {
				perfilusuario_Desde_Usuario.setid_usuario(idUsuarioActual);
			}

			perfilusuarioLogic_Desde_Usuario.saves();

			DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Usuario=new DatoGeneralUsuario_logic();
			datogeneralusuarioLogic_Desde_Usuario.setDatoGeneralUsuario(datogeneralusuario);

			if(datogeneralusuarioLogic_Desde_Usuario.getDatoGeneralUsuario()!=null) {
			datogeneralusuarioLogic_Desde_Usuario.getDatoGeneralUsuario().setId(idUsuarioActual);
			}

			datogeneralusuarioLogic_Desde_Usuario.setConnexion(this.getConnexion());
			datogeneralusuarioLogic_Desde_Usuario.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic_Desde_Usuario.save();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Usuario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Usuario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setUsuario(Usuario newUsuario) {
		this.usuario = newUsuario;
	}
	
	public Usuario_data getUsuarioDataAccess() {
		return usuarioDataAccess;
	}
	
	public void setUsuarioDataAccess(Usuario_data newusuarioDataAccess) {
		this.usuarioDataAccess = newusuarioDataAccess;
	}

	public void setUsuarios(List<Usuario> newUsuarios) {
		this.usuarios = newUsuarios;
	}
	
	public Object getUsuarioObject() {	
		this.usuarioObject=this.usuarioDataAccess.getEntityObject();
		return this.usuarioObject;
	}
		
	public void setUsuarioObject(Object newUsuarioObject) {
		this.usuarioObject = newUsuarioObject;
	}
	
	public List<Object> getUsuariosObject() {		
		this.usuariosObject=this.usuarioDataAccess.getEntitiesObject();
		return this.usuariosObject;
	}
		
	public void setUsuariosObject(List<Object> newUsuariosObject) {
		this.usuariosObject = newUsuariosObject;
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
