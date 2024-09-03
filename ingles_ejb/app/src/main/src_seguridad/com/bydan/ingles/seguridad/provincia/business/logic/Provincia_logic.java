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
package com.bydan.ingles.seguridad.provincia.business.logic;


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
import com.bydan.ingles.seguridad.provincia.util.*;
import com.bydan.ingles.seguridad.provincia.util.Provincia_util;
import com.bydan.ingles.seguridad.provincia.util.Provincia_param_return;
//import com.bydan.ingles.seguridad.provincia.util.ProvinciaParameterGeneral;
import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
//import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic_add;
import com.bydan.ingles.seguridad.provincia.business.data.*;
import com.bydan.ingles.seguridad.provincia.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.data.Pais_data;
import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;

//REL


import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.data.Ciudad_data;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;
import com.bydan.ingles.seguridad.ciudad.util.Ciudad_util;

import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.DatoGeneralUsuario_data;
import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Provincia_logic  extends GeneralEntityLogic implements Provincia_logicI {
	static Logger logger = Logger.getLogger("Provincia_logic.class");	

	protected Provincia_data provinciaDataAccess; 	
	protected Provincia provincia;
	protected List<Provincia> provincias;
	protected Object provinciaObject;	
	protected List<Object> provinciasObject;
	
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
	
	
	
	
	
	
	public Provincia_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.provinciaDataAccess = new Provincia_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Provincia_data.ActualizarQueries();
			
			//this.provinciaDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.provincias= new ArrayList<Provincia>();
			this.provincia= new Provincia();
			
			this.provinciaObject=new Object();
			this.provinciasObject=new ArrayList<Object>();
				
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
			
			this.provinciaDataAccess.setConnexionType(this.connexionType);
			this.provinciaDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Provincia_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.provinciaDataAccess = new Provincia_data();
			this.provincias= new ArrayList<Provincia>();
			this.provincia= new Provincia();
			this.provinciaObject=new Object();
			this.provinciasObject=new ArrayList<Object>();
			
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
			
			this.provinciaDataAccess.setConnexionType(this.connexionType);
			this.provinciaDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Provincia getProvincia() throws Exception {	
		//Provincia_logic_add.checkProvinciaToGet(provincia,this.datosCliente,this.arrDatoGeneral);
		//Provincia_logic_add.updateProvinciaToGet(provincia,this.arrDatoGeneral);
		
		return provincia;
	}
	
	public List<Provincia> getProvincias() throws Exception {		
		if(this.provincias==null) {
			this.provincias= new ArrayList<Provincia>();
		}
		
		this.quitarsNulos();
		
		//Provincia_logic_add.checkProvinciaToGets(provincias,this.datosCliente,this.arrDatoGeneral);
		
		for (Provincia provinciaLocal: provincias ) {
			//Provincia_logic_add.updateProvinciaToGet(provinciaLocal,this.arrDatoGeneral);
		}
		
		return provincias;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.provinciaDataAccess!=null) {
			this.provinciaDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			provinciaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			provinciaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		provincia = new  Provincia();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			provincia=provinciaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
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
		provincia = new  Provincia();
		  		  
        try {
			
			provincia=provinciaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		provincia = new  Provincia();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			provincia=provinciaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
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
		provincia = new  Provincia();
		  		  
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
		provincia = new  Provincia();
		  		  
        try {
			
			provincia=provinciaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		provincia = new  Provincia();
		  		  
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
		provincia = new  Provincia();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =provinciaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		provincia = new  Provincia();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=provinciaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		provincia = new  Provincia();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =provinciaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		provincia = new  Provincia();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=provinciaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		provincia = new  Provincia();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =provinciaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		provincia = new  Provincia();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=provinciaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		provincias = new  ArrayList<Provincia>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		  		  
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
		provincias = new  ArrayList<Provincia>();
		  		  
        try {			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		provincias = new  ArrayList<Provincia>();
		  		  
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
		provincias = new  ArrayList<Provincia>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		  		  
        try {
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		provincia = new  Provincia();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincia=provinciaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(provincia);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
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
		provincia = new  Provincia();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincia=provinciaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(provincia);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincia);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		provincias = new  ArrayList<Provincia>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		  		  
        try {
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		provincias = new  ArrayList<Provincia>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
		provincias = new  ArrayList<Provincia>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			provincias=provinciaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(provincias);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Provincia provincia) throws Exception {
		Boolean estaValidado=false;
		
		if(provincia.getIsNew() || provincia.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Provincia> Provincias) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Provincia provinciaLocal:provincias) {				
			estaValidadoObjeto=this.validarGuardar(provinciaLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Provincia> Provincias) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(provincias)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Provincia Provincia) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(provincia)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Provincia provincia) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+provincia.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"provincia","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Provincia_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Provincia_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Provincia_logic_add.checkProvinciaToSave(this.provincia,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Provincia_logic_add.updateProvinciaToSave(this.provincia,this.arrDatoGeneral);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.provincia,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Provincia_util.permiteMantenimiento(this.provincia) && this.validarGuardar(this.provincia)) {
				Provincia_data.save(this.provincia, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Provincia_util.refrescarFKsDescripciones(this.provincia);				
			}

			//Provincia_logic_add.checkProvinciaToSaveAfter(this.provincia,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.provincia.getIsDeleted()) {
				this.provincia=null;
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
			
			//Provincia_logic_add.checkProvinciaToSave(this.provincia,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Provincia_logic_add.updateProvinciaToSave(this.provincia,this.arrDatoGeneral);
			
			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.provincia,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Provincia_util.permiteMantenimiento(this.provincia) && this.validarGuardar(this.provincia)) {			
				Provincia_data.save(this.provincia, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.provincia,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Provincia_util.refrescarFKsDescripciones(this.provincia);				
			}
			
			//Provincia_logic_add.checkProvinciaToSaveAfter(this.provincia,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.provincia.getIsDeleted()) {
				this.provincia=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Provincia_logic_add.checkProvinciaToSaves(provincias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosProvincia=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Provincia provinciaLocal:provincias) {		
				
				if(!Provincia_util.permiteMantenimiento(provinciaLocal)) {
					continue;
				}
				
				//Provincia_logic_add.updateProvinciaToSave(provinciaLocal,this.arrDatoGeneral);
	        	
				Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),provinciaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(provinciaLocal)) {
					Provincia_data.save(provinciaLocal, connexion);				
				} else {
					validadoTodosProvincia=false;
				}
			}
			
			if(!validadoTodosProvincia) {
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
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}
			
			//Provincia_logic_add.checkProvinciaToSavesAfter(provincias,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Provincia_logic_add.checkProvinciaToSaves(provincias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosProvincia=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Provincia provinciaLocal:provincias) {				
				if(!Provincia_util.permiteMantenimiento(provinciaLocal)) {
					continue;
				}
				
				//Provincia_logic_add.updateProvinciaToSave(provinciaLocal,this.arrDatoGeneral);
	        	
				Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),provinciaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(provinciaLocal)) {				
					Provincia_data.save(provinciaLocal, connexion);				
				} else {
					validadoTodosProvincia=false;
				}
			}
			
			if(!validadoTodosProvincia) {
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
				
				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}

			//Provincia_logic_add.checkProvinciaToSavesAfter(provincias,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Provincia_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Provincia> provincias,Provincia_param_return provinciaParameterGeneral)throws Exception {
		 try {	
			Provincia_param_return provinciaReturnGeneral=new Provincia_param_return();
	
			
			return provinciaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Provincia_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Provincia> provincias,Provincia_param_return provinciaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Provincia_param_return provinciaReturnGeneral=new Provincia_param_return();
	
			
			this.connexion.commit();
			
			return provinciaReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Provincia_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Provincia> provincias,Provincia provincia,Provincia_param_return provinciaParameterGeneral,Boolean isEsNuevoProvincia,ArrayList<Classe> clases)throws Exception {
		 try {	
			Provincia_param_return provinciaReturnGeneral=new Provincia_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				provinciaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return provinciaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Provincia_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Provincia> provincias,Provincia provincia,Provincia_param_return provinciaParameterGeneral,Boolean isEsNuevoProvincia,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Provincia_param_return provinciaReturnGeneral=new Provincia_param_return();
	
			provinciaReturnGeneral.setProvincia(provincia);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				provinciaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return provinciaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Provincia_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Provincia_param_return provinciaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Provincia_param_return provinciaReturnGeneral=new Provincia_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.provincias=new ArrayList<Provincia>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.provincia=new Provincia();
				
				
				if(conColumnasBase) {this.provincia.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.provincia.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.provincia.setcodigo(arrColumnas[iColumn++]);
			this.provincia.setnombre(arrColumnas[iColumn++]);
				
				this.provincias.add(this.provincia);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			provinciaReturnGeneral.setConRetornoEstaProcesado(true);
			provinciaReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return provinciaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Provincia> provinciasAux= new ArrayList<Provincia>();
		
		for(Provincia provincia:provincias) {
			if(!provincia.getIsDeleted()) {
				provinciasAux.add(provincia);
			}
		}
		
		provincias=provinciasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Provincia> provinciasAux= new ArrayList<Provincia>();
		
		for(Provincia provincia : this.provincias) {
			if(provincia==null) {
				provinciasAux.add(provincia);
			}
		}
		
		//this.provincias=provinciasAux;
		
		this.provincias.removeAll(provinciasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(provincia.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((provincia.getIsDeleted() || (provincia.getIsChanged()&&!provincia.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=provinciaDataAccess.getSetVersionRow(connexion,provincia.getId());
				
				if(!provincia.getVersionRow().equals(timestamp)) {	
					provincia.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				provincia.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(provincia.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((provincia.getIsDeleted() || (provincia.getIsChanged()&&!provincia.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=provinciaDataAccess.getSetVersionRow(connexion,provincia.getId());
			
			try {							
				if(!provincia.getVersionRow().equals(timestamp)) {	
					provincia.setVersionRow(timestamp);
				}
				
				provincia.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(provincias!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Provincia provinciaAux:provincias) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(provinciaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(provinciaAux.getIsDeleted() || (provinciaAux.getIsChanged()&&!provinciaAux.getIsNew())) {
						
						timestamp=provinciaDataAccess.getSetVersionRow(connexion,provinciaAux.getId());
						
						if(!provincia.getVersionRow().equals(timestamp)) {	
							provinciaAux.setVersionRow(timestamp);
						}
								
						provinciaAux.setIsChangedAuxiliar(false);														
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
		if(provincias!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Provincia provinciaAux:provincias) {
					if(provinciaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(provinciaAux.getIsDeleted() || (provinciaAux.getIsChanged()&&!provinciaAux.getIsNew())) {
						
						timestamp=provinciaDataAccess.getSetVersionRow(connexion,provinciaAux.getId());
						
						if(!provinciaAux.getVersionRow().equals(timestamp)) {	
							provinciaAux.setVersionRow(timestamp);
						}
						
													
						provinciaAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Provincia_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalPais) throws Exception {
		Provincia_param_return  provincia_return =new Provincia_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-cargarCombosLoteForeignKeyProvinciaWithConnection");
			
			this.connexion.begin();
			
			provincia_return =new Provincia_param_return();
			
			

			List<Pais> paissForeignKey=new ArrayList<Pais>();
			Pais_logic paisLogic=new Pais_logic();
			paisLogic.setConnexion(this.connexion);
			paisLogic.getPaisDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPais.equals("NONE")) {
				paisLogic.getTodos(finalQueryGlobalPais,new Pagination());
				paissForeignKey=paisLogic.getPaiss();
			}

			provincia_return.setpaissFK(paissForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return provincia_return;
	}
	
	public Provincia_param_return cargarCombosLoteFK(String finalQueryGlobalPais) throws Exception {
		Provincia_param_return  provincia_return =new Provincia_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			provincia_return =new Provincia_param_return();
			
			

			List<Pais> paissForeignKey=new ArrayList<Pais>();
			Pais_logic paisLogic=new Pais_logic();
			paisLogic.setConnexion(this.connexion);
			paisLogic.getPaisDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPais.equals("NONE")) {
				paisLogic.getTodos(finalQueryGlobalPais,new Pagination());
				paissForeignKey=paisLogic.getPaiss();
			}

			provincia_return.setpaissFK(paissForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return provincia_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			Ciudad_logic ciudadLogic=new Ciudad_logic();
			DatoGeneralUsuario_logic datogeneralusuarioLogic=new DatoGeneralUsuario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyProvinciaWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(Ciudad.class));
			classes.add(new Classe(DatoGeneralUsuario.class));
											
			

			ciudadLogic.setConnexion(this.getConnexion());
			ciudadLogic.setDatosCliente(this.datosCliente);
			ciudadLogic.setIsConRefrescarForeignKeys(true);

			datogeneralusuarioLogic.setConnexion(this.getConnexion());
			datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Provincia provincia:this.provincias) {
				

				classes=new ArrayList<Classe>();
				classes=Ciudad_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				ciudadLogic.setCiudads(provincia.ciudads);
				ciudadLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				datogeneralusuarioLogic.setDatoGeneralUsuarios(provincia.datogeneralusuarios);
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
	
	public void deepLoad(Provincia provincia,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Provincia_logic_add.updateProvinciaToGet(provincia,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
		provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));
		provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
				continue;
			}

			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));

				if(this.isConDeep) {
					Ciudad_logic ciudadLogic= new Ciudad_logic(this.connexion);
					ciudadLogic.setCiudads(provincia.getCiudads());
					ArrayList<Classe> classesLocal=Ciudad_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					ciudadLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Ciudad_util.refrescarFKsDescripciones(ciudadLogic.getCiudads());
					provincia.setCiudads(ciudadLogic.getCiudads());
				}

				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));

				if(this.isConDeep) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(this.connexion);
					datogeneralusuarioLogic.setDatoGeneralUsuarios(provincia.getDatoGeneralUsuarios());
					ArrayList<Classe> classesLocal=DatoGeneralUsuario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					datogeneralusuarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarioLogic.getDatoGeneralUsuarios());
					provincia.setDatoGeneralUsuarios(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Ciudad.class));
			provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));
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
			provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
		Pais_logic paisLogic= new Pais_logic(connexion);
		paisLogic.deepLoad(provincia.getPais(),isDeep,deepLoadType,clases);
				

		provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));

		for(Ciudad ciudad:provincia.getCiudads()) {
			Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
			ciudadLogic.deepLoad(ciudad,isDeep,deepLoadType,clases);
		}

		provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));

		for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuarioLogic.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
				Pais_logic paisLogic= new Pais_logic(connexion);
				paisLogic.deepLoad(provincia.getPais(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));

				for(Ciudad ciudad:provincia.getCiudads()) {
					Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
					ciudadLogic.deepLoad(ciudad,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));

				for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
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
			if(clas.clas.equals(Pais.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			provincia.setPais(provinciaDataAccess.getPais(connexion,provincia));
			Pais_logic paisLogic= new Pais_logic(connexion);
			paisLogic.deepLoad(provincia.getPais(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Ciudad.class));
			provincia.setCiudads(provinciaDataAccess.getCiudads(connexion,provincia));

			for(Ciudad ciudad:provincia.getCiudads()) {
				Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
				ciudadLogic.deepLoad(ciudad,isDeep,deepLoadType,clases);
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
			provincia.setDatoGeneralUsuarios(provinciaDataAccess.getDatoGeneralUsuarios(connexion,provincia));

			for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
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
	
	public void deepSave(Provincia provincia,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Provincia_logic_add.updateProvinciaToSave(provincia,this.arrDatoGeneral);
			
Provincia_data.save(provincia, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Pais_data.save(provincia.getPais(),connexion);

		for(Ciudad ciudad:provincia.getCiudads()) {
			ciudad.setid_provincia(provincia.getId());
			Ciudad_data.save(ciudad,connexion);
		}

		for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
			datogeneralusuario.setid_provincia(provincia.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				Pais_data.save(provincia.getPais(),connexion);
				continue;
			}


			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Ciudad ciudad:provincia.getCiudads()) {
					ciudad.setid_provincia(provincia.getId());
					Ciudad_data.save(ciudad,connexion);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
					datogeneralusuario.setid_provincia(provincia.getId());
					DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Pais_data.save(provincia.getPais(),connexion);
		Pais_logic paisLogic= new Pais_logic(connexion);
		paisLogic.deepLoad(provincia.getPais(),isDeep,deepLoadType,clases);
				

		for(Ciudad ciudad:provincia.getCiudads()) {
			Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
			ciudad.setid_provincia(provincia.getId());
			Ciudad_data.save(ciudad,connexion);
			ciudadLogic.deepSave(ciudad,isDeep,deepLoadType,clases);
		}

		for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
			DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
			datogeneralusuario.setid_provincia(provincia.getId());
			DatoGeneralUsuario_data.save(datogeneralusuario,connexion);
			datogeneralusuarioLogic.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				Pais_data.save(provincia.getPais(),connexion);
				Pais_logic paisLogic= new Pais_logic(connexion);
				paisLogic.deepSave(provincia.getPais(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(Ciudad.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Ciudad ciudad:provincia.getCiudads()) {
					Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
					ciudad.setid_provincia(provincia.getId());
					Ciudad_data.save(ciudad,connexion);
					ciudadLogic.deepSave(ciudad,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(DatoGeneralUsuario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(DatoGeneralUsuario datogeneralusuario:provincia.getDatoGeneralUsuarios()) {
					DatoGeneralUsuario_logic datogeneralusuarioLogic= new DatoGeneralUsuario_logic(connexion);
					datogeneralusuario.setid_provincia(provincia.getId());
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
			this.getNewConnexionToDeep(Provincia.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(provincia,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Provincia_util.refrescarFKsDescripciones(provincia);
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
			this.deepLoad(this.provincia,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Provincia_util.refrescarFKsDescripciones(this.provincia);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Provincia.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(provincias!=null) {
				for(Provincia provincia:provincias) {
					this.deepLoad(provincia,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Provincia_util.refrescarFKsDescripciones(provincias);
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
			if(provincias!=null) {
				for(Provincia provincia:provincias) {
					this.deepLoad(provincia,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Provincia_util.refrescarFKsDescripciones(provincias);
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
			this.getNewConnexionToDeep(Provincia.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(provincia,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Provincia.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(provincias!=null) {
				for(Provincia provincia:provincias) {
					this.deepSave(provincia,isDeep,deepLoadType,clases);
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
			if(provincias!=null) {
				for(Provincia provincia:provincias) {
					this.deepSave(provincia,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdPaisWithConnection(String sFinalQuery,Pagination pagination,Long id_pais)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Provincia.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPais= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPais.setParameterSelectionGeneralEqual(ParameterType.LONG,id_pais,Provincia_util.IDPAIS,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPais);

			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPais","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			provincias=provinciaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Provincia_util.refrescarFKsDescripciones(this.provincias);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdPais(String sFinalQuery,Pagination pagination,Long id_pais)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPais= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPais.setParameterSelectionGeneralEqual(ParameterType.LONG,id_pais,Provincia_util.IDPAIS,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPais);

			Provincia_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPais","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			provincias=provinciaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Provincia_util.refrescarFKsDescripciones(this.provincias);
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
			if(Provincia_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ProvinciaDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Provincia provincia,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Provincia_util.IS_CON_AUDITORIA) {
				if(provincia.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ProvinciaDataAccess.TABLENAME, provincia.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Provincia_util.IS_CON_AUDITORIA_DETALLE) {
						////Provincia_logic.registrarAuditoriaDetalles(connexion,provincia,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(provincia.getIsDeleted()) {
					/*if(!provincia.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ProvinciaDataAccess.TABLENAME, provincia.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Provincia_logic.registrarAuditoriaDetalles(connexion,provincia,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ProvinciaDataAccess.TABLENAME, provincia.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(provincia.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ProvinciaDataAccess.TABLENAME, provincia.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Provincia_util.IS_CON_AUDITORIA_DETALLE) {
						////Provincia_logic.registrarAuditoriaDetalles(connexion,provincia,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Provincia provincia)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(provincia.getIsNew()||!provincia.getid_pais().equals(provincia.getProvinciaOriginal().getid_pais()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(provincia.getProvinciaOriginal().getid_pais()!=null)
				{
					strValorActual=provincia.getProvinciaOriginal().getid_pais().toString();
				}
				if(provincia.getid_pais()!=null)
				{
					strValorNuevo=provincia.getid_pais().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ProvinciaConstantesFunciones.IDPAIS,strValorActual,strValorNuevo);
			}	
			
			if(provincia.getIsNew()||!provincia.getcodigo().equals(provincia.getProvinciaOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(provincia.getProvinciaOriginal().getcodigo()!=null)
				{
					strValorActual=provincia.getProvinciaOriginal().getcodigo();
				}
				if(provincia.getcodigo()!=null)
				{
					strValorNuevo=provincia.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ProvinciaConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(provincia.getIsNew()||!provincia.getnombre().equals(provincia.getProvinciaOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(provincia.getProvinciaOriginal().getnombre()!=null)
				{
					strValorActual=provincia.getProvinciaOriginal().getnombre();
				}
				if(provincia.getnombre()!=null)
				{
					strValorNuevo=provincia.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ProvinciaConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Provincia provincia,List<Ciudad> ciudads,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {

		if(!provincia.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(provincia,ciudads,datogeneralusuarios,true);
		}
	}

	public void saveRelaciones(Provincia provincia,List<Ciudad> ciudads,List<DatoGeneralUsuario> datogeneralusuarios)throws Exception {

		if(!provincia.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(provincia,ciudads,datogeneralusuarios,false);
		}
	}

	public void saveRelacionesBase(Provincia provincia,List<Ciudad> ciudads,List<DatoGeneralUsuario> datogeneralusuarios,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Provincia-saveRelacionesWithConnection");}
	
			provincia.setCiudads(ciudads);
			provincia.setDatoGeneralUsuarios(datogeneralusuarios);

			this.setProvincia(provincia);

			if(true) {

				//Provincia_logic_add.updateRelacionesToSave(provincia,this);

				if((provincia.getIsNew()||provincia.getIsChanged())&&!provincia.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(ciudads,datogeneralusuarios);

				} else if(provincia.getIsDeleted()) {
					this.saveRelacionesDetalles(ciudads,datogeneralusuarios);
					this.save();
				}

				//Provincia_logic_add.updateRelacionesToSaveAfter(provincia,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			Ciudad_util.InicializarGeneralEntityAuxiliares(ciudads,true,true);
			DatoGeneralUsuario_util.InicializarGeneralEntityAuxiliares(datogeneralusuarios,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<Ciudad> ciudads,List<DatoGeneralUsuario> datogeneralusuarios)throws Exception {
		try {
	

			Long idProvinciaActual=this.getProvincia().getId();

			Ciudad_logic ciudadLogic_Desde_Provincia=new Ciudad_logic();
			ciudadLogic_Desde_Provincia.setCiudads(ciudads);

			ciudadLogic_Desde_Provincia.setConnexion(this.getConnexion());
			ciudadLogic_Desde_Provincia.setDatosCliente(this.datosCliente);

			for(Ciudad ciudad_Desde_Provincia:ciudadLogic_Desde_Provincia.getCiudads()) {
				ciudad_Desde_Provincia.setid_provincia(idProvinciaActual);

				ciudadLogic_Desde_Provincia.setCiudad(ciudad_Desde_Provincia);
				ciudadLogic_Desde_Provincia.save();

				Long idCiudadActual=ciudad_Desde_Provincia.getId();

				DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Ciudad=new DatoGeneralUsuario_logic();

				if(ciudad_Desde_Provincia.getDatoGeneralUsuarios()==null){
					ciudad_Desde_Provincia.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
				}

				datogeneralusuarioLogic_Desde_Ciudad.setDatoGeneralUsuarios(ciudad_Desde_Provincia.getDatoGeneralUsuarios());

				datogeneralusuarioLogic_Desde_Ciudad.setConnexion(this.getConnexion());
				datogeneralusuarioLogic_Desde_Ciudad.setDatosCliente(this.datosCliente);

				for(DatoGeneralUsuario datogeneralusuario_Desde_Ciudad:datogeneralusuarioLogic_Desde_Ciudad.getDatoGeneralUsuarios()) {
					datogeneralusuario_Desde_Ciudad.setid_ciudad(idCiudadActual);
				}

				datogeneralusuarioLogic_Desde_Ciudad.saves();
			}


			DatoGeneralUsuario_logic datogeneralusuarioLogic_Desde_Provincia=new DatoGeneralUsuario_logic();
			datogeneralusuarioLogic_Desde_Provincia.setDatoGeneralUsuarios(datogeneralusuarios);

			datogeneralusuarioLogic_Desde_Provincia.setConnexion(this.getConnexion());
			datogeneralusuarioLogic_Desde_Provincia.setDatosCliente(this.datosCliente);

			for(DatoGeneralUsuario datogeneralusuario_Desde_Provincia:datogeneralusuarioLogic_Desde_Provincia.getDatoGeneralUsuarios()) {
				datogeneralusuario_Desde_Provincia.setid_provincia(idProvinciaActual);
			}

			datogeneralusuarioLogic_Desde_Provincia.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Provincia_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Provincia_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setProvincia(Provincia newProvincia) {
		this.provincia = newProvincia;
	}
	
	public Provincia_data getProvinciaDataAccess() {
		return provinciaDataAccess;
	}
	
	public void setProvinciaDataAccess(Provincia_data newprovinciaDataAccess) {
		this.provinciaDataAccess = newprovinciaDataAccess;
	}

	public void setProvincias(List<Provincia> newProvincias) {
		this.provincias = newProvincias;
	}
	
	public Object getProvinciaObject() {	
		this.provinciaObject=this.provinciaDataAccess.getEntityObject();
		return this.provinciaObject;
	}
		
	public void setProvinciaObject(Object newProvinciaObject) {
		this.provinciaObject = newProvinciaObject;
	}
	
	public List<Object> getProvinciasObject() {		
		this.provinciasObject=this.provinciaDataAccess.getEntitiesObject();
		return this.provinciasObject;
	}
		
	public void setProvinciasObject(List<Object> newProvinciasObject) {
		this.provinciasObject = newProvinciasObject;
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
