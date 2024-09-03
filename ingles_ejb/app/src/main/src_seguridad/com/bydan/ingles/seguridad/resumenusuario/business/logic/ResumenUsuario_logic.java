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
package com.bydan.ingles.seguridad.resumenusuario.business.logic;


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
import com.bydan.ingles.seguridad.resumenusuario.util.*;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_util;
import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuario_param_return;
//import com.bydan.ingles.seguridad.resumenusuario.util.ResumenUsuarioParameterGeneral;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.ResumenUsuario;
import com.bydan.ingles.seguridad.resumenusuario.business.logic.ResumenUsuario_logic_add;
import com.bydan.ingles.seguridad.resumenusuario.business.data.*;
import com.bydan.ingles.seguridad.resumenusuario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class ResumenUsuario_logic  extends GeneralEntityLogic implements ResumenUsuario_logicI {
	static Logger logger = Logger.getLogger("ResumenUsuario_logic.class");	

	protected ResumenUsuario_data resumenusuarioDataAccess; 	
	protected ResumenUsuario resumenusuario;
	protected List<ResumenUsuario> resumenusuarios;
	protected Object resumenusuarioObject;	
	protected List<Object> resumenusuariosObject;
	
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
	
	
	protected ResumenUsuario_logic_add resumenusuarioLogicAdditional=null;
	
	public ResumenUsuario_logic_add getResumenUsuarioLogicAdditional() {
		return this.resumenusuarioLogicAdditional;
	}
	
	public void setResumenUsuarioLogicAdditional(ResumenUsuario_logic_add resumenusuarioLogicAdditional) {
		try {
			this.resumenusuarioLogicAdditional=resumenusuarioLogicAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	
	
	public ResumenUsuario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.resumenusuarioDataAccess = new ResumenUsuario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			ResumenUsuario_data.ActualizarQueries();
			
			//this.resumenusuarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.resumenusuarios= new ArrayList<ResumenUsuario>();
			this.resumenusuario= new ResumenUsuario();
			
			this.resumenusuarioObject=new Object();
			this.resumenusuariosObject=new ArrayList<Object>();
				
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
			
			this.resumenusuarioDataAccess.setConnexionType(this.connexionType);
			this.resumenusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public ResumenUsuario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.resumenusuarioDataAccess = new ResumenUsuario_data();
			this.resumenusuarios= new ArrayList<ResumenUsuario>();
			this.resumenusuario= new ResumenUsuario();
			this.resumenusuarioObject=new Object();
			this.resumenusuariosObject=new ArrayList<Object>();
			
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
			
			this.resumenusuarioDataAccess.setConnexionType(this.connexionType);
			this.resumenusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public ResumenUsuario getResumenUsuario() throws Exception {	
		ResumenUsuario_logic_add.checkResumenUsuarioToGet(resumenusuario,this.datosCliente,this.arrDatoGeneral);
		ResumenUsuario_logic_add.updateResumenUsuarioToGet(resumenusuario,this.arrDatoGeneral);
		
		return resumenusuario;
	}
	
	public List<ResumenUsuario> getResumenUsuarios() throws Exception {		
		if(this.resumenusuarios==null) {
			this.resumenusuarios= new ArrayList<ResumenUsuario>();
		}
		
		this.quitarsNulos();
		
		ResumenUsuario_logic_add.checkResumenUsuarioToGets(resumenusuarios,this.datosCliente,this.arrDatoGeneral);
		
		for (ResumenUsuario resumenusuarioLocal: resumenusuarios ) {
			ResumenUsuario_logic_add.updateResumenUsuarioToGet(resumenusuarioLocal,this.arrDatoGeneral);
		}
		
		return resumenusuarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.resumenusuarioDataAccess!=null) {
			this.resumenusuarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			resumenusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			resumenusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		resumenusuario = new  ResumenUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
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
		resumenusuario = new  ResumenUsuario();
		  		  
        try {
			
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		resumenusuario = new  ResumenUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
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
		resumenusuario = new  ResumenUsuario();
		  		  
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
		resumenusuario = new  ResumenUsuario();
		  		  
        try {
			
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		resumenusuario = new  ResumenUsuario();
		  		  
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
		resumenusuario = new  ResumenUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =resumenusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		resumenusuario = new  ResumenUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=resumenusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		resumenusuario = new  ResumenUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =resumenusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		resumenusuario = new  ResumenUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=resumenusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		resumenusuario = new  ResumenUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =resumenusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		resumenusuario = new  ResumenUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=resumenusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		resumenusuario = new  ResumenUsuario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(resumenusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
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
		resumenusuario = new  ResumenUsuario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuario=resumenusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(resumenusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		  		  
        try {
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
		resumenusuarios = new  ArrayList<ResumenUsuario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(resumenusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(ResumenUsuario resumenusuario) throws Exception {
		Boolean estaValidado=false;
		
		if(resumenusuario.getIsNew() || resumenusuario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<ResumenUsuario> ResumenUsuarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(ResumenUsuario resumenusuarioLocal:resumenusuarios) {				
			estaValidadoObjeto=this.validarGuardar(resumenusuarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<ResumenUsuario> ResumenUsuarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(resumenusuarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(ResumenUsuario ResumenUsuario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(resumenusuario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(ResumenUsuario resumenusuario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+resumenusuario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"resumenusuario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(ResumenUsuario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(ResumenUsuario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_logic_add.checkResumenUsuarioToSave(this.resumenusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			ResumenUsuario_logic_add.updateResumenUsuarioToSave(this.resumenusuario,this.arrDatoGeneral);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.resumenusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ResumenUsuario_util.permiteMantenimiento(this.resumenusuario) && this.validarGuardar(this.resumenusuario)) {
				ResumenUsuario_data.save(this.resumenusuario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);				
			}

			ResumenUsuario_logic_add.checkResumenUsuarioToSaveAfter(this.resumenusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.resumenusuario.getIsDeleted()) {
				this.resumenusuario=null;
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
			
			ResumenUsuario_logic_add.checkResumenUsuarioToSave(this.resumenusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			ResumenUsuario_logic_add.updateResumenUsuarioToSave(this.resumenusuario,this.arrDatoGeneral);
			
			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.resumenusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ResumenUsuario_util.permiteMantenimiento(this.resumenusuario) && this.validarGuardar(this.resumenusuario)) {			
				ResumenUsuario_data.save(this.resumenusuario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.resumenusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);				
			}
			
			ResumenUsuario_logic_add.checkResumenUsuarioToSaveAfter(this.resumenusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.resumenusuario.getIsDeleted()) {
				this.resumenusuario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_logic_add.checkResumenUsuarioToSaves(resumenusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosResumenUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ResumenUsuario resumenusuarioLocal:resumenusuarios) {		
				
				if(!ResumenUsuario_util.permiteMantenimiento(resumenusuarioLocal)) {
					continue;
				}
				
				ResumenUsuario_logic_add.updateResumenUsuarioToSave(resumenusuarioLocal,this.arrDatoGeneral);
	        	
				ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),resumenusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(resumenusuarioLocal)) {
					ResumenUsuario_data.save(resumenusuarioLocal, connexion);				
				} else {
					validadoTodosResumenUsuario=false;
				}
			}
			
			if(!validadoTodosResumenUsuario) {
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
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}
			
			ResumenUsuario_logic_add.checkResumenUsuarioToSavesAfter(resumenusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			ResumenUsuario_logic_add.checkResumenUsuarioToSaves(resumenusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosResumenUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ResumenUsuario resumenusuarioLocal:resumenusuarios) {				
				if(!ResumenUsuario_util.permiteMantenimiento(resumenusuarioLocal)) {
					continue;
				}
				
				ResumenUsuario_logic_add.updateResumenUsuarioToSave(resumenusuarioLocal,this.arrDatoGeneral);
	        	
				ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),resumenusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(resumenusuarioLocal)) {				
					ResumenUsuario_data.save(resumenusuarioLocal, connexion);				
				} else {
					validadoTodosResumenUsuario=false;
				}
			}
			
			if(!validadoTodosResumenUsuario) {
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
				
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
			}

			ResumenUsuario_logic_add.checkResumenUsuarioToSavesAfter(resumenusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ResumenUsuario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ResumenUsuario> resumenusuarios,ResumenUsuario_param_return resumenusuarioParameterGeneral)throws Exception {
		 try {	
			ResumenUsuario_param_return resumenusuarioReturnGeneral=new ResumenUsuario_param_return();
	
			ResumenUsuario_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,resumenusuarios,resumenusuarioParameterGeneral,resumenusuarioReturnGeneral);
			
			return resumenusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ResumenUsuario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ResumenUsuario> resumenusuarios,ResumenUsuario_param_return resumenusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_param_return resumenusuarioReturnGeneral=new ResumenUsuario_param_return();
	
			ResumenUsuario_logic_add.procesarAccions(parametroGeneralUsuario,modulo,opcion,usuario,this,sProceso,resumenusuarios,resumenusuarioParameterGeneral,resumenusuarioReturnGeneral);
			
			this.connexion.commit();
			
			return resumenusuarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ResumenUsuario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,ResumenUsuario_param_return resumenusuarioParameterGeneral,Boolean isEsNuevoResumenUsuario,ArrayList<Classe> clases)throws Exception {
		 try {	
			ResumenUsuario_param_return resumenusuarioReturnGeneral=new ResumenUsuario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				resumenusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			ResumenUsuario_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,resumenusuarios,resumenusuario,resumenusuarioParameterGeneral,resumenusuarioReturnGeneral,isEsNuevoResumenUsuario,clases);
			
			return resumenusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public ResumenUsuario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ResumenUsuario> resumenusuarios,ResumenUsuario resumenusuario,ResumenUsuario_param_return resumenusuarioParameterGeneral,Boolean isEsNuevoResumenUsuario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_param_return resumenusuarioReturnGeneral=new ResumenUsuario_param_return();
	
			resumenusuarioReturnGeneral.setResumenUsuario(resumenusuario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				resumenusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			ResumenUsuario_logic_add.procesarEventos(parametroGeneralUsuario,moduloActual,opcionActual,usuarioActual,this,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,resumenusuarios,resumenusuario,resumenusuarioParameterGeneral,resumenusuarioReturnGeneral,isEsNuevoResumenUsuario,clases);
			
			this.connexion.commit();
			
			return resumenusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ResumenUsuario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,ResumenUsuario_param_return resumenusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			ResumenUsuario_param_return resumenusuarioReturnGeneral=new ResumenUsuario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.resumenusuarios=new ArrayList<ResumenUsuario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.resumenusuario=new ResumenUsuario();
				
				
				if(conColumnasBase) {this.resumenusuario.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.resumenusuario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.resumenusuario.setnumero_ingresos(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setnumero_error_ingreso(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setnumero_intentos(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setnumero_cierres(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setnumero_reinicios(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setnumero_ingreso_actual(Long.parseLong(arrColumnas[iColumn++]));
				this.resumenusuario.setfecha_ultimo_ingreso(Funciones.ConvertToDate(arrColumnas[iColumn++]));
				this.resumenusuario.setfecha_ultimo_error_ingreso(Funciones.ConvertToDate(arrColumnas[iColumn++]));
				this.resumenusuario.setfecha_ultimo_intento(Funciones.ConvertToDate(arrColumnas[iColumn++]));
				this.resumenusuario.setfecha_ultimo_cierre(Funciones.ConvertToDate(arrColumnas[iColumn++]));
				
				this.resumenusuarios.add(this.resumenusuario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			resumenusuarioReturnGeneral.setConRetornoEstaProcesado(true);
			resumenusuarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return resumenusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<ResumenUsuario> resumenusuariosAux= new ArrayList<ResumenUsuario>();
		
		for(ResumenUsuario resumenusuario:resumenusuarios) {
			if(!resumenusuario.getIsDeleted()) {
				resumenusuariosAux.add(resumenusuario);
			}
		}
		
		resumenusuarios=resumenusuariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<ResumenUsuario> resumenusuariosAux= new ArrayList<ResumenUsuario>();
		
		for(ResumenUsuario resumenusuario : this.resumenusuarios) {
			if(resumenusuario==null) {
				resumenusuariosAux.add(resumenusuario);
			}
		}
		
		//this.resumenusuarios=resumenusuariosAux;
		
		this.resumenusuarios.removeAll(resumenusuariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(resumenusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((resumenusuario.getIsDeleted() || (resumenusuario.getIsChanged()&&!resumenusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=resumenusuarioDataAccess.getSetVersionRow(connexion,resumenusuario.getId());
				
				if(!resumenusuario.getVersionRow().equals(timestamp)) {	
					resumenusuario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				resumenusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(resumenusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((resumenusuario.getIsDeleted() || (resumenusuario.getIsChanged()&&!resumenusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=resumenusuarioDataAccess.getSetVersionRow(connexion,resumenusuario.getId());
			
			try {							
				if(!resumenusuario.getVersionRow().equals(timestamp)) {	
					resumenusuario.setVersionRow(timestamp);
				}
				
				resumenusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(resumenusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(resumenusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(resumenusuarioAux.getIsDeleted() || (resumenusuarioAux.getIsChanged()&&!resumenusuarioAux.getIsNew())) {
						
						timestamp=resumenusuarioDataAccess.getSetVersionRow(connexion,resumenusuarioAux.getId());
						
						if(!resumenusuario.getVersionRow().equals(timestamp)) {	
							resumenusuarioAux.setVersionRow(timestamp);
						}
								
						resumenusuarioAux.setIsChangedAuxiliar(false);														
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
		if(resumenusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
					if(resumenusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(resumenusuarioAux.getIsDeleted() || (resumenusuarioAux.getIsChanged()&&!resumenusuarioAux.getIsNew())) {
						
						timestamp=resumenusuarioDataAccess.getSetVersionRow(connexion,resumenusuarioAux.getId());
						
						if(!resumenusuarioAux.getVersionRow().equals(timestamp)) {	
							resumenusuarioAux.setVersionRow(timestamp);
						}
						
													
						resumenusuarioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public ResumenUsuario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalUsuario) throws Exception {
		ResumenUsuario_param_return  resumenusuario_return =new ResumenUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-cargarCombosLoteForeignKeyResumenUsuarioWithConnection");
			
			this.connexion.begin();
			
			resumenusuario_return =new ResumenUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			resumenusuario_return.setusuariosFK(usuariosForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return resumenusuario_return;
	}
	
	public ResumenUsuario_param_return cargarCombosLoteFK(String finalQueryGlobalUsuario) throws Exception {
		ResumenUsuario_param_return  resumenusuario_return =new ResumenUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			resumenusuario_return =new ResumenUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			resumenusuario_return.setusuariosFK(usuariosForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return resumenusuario_return;
	}
	
	
	public void deepLoad(ResumenUsuario resumenusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			ResumenUsuario_logic_add.updateResumenUsuarioToGet(resumenusuario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
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
			resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(resumenusuario.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(resumenusuario.getUsuario(),isDeep,deepLoadType,clases);				
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
			resumenusuario.setUsuario(resumenusuarioDataAccess.getUsuario(connexion,resumenusuario));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(resumenusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(ResumenUsuario resumenusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			ResumenUsuario_logic_add.updateResumenUsuarioToSave(resumenusuario,this.arrDatoGeneral);
			
ResumenUsuario_data.save(resumenusuario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(resumenusuario.getUsuario(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(resumenusuario.getUsuario(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(resumenusuario.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(resumenusuario.getUsuario(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(resumenusuario.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(resumenusuario.getUsuario(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(ResumenUsuario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(resumenusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ResumenUsuario_util.refrescarFKsDescripciones(resumenusuario);
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
			this.deepLoad(this.resumenusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ResumenUsuario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(resumenusuarios!=null) {
				for(ResumenUsuario resumenusuario:resumenusuarios) {
					this.deepLoad(resumenusuario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					ResumenUsuario_util.refrescarFKsDescripciones(resumenusuarios);
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
			if(resumenusuarios!=null) {
				for(ResumenUsuario resumenusuario:resumenusuarios) {
					this.deepLoad(resumenusuario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					ResumenUsuario_util.refrescarFKsDescripciones(resumenusuarios);
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
			this.getNewConnexionToDeep(ResumenUsuario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(resumenusuario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(ResumenUsuario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(resumenusuarios!=null) {
				for(ResumenUsuario resumenusuario:resumenusuarios) {
					this.deepSave(resumenusuario,isDeep,deepLoadType,clases);
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
			if(resumenusuarios!=null) {
				for(ResumenUsuario resumenusuario:resumenusuarios) {
					this.deepSave(resumenusuario,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdUsuarioWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ResumenUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidUsuario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,ResumenUsuario_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
			parameterSelectionGeneralidUsuario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,ResumenUsuario_util.IDUSUARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidUsuario);

			ResumenUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			resumenusuarios=resumenusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				ResumenUsuario_util.refrescarFKsDescripciones(this.resumenusuarios);
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
			if(ResumenUsuario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ResumenUsuarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,ResumenUsuario resumenusuario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ResumenUsuario_util.IS_CON_AUDITORIA) {
				if(resumenusuario.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ResumenUsuarioDataAccess.TABLENAME, resumenusuario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ResumenUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////ResumenUsuario_logic.registrarAuditoriaDetalles(connexion,resumenusuario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(resumenusuario.getIsDeleted()) {
					/*if(!resumenusuario.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ResumenUsuarioDataAccess.TABLENAME, resumenusuario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////ResumenUsuario_logic.registrarAuditoriaDetalles(connexion,resumenusuario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ResumenUsuarioDataAccess.TABLENAME, resumenusuario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(resumenusuario.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ResumenUsuarioDataAccess.TABLENAME, resumenusuario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ResumenUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////ResumenUsuario_logic.registrarAuditoriaDetalles(connexion,resumenusuario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,ResumenUsuario resumenusuario)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(resumenusuario.getIsNew()||!resumenusuario.getid_usuario().equals(resumenusuario.getResumenUsuarioOriginal().getid_usuario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getid_usuario()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getid_usuario().toString();
				}
				if(resumenusuario.getid_usuario()!=null)
				{
					strValorNuevo=resumenusuario.getid_usuario().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.IDUSUARIO,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_ingresos().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_ingresos()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_ingresos()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_ingresos().toString();
				}
				if(resumenusuario.getnumero_ingresos()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_ingresos().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROINGRESOS,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_error_ingreso().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_error_ingreso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_error_ingreso()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_error_ingreso().toString();
				}
				if(resumenusuario.getnumero_error_ingreso()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_error_ingreso().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROERRORINGRESO,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_intentos().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_intentos()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_intentos()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_intentos().toString();
				}
				if(resumenusuario.getnumero_intentos()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_intentos().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROINTENTOS,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_cierres().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_cierres()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_cierres()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_cierres().toString();
				}
				if(resumenusuario.getnumero_cierres()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_cierres().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROCIERRES,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_reinicios().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_reinicios()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_reinicios()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_reinicios().toString();
				}
				if(resumenusuario.getnumero_reinicios()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_reinicios().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROREINICIOS,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getnumero_ingreso_actual().equals(resumenusuario.getResumenUsuarioOriginal().getnumero_ingreso_actual()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getnumero_ingreso_actual()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getnumero_ingreso_actual().toString();
				}
				if(resumenusuario.getnumero_ingreso_actual()!=null)
				{
					strValorNuevo=resumenusuario.getnumero_ingreso_actual().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.NUMEROINGRESOACTUAL,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getfecha_ultimo_ingreso().equals(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_ingreso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_ingreso()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_ingreso().toString();
				}
				if(resumenusuario.getfecha_ultimo_ingreso()!=null)
				{
					strValorNuevo=resumenusuario.getfecha_ultimo_ingreso().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.FECHAULTIMOINGRESO,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getfecha_ultimo_error_ingreso().equals(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_error_ingreso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_error_ingreso()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_error_ingreso().toString();
				}
				if(resumenusuario.getfecha_ultimo_error_ingreso()!=null)
				{
					strValorNuevo=resumenusuario.getfecha_ultimo_error_ingreso().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.FECHAULTIMOERRORINGRESO,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getfecha_ultimo_intento().equals(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_intento()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_intento()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_intento().toString();
				}
				if(resumenusuario.getfecha_ultimo_intento()!=null)
				{
					strValorNuevo=resumenusuario.getfecha_ultimo_intento().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.FECHAULTIMOINTENTO,strValorActual,strValorNuevo);
			}	
			
			if(resumenusuario.getIsNew()||!resumenusuario.getfecha_ultimo_cierre().equals(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_cierre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_cierre()!=null)
				{
					strValorActual=resumenusuario.getResumenUsuarioOriginal().getfecha_ultimo_cierre().toString();
				}
				if(resumenusuario.getfecha_ultimo_cierre()!=null)
				{
					strValorNuevo=resumenusuario.getfecha_ultimo_cierre().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ResumenUsuarioConstantesFunciones.FECHAULTIMOCIERRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(ResumenUsuario resumenusuario) throws Exception {

		if(!resumenusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(resumenusuario,true);
		}
	}

	public void saveRelaciones(ResumenUsuario resumenusuario)throws Exception {

		if(!resumenusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(resumenusuario,false);
		}
	}

	public void saveRelacionesBase(ResumenUsuario resumenusuario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("ResumenUsuario-saveRelacionesWithConnection");}
	

			this.setResumenUsuario(resumenusuario);

			if(ResumenUsuario_logic_add.validarSaveRelaciones(resumenusuario,this)) {

				ResumenUsuario_logic_add.updateRelacionesToSave(resumenusuario,this);

				if((resumenusuario.getIsNew()||resumenusuario.getIsChanged())&&!resumenusuario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(resumenusuario.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				ResumenUsuario_logic_add.updateRelacionesToSaveAfter(resumenusuario,this);

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
			ArrayList<Classe> classes=ResumenUsuario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ResumenUsuario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setResumenUsuario(ResumenUsuario newResumenUsuario) {
		this.resumenusuario = newResumenUsuario;
	}
	
	public ResumenUsuario_data getResumenUsuarioDataAccess() {
		return resumenusuarioDataAccess;
	}
	
	public void setResumenUsuarioDataAccess(ResumenUsuario_data newresumenusuarioDataAccess) {
		this.resumenusuarioDataAccess = newresumenusuarioDataAccess;
	}

	public void setResumenUsuarios(List<ResumenUsuario> newResumenUsuarios) {
		this.resumenusuarios = newResumenUsuarios;
	}
	
	public Object getResumenUsuarioObject() {	
		this.resumenusuarioObject=this.resumenusuarioDataAccess.getEntityObject();
		return this.resumenusuarioObject;
	}
		
	public void setResumenUsuarioObject(Object newResumenUsuarioObject) {
		this.resumenusuarioObject = newResumenUsuarioObject;
	}
	
	public List<Object> getResumenUsuariosObject() {		
		this.resumenusuariosObject=this.resumenusuarioDataAccess.getEntitiesObject();
		return this.resumenusuariosObject;
	}
		
	public void setResumenUsuariosObject(List<Object> newResumenUsuariosObject) {
		this.resumenusuariosObject = newResumenUsuariosObject;
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
