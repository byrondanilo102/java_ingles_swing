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
package com.bydan.ingles.seguridad.modulo.business.logic;


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
import com.bydan.ingles.seguridad.modulo.util.*;
import com.bydan.ingles.seguridad.modulo.util.Modulo_util;
import com.bydan.ingles.seguridad.modulo.util.Modulo_param_return;
//import com.bydan.ingles.seguridad.modulo.util.ModuloParameterGeneral;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
//import com.bydan.ingles.seguridad.modulo.business.logic.Modulo_logic_add;
import com.bydan.ingles.seguridad.modulo.business.data.*;
import com.bydan.ingles.seguridad.modulo.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.sistema.business.entity.Sistema;
import com.bydan.ingles.seguridad.sistema.business.data.Sistema_data;
import com.bydan.ingles.seguridad.sistema.business.logic.Sistema_logic;

import com.bydan.ingles.seguridad.paquete.business.entity.Paquete;
import com.bydan.ingles.seguridad.paquete.business.data.Paquete_data;
import com.bydan.ingles.seguridad.paquete.business.logic.Paquete_logic;

import com.bydan.ingles.seguridad.tipoteclamascara.business.entity.TipoTeclaMascara;
import com.bydan.ingles.seguridad.tipoteclamascara.business.data.TipoTeclaMascara_data;
import com.bydan.ingles.seguridad.tipoteclamascara.business.logic.TipoTeclaMascara_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class Modulo_logic  extends GeneralEntityLogic implements Modulo_logicI {
	static Logger logger = Logger.getLogger("Modulo_logic.class");	

	protected Modulo_data moduloDataAccess; 	
	protected Modulo modulo;
	protected List<Modulo> modulos;
	protected Object moduloObject;	
	protected List<Object> modulosObject;
	
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
	
	
	
	
	
	
	public Modulo_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.moduloDataAccess = new Modulo_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Modulo_data.ActualizarQueries();
			
			//this.moduloDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.modulos= new ArrayList<Modulo>();
			this.modulo= new Modulo();
			
			this.moduloObject=new Object();
			this.modulosObject=new ArrayList<Object>();
				
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
			
			this.moduloDataAccess.setConnexionType(this.connexionType);
			this.moduloDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Modulo_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.moduloDataAccess = new Modulo_data();
			this.modulos= new ArrayList<Modulo>();
			this.modulo= new Modulo();
			this.moduloObject=new Object();
			this.modulosObject=new ArrayList<Object>();
			
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
			
			this.moduloDataAccess.setConnexionType(this.connexionType);
			this.moduloDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Modulo getModulo() throws Exception {	
		//Modulo_logic_add.checkModuloToGet(modulo,this.datosCliente,this.arrDatoGeneral);
		//Modulo_logic_add.updateModuloToGet(modulo,this.arrDatoGeneral);
		
		return modulo;
	}
	
	public List<Modulo> getModulos() throws Exception {		
		if(this.modulos==null) {
			this.modulos= new ArrayList<Modulo>();
		}
		
		this.quitarsNulos();
		
		//Modulo_logic_add.checkModuloToGets(modulos,this.datosCliente,this.arrDatoGeneral);
		
		for (Modulo moduloLocal: modulos ) {
			//Modulo_logic_add.updateModuloToGet(moduloLocal,this.arrDatoGeneral);
		}
		
		return modulos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.moduloDataAccess!=null) {
			this.moduloDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			moduloDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			moduloDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		modulo = new  Modulo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			modulo=moduloDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
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
		modulo = new  Modulo();
		  		  
        try {
			
			modulo=moduloDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		modulo = new  Modulo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			modulo=moduloDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
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
		modulo = new  Modulo();
		  		  
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
		modulo = new  Modulo();
		  		  
        try {
			
			modulo=moduloDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		modulo = new  Modulo();
		  		  
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
		modulo = new  Modulo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =moduloDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		modulo = new  Modulo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=moduloDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		modulo = new  Modulo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =moduloDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		modulo = new  Modulo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=moduloDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		modulo = new  Modulo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =moduloDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		modulo = new  Modulo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=moduloDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		modulos = new  ArrayList<Modulo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		  		  
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
		modulos = new  ArrayList<Modulo>();
		  		  
        try {			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		modulos = new  ArrayList<Modulo>();
		  		  
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
		modulos = new  ArrayList<Modulo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		  		  
        try {
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		modulo = new  Modulo();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulo=moduloDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(modulo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
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
		modulo = new  Modulo();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulo=moduloDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(modulo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		modulos = new  ArrayList<Modulo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		  		  
        try {
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		modulos = new  ArrayList<Modulo>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
		modulos = new  ArrayList<Modulo>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(modulos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Modulo modulo) throws Exception {
		Boolean estaValidado=false;
		
		if(modulo.getIsNew() || modulo.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Modulo> Modulos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Modulo moduloLocal:modulos) {				
			estaValidadoObjeto=this.validarGuardar(moduloLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Modulo> Modulos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(modulos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Modulo Modulo) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(modulo)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Modulo modulo) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+modulo.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"modulo","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Modulo_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Modulo_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Modulo_logic_add.checkModuloToSave(this.modulo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Modulo_logic_add.updateModuloToSave(this.modulo,this.arrDatoGeneral);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.modulo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Modulo_util.permiteMantenimiento(this.modulo) && this.validarGuardar(this.modulo)) {
				Modulo_data.save(this.modulo, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Modulo_util.refrescarFKsDescripciones(this.modulo);				
			}

			//Modulo_logic_add.checkModuloToSaveAfter(this.modulo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.modulo.getIsDeleted()) {
				this.modulo=null;
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
			
			//Modulo_logic_add.checkModuloToSave(this.modulo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Modulo_logic_add.updateModuloToSave(this.modulo,this.arrDatoGeneral);
			
			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.modulo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Modulo_util.permiteMantenimiento(this.modulo) && this.validarGuardar(this.modulo)) {			
				Modulo_data.save(this.modulo, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.modulo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Modulo_util.refrescarFKsDescripciones(this.modulo);				
			}
			
			//Modulo_logic_add.checkModuloToSaveAfter(this.modulo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.modulo.getIsDeleted()) {
				this.modulo=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Modulo_logic_add.checkModuloToSaves(modulos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosModulo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Modulo moduloLocal:modulos) {		
				
				if(!Modulo_util.permiteMantenimiento(moduloLocal)) {
					continue;
				}
				
				//Modulo_logic_add.updateModuloToSave(moduloLocal,this.arrDatoGeneral);
	        	
				Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),moduloLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(moduloLocal)) {
					Modulo_data.save(moduloLocal, connexion);				
				} else {
					validadoTodosModulo=false;
				}
			}
			
			if(!validadoTodosModulo) {
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
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}
			
			//Modulo_logic_add.checkModuloToSavesAfter(modulos,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Modulo_logic_add.checkModuloToSaves(modulos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosModulo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Modulo moduloLocal:modulos) {				
				if(!Modulo_util.permiteMantenimiento(moduloLocal)) {
					continue;
				}
				
				//Modulo_logic_add.updateModuloToSave(moduloLocal,this.arrDatoGeneral);
	        	
				Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),moduloLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(moduloLocal)) {				
					Modulo_data.save(moduloLocal, connexion);				
				} else {
					validadoTodosModulo=false;
				}
			}
			
			if(!validadoTodosModulo) {
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
				
				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}

			//Modulo_logic_add.checkModuloToSavesAfter(modulos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Modulo_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Modulo> modulos,Modulo_param_return moduloParameterGeneral)throws Exception {
		 try {	
			Modulo_param_return moduloReturnGeneral=new Modulo_param_return();
	
			
			return moduloReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Modulo_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Modulo> modulos,Modulo_param_return moduloParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Modulo_param_return moduloReturnGeneral=new Modulo_param_return();
	
			
			this.connexion.commit();
			
			return moduloReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Modulo_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Modulo> modulos,Modulo modulo,Modulo_param_return moduloParameterGeneral,Boolean isEsNuevoModulo,ArrayList<Classe> clases)throws Exception {
		 try {	
			Modulo_param_return moduloReturnGeneral=new Modulo_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				moduloReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return moduloReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Modulo_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Modulo> modulos,Modulo modulo,Modulo_param_return moduloParameterGeneral,Boolean isEsNuevoModulo,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Modulo_param_return moduloReturnGeneral=new Modulo_param_return();
	
			moduloReturnGeneral.setModulo(modulo);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				moduloReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return moduloReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Modulo_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Modulo_param_return moduloParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Modulo_param_return moduloReturnGeneral=new Modulo_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.modulos=new ArrayList<Modulo>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.modulo=new Modulo();
				
				
				if(conColumnasBase) {this.modulo.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.modulo.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.modulo.setcodigo(arrColumnas[iColumn++]);
				this.modulo.setnombre(arrColumnas[iColumn++]);
				this.modulo.settecla(arrColumnas[iColumn++]);
				this.modulo.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.modulo.setorden(Integer.parseInt(arrColumnas[iColumn++]));
			this.modulo.setdescripcion(arrColumnas[iColumn++]);
				
				this.modulos.add(this.modulo);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			moduloReturnGeneral.setConRetornoEstaProcesado(true);
			moduloReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return moduloReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Modulo> modulosAux= new ArrayList<Modulo>();
		
		for(Modulo modulo:modulos) {
			if(!modulo.getIsDeleted()) {
				modulosAux.add(modulo);
			}
		}
		
		modulos=modulosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Modulo> modulosAux= new ArrayList<Modulo>();
		
		for(Modulo modulo : this.modulos) {
			if(modulo==null) {
				modulosAux.add(modulo);
			}
		}
		
		//this.modulos=modulosAux;
		
		this.modulos.removeAll(modulosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(modulo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((modulo.getIsDeleted() || (modulo.getIsChanged()&&!modulo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=moduloDataAccess.getSetVersionRow(connexion,modulo.getId());
				
				if(!modulo.getVersionRow().equals(timestamp)) {	
					modulo.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				modulo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(modulo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((modulo.getIsDeleted() || (modulo.getIsChanged()&&!modulo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=moduloDataAccess.getSetVersionRow(connexion,modulo.getId());
			
			try {							
				if(!modulo.getVersionRow().equals(timestamp)) {	
					modulo.setVersionRow(timestamp);
				}
				
				modulo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(modulos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Modulo moduloAux:modulos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(moduloAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(moduloAux.getIsDeleted() || (moduloAux.getIsChanged()&&!moduloAux.getIsNew())) {
						
						timestamp=moduloDataAccess.getSetVersionRow(connexion,moduloAux.getId());
						
						if(!modulo.getVersionRow().equals(timestamp)) {	
							moduloAux.setVersionRow(timestamp);
						}
								
						moduloAux.setIsChangedAuxiliar(false);														
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
		if(modulos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Modulo moduloAux:modulos) {
					if(moduloAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(moduloAux.getIsDeleted() || (moduloAux.getIsChanged()&&!moduloAux.getIsNew())) {
						
						timestamp=moduloDataAccess.getSetVersionRow(connexion,moduloAux.getId());
						
						if(!moduloAux.getVersionRow().equals(timestamp)) {	
							moduloAux.setVersionRow(timestamp);
						}
						
													
						moduloAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Modulo_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalSistema,String finalQueryGlobalPaquete,String finalQueryGlobalTipoTeclaMascara) throws Exception {
		Modulo_param_return  modulo_return =new Modulo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-cargarCombosLoteForeignKeyModuloWithConnection");
			
			this.connexion.begin();
			
			modulo_return =new Modulo_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			modulo_return.setsistemasFK(sistemasForeignKey);


			List<Paquete> paquetesForeignKey=new ArrayList<Paquete>();
			Paquete_logic paqueteLogic=new Paquete_logic();
			paqueteLogic.setConnexion(this.connexion);
			paqueteLogic.getPaqueteDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPaquete.equals("NONE")) {
				paqueteLogic.getTodos(finalQueryGlobalPaquete,new Pagination());
				paquetesForeignKey=paqueteLogic.getPaquetes();
			}

			modulo_return.setpaquetesFK(paquetesForeignKey);


			List<TipoTeclaMascara> tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();
			TipoTeclaMascara_logic tipoteclamascaraLogic=new TipoTeclaMascara_logic();
			tipoteclamascaraLogic.setConnexion(this.connexion);
			tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoTeclaMascara.equals("NONE")) {
				tipoteclamascaraLogic.getTodos(finalQueryGlobalTipoTeclaMascara,new Pagination());
				tipoteclamascarasForeignKey=tipoteclamascaraLogic.getTipoTeclaMascaras();
			}

			modulo_return.settipoteclamascarasFK(tipoteclamascarasForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return modulo_return;
	}
	
	public Modulo_param_return cargarCombosLoteFK(String finalQueryGlobalSistema,String finalQueryGlobalPaquete,String finalQueryGlobalTipoTeclaMascara) throws Exception {
		Modulo_param_return  modulo_return =new Modulo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			modulo_return =new Modulo_param_return();
			
			

			List<Sistema> sistemasForeignKey=new ArrayList<Sistema>();
			Sistema_logic sistemaLogic=new Sistema_logic();
			sistemaLogic.setConnexion(this.connexion);
			sistemaLogic.getSistemaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSistema.equals("NONE")) {
				sistemaLogic.getTodos(finalQueryGlobalSistema,new Pagination());
				sistemasForeignKey=sistemaLogic.getSistemas();
			}

			modulo_return.setsistemasFK(sistemasForeignKey);


			List<Paquete> paquetesForeignKey=new ArrayList<Paquete>();
			Paquete_logic paqueteLogic=new Paquete_logic();
			paqueteLogic.setConnexion(this.connexion);
			paqueteLogic.getPaqueteDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPaquete.equals("NONE")) {
				paqueteLogic.getTodos(finalQueryGlobalPaquete,new Pagination());
				paquetesForeignKey=paqueteLogic.getPaquetes();
			}

			modulo_return.setpaquetesFK(paquetesForeignKey);


			List<TipoTeclaMascara> tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();
			TipoTeclaMascara_logic tipoteclamascaraLogic=new TipoTeclaMascara_logic();
			tipoteclamascaraLogic.setConnexion(this.connexion);
			tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoTeclaMascara.equals("NONE")) {
				tipoteclamascaraLogic.getTodos(finalQueryGlobalTipoTeclaMascara,new Pagination());
				tipoteclamascarasForeignKey=tipoteclamascaraLogic.getTipoTeclaMascaras();
			}

			modulo_return.settipoteclamascarasFK(tipoteclamascarasForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return modulo_return;
	}
	
	
	public void deepLoad(Modulo modulo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Modulo_logic_add.updateModuloToGet(modulo,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
		modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
		modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
				continue;
			}

			if(clas.clas.equals(Paquete.class)) {
				modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
				continue;
			}

			if(clas.clas.equals(TipoTeclaMascara.class)) {
				modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
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
			modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Paquete.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoTeclaMascara.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(modulo.getSistema(),isDeep,deepLoadType,clases);
				
		modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
		Paquete_logic paqueteLogic= new Paquete_logic(connexion);
		paqueteLogic.deepLoad(modulo.getPaquete(),isDeep,deepLoadType,clases);
				
		modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
		TipoTeclaMascara_logic tipoteclamascaraLogic= new TipoTeclaMascara_logic(connexion);
		tipoteclamascaraLogic.deepLoad(modulo.getTipoTeclaMascara(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepLoad(modulo.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Paquete.class)) {
				modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
				Paquete_logic paqueteLogic= new Paquete_logic(connexion);
				paqueteLogic.deepLoad(modulo.getPaquete(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoTeclaMascara.class)) {
				modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
				TipoTeclaMascara_logic tipoteclamascaraLogic= new TipoTeclaMascara_logic(connexion);
				tipoteclamascaraLogic.deepLoad(modulo.getTipoTeclaMascara(),isDeep,deepLoadType,clases);				
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
			modulo.setSistema(moduloDataAccess.getSistema(connexion,modulo));
			Sistema_logic sistemaLogic= new Sistema_logic(connexion);
			sistemaLogic.deepLoad(modulo.getSistema(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Paquete.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			modulo.setPaquete(moduloDataAccess.getPaquete(connexion,modulo));
			Paquete_logic paqueteLogic= new Paquete_logic(connexion);
			paqueteLogic.deepLoad(modulo.getPaquete(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoTeclaMascara.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			modulo.setTipoTeclaMascara(moduloDataAccess.getTipoTeclaMascara(connexion,modulo));
			TipoTeclaMascara_logic tipoteclamascaraLogic= new TipoTeclaMascara_logic(connexion);
			tipoteclamascaraLogic.deepLoad(modulo.getTipoTeclaMascara(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Modulo modulo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Modulo_logic_add.updateModuloToSave(modulo,this.arrDatoGeneral);
			
Modulo_data.save(modulo, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(modulo.getSistema(),connexion);

		Paquete_data.save(modulo.getPaquete(),connexion);

		TipoTeclaMascara_data.save(modulo.getTipoTeclaMascara(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(modulo.getSistema(),connexion);
				continue;
			}

			if(clas.clas.equals(Paquete.class)) {
				Paquete_data.save(modulo.getPaquete(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoTeclaMascara.class)) {
				TipoTeclaMascara_data.save(modulo.getTipoTeclaMascara(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Sistema_data.save(modulo.getSistema(),connexion);
		Sistema_logic sistemaLogic= new Sistema_logic(connexion);
		sistemaLogic.deepLoad(modulo.getSistema(),isDeep,deepLoadType,clases);
				

		Paquete_data.save(modulo.getPaquete(),connexion);
		Paquete_logic paqueteLogic= new Paquete_logic(connexion);
		paqueteLogic.deepLoad(modulo.getPaquete(),isDeep,deepLoadType,clases);
				

		TipoTeclaMascara_data.save(modulo.getTipoTeclaMascara(),connexion);
		TipoTeclaMascara_logic tipoteclamascaraLogic= new TipoTeclaMascara_logic(connexion);
		tipoteclamascaraLogic.deepLoad(modulo.getTipoTeclaMascara(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Sistema.class)) {
				Sistema_data.save(modulo.getSistema(),connexion);
				Sistema_logic sistemaLogic= new Sistema_logic(connexion);
				sistemaLogic.deepSave(modulo.getSistema(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Paquete.class)) {
				Paquete_data.save(modulo.getPaquete(),connexion);
				Paquete_logic paqueteLogic= new Paquete_logic(connexion);
				paqueteLogic.deepSave(modulo.getPaquete(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoTeclaMascara.class)) {
				TipoTeclaMascara_data.save(modulo.getTipoTeclaMascara(),connexion);
				TipoTeclaMascara_logic tipoteclamascaraLogic= new TipoTeclaMascara_logic(connexion);
				tipoteclamascaraLogic.deepSave(modulo.getTipoTeclaMascara(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(Modulo.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(modulo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Modulo_util.refrescarFKsDescripciones(modulo);
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
			this.deepLoad(this.modulo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Modulo_util.refrescarFKsDescripciones(this.modulo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Modulo.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(modulos!=null) {
				for(Modulo modulo:modulos) {
					this.deepLoad(modulo,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Modulo_util.refrescarFKsDescripciones(modulos);
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
			if(modulos!=null) {
				for(Modulo modulo:modulos) {
					this.deepLoad(modulo,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Modulo_util.refrescarFKsDescripciones(modulos);
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
			this.getNewConnexionToDeep(Modulo.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(modulo,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Modulo.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(modulos!=null) {
				for(Modulo modulo:modulos) {
					this.deepSave(modulo,isDeep,deepLoadType,clases);
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
			if(modulos!=null) {
				for(Modulo modulo:modulos) {
					this.deepSave(modulo,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdPaqueteWithConnection(String sFinalQuery,Pagination pagination,Long id_paquete)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPaquete= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPaquete.setParameterSelectionGeneralEqual(ParameterType.LONG,id_paquete,Modulo_util.IDPAQUETE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPaquete);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPaquete","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdPaquete(String sFinalQuery,Pagination pagination,Long id_paquete)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPaquete= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPaquete.setParameterSelectionGeneralEqual(ParameterType.LONG,id_paquete,Modulo_util.IDPAQUETE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPaquete);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPaquete","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSistema= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Modulo_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
			parameterSelectionGeneralidSistema.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sistema,Modulo_util.IDSISTEMA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSistema);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSistema","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdTipoTeclaMascaraWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_tecla_mascara)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Modulo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoTeclaMascara= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoTeclaMascara.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_tecla_mascara,Modulo_util.IDTIPOTECLAMASCARA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoTeclaMascara);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoTeclaMascara","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoTeclaMascara(String sFinalQuery,Pagination pagination,Long id_tipo_tecla_mascara)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoTeclaMascara= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoTeclaMascara.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_tecla_mascara,Modulo_util.IDTIPOTECLAMASCARA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoTeclaMascara);

			Modulo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoTeclaMascara","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			modulos=moduloDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Modulo_util.refrescarFKsDescripciones(this.modulos);
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
			if(Modulo_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ModuloDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Modulo modulo,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Modulo_util.IS_CON_AUDITORIA) {
				if(modulo.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ModuloDataAccess.TABLENAME, modulo.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Modulo_util.IS_CON_AUDITORIA_DETALLE) {
						////Modulo_logic.registrarAuditoriaDetalles(connexion,modulo,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(modulo.getIsDeleted()) {
					/*if(!modulo.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ModuloDataAccess.TABLENAME, modulo.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Modulo_logic.registrarAuditoriaDetalles(connexion,modulo,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ModuloDataAccess.TABLENAME, modulo.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(modulo.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ModuloDataAccess.TABLENAME, modulo.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Modulo_util.IS_CON_AUDITORIA_DETALLE) {
						////Modulo_logic.registrarAuditoriaDetalles(connexion,modulo,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Modulo modulo)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(modulo.getIsNew()||!modulo.getid_sistema().equals(modulo.getModuloOriginal().getid_sistema()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getid_sistema()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getid_sistema().toString();
				}
				if(modulo.getid_sistema()!=null)
				{
					strValorNuevo=modulo.getid_sistema().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.IDSISTEMA,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getid_paquete().equals(modulo.getModuloOriginal().getid_paquete()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getid_paquete()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getid_paquete().toString();
				}
				if(modulo.getid_paquete()!=null)
				{
					strValorNuevo=modulo.getid_paquete().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.IDPAQUETE,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getcodigo().equals(modulo.getModuloOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getcodigo()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getcodigo();
				}
				if(modulo.getcodigo()!=null)
				{
					strValorNuevo=modulo.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getnombre().equals(modulo.getModuloOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getnombre()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getnombre();
				}
				if(modulo.getnombre()!=null)
				{
					strValorNuevo=modulo.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getid_tipo_tecla_mascara().equals(modulo.getModuloOriginal().getid_tipo_tecla_mascara()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getid_tipo_tecla_mascara()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getid_tipo_tecla_mascara().toString();
				}
				if(modulo.getid_tipo_tecla_mascara()!=null)
				{
					strValorNuevo=modulo.getid_tipo_tecla_mascara().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.IDTIPOTECLAMASCARA,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.gettecla().equals(modulo.getModuloOriginal().gettecla()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().gettecla()!=null)
				{
					strValorActual=modulo.getModuloOriginal().gettecla();
				}
				if(modulo.gettecla()!=null)
				{
					strValorNuevo=modulo.gettecla() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.TECLA,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getestado().equals(modulo.getModuloOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getestado()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getestado().toString();
				}
				if(modulo.getestado()!=null)
				{
					strValorNuevo=modulo.getestado().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getorden().equals(modulo.getModuloOriginal().getorden()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getorden()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getorden().toString();
				}
				if(modulo.getorden()!=null)
				{
					strValorNuevo=modulo.getorden().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.ORDEN,strValorActual,strValorNuevo);
			}	
			
			if(modulo.getIsNew()||!modulo.getdescripcion().equals(modulo.getModuloOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(modulo.getModuloOriginal().getdescripcion()!=null)
				{
					strValorActual=modulo.getModuloOriginal().getdescripcion();
				}
				if(modulo.getdescripcion()!=null)
				{
					strValorNuevo=modulo.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ModuloConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Modulo modulo) throws Exception {

		if(!modulo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(modulo,true);
		}
	}

	public void saveRelaciones(Modulo modulo)throws Exception {

		if(!modulo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(modulo,false);
		}
	}

	public void saveRelacionesBase(Modulo modulo,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Modulo-saveRelacionesWithConnection");}
	

			this.setModulo(modulo);

				if((modulo.getIsNew()||modulo.getIsChanged())&&!modulo.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(modulo.getIsDeleted()) {
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
			ArrayList<Classe> classes=Modulo_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Modulo_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setModulo(Modulo newModulo) {
		this.modulo = newModulo;
	}
	
	public Modulo_data getModuloDataAccess() {
		return moduloDataAccess;
	}
	
	public void setModuloDataAccess(Modulo_data newmoduloDataAccess) {
		this.moduloDataAccess = newmoduloDataAccess;
	}

	public void setModulos(List<Modulo> newModulos) {
		this.modulos = newModulos;
	}
	
	public Object getModuloObject() {	
		this.moduloObject=this.moduloDataAccess.getEntityObject();
		return this.moduloObject;
	}
		
	public void setModuloObject(Object newModuloObject) {
		this.moduloObject = newModuloObject;
	}
	
	public List<Object> getModulosObject() {		
		this.modulosObject=this.moduloDataAccess.getEntitiesObject();
		return this.modulosObject;
	}
		
	public void setModulosObject(List<Object> newModulosObject) {
		this.modulosObject = newModulosObject;
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
