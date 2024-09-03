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
package com.bydan.ingles.seguridad.ciudad.business.logic;


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
import com.bydan.ingles.seguridad.ciudad.util.*;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_param_return;
//import com.bydan.ingles.seguridad.ciudad.util.CiudadParameterGeneral;
import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
//import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic_add;
import com.bydan.ingles.seguridad.ciudad.business.data.*;
import com.bydan.ingles.seguridad.ciudad.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;

//REL


import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Ciudad_logic  extends GeneralEntityLogic implements Ciudad_logicI {
	static Logger logger = Logger.getLogger("Ciudad_logic.class");	

	protected Ciudad_data ciudadDataAccess; 	
	protected Ciudad ciudad;
	protected List<Ciudad> ciudads;
	protected Object ciudadObject;	
	protected List<Object> ciudadsObject;
	
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
	
	
	
	
	
	
	public Ciudad_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.ciudadDataAccess = new Ciudad_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Ciudad_data.ActualizarQueries();
			
			//this.ciudadDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.ciudads= new ArrayList<Ciudad>();
			this.ciudad= new Ciudad();
			
			this.ciudadObject=new Object();
			this.ciudadsObject=new ArrayList<Object>();
				
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
			
			this.ciudadDataAccess.setConnexionType(this.connexionType);
			this.ciudadDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Ciudad_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.ciudadDataAccess = new Ciudad_data();
			this.ciudads= new ArrayList<Ciudad>();
			this.ciudad= new Ciudad();
			this.ciudadObject=new Object();
			this.ciudadsObject=new ArrayList<Object>();
			
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
			
			this.ciudadDataAccess.setConnexionType(this.connexionType);
			this.ciudadDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Ciudad getCiudad() throws Exception {	
		//Ciudad_logic_add.checkCiudadToGet(ciudad,this.datosCliente,this.arrDatoGeneral);
		//Ciudad_logic_add.updateCiudadToGet(ciudad,this.arrDatoGeneral);
		
		return ciudad;
	}
	
	public List<Ciudad> getCiudads() throws Exception {		
		if(this.ciudads==null) {
			this.ciudads= new ArrayList<Ciudad>();
		}
		
		this.quitarsNulos();
		
		//Ciudad_logic_add.checkCiudadToGets(ciudads,this.datosCliente,this.arrDatoGeneral);
		
		for (Ciudad ciudadLocal: ciudads ) {
			//Ciudad_logic_add.updateCiudadToGet(ciudadLocal,this.arrDatoGeneral);
		}
		
		return ciudads;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.ciudadDataAccess!=null) {
			this.ciudadDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			ciudadDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			ciudadDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		ciudad = new  Ciudad();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			ciudad=ciudadDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
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
		ciudad = new  Ciudad();
		  		  
        try {
			
			ciudad=ciudadDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		ciudad = new  Ciudad();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			ciudad=ciudadDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
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
		ciudad = new  Ciudad();
		  		  
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
		ciudad = new  Ciudad();
		  		  
        try {
			
			ciudad=ciudadDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		ciudad = new  Ciudad();
		  		  
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
		ciudad = new  Ciudad();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =ciudadDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		ciudad = new  Ciudad();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=ciudadDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		ciudad = new  Ciudad();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =ciudadDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		ciudad = new  Ciudad();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=ciudadDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		ciudad = new  Ciudad();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =ciudadDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		ciudad = new  Ciudad();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=ciudadDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		  		  
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
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		ciudads = new  ArrayList<Ciudad>();
		  		  
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
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		ciudad = new  Ciudad();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudad=ciudadDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(ciudad);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
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
		ciudad = new  Ciudad();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudad=ciudadDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(ciudad);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		  		  
        try {
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		ciudads = new  ArrayList<Ciudad>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
		ciudads = new  ArrayList<Ciudad>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(ciudads);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Ciudad ciudad) throws Exception {
		Boolean estaValidado=false;
		
		if(ciudad.getIsNew() || ciudad.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Ciudad> Ciudads) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Ciudad ciudadLocal:ciudads) {				
			estaValidadoObjeto=this.validarGuardar(ciudadLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Ciudad> Ciudads) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(ciudads)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Ciudad Ciudad) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(ciudad)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Ciudad ciudad) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+ciudad.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"ciudad","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Ciudad_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Ciudad_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Ciudad_logic_add.checkCiudadToSave(this.ciudad,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Ciudad_logic_add.updateCiudadToSave(this.ciudad,this.arrDatoGeneral);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.ciudad,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Ciudad_util.permiteMantenimiento(this.ciudad) && this.validarGuardar(this.ciudad)) {
				Ciudad_data.save(this.ciudad, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);				
			}

			//Ciudad_logic_add.checkCiudadToSaveAfter(this.ciudad,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.ciudad.getIsDeleted()) {
				this.ciudad=null;
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
			
			//Ciudad_logic_add.checkCiudadToSave(this.ciudad,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Ciudad_logic_add.updateCiudadToSave(this.ciudad,this.arrDatoGeneral);
			
			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.ciudad,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Ciudad_util.permiteMantenimiento(this.ciudad) && this.validarGuardar(this.ciudad)) {			
				Ciudad_data.save(this.ciudad, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.ciudad,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);				
			}
			
			//Ciudad_logic_add.checkCiudadToSaveAfter(this.ciudad,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.ciudad.getIsDeleted()) {
				this.ciudad=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Ciudad_logic_add.checkCiudadToSaves(ciudads,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosCiudad=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Ciudad ciudadLocal:ciudads) {		
				
				if(!Ciudad_util.permiteMantenimiento(ciudadLocal)) {
					continue;
				}
				
				//Ciudad_logic_add.updateCiudadToSave(ciudadLocal,this.arrDatoGeneral);
	        	
				Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),ciudadLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(ciudadLocal)) {
					Ciudad_data.save(ciudadLocal, connexion);				
				} else {
					validadoTodosCiudad=false;
				}
			}
			
			if(!validadoTodosCiudad) {
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
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}
			
			//Ciudad_logic_add.checkCiudadToSavesAfter(ciudads,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Ciudad_logic_add.checkCiudadToSaves(ciudads,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosCiudad=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Ciudad ciudadLocal:ciudads) {				
				if(!Ciudad_util.permiteMantenimiento(ciudadLocal)) {
					continue;
				}
				
				//Ciudad_logic_add.updateCiudadToSave(ciudadLocal,this.arrDatoGeneral);
	        	
				Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),ciudadLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(ciudadLocal)) {				
					Ciudad_data.save(ciudadLocal, connexion);				
				} else {
					validadoTodosCiudad=false;
				}
			}
			
			if(!validadoTodosCiudad) {
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
				
				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}

			//Ciudad_logic_add.checkCiudadToSavesAfter(ciudads,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Ciudad_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Ciudad> ciudads,Ciudad_param_return ciudadParameterGeneral)throws Exception {
		 try {	
			Ciudad_param_return ciudadReturnGeneral=new Ciudad_param_return();
	
			
			return ciudadReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Ciudad_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Ciudad> ciudads,Ciudad_param_return ciudadParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Ciudad_param_return ciudadReturnGeneral=new Ciudad_param_return();
	
			
			this.connexion.commit();
			
			return ciudadReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Ciudad_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Ciudad> ciudads,Ciudad ciudad,Ciudad_param_return ciudadParameterGeneral,Boolean isEsNuevoCiudad,ArrayList<Classe> clases)throws Exception {
		 try {	
			Ciudad_param_return ciudadReturnGeneral=new Ciudad_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				ciudadReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return ciudadReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Ciudad_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Ciudad> ciudads,Ciudad ciudad,Ciudad_param_return ciudadParameterGeneral,Boolean isEsNuevoCiudad,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Ciudad_param_return ciudadReturnGeneral=new Ciudad_param_return();
	
			ciudadReturnGeneral.setCiudad(ciudad);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				ciudadReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return ciudadReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Ciudad_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Ciudad_param_return ciudadParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Ciudad_param_return ciudadReturnGeneral=new Ciudad_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.ciudads=new ArrayList<Ciudad>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.ciudad=new Ciudad();
				
				
				if(conColumnasBase) {this.ciudad.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.ciudad.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.ciudad.setcodigo(arrColumnas[iColumn++]);
			this.ciudad.setnombre(arrColumnas[iColumn++]);
				
				this.ciudads.add(this.ciudad);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			ciudadReturnGeneral.setConRetornoEstaProcesado(true);
			ciudadReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return ciudadReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Ciudad> ciudadsAux= new ArrayList<Ciudad>();
		
		for(Ciudad ciudad:ciudads) {
			if(!ciudad.getIsDeleted()) {
				ciudadsAux.add(ciudad);
			}
		}
		
		ciudads=ciudadsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Ciudad> ciudadsAux= new ArrayList<Ciudad>();
		
		for(Ciudad ciudad : this.ciudads) {
			if(ciudad==null) {
				ciudadsAux.add(ciudad);
			}
		}
		
		//this.ciudads=ciudadsAux;
		
		this.ciudads.removeAll(ciudadsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(ciudad.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((ciudad.getIsDeleted() || (ciudad.getIsChanged()&&!ciudad.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=ciudadDataAccess.getSetVersionRow(connexion,ciudad.getId());
				
				if(!ciudad.getVersionRow().equals(timestamp)) {	
					ciudad.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				ciudad.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(ciudad.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((ciudad.getIsDeleted() || (ciudad.getIsChanged()&&!ciudad.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=ciudadDataAccess.getSetVersionRow(connexion,ciudad.getId());
			
			try {							
				if(!ciudad.getVersionRow().equals(timestamp)) {	
					ciudad.setVersionRow(timestamp);
				}
				
				ciudad.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(ciudads!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Ciudad ciudadAux:ciudads) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(ciudadAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(ciudadAux.getIsDeleted() || (ciudadAux.getIsChanged()&&!ciudadAux.getIsNew())) {
						
						timestamp=ciudadDataAccess.getSetVersionRow(connexion,ciudadAux.getId());
						
						if(!ciudad.getVersionRow().equals(timestamp)) {	
							ciudadAux.setVersionRow(timestamp);
						}
								
						ciudadAux.setIsChangedAuxiliar(false);														
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
		if(ciudads!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Ciudad ciudadAux:ciudads) {
					if(ciudadAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(ciudadAux.getIsDeleted() || (ciudadAux.getIsChanged()&&!ciudadAux.getIsNew())) {
						
						timestamp=ciudadDataAccess.getSetVersionRow(connexion,ciudadAux.getId());
						
						if(!ciudadAux.getVersionRow().equals(timestamp)) {	
							ciudadAux.setVersionRow(timestamp);
						}
						
													
						ciudadAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Ciudad_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalProvincia) throws Exception {
		Ciudad_param_return  ciudad_return =new Ciudad_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-cargarCombosLoteForeignKeyCiudadWithConnection");
			
			this.connexion.begin();
			
			ciudad_return =new Ciudad_param_return();
			
			

			List<Provincia> provinciasForeignKey=new ArrayList<Provincia>();
			Provincia_logic provinciaLogic=new Provincia_logic();
			provinciaLogic.setConnexion(this.connexion);
			provinciaLogic.getProvinciaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				provinciaLogic.getTodos(finalQueryGlobalProvincia,new Pagination());
				provinciasForeignKey=provinciaLogic.getProvincias();
			}

			ciudad_return.setprovinciasFK(provinciasForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return ciudad_return;
	}
	
	public Ciudad_param_return cargarCombosLoteFK(String finalQueryGlobalProvincia) throws Exception {
		Ciudad_param_return  ciudad_return =new Ciudad_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			ciudad_return =new Ciudad_param_return();
			
			

			List<Provincia> provinciasForeignKey=new ArrayList<Provincia>();
			Provincia_logic provinciaLogic=new Provincia_logic();
			provinciaLogic.setConnexion(this.connexion);
			provinciaLogic.getProvinciaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				provinciaLogic.getTodos(finalQueryGlobalProvincia,new Pagination());
				provinciasForeignKey=provinciaLogic.getProvincias();
			}

			ciudad_return.setprovinciasFK(provinciasForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return ciudad_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			DatoGeneralUsuario_logic datogeneralusuarioLogic=new DatoGeneralUsuario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyCiudadWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(DatoGeneralUsuario.class));
											
			

			datogeneralusuarioLogic.setConnexion(this.getConnexion());
			datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Ciudad ciudad:this.ciudads) {
				

				classes=new ArrayList<Classe>();
				classes=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				datogeneralusuarioLogic.setDatoGeneralUsuarios(ciudad.datogeneralusuarios);
				datogeneralusuarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Ciudad ciudad,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Ciudad_logic_add.updateCiudadToGet(ciudad,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
		ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));

				if(this.isConDeep) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(this.connexion);
					datogeneralusuarioLogic.setDatoGeneralUsuarios(ciudad.getDatoGeneralUsuarios());
					ArrayList<Classe> classesLocal=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					datogeneralusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarioLogic.getDatoGeneralUsuarios());
					ciudad.setDatoGeneralUsuarios(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
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
			ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
		Provincia_logic provinciaLogic= new Provincia_logic(connexion);
		provinciaLogic.deepLoad(ciudad.getProvincia(),isDeep,deepLoadType,clases);
				

		ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));

		for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
				Provincia_logic provinciaLogic= new Provincia_logic(connexion);
				provinciaLogic.deepLoad(ciudad.getProvincia(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));

				for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
					datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			ciudad.setProvincia(ciudadDataAccess.getProvincia(connexion,ciudad));
			Provincia_logic provinciaLogic= new Provincia_logic(connexion);
			provinciaLogic.deepLoad(ciudad.getProvincia(),isDeep,deepLoadType,clases);
				
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
			ciudad.setDatoGeneralUsuarios(ciudadDataAccess.getDatoGeneralUsuarios(connexion,ciudad));

			for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
				DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
				datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Ciudad ciudad,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Ciudad_logic_add.updateCiudadToSave(ciudad,this.arrDatoGeneral);
			
Ciudad_data.save(ciudad, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Provincia_data.save(ciudad.getProvincia(),connexion);

		for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
			datogeneralusuario.setid_ciudad(ciudad.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				Provincia_data.save(ciudad.getProvincia(),connexion);
				continue;
			}


			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
					datogeneralusuario.setid_ciudad(ciudad.getId());
					DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Provincia_data.save(ciudad.getProvincia(),connexion);
		Provincia_logic provinciaLogic= new Provincia_logic(connexion);
		provinciaLogic.deepLoad(ciudad.getProvincia(),isDeep,deepLoadType,clases);
				

		for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuario.setid_ciudad(ciudad.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
			datogeneralusuarioLogic.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				Provincia_data.save(ciudad.getProvincia(),connexion);
				Provincia_logic provinciaLogic= new Provincia_logic(connexion);
				provinciaLogic.deepSave(ciudad.getProvincia(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:ciudad.getDatoGeneralUsuarios()) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
					datogeneralusuario.setid_ciudad(ciudad.getId());
					DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
					datogeneralusuarioLogic.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Ciudad.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(ciudad,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Ciudad_util.refrescarFKsDescripciones(ciudad);
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
			this.deepLoad(this.ciudad,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Ciudad_util.refrescarFKsDescripciones(this.ciudad);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Ciudad.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(ciudads!=null) {
				for(Ciudad ciudad:ciudads) {
					this.deepLoad(ciudad,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Ciudad_util.refrescarFKsDescripciones(ciudads);
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
			if(ciudads!=null) {
				for(Ciudad ciudad:ciudads) {
					this.deepLoad(ciudad,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Ciudad_util.refrescarFKsDescripciones(ciudads);
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
			this.getNewConnexionToDeep(Ciudad.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(ciudad,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Ciudad.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(ciudads!=null) {
				for(Ciudad ciudad:ciudads) {
					this.deepSave(ciudad,isDeep,deepLoadType,clases);
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
			if(ciudads!=null) {
				for(Ciudad ciudad:ciudads) {
					this.deepSave(ciudad,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorCodigoWithConnection(String sFinalQuery,Pagination pagination,String codigo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Ciudad_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorCodigo(String sFinalQuery,Pagination pagination,String codigo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Ciudad_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorNombreWithConnection(String sFinalQuery,Pagination pagination,String nombre)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Ciudad_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Ciudad_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdProvinciaWithConnection(String sFinalQuery,Pagination pagination,Long id_provincia)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Ciudad.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidProvincia= new ParameterSelectionGeneral();
			parameterSelectionGeneralidProvincia.setParameterSelectionGeneralEqual(ParameterType.LONG,id_provincia,Ciudad_util.IDPROVINCIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidProvincia);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdProvincia","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdProvincia(String sFinalQuery,Pagination pagination,Long id_provincia)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidProvincia= new ParameterSelectionGeneral();
			parameterSelectionGeneralidProvincia.setParameterSelectionGeneralEqual(ParameterType.LONG,id_provincia,Ciudad_util.IDPROVINCIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidProvincia);

			Ciudad_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdProvincia","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			ciudads=ciudadDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Ciudad_util.refrescarFKsDescripciones(this.ciudads);
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
			if(Ciudad_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,CiudadDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Ciudad ciudad,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Ciudad_util.IS_CON_AUDITORIA) {
				if(ciudad.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CiudadDataAccess.TABLENAME, ciudad.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Ciudad_util.IS_CON_AUDITORIA_DETALLE) {
						////Ciudad_logic.registrarAuditoriaDetalles(connexion,ciudad,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(ciudad.getIsDeleted()) {
					/*if(!ciudad.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,CiudadDataAccess.TABLENAME, ciudad.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Ciudad_logic.registrarAuditoriaDetalles(connexion,ciudad,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CiudadDataAccess.TABLENAME, ciudad.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(ciudad.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,CiudadDataAccess.TABLENAME, ciudad.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Ciudad_util.IS_CON_AUDITORIA_DETALLE) {
						////Ciudad_logic.registrarAuditoriaDetalles(connexion,ciudad,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Ciudad ciudad)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(ciudad.getIsNew()||!ciudad.getid_provincia().equals(ciudad.getCiudadOriginal().getid_provincia()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(ciudad.getCiudadOriginal().getid_provincia()!=null)
				{
					strValorActual=ciudad.getCiudadOriginal().getid_provincia().toString();
				}
				if(ciudad.getid_provincia()!=null)
				{
					strValorNuevo=ciudad.getid_provincia().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CiudadConstantesFunciones.IDPROVINCIA,strValorActual,strValorNuevo);
			}	
			
			if(ciudad.getIsNew()||!ciudad.getcodigo().equals(ciudad.getCiudadOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(ciudad.getCiudadOriginal().getcodigo()!=null)
				{
					strValorActual=ciudad.getCiudadOriginal().getcodigo();
				}
				if(ciudad.getcodigo()!=null)
				{
					strValorNuevo=ciudad.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CiudadConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(ciudad.getIsNew()||!ciudad.getnombre().equals(ciudad.getCiudadOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(ciudad.getCiudadOriginal().getnombre()!=null)
				{
					strValorActual=ciudad.getCiudadOriginal().getnombre();
				}
				if(ciudad.getnombre()!=null)
				{
					strValorNuevo=ciudad.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),CiudadConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Ciudad ciudad,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {

		if(!ciudad.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(ciudad,datogeneralusuarios,true);
		}
	}

	public void saveRelaciones(Ciudad ciudad,List<DatoGeneralUsuario> datogeneralusuarios)throws Exception {

		if(!ciudad.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(ciudad,datogeneralusuarios,false);
		}
	}

	public void saveRelacionesBase(Ciudad ciudad,List<DatoGeneralUsuario> datogeneralusuarios,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Ciudad-saveRelacionesWithConnection");}
	
			ciudad.setDatoGeneralUsuarios(datogeneralusuarios);

			this.setCiudad(ciudad);

			if(true) {

				//Ciudad_logic_add.updateRelacionesToSave(ciudad,this);

				if((ciudad.getIsNew()||ciudad.getIsChanged())&&!ciudad.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(datogeneralusuarios);

				} else if(ciudad.getIsDeleted()) {
					this.saveRelacionesDetalles(datogeneralusuarios);
					this.save();
				}

				//Ciudad_logic_add.updateRelacionesToSaveAfter(ciudad,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			DatoGeneralUsuario_util.InicializarGeneralEntityAuxiliares(datogeneralusuarios,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<DatoGeneralUsuario> datogeneralusuarios)throws Exception {
		try {
	

			Long idCiudadActual=this.getCiudad().getId();

			DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Ciudad=new DatoGeneralUsuario_logic();
			datogeneralusuarioLogic_Desde_Ciudad.setDatoGeneralUsuarios(datogeneralusuarios);

			datogeneralusuarioLogic_Desde_Ciudad.setConnexion(this.getConnexion());
			datogeneralusuarioLogic_Desde_Ciudad.setDatosCliente(this.datosCliente);

			for(DatoGeneralUsuario datogeneralusuario_Desde_Ciudad:datogeneralusuarioLogic_Desde_Ciudad.getDatoGeneralUsuarios()) {
				datogeneralusuario_Desde_Ciudad.setid_ciudad(idCiudadActual);
			}

			datogeneralusuarioLogic_Desde_Ciudad.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Ciudad_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Ciudad_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setCiudad(Ciudad newCiudad) {
		this.ciudad = newCiudad;
	}
	
	public Ciudad_data getCiudadDataAccess() {
		return ciudadDataAccess;
	}
	
	public void setCiudadDataAccess(Ciudad_data newciudadDataAccess) {
		this.ciudadDataAccess = newciudadDataAccess;
	}

	public void setCiudads(List<Ciudad> newCiudads) {
		this.ciudads = newCiudads;
	}
	
	public Object getCiudadObject() {	
		this.ciudadObject=this.ciudadDataAccess.getEntityObject();
		return this.ciudadObject;
	}
		
	public void setCiudadObject(Object newCiudadObject) {
		this.ciudadObject = newCiudadObject;
	}
	
	public List<Object> getCiudadsObject() {		
		this.ciudadsObject=this.ciudadDataAccess.getEntitiesObject();
		return this.ciudadsObject;
	}
		
	public void setCiudadsObject(List<Object> newCiudadsObject) {
		this.ciudadsObject = newCiudadsObject;
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
