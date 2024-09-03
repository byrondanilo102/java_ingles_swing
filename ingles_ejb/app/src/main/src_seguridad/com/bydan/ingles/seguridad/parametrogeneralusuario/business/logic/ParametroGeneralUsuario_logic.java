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
package com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic;


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
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_util;
import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralusuario.util.ParametroGeneralUsuarioParameterGeneral;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;
//import com.bydan.ingles.seguridad.parametrogeneralusuario.business.logic.ParametroGeneralUsuario_logic_add;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.data.*;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;

import com.bydan.ingles.seguridad.tipofondo.business.entity.TipoFondo;
import com.bydan.ingles.seguridad.tipofondo.business.data.TipoFondo_data;
import com.bydan.ingles.seguridad.tipofondo.business.logic.TipoFondo_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class ParametroGeneralUsuario_logic  extends GeneralEntityLogic implements ParametroGeneralUsuario_logicI {
	static Logger logger = Logger.getLogger("ParametroGeneralUsuario_logic.class");	

	protected ParametroGeneralUsuario_data parametrogeneralusuarioDataAccess; 	
	protected ParametroGeneralUsuario parametrogeneralusuario;
	protected List<ParametroGeneralUsuario> parametrogeneralusuarios;
	protected Object parametrogeneralusuarioObject;	
	protected List<Object> parametrogeneralusuariosObject;
	
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
	
	
	
	
	
	
	public ParametroGeneralUsuario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.parametrogeneralusuarioDataAccess = new ParametroGeneralUsuario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			ParametroGeneralUsuario_data.ActualizarQueries();
			
			//this.parametrogeneralusuarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
			this.parametrogeneralusuario= new ParametroGeneralUsuario();
			
			this.parametrogeneralusuarioObject=new Object();
			this.parametrogeneralusuariosObject=new ArrayList<Object>();
				
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
			
			this.parametrogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			this.parametrogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public ParametroGeneralUsuario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.parametrogeneralusuarioDataAccess = new ParametroGeneralUsuario_data();
			this.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
			this.parametrogeneralusuario= new ParametroGeneralUsuario();
			this.parametrogeneralusuarioObject=new Object();
			this.parametrogeneralusuariosObject=new ArrayList<Object>();
			
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
			
			this.parametrogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			this.parametrogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public ParametroGeneralUsuario getParametroGeneralUsuario() throws Exception {	
		//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToGet(parametrogeneralusuario,this.datosCliente,this.arrDatoGeneral);
		//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToGet(parametrogeneralusuario,this.arrDatoGeneral);
		
		return parametrogeneralusuario;
	}
	
	public List<ParametroGeneralUsuario> getParametroGeneralUsuarios() throws Exception {		
		if(this.parametrogeneralusuarios==null) {
			this.parametrogeneralusuarios= new ArrayList<ParametroGeneralUsuario>();
		}
		
		this.quitarsNulos();
		
		//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToGets(parametrogeneralusuarios,this.datosCliente,this.arrDatoGeneral);
		
		for (ParametroGeneralUsuario parametrogeneralusuarioLocal: parametrogeneralusuarios ) {
			//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToGet(parametrogeneralusuarioLocal,this.arrDatoGeneral);
		}
		
		return parametrogeneralusuarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.parametrogeneralusuarioDataAccess!=null) {
			this.parametrogeneralusuarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			parametrogeneralusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
        try {
			
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
        try {
			
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  		  
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =parametrogeneralusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=parametrogeneralusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =parametrogeneralusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=parametrogeneralusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =parametrogeneralusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=parametrogeneralusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
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
		parametrogeneralusuario = new  ParametroGeneralUsuario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuario=parametrogeneralusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		  		  
        try {
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
		parametrogeneralusuarios = new  ArrayList<ParametroGeneralUsuario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(parametrogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		Boolean estaValidado=false;
		
		if(parametrogeneralusuario.getIsNew() || parametrogeneralusuario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<ParametroGeneralUsuario> ParametroGeneralUsuarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuarios) {				
			estaValidadoObjeto=this.validarGuardar(parametrogeneralusuarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<ParametroGeneralUsuario> ParametroGeneralUsuarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(parametrogeneralusuarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(ParametroGeneralUsuario ParametroGeneralUsuario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(parametrogeneralusuario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+parametrogeneralusuario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"parametrogeneralusuario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(ParametroGeneralUsuario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSave(this.parametrogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToSave(this.parametrogeneralusuario,this.arrDatoGeneral);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.parametrogeneralusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ParametroGeneralUsuario_util.permiteMantenimiento(this.parametrogeneralusuario) && this.validarGuardar(this.parametrogeneralusuario)) {
				ParametroGeneralUsuario_data.save(this.parametrogeneralusuario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);				
			}

			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSaveAfter(this.parametrogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.parametrogeneralusuario.getIsDeleted()) {
				this.parametrogeneralusuario=null;
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
			
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSave(this.parametrogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToSave(this.parametrogeneralusuario,this.arrDatoGeneral);
			
			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.parametrogeneralusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ParametroGeneralUsuario_util.permiteMantenimiento(this.parametrogeneralusuario) && this.validarGuardar(this.parametrogeneralusuario)) {			
				ParametroGeneralUsuario_data.save(this.parametrogeneralusuario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.parametrogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);				
			}
			
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSaveAfter(this.parametrogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.parametrogeneralusuario.getIsDeleted()) {
				this.parametrogeneralusuario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSaves(parametrogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosParametroGeneralUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuarios) {		
				
				if(!ParametroGeneralUsuario_util.permiteMantenimiento(parametrogeneralusuarioLocal)) {
					continue;
				}
				
				//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToSave(parametrogeneralusuarioLocal,this.arrDatoGeneral);
	        	
				ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),parametrogeneralusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(parametrogeneralusuarioLocal)) {
					ParametroGeneralUsuario_data.save(parametrogeneralusuarioLocal, connexion);				
				} else {
					validadoTodosParametroGeneralUsuario=false;
				}
			}
			
			if(!validadoTodosParametroGeneralUsuario) {
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
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}
			
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSavesAfter(parametrogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSaves(parametrogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosParametroGeneralUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ParametroGeneralUsuario parametrogeneralusuarioLocal:parametrogeneralusuarios) {				
				if(!ParametroGeneralUsuario_util.permiteMantenimiento(parametrogeneralusuarioLocal)) {
					continue;
				}
				
				//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToSave(parametrogeneralusuarioLocal,this.arrDatoGeneral);
	        	
				ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),parametrogeneralusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(parametrogeneralusuarioLocal)) {				
					ParametroGeneralUsuario_data.save(parametrogeneralusuarioLocal, connexion);				
				} else {
					validadoTodosParametroGeneralUsuario=false;
				}
			}
			
			if(!validadoTodosParametroGeneralUsuario) {
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
				
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}

			//ParametroGeneralUsuario_logic_add.checkParametroGeneralUsuarioToSavesAfter(parametrogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ParametroGeneralUsuario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario_param_return parametrogeneralusuarioParameterGeneral)throws Exception {
		 try {	
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturnGeneral=new ParametroGeneralUsuario_param_return();
	
			
			return parametrogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ParametroGeneralUsuario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario_param_return parametrogeneralusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturnGeneral=new ParametroGeneralUsuario_param_return();
	
			
			this.connexion.commit();
			
			return parametrogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ParametroGeneralUsuario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,ParametroGeneralUsuario_param_return parametrogeneralusuarioParameterGeneral,Boolean isEsNuevoParametroGeneralUsuario,ArrayList<Classe> clases)throws Exception {
		 try {	
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturnGeneral=new ParametroGeneralUsuario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				parametrogeneralusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return parametrogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public ParametroGeneralUsuario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ParametroGeneralUsuario> parametrogeneralusuarios,ParametroGeneralUsuario parametrogeneralusuario,ParametroGeneralUsuario_param_return parametrogeneralusuarioParameterGeneral,Boolean isEsNuevoParametroGeneralUsuario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturnGeneral=new ParametroGeneralUsuario_param_return();
	
			parametrogeneralusuarioReturnGeneral.setParametroGeneralUsuario(parametrogeneralusuario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				parametrogeneralusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return parametrogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ParametroGeneralUsuario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,ParametroGeneralUsuario_param_return parametrogeneralusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralUsuario_param_return parametrogeneralusuarioReturnGeneral=new ParametroGeneralUsuario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.parametrogeneralusuarios=new ArrayList<ParametroGeneralUsuario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.parametrogeneralusuario=new ParametroGeneralUsuario();
				
				

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.parametrogeneralusuario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.parametrogeneralusuario.setpath_exportar(arrColumnas[iColumn++]);
				this.parametrogeneralusuario.setcon_exportar_cabecera(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_exportar_campo_version(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_botones_tool_bar(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_cargar_por_parte(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_guardar_relaciones(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_mostrar_acciones_campo_general(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.parametrogeneralusuario.setcon_mensaje_confirmacion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.parametrogeneralusuarios.add(this.parametrogeneralusuario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			parametrogeneralusuarioReturnGeneral.setConRetornoEstaProcesado(true);
			parametrogeneralusuarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return parametrogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<ParametroGeneralUsuario> parametrogeneralusuariosAux= new ArrayList<ParametroGeneralUsuario>();
		
		for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
			if(!parametrogeneralusuario.getIsDeleted()) {
				parametrogeneralusuariosAux.add(parametrogeneralusuario);
			}
		}
		
		parametrogeneralusuarios=parametrogeneralusuariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<ParametroGeneralUsuario> parametrogeneralusuariosAux= new ArrayList<ParametroGeneralUsuario>();
		
		for(ParametroGeneralUsuario parametrogeneralusuario : this.parametrogeneralusuarios) {
			if(parametrogeneralusuario==null) {
				parametrogeneralusuariosAux.add(parametrogeneralusuario);
			}
		}
		
		//this.parametrogeneralusuarios=parametrogeneralusuariosAux;
		
		this.parametrogeneralusuarios.removeAll(parametrogeneralusuariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(parametrogeneralusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((parametrogeneralusuario.getIsDeleted() || (parametrogeneralusuario.getIsChanged()&&!parametrogeneralusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=parametrogeneralusuarioDataAccess.getSetVersionRow(connexion,parametrogeneralusuario.getId());
				
				if(!parametrogeneralusuario.getVersionRow().equals(timestamp)) {	
					parametrogeneralusuario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				parametrogeneralusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(parametrogeneralusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((parametrogeneralusuario.getIsDeleted() || (parametrogeneralusuario.getIsChanged()&&!parametrogeneralusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=parametrogeneralusuarioDataAccess.getSetVersionRow(connexion,parametrogeneralusuario.getId());
			
			try {							
				if(!parametrogeneralusuario.getVersionRow().equals(timestamp)) {	
					parametrogeneralusuario.setVersionRow(timestamp);
				}
				
				parametrogeneralusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(parametrogeneralusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(parametrogeneralusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(parametrogeneralusuarioAux.getIsDeleted() || (parametrogeneralusuarioAux.getIsChanged()&&!parametrogeneralusuarioAux.getIsNew())) {
						
						timestamp=parametrogeneralusuarioDataAccess.getSetVersionRow(connexion,parametrogeneralusuarioAux.getId());
						
						if(!parametrogeneralusuario.getVersionRow().equals(timestamp)) {	
							parametrogeneralusuarioAux.setVersionRow(timestamp);
						}
								
						parametrogeneralusuarioAux.setIsChangedAuxiliar(false);														
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
		if(parametrogeneralusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(ParametroGeneralUsuario parametrogeneralusuarioAux:parametrogeneralusuarios) {
					if(parametrogeneralusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(parametrogeneralusuarioAux.getIsDeleted() || (parametrogeneralusuarioAux.getIsChanged()&&!parametrogeneralusuarioAux.getIsNew())) {
						
						timestamp=parametrogeneralusuarioDataAccess.getSetVersionRow(connexion,parametrogeneralusuarioAux.getId());
						
						if(!parametrogeneralusuarioAux.getVersionRow().equals(timestamp)) {	
							parametrogeneralusuarioAux.setVersionRow(timestamp);
						}
						
													
						parametrogeneralusuarioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public ParametroGeneralUsuario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalUsuario,String finalQueryGlobalTipoFondo) throws Exception {
		ParametroGeneralUsuario_param_return  parametrogeneralusuario_return =new ParametroGeneralUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-cargarCombosLoteForeignKeyParametroGeneralUsuarioWithConnection");
			
			this.connexion.begin();
			
			parametrogeneralusuario_return =new ParametroGeneralUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			parametrogeneralusuario_return.setusuariosFK(usuariosForeignKey);


			List<TipoFondo> tipofondosForeignKey=new ArrayList<TipoFondo>();
			TipoFondo_logic tipofondoLogic=new TipoFondo_logic();
			tipofondoLogic.setConnexion(this.connexion);
			tipofondoLogic.getTipoFondoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoFondo.equals("NONE")) {
				tipofondoLogic.getTodos(finalQueryGlobalTipoFondo,new Pagination());
				tipofondosForeignKey=tipofondoLogic.getTipoFondos();
			}

			parametrogeneralusuario_return.settipofondosFK(tipofondosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return parametrogeneralusuario_return;
	}
	
	public ParametroGeneralUsuario_param_return cargarCombosLoteFK(String finalQueryGlobalUsuario,String finalQueryGlobalTipoFondo) throws Exception {
		ParametroGeneralUsuario_param_return  parametrogeneralusuario_return =new ParametroGeneralUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			parametrogeneralusuario_return =new ParametroGeneralUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			parametrogeneralusuario_return.setusuariosFK(usuariosForeignKey);


			List<TipoFondo> tipofondosForeignKey=new ArrayList<TipoFondo>();
			TipoFondo_logic tipofondoLogic=new TipoFondo_logic();
			tipofondoLogic.setConnexion(this.connexion);
			tipofondoLogic.getTipoFondoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoFondo.equals("NONE")) {
				tipofondoLogic.getTodos(finalQueryGlobalTipoFondo,new Pagination());
				tipofondosForeignKey=tipofondoLogic.getTipoFondos();
			}

			parametrogeneralusuario_return.settipofondosFK(tipofondosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return parametrogeneralusuario_return;
	}
	
	
	public void deepLoad(ParametroGeneralUsuario parametrogeneralusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToGet(parametrogeneralusuario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
		parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
				continue;
			}

			if(clas.clas.equals(TipoFondo.class)) {
				parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoFondo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(parametrogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
		TipoFondo_logic tipofondoLogic= new TipoFondo_logic(connexion);
		tipofondoLogic.deepLoad(parametrogeneralusuario.getTipoFondo(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(parametrogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoFondo.class)) {
				parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
				TipoFondo_logic tipofondoLogic= new TipoFondo_logic(connexion);
				tipofondoLogic.deepLoad(parametrogeneralusuario.getTipoFondo(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			parametrogeneralusuario.setUsuario(parametrogeneralusuarioDataAccess.getUsuario(connexion,parametrogeneralusuario));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(parametrogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoFondo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			parametrogeneralusuario.setTipoFondo(parametrogeneralusuarioDataAccess.getTipoFondo(connexion,parametrogeneralusuario));
			TipoFondo_logic tipofondoLogic= new TipoFondo_logic(connexion);
			tipofondoLogic.deepLoad(parametrogeneralusuario.getTipoFondo(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(ParametroGeneralUsuario parametrogeneralusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//ParametroGeneralUsuario_logic_add.updateParametroGeneralUsuarioToSave(parametrogeneralusuario,this.arrDatoGeneral);
			
ParametroGeneralUsuario_data.save(parametrogeneralusuario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(parametrogeneralusuario.getUsuario(),connexion);

		TipoFondo_data.save(parametrogeneralusuario.getTipoFondo(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(parametrogeneralusuario.getUsuario(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoFondo.class)) {
				TipoFondo_data.save(parametrogeneralusuario.getTipoFondo(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(parametrogeneralusuario.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(parametrogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				

		TipoFondo_data.save(parametrogeneralusuario.getTipoFondo(),connexion);
		TipoFondo_logic tipofondoLogic= new TipoFondo_logic(connexion);
		tipofondoLogic.deepLoad(parametrogeneralusuario.getTipoFondo(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(parametrogeneralusuario.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(parametrogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoFondo.class)) {
				TipoFondo_data.save(parametrogeneralusuario.getTipoFondo(),connexion);
				TipoFondo_logic tipofondoLogic= new TipoFondo_logic(connexion);
				tipofondoLogic.deepSave(parametrogeneralusuario.getTipoFondo(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(ParametroGeneralUsuario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(parametrogeneralusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(parametrogeneralusuario);
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
			this.deepLoad(this.parametrogeneralusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ParametroGeneralUsuario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(parametrogeneralusuarios!=null) {
				for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
					this.deepLoad(parametrogeneralusuario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					ParametroGeneralUsuario_util.refrescarFKsDescripciones(parametrogeneralusuarios);
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
			if(parametrogeneralusuarios!=null) {
				for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
					this.deepLoad(parametrogeneralusuario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					ParametroGeneralUsuario_util.refrescarFKsDescripciones(parametrogeneralusuarios);
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
			this.getNewConnexionToDeep(ParametroGeneralUsuario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(parametrogeneralusuario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(ParametroGeneralUsuario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(parametrogeneralusuarios!=null) {
				for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
					this.deepSave(parametrogeneralusuario,isDeep,deepLoadType,clases);
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
			if(parametrogeneralusuarios!=null) {
				for(ParametroGeneralUsuario parametrogeneralusuario:parametrogeneralusuarios) {
					this.deepSave(parametrogeneralusuario,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdTipoFondoWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_fondo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoFondo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoFondo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_fondo,ParametroGeneralUsuario_util.IDTIPOFONDO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoFondo);

			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoFondo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoFondo(String sFinalQuery,Pagination pagination,Long id_tipo_fondo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoFondo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoFondo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_fondo,ParametroGeneralUsuario_util.IDTIPOFONDO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoFondo);

			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoFondo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralid= new ParameterSelectionGeneral();
			parameterSelectionGeneralid.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,ParametroGeneralUsuario_util.ID,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralid);

			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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

			ParameterSelectionGeneral parameterSelectionGeneralid= new ParameterSelectionGeneral();
			parameterSelectionGeneralid.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,ParametroGeneralUsuario_util.ID,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralid);

			ParametroGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			parametrogeneralusuarios=parametrogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ParametroGeneralUsuario_util.refrescarFKsDescripciones(this.parametrogeneralusuarios);
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
			if(ParametroGeneralUsuario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralUsuarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,ParametroGeneralUsuario parametrogeneralusuario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ParametroGeneralUsuario_util.IS_CON_AUDITORIA) {
				if(parametrogeneralusuario.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralUsuarioDataAccess.TABLENAME, parametrogeneralusuario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ParametroGeneralUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////ParametroGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,parametrogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(parametrogeneralusuario.getIsDeleted()) {
					/*if(!parametrogeneralusuario.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ParametroGeneralUsuarioDataAccess.TABLENAME, parametrogeneralusuario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////ParametroGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,parametrogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralUsuarioDataAccess.TABLENAME, parametrogeneralusuario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(parametrogeneralusuario.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralUsuarioDataAccess.TABLENAME, parametrogeneralusuario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ParametroGeneralUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////ParametroGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,parametrogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,ParametroGeneralUsuario parametrogeneralusuario)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getid_tipo_fondo().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getid_tipo_fondo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getid_tipo_fondo()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getid_tipo_fondo().toString();
				}
				if(parametrogeneralusuario.getid_tipo_fondo()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getid_tipo_fondo().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.IDTIPOFONDO,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getpath_exportar().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getpath_exportar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getpath_exportar()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getpath_exportar();
				}
				if(parametrogeneralusuario.getpath_exportar()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getpath_exportar() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.PATHEXPORTAR,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_exportar_cabecera().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_cabecera()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_cabecera()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_cabecera().toString();
				}
				if(parametrogeneralusuario.getcon_exportar_cabecera()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_exportar_cabecera().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONEXPORTARCABECERA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_exportar_campo_version().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_campo_version()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_campo_version()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_exportar_campo_version().toString();
				}
				if(parametrogeneralusuario.getcon_exportar_campo_version()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_exportar_campo_version().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONEXPORTARCAMPOVERSION,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_botones_tool_bar().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_botones_tool_bar()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_botones_tool_bar()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_botones_tool_bar().toString();
				}
				if(parametrogeneralusuario.getcon_botones_tool_bar()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_botones_tool_bar().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONBOTONESTOOLBAR,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_cargar_por_parte().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_cargar_por_parte()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_cargar_por_parte()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_cargar_por_parte().toString();
				}
				if(parametrogeneralusuario.getcon_cargar_por_parte()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_cargar_por_parte().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONCARGARPORPARTE,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_guardar_relaciones().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_guardar_relaciones()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_guardar_relaciones()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_guardar_relaciones().toString();
				}
				if(parametrogeneralusuario.getcon_guardar_relaciones()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_guardar_relaciones().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONGUARDARRELACIONES,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_mostrar_acciones_campo_general().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mostrar_acciones_campo_general()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mostrar_acciones_campo_general()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mostrar_acciones_campo_general().toString();
				}
				if(parametrogeneralusuario.getcon_mostrar_acciones_campo_general()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_mostrar_acciones_campo_general().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONMOSTRARACCIONESCAMPOGENERAL,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralusuario.getIsNew()||!parametrogeneralusuario.getcon_mensaje_confirmacion().equals(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mensaje_confirmacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mensaje_confirmacion()!=null)
				{
					strValorActual=parametrogeneralusuario.getParametroGeneralUsuarioOriginal().getcon_mensaje_confirmacion().toString();
				}
				if(parametrogeneralusuario.getcon_mensaje_confirmacion()!=null)
				{
					strValorNuevo=parametrogeneralusuario.getcon_mensaje_confirmacion().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralUsuarioConstantesFunciones.CONMENSAJECONFIRMACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(ParametroGeneralUsuario parametrogeneralusuario) throws Exception {

		if(!parametrogeneralusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(parametrogeneralusuario,true);
		}
	}

	public void saveRelaciones(ParametroGeneralUsuario parametrogeneralusuario)throws Exception {

		if(!parametrogeneralusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(parametrogeneralusuario,false);
		}
	}

	public void saveRelacionesBase(ParametroGeneralUsuario parametrogeneralusuario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("ParametroGeneralUsuario-saveRelacionesWithConnection");}
	

			this.setParametroGeneralUsuario(parametrogeneralusuario);

				if((parametrogeneralusuario.getIsNew()||parametrogeneralusuario.getIsChanged())&&!parametrogeneralusuario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(parametrogeneralusuario.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
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
			ArrayList<Classe> classes=ParametroGeneralUsuario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ParametroGeneralUsuario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setParametroGeneralUsuario(ParametroGeneralUsuario newParametroGeneralUsuario) {
		this.parametrogeneralusuario = newParametroGeneralUsuario;
	}
	
	public ParametroGeneralUsuario_data getParametroGeneralUsuarioDataAccess() {
		return parametrogeneralusuarioDataAccess;
	}
	
	public void setParametroGeneralUsuarioDataAccess(ParametroGeneralUsuario_data newparametrogeneralusuarioDataAccess) {
		this.parametrogeneralusuarioDataAccess = newparametrogeneralusuarioDataAccess;
	}

	public void setParametroGeneralUsuarios(List<ParametroGeneralUsuario> newParametroGeneralUsuarios) {
		this.parametrogeneralusuarios = newParametroGeneralUsuarios;
	}
	
	public Object getParametroGeneralUsuarioObject() {	
		this.parametrogeneralusuarioObject=this.parametrogeneralusuarioDataAccess.getEntityObject();
		return this.parametrogeneralusuarioObject;
	}
		
	public void setParametroGeneralUsuarioObject(Object newParametroGeneralUsuarioObject) {
		this.parametrogeneralusuarioObject = newParametroGeneralUsuarioObject;
	}
	
	public List<Object> getParametroGeneralUsuariosObject() {		
		this.parametrogeneralusuariosObject=this.parametrogeneralusuarioDataAccess.getEntitiesObject();
		return this.parametrogeneralusuariosObject;
	}
		
	public void setParametroGeneralUsuariosObject(List<Object> newParametroGeneralUsuariosObject) {
		this.parametrogeneralusuariosObject = newParametroGeneralUsuariosObject;
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
