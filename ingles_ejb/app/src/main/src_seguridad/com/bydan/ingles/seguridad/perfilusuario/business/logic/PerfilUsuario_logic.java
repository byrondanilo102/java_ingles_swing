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
package com.bydan.ingles.seguridad.perfilusuario.business.logic;


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
import com.bydan.ingles.seguridad.perfilusuario.util.*;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_util;
import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuario_param_return;
//import com.bydan.ingles.seguridad.perfilusuario.util.PerfilUsuarioParameterGeneral;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.PerfilUsuario;
//import com.bydan.ingles.seguridad.perfilusuario.business.logic.PerfilUsuario_logic_add;
import com.bydan.ingles.seguridad.perfilusuario.business.data.*;
import com.bydan.ingles.seguridad.perfilusuario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;

import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class PerfilUsuario_logic  extends GeneralEntityLogic implements PerfilUsuario_logicI {
	static Logger logger = Logger.getLogger("PerfilUsuario_logic.class");	

	protected PerfilUsuario_data perfilusuarioDataAccess; 	
	protected PerfilUsuario perfilusuario;
	protected List<PerfilUsuario> perfilusuarios;
	protected Object perfilusuarioObject;	
	protected List<Object> perfilusuariosObject;
	
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
	
	
	
	
	
	
	public PerfilUsuario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.perfilusuarioDataAccess = new PerfilUsuario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			PerfilUsuario_data.ActualizarQueries();
			
			//this.perfilusuarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.perfilusuarios= new ArrayList<PerfilUsuario>();
			this.perfilusuario= new PerfilUsuario();
			
			this.perfilusuarioObject=new Object();
			this.perfilusuariosObject=new ArrayList<Object>();
				
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
			
			this.perfilusuarioDataAccess.setConnexionType(this.connexionType);
			this.perfilusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public PerfilUsuario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.perfilusuarioDataAccess = new PerfilUsuario_data();
			this.perfilusuarios= new ArrayList<PerfilUsuario>();
			this.perfilusuario= new PerfilUsuario();
			this.perfilusuarioObject=new Object();
			this.perfilusuariosObject=new ArrayList<Object>();
			
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
			
			this.perfilusuarioDataAccess.setConnexionType(this.connexionType);
			this.perfilusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public PerfilUsuario getPerfilUsuario() throws Exception {	
		//PerfilUsuario_logic_add.checkPerfilUsuarioToGet(perfilusuario,this.datosCliente,this.arrDatoGeneral);
		//PerfilUsuario_logic_add.updatePerfilUsuarioToGet(perfilusuario,this.arrDatoGeneral);
		
		return perfilusuario;
	}
	
	public List<PerfilUsuario> getPerfilUsuarios() throws Exception {		
		if(this.perfilusuarios==null) {
			this.perfilusuarios= new ArrayList<PerfilUsuario>();
		}
		
		this.quitarsNulos();
		
		//PerfilUsuario_logic_add.checkPerfilUsuarioToGets(perfilusuarios,this.datosCliente,this.arrDatoGeneral);
		
		for (PerfilUsuario perfilusuarioLocal: perfilusuarios ) {
			//PerfilUsuario_logic_add.updatePerfilUsuarioToGet(perfilusuarioLocal,this.arrDatoGeneral);
		}
		
		return perfilusuarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.perfilusuarioDataAccess!=null) {
			this.perfilusuarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			perfilusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			perfilusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		perfilusuario = new  PerfilUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
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
		perfilusuario = new  PerfilUsuario();
		  		  
        try {
			
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		perfilusuario = new  PerfilUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
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
		perfilusuario = new  PerfilUsuario();
		  		  
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
		perfilusuario = new  PerfilUsuario();
		  		  
        try {
			
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		perfilusuario = new  PerfilUsuario();
		  		  
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
		perfilusuario = new  PerfilUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =perfilusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilusuario = new  PerfilUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=perfilusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilusuario = new  PerfilUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =perfilusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilusuario = new  PerfilUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=perfilusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilusuario = new  PerfilUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =perfilusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilusuario = new  PerfilUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=perfilusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		perfilusuario = new  PerfilUsuario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
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
		perfilusuario = new  PerfilUsuario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuario=perfilusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		  		  
        try {
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
		perfilusuarios = new  ArrayList<PerfilUsuario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(PerfilUsuario perfilusuario) throws Exception {
		Boolean estaValidado=false;
		
		if(perfilusuario.getIsNew() || perfilusuario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<PerfilUsuario> PerfilUsuarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(PerfilUsuario perfilusuarioLocal:perfilusuarios) {				
			estaValidadoObjeto=this.validarGuardar(perfilusuarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<PerfilUsuario> PerfilUsuarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilusuarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(PerfilUsuario PerfilUsuario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilusuario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(PerfilUsuario perfilusuario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+perfilusuario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"perfilusuario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(PerfilUsuario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(PerfilUsuario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSave(this.perfilusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilUsuario_logic_add.updatePerfilUsuarioToSave(this.perfilusuario,this.arrDatoGeneral);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilUsuario_util.permiteMantenimiento(this.perfilusuario) && this.validarGuardar(this.perfilusuario)) {
				PerfilUsuario_data.save(this.perfilusuario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);				
			}

			//PerfilUsuario_logic_add.checkPerfilUsuarioToSaveAfter(this.perfilusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.perfilusuario.getIsDeleted()) {
				this.perfilusuario=null;
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
			
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSave(this.perfilusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilUsuario_logic_add.updatePerfilUsuarioToSave(this.perfilusuario,this.arrDatoGeneral);
			
			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilUsuario_util.permiteMantenimiento(this.perfilusuario) && this.validarGuardar(this.perfilusuario)) {			
				PerfilUsuario_data.save(this.perfilusuario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);				
			}
			
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSaveAfter(this.perfilusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.perfilusuario.getIsDeleted()) {
				this.perfilusuario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSaves(perfilusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPerfilUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilUsuario perfilusuarioLocal:perfilusuarios) {		
				
				if(!PerfilUsuario_util.permiteMantenimiento(perfilusuarioLocal)) {
					continue;
				}
				
				//PerfilUsuario_logic_add.updatePerfilUsuarioToSave(perfilusuarioLocal,this.arrDatoGeneral);
	        	
				PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilusuarioLocal)) {
					PerfilUsuario_data.save(perfilusuarioLocal, connexion);				
				} else {
					validadoTodosPerfilUsuario=false;
				}
			}
			
			if(!validadoTodosPerfilUsuario) {
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
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}
			
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSavesAfter(perfilusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//PerfilUsuario_logic_add.checkPerfilUsuarioToSaves(perfilusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPerfilUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilUsuario perfilusuarioLocal:perfilusuarios) {				
				if(!PerfilUsuario_util.permiteMantenimiento(perfilusuarioLocal)) {
					continue;
				}
				
				//PerfilUsuario_logic_add.updatePerfilUsuarioToSave(perfilusuarioLocal,this.arrDatoGeneral);
	        	
				PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilusuarioLocal)) {				
					PerfilUsuario_data.save(perfilusuarioLocal, connexion);				
				} else {
					validadoTodosPerfilUsuario=false;
				}
			}
			
			if(!validadoTodosPerfilUsuario) {
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
				
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}

			//PerfilUsuario_logic_add.checkPerfilUsuarioToSavesAfter(perfilusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilUsuario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilUsuario> perfilusuarios,PerfilUsuario_param_return perfilusuarioParameterGeneral)throws Exception {
		 try {	
			PerfilUsuario_param_return perfilusuarioReturnGeneral=new PerfilUsuario_param_return();
	
			
			return perfilusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilUsuario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilUsuario> perfilusuarios,PerfilUsuario_param_return perfilusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilUsuario_param_return perfilusuarioReturnGeneral=new PerfilUsuario_param_return();
	
			
			this.connexion.commit();
			
			return perfilusuarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilUsuario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,PerfilUsuario_param_return perfilusuarioParameterGeneral,Boolean isEsNuevoPerfilUsuario,ArrayList<Classe> clases)throws Exception {
		 try {	
			PerfilUsuario_param_return perfilusuarioReturnGeneral=new PerfilUsuario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return perfilusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public PerfilUsuario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilUsuario> perfilusuarios,PerfilUsuario perfilusuario,PerfilUsuario_param_return perfilusuarioParameterGeneral,Boolean isEsNuevoPerfilUsuario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			PerfilUsuario_param_return perfilusuarioReturnGeneral=new PerfilUsuario_param_return();
	
			perfilusuarioReturnGeneral.setPerfilUsuario(perfilusuario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return perfilusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilUsuario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,PerfilUsuario_param_return perfilusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilUsuario_param_return perfilusuarioReturnGeneral=new PerfilUsuario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.perfilusuarios=new ArrayList<PerfilUsuario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.perfilusuario=new PerfilUsuario();
				
				
				if(conColumnasBase) {this.perfilusuario.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.perfilusuario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.perfilusuario.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.perfilusuarios.add(this.perfilusuario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			perfilusuarioReturnGeneral.setConRetornoEstaProcesado(true);
			perfilusuarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return perfilusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<PerfilUsuario> perfilusuariosAux= new ArrayList<PerfilUsuario>();
		
		for(PerfilUsuario perfilusuario:perfilusuarios) {
			if(!perfilusuario.getIsDeleted()) {
				perfilusuariosAux.add(perfilusuario);
			}
		}
		
		perfilusuarios=perfilusuariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<PerfilUsuario> perfilusuariosAux= new ArrayList<PerfilUsuario>();
		
		for(PerfilUsuario perfilusuario : this.perfilusuarios) {
			if(perfilusuario==null) {
				perfilusuariosAux.add(perfilusuario);
			}
		}
		
		//this.perfilusuarios=perfilusuariosAux;
		
		this.perfilusuarios.removeAll(perfilusuariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(perfilusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((perfilusuario.getIsDeleted() || (perfilusuario.getIsChanged()&&!perfilusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=perfilusuarioDataAccess.getSetVersionRow(connexion,perfilusuario.getId());
				
				if(!perfilusuario.getVersionRow().equals(timestamp)) {	
					perfilusuario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				perfilusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(perfilusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((perfilusuario.getIsDeleted() || (perfilusuario.getIsChanged()&&!perfilusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=perfilusuarioDataAccess.getSetVersionRow(connexion,perfilusuario.getId());
			
			try {							
				if(!perfilusuario.getVersionRow().equals(timestamp)) {	
					perfilusuario.setVersionRow(timestamp);
				}
				
				perfilusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(perfilusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(perfilusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilusuarioAux.getIsDeleted() || (perfilusuarioAux.getIsChanged()&&!perfilusuarioAux.getIsNew())) {
						
						timestamp=perfilusuarioDataAccess.getSetVersionRow(connexion,perfilusuarioAux.getId());
						
						if(!perfilusuario.getVersionRow().equals(timestamp)) {	
							perfilusuarioAux.setVersionRow(timestamp);
						}
								
						perfilusuarioAux.setIsChangedAuxiliar(false);														
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
		if(perfilusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
					if(perfilusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilusuarioAux.getIsDeleted() || (perfilusuarioAux.getIsChanged()&&!perfilusuarioAux.getIsNew())) {
						
						timestamp=perfilusuarioDataAccess.getSetVersionRow(connexion,perfilusuarioAux.getId());
						
						if(!perfilusuarioAux.getVersionRow().equals(timestamp)) {	
							perfilusuarioAux.setVersionRow(timestamp);
						}
						
													
						perfilusuarioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public PerfilUsuario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalPerfil,String finalQueryGlobalUsuario) throws Exception {
		PerfilUsuario_param_return  perfilusuario_return =new PerfilUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-cargarCombosLoteForeignKeyPerfilUsuarioWithConnection");
			
			this.connexion.begin();
			
			perfilusuario_return =new PerfilUsuario_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilusuario_return.setperfilsFK(perfilsForeignKey);


			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			perfilusuario_return.setusuariosFK(usuariosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return perfilusuario_return;
	}
	
	public PerfilUsuario_param_return cargarCombosLoteFK(String finalQueryGlobalPerfil,String finalQueryGlobalUsuario) throws Exception {
		PerfilUsuario_param_return  perfilusuario_return =new PerfilUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			perfilusuario_return =new PerfilUsuario_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilusuario_return.setperfilsFK(perfilsForeignKey);


			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			perfilusuario_return.setusuariosFK(usuariosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return perfilusuario_return;
	}
	
	
	public void deepLoad(PerfilUsuario perfilusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//PerfilUsuario_logic_add.updatePerfilUsuarioToGet(perfilusuario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
		perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
				continue;
			}

			if(clas.clas.equals(Usuario.class)) {
				perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
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
			perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilusuario.getPerfil(),isDeep,deepLoadType,clases);
				
		perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(perfilusuario.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfilusuario.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Usuario.class)) {
				perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(perfilusuario.getUsuario(),isDeep,deepLoadType,clases);				
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
			perfilusuario.setPerfil(perfilusuarioDataAccess.getPerfil(connexion,perfilusuario));
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfilusuario.getPerfil(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilusuario.setUsuario(perfilusuarioDataAccess.getUsuario(connexion,perfilusuario));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(perfilusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(PerfilUsuario perfilusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//PerfilUsuario_logic_add.updatePerfilUsuarioToSave(perfilusuario,this.arrDatoGeneral);
			
PerfilUsuario_data.save(perfilusuario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilusuario.getPerfil(),connexion);

		Usuario_data.save(perfilusuario.getUsuario(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilusuario.getPerfil(),connexion);
				continue;
			}

			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(perfilusuario.getUsuario(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilusuario.getPerfil(),connexion);
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilusuario.getPerfil(),isDeep,deepLoadType,clases);
				

		Usuario_data.save(perfilusuario.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(perfilusuario.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilusuario.getPerfil(),connexion);
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepSave(perfilusuario.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(perfilusuario.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(perfilusuario.getUsuario(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(PerfilUsuario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(perfilusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilUsuario_util.refrescarFKsDescripciones(perfilusuario);
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
			this.deepLoad(this.perfilusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PerfilUsuario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(perfilusuarios!=null) {
				for(PerfilUsuario perfilusuario:perfilusuarios) {
					this.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					PerfilUsuario_util.refrescarFKsDescripciones(perfilusuarios);
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
			if(perfilusuarios!=null) {
				for(PerfilUsuario perfilusuario:perfilusuarios) {
					this.deepLoad(perfilusuario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					PerfilUsuario_util.refrescarFKsDescripciones(perfilusuarios);
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
			this.getNewConnexionToDeep(PerfilUsuario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(perfilusuario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(PerfilUsuario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(perfilusuarios!=null) {
				for(PerfilUsuario perfilusuario:perfilusuarios) {
					this.deepSave(perfilusuario,isDeep,deepLoadType,clases);
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
			if(perfilusuarios!=null) {
				for(PerfilUsuario perfilusuario:perfilusuarios) {
					this.deepSave(perfilusuario,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdPerfilWithConnection(String sFinalQuery,Pagination pagination,Long id_perfil)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilUsuario_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilUsuario_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdUsuarioWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,PerfilUsuario_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdUsuario(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,PerfilUsuario_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			PerfilUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilusuarios=perfilusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilUsuario_util.refrescarFKsDescripciones(this.perfilusuarios);
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
			if(PerfilUsuario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilUsuarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,PerfilUsuario perfilusuario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PerfilUsuario_util.IS_CON_AUDITORIA) {
				if(perfilusuario.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilUsuarioDataAccess.TABLENAME, perfilusuario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilUsuario_logic.registrarAuditoriaDetalles(connexion,perfilusuario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(perfilusuario.getIsDeleted()) {
					/*if(!perfilusuario.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PerfilUsuarioDataAccess.TABLENAME, perfilusuario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//PerfilUsuario_logic.registrarAuditoriaDetalles(connexion,perfilusuario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilUsuarioDataAccess.TABLENAME, perfilusuario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(perfilusuario.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilUsuarioDataAccess.TABLENAME, perfilusuario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilUsuario_logic.registrarAuditoriaDetalles(connexion,perfilusuario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,PerfilUsuario perfilusuario)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(perfilusuario.getIsNew()||!perfilusuario.getid_perfil().equals(perfilusuario.getPerfilUsuarioOriginal().getid_perfil()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilusuario.getPerfilUsuarioOriginal().getid_perfil()!=null)
				{
					strValorActual=perfilusuario.getPerfilUsuarioOriginal().getid_perfil().toString();
				}
				if(perfilusuario.getid_perfil()!=null)
				{
					strValorNuevo=perfilusuario.getid_perfil().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilUsuarioConstantesFunciones.IDPERFIL,strValorActual,strValorNuevo);
			}	
			
			if(perfilusuario.getIsNew()||!perfilusuario.getid_usuario().equals(perfilusuario.getPerfilUsuarioOriginal().getid_usuario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilusuario.getPerfilUsuarioOriginal().getid_usuario()!=null)
				{
					strValorActual=perfilusuario.getPerfilUsuarioOriginal().getid_usuario().toString();
				}
				if(perfilusuario.getid_usuario()!=null)
				{
					strValorNuevo=perfilusuario.getid_usuario().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilUsuarioConstantesFunciones.IDUSUARIO,strValorActual,strValorNuevo);
			}	
			
			if(perfilusuario.getIsNew()||!perfilusuario.getestado().equals(perfilusuario.getPerfilUsuarioOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilusuario.getPerfilUsuarioOriginal().getestado()!=null)
				{
					strValorActual=perfilusuario.getPerfilUsuarioOriginal().getestado().toString();
				}
				if(perfilusuario.getestado()!=null)
				{
					strValorNuevo=perfilusuario.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilUsuarioConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(PerfilUsuario perfilusuario) throws Exception {

		if(!perfilusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilusuario,true);
		}
	}

	public void saveRelaciones(PerfilUsuario perfilusuario)throws Exception {

		if(!perfilusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilusuario,false);
		}
	}

	public void saveRelacionesBase(PerfilUsuario perfilusuario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("PerfilUsuario-saveRelacionesWithConnection");}
	

			this.setPerfilUsuario(perfilusuario);

			if(true) {

				//PerfilUsuario_logic_add.updateRelacionesToSave(perfilusuario,this);

				if((perfilusuario.getIsNew()||perfilusuario.getIsChanged())&&!perfilusuario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(perfilusuario.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//PerfilUsuario_logic_add.updateRelacionesToSaveAfter(perfilusuario,this);

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
			ArrayList<Classe> classes=PerfilUsuario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PerfilUsuario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPerfilUsuario(PerfilUsuario newPerfilUsuario) {
		this.perfilusuario = newPerfilUsuario;
	}
	
	public PerfilUsuario_data getPerfilUsuarioDataAccess() {
		return perfilusuarioDataAccess;
	}
	
	public void setPerfilUsuarioDataAccess(PerfilUsuario_data newperfilusuarioDataAccess) {
		this.perfilusuarioDataAccess = newperfilusuarioDataAccess;
	}

	public void setPerfilUsuarios(List<PerfilUsuario> newPerfilUsuarios) {
		this.perfilusuarios = newPerfilUsuarios;
	}
	
	public Object getPerfilUsuarioObject() {	
		this.perfilusuarioObject=this.perfilusuarioDataAccess.getEntityObject();
		return this.perfilusuarioObject;
	}
		
	public void setPerfilUsuarioObject(Object newPerfilUsuarioObject) {
		this.perfilusuarioObject = newPerfilUsuarioObject;
	}
	
	public List<Object> getPerfilUsuariosObject() {		
		this.perfilusuariosObject=this.perfilusuarioDataAccess.getEntitiesObject();
		return this.perfilusuariosObject;
	}
		
	public void setPerfilUsuariosObject(List<Object> newPerfilUsuariosObject) {
		this.perfilusuariosObject = newPerfilUsuariosObject;
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
