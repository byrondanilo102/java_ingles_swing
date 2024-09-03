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
package com.bydan.ingles.gramatica.expresion.business.logic;


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
import com.bydan.ingles.gramatica.expresion.util.*;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;
import com.bydan.ingles.gramatica.expresion.util.Expresion_param_return;
//import com.bydan.ingles.gramatica.expresion.util.ExpresionParameterGeneral;
import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
//import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic_add;
import com.bydan.ingles.gramatica.expresion.business.data.*;
import com.bydan.ingles.gramatica.expresion.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;
import com.bydan.ingles.general.area.business.logic.Area_logic;

import com.bydan.ingles.general.subarea.business.entity.SubArea;
import com.bydan.ingles.general.subarea.business.data.SubArea_data;
import com.bydan.ingles.general.subarea.business.logic.SubArea_logic;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;

//REL


import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.data.ExpresionDetalle_data;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;
import com.bydan.ingles.gramatica.expresiondetalle.util.ExpresionDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Expresion_logic  extends GeneralEntityLogic implements Expresion_logicI {
	static Logger logger = Logger.getLogger("Expresion_logic.class");	

	protected Expresion_data expresionDataAccess; 	
	protected Expresion expresion;
	protected List<Expresion> expresions;
	protected Object expresionObject;	
	protected List<Object> expresionsObject;
	
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
	
	
	
	
	
	
	public Expresion_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.expresionDataAccess = new Expresion_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Expresion_data.ActualizarQueries();
			
			//this.expresionDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.expresions= new ArrayList<Expresion>();
			this.expresion= new Expresion();
			
			this.expresionObject=new Object();
			this.expresionsObject=new ArrayList<Object>();
				
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
			
			this.expresionDataAccess.setConnexionType(this.connexionType);
			this.expresionDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Expresion_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.expresionDataAccess = new Expresion_data();
			this.expresions= new ArrayList<Expresion>();
			this.expresion= new Expresion();
			this.expresionObject=new Object();
			this.expresionsObject=new ArrayList<Object>();
			
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
			
			this.expresionDataAccess.setConnexionType(this.connexionType);
			this.expresionDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Expresion getExpresion() throws Exception {	
		//Expresion_logic_add.checkExpresionToGet(expresion,this.datosCliente,this.arrDatoGeneral);
		//Expresion_logic_add.updateExpresionToGet(expresion,this.arrDatoGeneral);
		
		return expresion;
	}
	
	public List<Expresion> getExpresions() throws Exception {		
		if(this.expresions==null) {
			this.expresions= new ArrayList<Expresion>();
		}
		
		this.quitarsNulos();
		
		//Expresion_logic_add.checkExpresionToGets(expresions,this.datosCliente,this.arrDatoGeneral);
		
		for (Expresion expresionLocal: expresions ) {
			//Expresion_logic_add.updateExpresionToGet(expresionLocal,this.arrDatoGeneral);
		}
		
		return expresions;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.expresionDataAccess!=null) {
			this.expresionDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			expresionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			expresionDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		expresion = new  Expresion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			expresion=expresionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
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
		expresion = new  Expresion();
		  		  
        try {
			
			expresion=expresionDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		expresion = new  Expresion();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			expresion=expresionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
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
		expresion = new  Expresion();
		  		  
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
		expresion = new  Expresion();
		  		  
        try {
			
			expresion=expresionDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		expresion = new  Expresion();
		  		  
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
		expresion = new  Expresion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =expresionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		expresion = new  Expresion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=expresionDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresion = new  Expresion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =expresionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		expresion = new  Expresion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=expresionDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		expresion = new  Expresion();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =expresionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		expresion = new  Expresion();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=expresionDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresions = new  ArrayList<Expresion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		  		  
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
		expresions = new  ArrayList<Expresion>();
		  		  
        try {			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		expresions = new  ArrayList<Expresion>();
		  		  
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
		expresions = new  ArrayList<Expresion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		  		  
        try {
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		expresion = new  Expresion();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresion=expresionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
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
		expresion = new  Expresion();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresion=expresionDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(expresion);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		expresions = new  ArrayList<Expresion>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		  		  
        try {
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		expresions = new  ArrayList<Expresion>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
		expresions = new  ArrayList<Expresion>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(expresions);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Expresion expresion) throws Exception {
		Boolean estaValidado=false;
		
		if(expresion.getIsNew() || expresion.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Expresion> Expresions) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Expresion expresionLocal:expresions) {				
			estaValidadoObjeto=this.validarGuardar(expresionLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Expresion> Expresions) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(expresions)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Expresion Expresion) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(expresion)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Expresion expresion) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+expresion.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"expresion","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Expresion_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Expresion_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Expresion_logic_add.checkExpresionToSave(this.expresion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Expresion_logic_add.updateExpresionToSave(this.expresion,this.arrDatoGeneral);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.expresion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Expresion_util.permiteMantenimiento(this.expresion) && this.validarGuardar(this.expresion)) {
				Expresion_data.save(this.expresion, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Expresion_util.refrescarFKsDescripciones(this.expresion);				
			}

			//Expresion_logic_add.checkExpresionToSaveAfter(this.expresion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.expresion.getIsDeleted()) {
				this.expresion=null;
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
			
			//Expresion_logic_add.checkExpresionToSave(this.expresion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Expresion_logic_add.updateExpresionToSave(this.expresion,this.arrDatoGeneral);
			
			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.expresion,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Expresion_util.permiteMantenimiento(this.expresion) && this.validarGuardar(this.expresion)) {			
				Expresion_data.save(this.expresion, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.expresion,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Expresion_util.refrescarFKsDescripciones(this.expresion);				
			}
			
			//Expresion_logic_add.checkExpresionToSaveAfter(this.expresion,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.expresion.getIsDeleted()) {
				this.expresion=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Expresion_logic_add.checkExpresionToSaves(expresions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosExpresion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Expresion expresionLocal:expresions) {		
				
				if(!Expresion_util.permiteMantenimiento(expresionLocal)) {
					continue;
				}
				
				//Expresion_logic_add.updateExpresionToSave(expresionLocal,this.arrDatoGeneral);
	        	
				Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),expresionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(expresionLocal)) {
					Expresion_data.save(expresionLocal, connexion);				
				} else {
					validadoTodosExpresion=false;
				}
			}
			
			if(!validadoTodosExpresion) {
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
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}
			
			//Expresion_logic_add.checkExpresionToSavesAfter(expresions,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Expresion_logic_add.checkExpresionToSaves(expresions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosExpresion=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Expresion expresionLocal:expresions) {				
				if(!Expresion_util.permiteMantenimiento(expresionLocal)) {
					continue;
				}
				
				//Expresion_logic_add.updateExpresionToSave(expresionLocal,this.arrDatoGeneral);
	        	
				Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),expresionLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(expresionLocal)) {				
					Expresion_data.save(expresionLocal, connexion);				
				} else {
					validadoTodosExpresion=false;
				}
			}
			
			if(!validadoTodosExpresion) {
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
				
				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}

			//Expresion_logic_add.checkExpresionToSavesAfter(expresions,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Expresion_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Expresion> expresions,Expresion_param_return expresionParameterGeneral)throws Exception {
		 try {	
			Expresion_param_return expresionReturnGeneral=new Expresion_param_return();
	
			
			return expresionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Expresion_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Expresion> expresions,Expresion_param_return expresionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Expresion_param_return expresionReturnGeneral=new Expresion_param_return();
	
			
			this.connexion.commit();
			
			return expresionReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Expresion_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Expresion> expresions,Expresion expresion,Expresion_param_return expresionParameterGeneral,Boolean isEsNuevoExpresion,ArrayList<Classe> clases)throws Exception {
		 try {	
			Expresion_param_return expresionReturnGeneral=new Expresion_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				expresionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return expresionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Expresion_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Expresion> expresions,Expresion expresion,Expresion_param_return expresionParameterGeneral,Boolean isEsNuevoExpresion,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Expresion_param_return expresionReturnGeneral=new Expresion_param_return();
	
			expresionReturnGeneral.setExpresion(expresion);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				expresionReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return expresionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Expresion_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Expresion_param_return expresionParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Expresion_param_return expresionReturnGeneral=new Expresion_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.expresions=new ArrayList<Expresion>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.expresion=new Expresion();
				
				
				if(conColumnasBase) {this.expresion.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.expresion.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.expresion.setnombre(arrColumnas[iColumn++]);
				this.expresion.setdetalle(arrColumnas[iColumn++]);
				this.expresion.settraduccion(arrColumnas[iColumn++]);
				this.expresion.setpronunciacion(arrColumnas[iColumn++]);
				
				this.expresions.add(this.expresion);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			expresionReturnGeneral.setConRetornoEstaProcesado(true);
			expresionReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return expresionReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Expresion> expresionsAux= new ArrayList<Expresion>();
		
		for(Expresion expresion:expresions) {
			if(!expresion.getIsDeleted()) {
				expresionsAux.add(expresion);
			}
		}
		
		expresions=expresionsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Expresion> expresionsAux= new ArrayList<Expresion>();
		
		for(Expresion expresion : this.expresions) {
			if(expresion==null) {
				expresionsAux.add(expresion);
			}
		}
		
		//this.expresions=expresionsAux;
		
		this.expresions.removeAll(expresionsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(expresion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((expresion.getIsDeleted() || (expresion.getIsChanged()&&!expresion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=expresionDataAccess.getSetVersionRow(connexion,expresion.getId());
				
				if(!expresion.getVersionRow().equals(timestamp)) {	
					expresion.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				expresion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(expresion.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((expresion.getIsDeleted() || (expresion.getIsChanged()&&!expresion.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=expresionDataAccess.getSetVersionRow(connexion,expresion.getId());
			
			try {							
				if(!expresion.getVersionRow().equals(timestamp)) {	
					expresion.setVersionRow(timestamp);
				}
				
				expresion.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(expresions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Expresion expresionAux:expresions) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(expresionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(expresionAux.getIsDeleted() || (expresionAux.getIsChanged()&&!expresionAux.getIsNew())) {
						
						timestamp=expresionDataAccess.getSetVersionRow(connexion,expresionAux.getId());
						
						if(!expresion.getVersionRow().equals(timestamp)) {	
							expresionAux.setVersionRow(timestamp);
						}
								
						expresionAux.setIsChangedAuxiliar(false);														
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
		if(expresions!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Expresion expresionAux:expresions) {
					if(expresionAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(expresionAux.getIsDeleted() || (expresionAux.getIsChanged()&&!expresionAux.getIsNew())) {
						
						timestamp=expresionDataAccess.getSetVersionRow(connexion,expresionAux.getId());
						
						if(!expresionAux.getVersionRow().equals(timestamp)) {	
							expresionAux.setVersionRow(timestamp);
						}
						
													
						expresionAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Expresion_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		Expresion_param_return  expresion_return =new Expresion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-cargarCombosLoteForeignKeyExpresionWithConnection");
			
			this.connexion.begin();
			
			expresion_return =new Expresion_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			expresion_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			expresion_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			expresion_return.setnivelsFK(nivelsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return expresion_return;
	}
	
	public Expresion_param_return cargarCombosLoteFK(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		Expresion_param_return  expresion_return =new Expresion_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			expresion_return =new Expresion_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			expresion_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			expresion_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			expresion_return.setnivelsFK(nivelsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return expresion_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			ExpresionDetalle_logic expresiondetalleLogic=new ExpresionDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyExpresionWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(ExpresionDetalle.class));
											
			

			expresiondetalleLogic.setConnexion(this.getConnexion());
			expresiondetalleLogic.setDatosCliente(this.datosCliente);
			expresiondetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Expresion expresion:this.expresions) {
				

				classes=new ArrayList<Classe>();
				classes=ExpresionDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				expresiondetalleLogic.setExpresionDetalles(expresion.expresiondetalles);
				expresiondetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Expresion expresion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Expresion_logic_add.updateExpresionToGet(expresion,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
		expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
		expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
		expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
				continue;
			}

			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));

				if(this.isConDeep) {
					ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(this.connexion);
					expresiondetalleLogic.setExpresionDetalles(expresion.getExpresionDetalles());
					ArrayList<Classe> classesLocal=ExpresionDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					expresiondetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					ExpresionDetalle_util.refrescarFKsDescripciones(expresiondetalleLogic.getExpresionDetalles());
					expresion.setExpresionDetalles(expresiondetalleLogic.getExpresionDetalles());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ExpresionDetalle.class));
			expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(expresion.getArea(),isDeep,deepLoadType,clases);
				
		expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(expresion.getSubArea(),isDeep,deepLoadType,clases);
				
		expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(expresion.getNivel(),isDeep,deepLoadType,clases);
				

		expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));

		for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
			ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
			expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(expresion.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepLoad(expresion.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(expresion.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));

				for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
					ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
					expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setArea(expresionDataAccess.getArea(connexion,expresion));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(expresion.getArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setSubArea(expresionDataAccess.getSubArea(connexion,expresion));
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subareaLogic.deepLoad(expresion.getSubArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			expresion.setNivel(expresionDataAccess.getNivel(connexion,expresion));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(expresion.getNivel(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ExpresionDetalle.class));
			expresion.setExpresionDetalles(expresionDataAccess.getExpresionDetalles(connexion,expresion));

			for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
				ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
				expresiondetalleLogic.deepLoad(expresiondetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Expresion expresion,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Expresion_logic_add.updateExpresionToSave(expresion,this.arrDatoGeneral);
			
Expresion_data.save(expresion, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(expresion.getArea(),connexion);

		SubArea_data.save(expresion.getSubArea(),connexion);

		Nivel_data.save(expresion.getNivel(),connexion);

		for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
			expresiondetalle.setid_expresion(expresion.getId());
			ExpresionDetalle_data.save(expresiondetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(expresion.getArea(),connexion);
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(expresion.getSubArea(),connexion);
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(expresion.getNivel(),connexion);
				continue;
			}


			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
					expresiondetalle.setid_expresion(expresion.getId());
					ExpresionDetalle_data.save(expresiondetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(expresion.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(expresion.getArea(),isDeep,deepLoadType,clases);
				

		SubArea_data.save(expresion.getSubArea(),connexion);
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(expresion.getSubArea(),isDeep,deepLoadType,clases);
				

		Nivel_data.save(expresion.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(expresion.getNivel(),isDeep,deepLoadType,clases);
				

		for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
			ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
			expresiondetalle.setid_expresion(expresion.getId());
			ExpresionDetalle_data.save(expresiondetalle,connexion);
			expresiondetalleLogic.deepSave(expresiondetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(expresion.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(expresion.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(expresion.getSubArea(),connexion);
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepSave(expresion.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(expresion.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(expresion.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(ExpresionDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ExpresionDetalle expresiondetalle:expresion.getExpresionDetalles()) {
					ExpresionDetalle_logic expresiondetalleLogic= new ExpresionDetalle_logic(connexion);
					expresiondetalle.setid_expresion(expresion.getId());
					ExpresionDetalle_data.save(expresiondetalle,connexion);
					expresiondetalleLogic.deepSave(expresiondetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Expresion.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(expresion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Expresion_util.refrescarFKsDescripciones(expresion);
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
			this.deepLoad(this.expresion,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Expresion_util.refrescarFKsDescripciones(this.expresion);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Expresion.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(expresions!=null) {
				for(Expresion expresion:expresions) {
					this.deepLoad(expresion,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Expresion_util.refrescarFKsDescripciones(expresions);
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
			if(expresions!=null) {
				for(Expresion expresion:expresions) {
					this.deepLoad(expresion,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Expresion_util.refrescarFKsDescripciones(expresions);
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
			this.getNewConnexionToDeep(Expresion.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(expresion,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Expresion.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(expresions!=null) {
				for(Expresion expresion:expresions) {
					this.deepSave(expresion,isDeep,deepLoadType,clases);
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
			if(expresions!=null) {
				for(Expresion expresion:expresions) {
					this.deepSave(expresion,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Expresion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Expresion_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsBusquedaPorTraduccionWithConnection(String sFinalQuery,Pagination pagination,String traduccion)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralTraduccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",Expresion_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorTraduccion(String sFinalQuery,Pagination pagination,String traduccion)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralTraduccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",Expresion_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdAreaWithConnection(String sFinalQuery,Pagination pagination,Long id_area)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Expresion_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdArea(String sFinalQuery,Pagination pagination,Long id_area)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Expresion_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdNivelWithConnection(String sFinalQuery,Pagination pagination,Long id_nivel)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Expresion_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdNivel(String sFinalQuery,Pagination pagination,Long id_nivel)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Expresion_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdSubAreaWithConnection(String sFinalQuery,Pagination pagination,Long id_sub_area)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Expresion.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSubArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,Expresion_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdSubArea(String sFinalQuery,Pagination pagination,Long id_sub_area)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSubArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,Expresion_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			Expresion_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			expresions=expresionDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Expresion_util.refrescarFKsDescripciones(this.expresions);
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
			if(Expresion_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Expresion expresion,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Expresion_util.IS_CON_AUDITORIA) {
				if(expresion.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDataAccess.TABLENAME, expresion.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Expresion_util.IS_CON_AUDITORIA_DETALLE) {
						////Expresion_logic.registrarAuditoriaDetalles(connexion,expresion,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(expresion.getIsDeleted()) {
					/*if(!expresion.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ExpresionDataAccess.TABLENAME, expresion.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Expresion_logic.registrarAuditoriaDetalles(connexion,expresion,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDataAccess.TABLENAME, expresion.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(expresion.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ExpresionDataAccess.TABLENAME, expresion.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Expresion_util.IS_CON_AUDITORIA_DETALLE) {
						////Expresion_logic.registrarAuditoriaDetalles(connexion,expresion,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Expresion expresion)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(expresion.getIsNew()||!expresion.getid_area().equals(expresion.getExpresionOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getid_area()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getid_area().toString();
				}
				if(expresion.getid_area()!=null)
				{
					strValorNuevo=expresion.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.getid_sub_area().equals(expresion.getExpresionOriginal().getid_sub_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getid_sub_area()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getid_sub_area().toString();
				}
				if(expresion.getid_sub_area()!=null)
				{
					strValorNuevo=expresion.getid_sub_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.IDSUBAREA,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.getid_nivel().equals(expresion.getExpresionOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getid_nivel()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getid_nivel().toString();
				}
				if(expresion.getid_nivel()!=null)
				{
					strValorNuevo=expresion.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.getnombre().equals(expresion.getExpresionOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getnombre()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getnombre();
				}
				if(expresion.getnombre()!=null)
				{
					strValorNuevo=expresion.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.getdetalle().equals(expresion.getExpresionOriginal().getdetalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getdetalle()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getdetalle();
				}
				if(expresion.getdetalle()!=null)
				{
					strValorNuevo=expresion.getdetalle() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.DETALLE,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.gettraduccion().equals(expresion.getExpresionOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().gettraduccion()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().gettraduccion();
				}
				if(expresion.gettraduccion()!=null)
				{
					strValorNuevo=expresion.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(expresion.getIsNew()||!expresion.getpronunciacion().equals(expresion.getExpresionOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(expresion.getExpresionOriginal().getpronunciacion()!=null)
				{
					strValorActual=expresion.getExpresionOriginal().getpronunciacion();
				}
				if(expresion.getpronunciacion()!=null)
				{
					strValorNuevo=expresion.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ExpresionConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Expresion expresion,List<ExpresionDetalle> expresiondetalles) throws Exception {

		if(!expresion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(expresion,expresiondetalles,true);
		}
	}

	public void saveRelaciones(Expresion expresion,List<ExpresionDetalle> expresiondetalles)throws Exception {

		if(!expresion.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(expresion,expresiondetalles,false);
		}
	}

	public void saveRelacionesBase(Expresion expresion,List<ExpresionDetalle> expresiondetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Expresion-saveRelacionesWithConnection");}
	
			expresion.setExpresionDetalles(expresiondetalles);

			this.setExpresion(expresion);

			if(true) {

				//Expresion_logic_add.updateRelacionesToSave(expresion,this);

				if((expresion.getIsNew()||expresion.getIsChanged())&&!expresion.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(expresiondetalles);

				} else if(expresion.getIsDeleted()) {
					this.saveRelacionesDetalles(expresiondetalles);
					this.save();
				}

				//Expresion_logic_add.updateRelacionesToSaveAfter(expresion,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			ExpresionDetalle_util.InicializarGeneralEntityAuxiliares(expresiondetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<ExpresionDetalle> expresiondetalles)throws Exception {
		try {
	

			Long idExpresionActual=this.getExpresion().getId();

			ExpresionDetalle_logic expresiondetalleLogic_Desde_Expresion=new ExpresionDetalle_logic();
			expresiondetalleLogic_Desde_Expresion.setExpresionDetalles(expresiondetalles);

			expresiondetalleLogic_Desde_Expresion.setConnexion(this.getConnexion());
			expresiondetalleLogic_Desde_Expresion.setDatosCliente(this.datosCliente);

			for(ExpresionDetalle expresiondetalle_Desde_Expresion:expresiondetalleLogic_Desde_Expresion.getExpresionDetalles()) {
				expresiondetalle_Desde_Expresion.setid_expresion(idExpresionActual);
			}

			expresiondetalleLogic_Desde_Expresion.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Expresion_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Expresion_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setExpresion(Expresion newExpresion) {
		this.expresion = newExpresion;
	}
	
	public Expresion_data getExpresionDataAccess() {
		return expresionDataAccess;
	}
	
	public void setExpresionDataAccess(Expresion_data newexpresionDataAccess) {
		this.expresionDataAccess = newexpresionDataAccess;
	}

	public void setExpresions(List<Expresion> newExpresions) {
		this.expresions = newExpresions;
	}
	
	public Object getExpresionObject() {	
		this.expresionObject=this.expresionDataAccess.getEntityObject();
		return this.expresionObject;
	}
		
	public void setExpresionObject(Object newExpresionObject) {
		this.expresionObject = newExpresionObject;
	}
	
	public List<Object> getExpresionsObject() {		
		this.expresionsObject=this.expresionDataAccess.getEntitiesObject();
		return this.expresionsObject;
	}
		
	public void setExpresionsObject(List<Object> newExpresionsObject) {
		this.expresionsObject = newExpresionsObject;
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
