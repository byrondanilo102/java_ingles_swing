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
package com.bydan.ingles.seguridad.parametrogeneralsg.business.logic;


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
import com.bydan.ingles.seguridad.parametrogeneralsg.util.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_util;
import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSg_param_return;
//import com.bydan.ingles.seguridad.parametrogeneralsg.util.ParametroGeneralSgParameterGeneral;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.ParametroGeneralSg;
//import com.bydan.ingles.seguridad.parametrogeneralsg.business.logic.ParametroGeneralSg_logic_add;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.data.*;
import com.bydan.ingles.seguridad.parametrogeneralsg.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class ParametroGeneralSg_logic  extends GeneralEntityLogic implements ParametroGeneralSg_logicI {
	static Logger logger = Logger.getLogger("ParametroGeneralSg_logic.class");	

	protected ParametroGeneralSg_data parametrogeneralsgDataAccess; 	
	protected ParametroGeneralSg parametrogeneralsg;
	protected List<ParametroGeneralSg> parametrogeneralsgs;
	protected Object parametrogeneralsgObject;	
	protected List<Object> parametrogeneralsgsObject;
	
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
	
	
	
	
	
	
	public ParametroGeneralSg_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.parametrogeneralsgDataAccess = new ParametroGeneralSg_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			ParametroGeneralSg_data.ActualizarQueries();
			
			//this.parametrogeneralsgDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.parametrogeneralsgs= new ArrayList<ParametroGeneralSg>();
			this.parametrogeneralsg= new ParametroGeneralSg();
			
			this.parametrogeneralsgObject=new Object();
			this.parametrogeneralsgsObject=new ArrayList<Object>();
				
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
			
			this.parametrogeneralsgDataAccess.setConnexionType(this.connexionType);
			this.parametrogeneralsgDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public ParametroGeneralSg_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.parametrogeneralsgDataAccess = new ParametroGeneralSg_data();
			this.parametrogeneralsgs= new ArrayList<ParametroGeneralSg>();
			this.parametrogeneralsg= new ParametroGeneralSg();
			this.parametrogeneralsgObject=new Object();
			this.parametrogeneralsgsObject=new ArrayList<Object>();
			
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
			
			this.parametrogeneralsgDataAccess.setConnexionType(this.connexionType);
			this.parametrogeneralsgDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public ParametroGeneralSg getParametroGeneralSg() throws Exception {	
		//ParametroGeneralSg_logic_add.checkParametroGeneralSgToGet(parametrogeneralsg,this.datosCliente,this.arrDatoGeneral);
		//ParametroGeneralSg_logic_add.updateParametroGeneralSgToGet(parametrogeneralsg,this.arrDatoGeneral);
		
		return parametrogeneralsg;
	}
	
	public List<ParametroGeneralSg> getParametroGeneralSgs() throws Exception {		
		if(this.parametrogeneralsgs==null) {
			this.parametrogeneralsgs= new ArrayList<ParametroGeneralSg>();
		}
		
		this.quitarsNulos();
		
		//ParametroGeneralSg_logic_add.checkParametroGeneralSgToGets(parametrogeneralsgs,this.datosCliente,this.arrDatoGeneral);
		
		for (ParametroGeneralSg parametrogeneralsgLocal: parametrogeneralsgs ) {
			//ParametroGeneralSg_logic_add.updateParametroGeneralSgToGet(parametrogeneralsgLocal,this.arrDatoGeneral);
		}
		
		return parametrogeneralsgs;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.parametrogeneralsgDataAccess!=null) {
			this.parametrogeneralsgDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralsgDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			parametrogeneralsgDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
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
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
        try {
			
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
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
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
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
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
        try {
			
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		parametrogeneralsg = new  ParametroGeneralSg();
		  		  
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
		parametrogeneralsg = new  ParametroGeneralSg();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =parametrogeneralsgDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralsg = new  ParametroGeneralSg();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=parametrogeneralsgDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		parametrogeneralsg = new  ParametroGeneralSg();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =parametrogeneralsgDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralsg = new  ParametroGeneralSg();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=parametrogeneralsgDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		parametrogeneralsg = new  ParametroGeneralSg();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =parametrogeneralsgDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		parametrogeneralsg = new  ParametroGeneralSg();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=parametrogeneralsgDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		parametrogeneralsg = new  ParametroGeneralSg();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsg);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
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
		parametrogeneralsg = new  ParametroGeneralSg();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsg=parametrogeneralsgDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsg);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		  		  
        try {
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
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
		parametrogeneralsgs = new  ArrayList<ParametroGeneralSg>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			parametrogeneralsgs=parametrogeneralsgDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(parametrogeneralsgs);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(ParametroGeneralSg parametrogeneralsg) throws Exception {
		Boolean estaValidado=false;
		
		if(parametrogeneralsg.getIsNew() || parametrogeneralsg.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<ParametroGeneralSg> ParametroGeneralSgs) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgs) {				
			estaValidadoObjeto=this.validarGuardar(parametrogeneralsgLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<ParametroGeneralSg> ParametroGeneralSgs) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(parametrogeneralsgs)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(ParametroGeneralSg ParametroGeneralSg) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(parametrogeneralsg)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(ParametroGeneralSg parametrogeneralsg) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+parametrogeneralsg.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"parametrogeneralsg","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(ParametroGeneralSg_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(ParametroGeneralSg_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSave(this.parametrogeneralsg,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ParametroGeneralSg_logic_add.updateParametroGeneralSgToSave(this.parametrogeneralsg,this.arrDatoGeneral);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.parametrogeneralsg,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ParametroGeneralSg_util.permiteMantenimiento(this.parametrogeneralsg) && this.validarGuardar(this.parametrogeneralsg)) {
				ParametroGeneralSg_data.save(this.parametrogeneralsg, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);				
			}

			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSaveAfter(this.parametrogeneralsg,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.parametrogeneralsg.getIsDeleted()) {
				this.parametrogeneralsg=null;
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
			
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSave(this.parametrogeneralsg,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//ParametroGeneralSg_logic_add.updateParametroGeneralSgToSave(this.parametrogeneralsg,this.arrDatoGeneral);
			
			ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.parametrogeneralsg,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(ParametroGeneralSg_util.permiteMantenimiento(this.parametrogeneralsg) && this.validarGuardar(this.parametrogeneralsg)) {			
				ParametroGeneralSg_data.save(this.parametrogeneralsg, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.parametrogeneralsg,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);				
			}
			
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSaveAfter(this.parametrogeneralsg,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.parametrogeneralsg.getIsDeleted()) {
				this.parametrogeneralsg=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSaves(parametrogeneralsgs,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosParametroGeneralSg=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgs) {		
				
				if(!ParametroGeneralSg_util.permiteMantenimiento(parametrogeneralsgLocal)) {
					continue;
				}
				
				//ParametroGeneralSg_logic_add.updateParametroGeneralSgToSave(parametrogeneralsgLocal,this.arrDatoGeneral);
	        	
				ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),parametrogeneralsgLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(parametrogeneralsgLocal)) {
					ParametroGeneralSg_data.save(parametrogeneralsgLocal, connexion);				
				} else {
					validadoTodosParametroGeneralSg=false;
				}
			}
			
			if(!validadoTodosParametroGeneralSg) {
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
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}
			
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSavesAfter(parametrogeneralsgs,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSaves(parametrogeneralsgs,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosParametroGeneralSg=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgs) {				
				if(!ParametroGeneralSg_util.permiteMantenimiento(parametrogeneralsgLocal)) {
					continue;
				}
				
				//ParametroGeneralSg_logic_add.updateParametroGeneralSgToSave(parametrogeneralsgLocal,this.arrDatoGeneral);
	        	
				ParametroGeneralSg_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),parametrogeneralsgLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(parametrogeneralsgLocal)) {				
					ParametroGeneralSg_data.save(parametrogeneralsgLocal, connexion);				
				} else {
					validadoTodosParametroGeneralSg=false;
				}
			}
			
			if(!validadoTodosParametroGeneralSg) {
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
				
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsgs);
			}

			//ParametroGeneralSg_logic_add.checkParametroGeneralSgToSavesAfter(parametrogeneralsgs,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ParametroGeneralSg_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg_param_return parametrogeneralsgParameterGeneral)throws Exception {
		 try {	
			ParametroGeneralSg_param_return parametrogeneralsgReturnGeneral=new ParametroGeneralSg_param_return();
	
			
			return parametrogeneralsgReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public ParametroGeneralSg_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg_param_return parametrogeneralsgParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralSg_param_return parametrogeneralsgReturnGeneral=new ParametroGeneralSg_param_return();
	
			
			this.connexion.commit();
			
			return parametrogeneralsgReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ParametroGeneralSg_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,ParametroGeneralSg_param_return parametrogeneralsgParameterGeneral,Boolean isEsNuevoParametroGeneralSg,ArrayList<Classe> clases)throws Exception {
		 try {	
			ParametroGeneralSg_param_return parametrogeneralsgReturnGeneral=new ParametroGeneralSg_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				parametrogeneralsgReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return parametrogeneralsgReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public ParametroGeneralSg_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<ParametroGeneralSg> parametrogeneralsgs,ParametroGeneralSg parametrogeneralsg,ParametroGeneralSg_param_return parametrogeneralsgParameterGeneral,Boolean isEsNuevoParametroGeneralSg,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralSg_param_return parametrogeneralsgReturnGeneral=new ParametroGeneralSg_param_return();
	
			parametrogeneralsgReturnGeneral.setParametroGeneralSg(parametrogeneralsg);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				parametrogeneralsgReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return parametrogeneralsgReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public ParametroGeneralSg_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,ParametroGeneralSg_param_return parametrogeneralsgParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,ParametroGeneralSg.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			ParametroGeneralSg_param_return parametrogeneralsgReturnGeneral=new ParametroGeneralSg_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.parametrogeneralsgs=new ArrayList<ParametroGeneralSg>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.parametrogeneralsg=new ParametroGeneralSg();
				
				
				if(conColumnasBase) {this.parametrogeneralsg.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.parametrogeneralsg.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.parametrogeneralsg.setnombre_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setnombre_simple_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setnombre_empresa(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setversion_sistema(Double.parseDouble(arrColumnas[iColumn++]));
				this.parametrogeneralsg.setsiglas_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setmail_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.settelefono_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setfax_sistema(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setrepresentante_nombre(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setcodigo_proceso_actualizacion(arrColumnas[iColumn++]);
				this.parametrogeneralsg.setesta_activo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.parametrogeneralsgs.add(this.parametrogeneralsg);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			parametrogeneralsgReturnGeneral.setConRetornoEstaProcesado(true);
			parametrogeneralsgReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return parametrogeneralsgReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<ParametroGeneralSg> parametrogeneralsgsAux= new ArrayList<ParametroGeneralSg>();
		
		for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
			if(!parametrogeneralsg.getIsDeleted()) {
				parametrogeneralsgsAux.add(parametrogeneralsg);
			}
		}
		
		parametrogeneralsgs=parametrogeneralsgsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<ParametroGeneralSg> parametrogeneralsgsAux= new ArrayList<ParametroGeneralSg>();
		
		for(ParametroGeneralSg parametrogeneralsg : this.parametrogeneralsgs) {
			if(parametrogeneralsg==null) {
				parametrogeneralsgsAux.add(parametrogeneralsg);
			}
		}
		
		//this.parametrogeneralsgs=parametrogeneralsgsAux;
		
		this.parametrogeneralsgs.removeAll(parametrogeneralsgsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(parametrogeneralsg.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((parametrogeneralsg.getIsDeleted() || (parametrogeneralsg.getIsChanged()&&!parametrogeneralsg.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=parametrogeneralsgDataAccess.getSetVersionRow(connexion,parametrogeneralsg.getId());
				
				if(!parametrogeneralsg.getVersionRow().equals(timestamp)) {	
					parametrogeneralsg.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				parametrogeneralsg.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(parametrogeneralsg.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((parametrogeneralsg.getIsDeleted() || (parametrogeneralsg.getIsChanged()&&!parametrogeneralsg.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=parametrogeneralsgDataAccess.getSetVersionRow(connexion,parametrogeneralsg.getId());
			
			try {							
				if(!parametrogeneralsg.getVersionRow().equals(timestamp)) {	
					parametrogeneralsg.setVersionRow(timestamp);
				}
				
				parametrogeneralsg.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(parametrogeneralsgs!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(parametrogeneralsgAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(parametrogeneralsgAux.getIsDeleted() || (parametrogeneralsgAux.getIsChanged()&&!parametrogeneralsgAux.getIsNew())) {
						
						timestamp=parametrogeneralsgDataAccess.getSetVersionRow(connexion,parametrogeneralsgAux.getId());
						
						if(!parametrogeneralsg.getVersionRow().equals(timestamp)) {	
							parametrogeneralsgAux.setVersionRow(timestamp);
						}
								
						parametrogeneralsgAux.setIsChangedAuxiliar(false);														
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
		if(parametrogeneralsgs!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
					if(parametrogeneralsgAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(parametrogeneralsgAux.getIsDeleted() || (parametrogeneralsgAux.getIsChanged()&&!parametrogeneralsgAux.getIsNew())) {
						
						timestamp=parametrogeneralsgDataAccess.getSetVersionRow(connexion,parametrogeneralsgAux.getId());
						
						if(!parametrogeneralsgAux.getVersionRow().equals(timestamp)) {	
							parametrogeneralsgAux.setVersionRow(timestamp);
						}
						
													
						parametrogeneralsgAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	
	public void deepLoad(ParametroGeneralSg parametrogeneralsg,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		
		
		try {
			//ParametroGeneralSg_logic_add.updateParametroGeneralSgToGet(parametrogeneralsg,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(ParametroGeneralSg parametrogeneralsg,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
				
		try {
			//ParametroGeneralSg_logic_add.updateParametroGeneralSgToSave(parametrogeneralsg,this.arrDatoGeneral);
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ParametroGeneralSg.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(parametrogeneralsg,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ParametroGeneralSg_util.refrescarFKsDescripciones(parametrogeneralsg);
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
			this.deepLoad(this.parametrogeneralsg,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				ParametroGeneralSg_util.refrescarFKsDescripciones(this.parametrogeneralsg);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(ParametroGeneralSg.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(parametrogeneralsgs!=null) {
				for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
					this.deepLoad(parametrogeneralsg,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					ParametroGeneralSg_util.refrescarFKsDescripciones(parametrogeneralsgs);
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
			if(parametrogeneralsgs!=null) {
				for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
					this.deepLoad(parametrogeneralsg,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					ParametroGeneralSg_util.refrescarFKsDescripciones(parametrogeneralsgs);
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
			this.getNewConnexionToDeep(ParametroGeneralSg.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(parametrogeneralsg,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(ParametroGeneralSg.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(parametrogeneralsgs!=null) {
				for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
					this.deepSave(parametrogeneralsg,isDeep,deepLoadType,clases);
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
			if(parametrogeneralsgs!=null) {
				for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
					this.deepSave(parametrogeneralsg,isDeep,deepLoadType,clases);
				}		
			}
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
			if(ParametroGeneralSg_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralSgDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,ParametroGeneralSg parametrogeneralsg,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(ParametroGeneralSg_util.IS_CON_AUDITORIA) {
				if(parametrogeneralsg.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralSgDataAccess.TABLENAME, parametrogeneralsg.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ParametroGeneralSg_util.IS_CON_AUDITORIA_DETALLE) {
						////ParametroGeneralSg_logic.registrarAuditoriaDetalles(connexion,parametrogeneralsg,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(parametrogeneralsg.getIsDeleted()) {
					/*if(!parametrogeneralsg.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ParametroGeneralSgDataAccess.TABLENAME, parametrogeneralsg.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////ParametroGeneralSg_logic.registrarAuditoriaDetalles(connexion,parametrogeneralsg,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralSgDataAccess.TABLENAME, parametrogeneralsg.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(parametrogeneralsg.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ParametroGeneralSgDataAccess.TABLENAME, parametrogeneralsg.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(ParametroGeneralSg_util.IS_CON_AUDITORIA_DETALLE) {
						////ParametroGeneralSg_logic.registrarAuditoriaDetalles(connexion,parametrogeneralsg,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,ParametroGeneralSg parametrogeneralsg)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getnombre_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_sistema();
				}
				if(parametrogeneralsg.getnombre_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getnombre_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.NOMBRESISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getnombre_simple_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_simple_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_simple_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_simple_sistema();
				}
				if(parametrogeneralsg.getnombre_simple_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getnombre_simple_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.NOMBRESIMPLESISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getnombre_empresa().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_empresa()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_empresa()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getnombre_empresa();
				}
				if(parametrogeneralsg.getnombre_empresa()!=null)
				{
					strValorNuevo=parametrogeneralsg.getnombre_empresa() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.NOMBREEMPRESA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getversion_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getversion_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getversion_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getversion_sistema().toString();
				}
				if(parametrogeneralsg.getversion_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getversion_sistema().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.VERSIONSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getsiglas_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getsiglas_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getsiglas_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getsiglas_sistema();
				}
				if(parametrogeneralsg.getsiglas_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getsiglas_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.SIGLASSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getmail_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getmail_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getmail_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getmail_sistema();
				}
				if(parametrogeneralsg.getmail_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getmail_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.MAILSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.gettelefono_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().gettelefono_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().gettelefono_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().gettelefono_sistema();
				}
				if(parametrogeneralsg.gettelefono_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.gettelefono_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.TELEFONOSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getfax_sistema().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getfax_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getfax_sistema()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getfax_sistema();
				}
				if(parametrogeneralsg.getfax_sistema()!=null)
				{
					strValorNuevo=parametrogeneralsg.getfax_sistema() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.FAXSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getrepresentante_nombre().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getrepresentante_nombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getrepresentante_nombre()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getrepresentante_nombre();
				}
				if(parametrogeneralsg.getrepresentante_nombre()!=null)
				{
					strValorNuevo=parametrogeneralsg.getrepresentante_nombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.REPRESENTANTENOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getcodigo_proceso_actualizacion().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getcodigo_proceso_actualizacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getcodigo_proceso_actualizacion()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getcodigo_proceso_actualizacion();
				}
				if(parametrogeneralsg.getcodigo_proceso_actualizacion()!=null)
				{
					strValorNuevo=parametrogeneralsg.getcodigo_proceso_actualizacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.CODIGOPROCESOACTUALIZACION,strValorActual,strValorNuevo);
			}	
			
			if(parametrogeneralsg.getIsNew()||!parametrogeneralsg.getesta_activo().equals(parametrogeneralsg.getParametroGeneralSgOriginal().getesta_activo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(parametrogeneralsg.getParametroGeneralSgOriginal().getesta_activo()!=null)
				{
					strValorActual=parametrogeneralsg.getParametroGeneralSgOriginal().getesta_activo().toString();
				}
				if(parametrogeneralsg.getesta_activo()!=null)
				{
					strValorNuevo=parametrogeneralsg.getesta_activo().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ParametroGeneralSgConstantesFunciones.ESTAACTIVO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(ParametroGeneralSg parametrogeneralsg) throws Exception {

		if(!parametrogeneralsg.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(parametrogeneralsg,true);
		}
	}

	public void saveRelaciones(ParametroGeneralSg parametrogeneralsg)throws Exception {

		if(!parametrogeneralsg.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(parametrogeneralsg,false);
		}
	}

	public void saveRelacionesBase(ParametroGeneralSg parametrogeneralsg,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("ParametroGeneralSg-saveRelacionesWithConnection");}
	

			this.setParametroGeneralSg(parametrogeneralsg);

			if(true) {

				//ParametroGeneralSg_logic_add.updateRelacionesToSave(parametrogeneralsg,this);

				if((parametrogeneralsg.getIsNew()||parametrogeneralsg.getIsChanged())&&!parametrogeneralsg.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(parametrogeneralsg.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//ParametroGeneralSg_logic_add.updateRelacionesToSaveAfter(parametrogeneralsg,this);

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
			ArrayList<Classe> classes=ParametroGeneralSg_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=ParametroGeneralSg_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setParametroGeneralSg(ParametroGeneralSg newParametroGeneralSg) {
		this.parametrogeneralsg = newParametroGeneralSg;
	}
	
	public ParametroGeneralSg_data getParametroGeneralSgDataAccess() {
		return parametrogeneralsgDataAccess;
	}
	
	public void setParametroGeneralSgDataAccess(ParametroGeneralSg_data newparametrogeneralsgDataAccess) {
		this.parametrogeneralsgDataAccess = newparametrogeneralsgDataAccess;
	}

	public void setParametroGeneralSgs(List<ParametroGeneralSg> newParametroGeneralSgs) {
		this.parametrogeneralsgs = newParametroGeneralSgs;
	}
	
	public Object getParametroGeneralSgObject() {	
		this.parametrogeneralsgObject=this.parametrogeneralsgDataAccess.getEntityObject();
		return this.parametrogeneralsgObject;
	}
		
	public void setParametroGeneralSgObject(Object newParametroGeneralSgObject) {
		this.parametrogeneralsgObject = newParametroGeneralSgObject;
	}
	
	public List<Object> getParametroGeneralSgsObject() {		
		this.parametrogeneralsgsObject=this.parametrogeneralsgDataAccess.getEntitiesObject();
		return this.parametrogeneralsgsObject;
	}
		
	public void setParametroGeneralSgsObject(List<Object> newParametroGeneralSgsObject) {
		this.parametrogeneralsgsObject = newParametroGeneralSgsObject;
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
