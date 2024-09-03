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
package com.bydan.ingles.general.diccionario.business.logic;


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
import com.bydan.ingles.general.diccionario.util.*;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;
import com.bydan.ingles.general.diccionario.util.Diccionario_param_return;
//import com.bydan.ingles.general.diccionario.util.DiccionarioParameterGeneral;
import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
//import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic_add;
import com.bydan.ingles.general.diccionario.business.data.*;
import com.bydan.ingles.general.diccionario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.general.grupo.business.entity.Grupo;
import com.bydan.ingles.general.grupo.business.data.Grupo_data;
import com.bydan.ingles.general.grupo.business.logic.Grupo_logic;

import com.bydan.ingles.general.tipo.business.entity.Tipo;
import com.bydan.ingles.general.tipo.business.data.Tipo_data;
import com.bydan.ingles.general.tipo.business.logic.Tipo_logic;

import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;
import com.bydan.ingles.general.area.business.logic.Area_logic;

import com.bydan.ingles.general.nivel.business.entity.Nivel;
import com.bydan.ingles.general.nivel.business.data.Nivel_data;
import com.bydan.ingles.general.nivel.business.logic.Nivel_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class Diccionario_logic  extends GeneralEntityLogic implements Diccionario_logicI {
	static Logger logger = Logger.getLogger("Diccionario_logic.class");	

	protected Diccionario_data diccionarioDataAccess; 	
	protected Diccionario diccionario;
	protected List<Diccionario> diccionarios;
	protected Object diccionarioObject;	
	protected List<Object> diccionariosObject;
	
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
	
	
	
	
	
	
	public Diccionario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.diccionarioDataAccess = new Diccionario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Diccionario_data.ActualizarQueries();
			
			//this.diccionarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.diccionarios= new ArrayList<Diccionario>();
			this.diccionario= new Diccionario();
			
			this.diccionarioObject=new Object();
			this.diccionariosObject=new ArrayList<Object>();
				
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
			
			this.diccionarioDataAccess.setConnexionType(this.connexionType);
			this.diccionarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Diccionario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.diccionarioDataAccess = new Diccionario_data();
			this.diccionarios= new ArrayList<Diccionario>();
			this.diccionario= new Diccionario();
			this.diccionarioObject=new Object();
			this.diccionariosObject=new ArrayList<Object>();
			
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
			
			this.diccionarioDataAccess.setConnexionType(this.connexionType);
			this.diccionarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Diccionario getDiccionario() throws Exception {	
		//Diccionario_logic_add.checkDiccionarioToGet(diccionario,this.datosCliente,this.arrDatoGeneral);
		//Diccionario_logic_add.updateDiccionarioToGet(diccionario,this.arrDatoGeneral);
		
		return diccionario;
	}
	
	public List<Diccionario> getDiccionarios() throws Exception {		
		if(this.diccionarios==null) {
			this.diccionarios= new ArrayList<Diccionario>();
		}
		
		this.quitarsNulos();
		
		//Diccionario_logic_add.checkDiccionarioToGets(diccionarios,this.datosCliente,this.arrDatoGeneral);
		
		for (Diccionario diccionarioLocal: diccionarios ) {
			//Diccionario_logic_add.updateDiccionarioToGet(diccionarioLocal,this.arrDatoGeneral);
		}
		
		return diccionarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.diccionarioDataAccess!=null) {
			this.diccionarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			diccionarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			diccionarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		diccionario = new  Diccionario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			diccionario=diccionarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
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
		diccionario = new  Diccionario();
		  		  
        try {
			
			diccionario=diccionarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		diccionario = new  Diccionario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			diccionario=diccionarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
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
		diccionario = new  Diccionario();
		  		  
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
		diccionario = new  Diccionario();
		  		  
        try {
			
			diccionario=diccionarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		diccionario = new  Diccionario();
		  		  
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
		diccionario = new  Diccionario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =diccionarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		diccionario = new  Diccionario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=diccionarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		diccionario = new  Diccionario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =diccionarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		diccionario = new  Diccionario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=diccionarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		diccionario = new  Diccionario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =diccionarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		diccionario = new  Diccionario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=diccionarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		  		  
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
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		diccionarios = new  ArrayList<Diccionario>();
		  		  
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
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		diccionario = new  Diccionario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionario=diccionarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(diccionario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
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
		diccionario = new  Diccionario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionario=diccionarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(diccionario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		  		  
        try {
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		diccionarios = new  ArrayList<Diccionario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
		diccionarios = new  ArrayList<Diccionario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(diccionarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Diccionario diccionario) throws Exception {
		Boolean estaValidado=false;
		
		if(diccionario.getIsNew() || diccionario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Diccionario> Diccionarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Diccionario diccionarioLocal:diccionarios) {				
			estaValidadoObjeto=this.validarGuardar(diccionarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Diccionario> Diccionarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(diccionarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Diccionario Diccionario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(diccionario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Diccionario diccionario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+diccionario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"diccionario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Diccionario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Diccionario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Diccionario_logic_add.checkDiccionarioToSave(this.diccionario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Diccionario_logic_add.updateDiccionarioToSave(this.diccionario,this.arrDatoGeneral);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.diccionario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Diccionario_util.permiteMantenimiento(this.diccionario) && this.validarGuardar(this.diccionario)) {
				Diccionario_data.save(this.diccionario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);				
			}

			//Diccionario_logic_add.checkDiccionarioToSaveAfter(this.diccionario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.diccionario.getIsDeleted()) {
				this.diccionario=null;
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
			
			//Diccionario_logic_add.checkDiccionarioToSave(this.diccionario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Diccionario_logic_add.updateDiccionarioToSave(this.diccionario,this.arrDatoGeneral);
			
			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.diccionario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Diccionario_util.permiteMantenimiento(this.diccionario) && this.validarGuardar(this.diccionario)) {			
				Diccionario_data.save(this.diccionario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.diccionario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);				
			}
			
			//Diccionario_logic_add.checkDiccionarioToSaveAfter(this.diccionario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.diccionario.getIsDeleted()) {
				this.diccionario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Diccionario_logic_add.checkDiccionarioToSaves(diccionarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosDiccionario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Diccionario diccionarioLocal:diccionarios) {		
				
				if(!Diccionario_util.permiteMantenimiento(diccionarioLocal)) {
					continue;
				}
				
				//Diccionario_logic_add.updateDiccionarioToSave(diccionarioLocal,this.arrDatoGeneral);
	        	
				Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),diccionarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(diccionarioLocal)) {
					Diccionario_data.save(diccionarioLocal, connexion);				
				} else {
					validadoTodosDiccionario=false;
				}
			}
			
			if(!validadoTodosDiccionario) {
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
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}
			
			//Diccionario_logic_add.checkDiccionarioToSavesAfter(diccionarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Diccionario_logic_add.checkDiccionarioToSaves(diccionarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosDiccionario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Diccionario diccionarioLocal:diccionarios) {				
				if(!Diccionario_util.permiteMantenimiento(diccionarioLocal)) {
					continue;
				}
				
				//Diccionario_logic_add.updateDiccionarioToSave(diccionarioLocal,this.arrDatoGeneral);
	        	
				Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),diccionarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(diccionarioLocal)) {				
					Diccionario_data.save(diccionarioLocal, connexion);				
				} else {
					validadoTodosDiccionario=false;
				}
			}
			
			if(!validadoTodosDiccionario) {
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
				
				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}

			//Diccionario_logic_add.checkDiccionarioToSavesAfter(diccionarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Diccionario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Diccionario> diccionarios,Diccionario_param_return diccionarioParameterGeneral)throws Exception {
		 try {	
			Diccionario_param_return diccionarioReturnGeneral=new Diccionario_param_return();
	
			
			return diccionarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Diccionario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Diccionario> diccionarios,Diccionario_param_return diccionarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Diccionario_param_return diccionarioReturnGeneral=new Diccionario_param_return();
	
			
			this.connexion.commit();
			
			return diccionarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Diccionario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Diccionario> diccionarios,Diccionario diccionario,Diccionario_param_return diccionarioParameterGeneral,Boolean isEsNuevoDiccionario,ArrayList<Classe> clases)throws Exception {
		 try {	
			Diccionario_param_return diccionarioReturnGeneral=new Diccionario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				diccionarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return diccionarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Diccionario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Diccionario> diccionarios,Diccionario diccionario,Diccionario_param_return diccionarioParameterGeneral,Boolean isEsNuevoDiccionario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Diccionario_param_return diccionarioReturnGeneral=new Diccionario_param_return();
	
			diccionarioReturnGeneral.setDiccionario(diccionario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				diccionarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return diccionarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Diccionario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Diccionario_param_return diccionarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Diccionario_param_return diccionarioReturnGeneral=new Diccionario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.diccionarios=new ArrayList<Diccionario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.diccionario=new Diccionario();
				
				
				if(conColumnasBase) {this.diccionario.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.diccionario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.diccionario.setexpresion(arrColumnas[iColumn++]);
				this.diccionario.settraduccion1(arrColumnas[iColumn++]);
				this.diccionario.settraduccion2(arrColumnas[iColumn++]);
				
				this.diccionarios.add(this.diccionario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			diccionarioReturnGeneral.setConRetornoEstaProcesado(true);
			diccionarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return diccionarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Diccionario> diccionariosAux= new ArrayList<Diccionario>();
		
		for(Diccionario diccionario:diccionarios) {
			if(!diccionario.getIsDeleted()) {
				diccionariosAux.add(diccionario);
			}
		}
		
		diccionarios=diccionariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Diccionario> diccionariosAux= new ArrayList<Diccionario>();
		
		for(Diccionario diccionario : this.diccionarios) {
			if(diccionario==null) {
				diccionariosAux.add(diccionario);
			}
		}
		
		//this.diccionarios=diccionariosAux;
		
		this.diccionarios.removeAll(diccionariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(diccionario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((diccionario.getIsDeleted() || (diccionario.getIsChanged()&&!diccionario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=diccionarioDataAccess.getSetVersionRow(connexion,diccionario.getId());
				
				if(!diccionario.getVersionRow().equals(timestamp)) {	
					diccionario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				diccionario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(diccionario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((diccionario.getIsDeleted() || (diccionario.getIsChanged()&&!diccionario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=diccionarioDataAccess.getSetVersionRow(connexion,diccionario.getId());
			
			try {							
				if(!diccionario.getVersionRow().equals(timestamp)) {	
					diccionario.setVersionRow(timestamp);
				}
				
				diccionario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(diccionarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Diccionario diccionarioAux:diccionarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(diccionarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(diccionarioAux.getIsDeleted() || (diccionarioAux.getIsChanged()&&!diccionarioAux.getIsNew())) {
						
						timestamp=diccionarioDataAccess.getSetVersionRow(connexion,diccionarioAux.getId());
						
						if(!diccionario.getVersionRow().equals(timestamp)) {	
							diccionarioAux.setVersionRow(timestamp);
						}
								
						diccionarioAux.setIsChangedAuxiliar(false);														
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
		if(diccionarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Diccionario diccionarioAux:diccionarios) {
					if(diccionarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(diccionarioAux.getIsDeleted() || (diccionarioAux.getIsChanged()&&!diccionarioAux.getIsNew())) {
						
						timestamp=diccionarioDataAccess.getSetVersionRow(connexion,diccionarioAux.getId());
						
						if(!diccionarioAux.getVersionRow().equals(timestamp)) {	
							diccionarioAux.setVersionRow(timestamp);
						}
						
													
						diccionarioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Diccionario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalGrupo,String finalQueryGlobalTipo,String finalQueryGlobalArea,String finalQueryGlobalNivel) throws Exception {
		Diccionario_param_return  diccionario_return =new Diccionario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-cargarCombosLoteForeignKeyDiccionarioWithConnection");
			
			this.connexion.begin();
			
			diccionario_return =new Diccionario_param_return();
			
			

			List<Grupo> gruposForeignKey=new ArrayList<Grupo>();
			Grupo_logic grupoLogic=new Grupo_logic();
			grupoLogic.setConnexion(this.connexion);
			grupoLogic.getGrupoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalGrupo.equals("NONE")) {
				grupoLogic.getTodos(finalQueryGlobalGrupo,new Pagination());
				gruposForeignKey=grupoLogic.getGrupos();
			}

			diccionario_return.setgruposFK(gruposForeignKey);


			List<Tipo> tiposForeignKey=new ArrayList<Tipo>();
			Tipo_logic tipoLogic=new Tipo_logic();
			tipoLogic.setConnexion(this.connexion);
			tipoLogic.getTipoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipo.equals("NONE")) {
				tipoLogic.getTodos(finalQueryGlobalTipo,new Pagination());
				tiposForeignKey=tipoLogic.getTipos();
			}

			diccionario_return.settiposFK(tiposForeignKey);


			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			diccionario_return.setareasFK(areasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			diccionario_return.setnivelsFK(nivelsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return diccionario_return;
	}
	
	public Diccionario_param_return cargarCombosLoteFK(String finalQueryGlobalGrupo,String finalQueryGlobalTipo,String finalQueryGlobalArea,String finalQueryGlobalNivel) throws Exception {
		Diccionario_param_return  diccionario_return =new Diccionario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			diccionario_return =new Diccionario_param_return();
			
			

			List<Grupo> gruposForeignKey=new ArrayList<Grupo>();
			Grupo_logic grupoLogic=new Grupo_logic();
			grupoLogic.setConnexion(this.connexion);
			grupoLogic.getGrupoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalGrupo.equals("NONE")) {
				grupoLogic.getTodos(finalQueryGlobalGrupo,new Pagination());
				gruposForeignKey=grupoLogic.getGrupos();
			}

			diccionario_return.setgruposFK(gruposForeignKey);


			List<Tipo> tiposForeignKey=new ArrayList<Tipo>();
			Tipo_logic tipoLogic=new Tipo_logic();
			tipoLogic.setConnexion(this.connexion);
			tipoLogic.getTipoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipo.equals("NONE")) {
				tipoLogic.getTodos(finalQueryGlobalTipo,new Pagination());
				tiposForeignKey=tipoLogic.getTipos();
			}

			diccionario_return.settiposFK(tiposForeignKey);


			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			diccionario_return.setareasFK(areasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			diccionario_return.setnivelsFK(nivelsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return diccionario_return;
	}
	
	
	public void deepLoad(Diccionario diccionario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Diccionario_logic_add.updateDiccionarioToGet(diccionario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
		diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
		diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
		diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
				continue;
			}

			if(clas.clas.equals(Tipo.class)) {
				diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
				continue;
			}

			if(clas.clas.equals(Area.class)) {
				diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Tipo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
		Grupo_logic grupoLogic= new Grupo_logic(connexion);
		grupoLogic.deepLoad(diccionario.getGrupo(),isDeep,deepLoadType,clases);
				
		diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
		Tipo_logic tipoLogic= new Tipo_logic(connexion);
		tipoLogic.deepLoad(diccionario.getTipo(),isDeep,deepLoadType,clases);
				
		diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(diccionario.getArea(),isDeep,deepLoadType,clases);
				
		diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(diccionario.getNivel(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
				Grupo_logic grupoLogic= new Grupo_logic(connexion);
				grupoLogic.deepLoad(diccionario.getGrupo(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Tipo.class)) {
				diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
				Tipo_logic tipoLogic= new Tipo_logic(connexion);
				tipoLogic.deepLoad(diccionario.getTipo(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Area.class)) {
				diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(diccionario.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(diccionario.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setGrupo(diccionarioDataAccess.getGrupo(connexion,diccionario));
			Grupo_logic grupoLogic= new Grupo_logic(connexion);
			grupoLogic.deepLoad(diccionario.getGrupo(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Tipo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setTipo(diccionarioDataAccess.getTipo(connexion,diccionario));
			Tipo_logic tipoLogic= new Tipo_logic(connexion);
			tipoLogic.deepLoad(diccionario.getTipo(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setArea(diccionarioDataAccess.getArea(connexion,diccionario));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(diccionario.getArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			diccionario.setNivel(diccionarioDataAccess.getNivel(connexion,diccionario));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(diccionario.getNivel(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Diccionario diccionario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Diccionario_logic_add.updateDiccionarioToSave(diccionario,this.arrDatoGeneral);
			
Diccionario_data.save(diccionario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Grupo_data.save(diccionario.getGrupo(),connexion);

		Tipo_data.save(diccionario.getTipo(),connexion);

		Area_data.save(diccionario.getArea(),connexion);

		Nivel_data.save(diccionario.getNivel(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				Grupo_data.save(diccionario.getGrupo(),connexion);
				continue;
			}

			if(clas.clas.equals(Tipo.class)) {
				Tipo_data.save(diccionario.getTipo(),connexion);
				continue;
			}

			if(clas.clas.equals(Area.class)) {
				Area_data.save(diccionario.getArea(),connexion);
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(diccionario.getNivel(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Grupo_data.save(diccionario.getGrupo(),connexion);
		Grupo_logic grupoLogic= new Grupo_logic(connexion);
		grupoLogic.deepLoad(diccionario.getGrupo(),isDeep,deepLoadType,clases);
				

		Tipo_data.save(diccionario.getTipo(),connexion);
		Tipo_logic tipoLogic= new Tipo_logic(connexion);
		tipoLogic.deepLoad(diccionario.getTipo(),isDeep,deepLoadType,clases);
				

		Area_data.save(diccionario.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(diccionario.getArea(),isDeep,deepLoadType,clases);
				

		Nivel_data.save(diccionario.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(diccionario.getNivel(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Grupo.class)) {
				Grupo_data.save(diccionario.getGrupo(),connexion);
				Grupo_logic grupoLogic= new Grupo_logic(connexion);
				grupoLogic.deepSave(diccionario.getGrupo(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Tipo.class)) {
				Tipo_data.save(diccionario.getTipo(),connexion);
				Tipo_logic tipoLogic= new Tipo_logic(connexion);
				tipoLogic.deepSave(diccionario.getTipo(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Area.class)) {
				Area_data.save(diccionario.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(diccionario.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(diccionario.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(diccionario.getNivel(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(Diccionario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(diccionario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Diccionario_util.refrescarFKsDescripciones(diccionario);
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
			this.deepLoad(this.diccionario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Diccionario_util.refrescarFKsDescripciones(this.diccionario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Diccionario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(diccionarios!=null) {
				for(Diccionario diccionario:diccionarios) {
					this.deepLoad(diccionario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Diccionario_util.refrescarFKsDescripciones(diccionarios);
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
			if(diccionarios!=null) {
				for(Diccionario diccionario:diccionarios) {
					this.deepLoad(diccionario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Diccionario_util.refrescarFKsDescripciones(diccionarios);
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
			this.getNewConnexionToDeep(Diccionario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(diccionario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Diccionario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(diccionarios!=null) {
				for(Diccionario diccionario:diccionarios) {
					this.deepSave(diccionario,isDeep,deepLoadType,clases);
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
			if(diccionarios!=null) {
				for(Diccionario diccionario:diccionarios) {
					this.deepSave(diccionario,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdAreaWithConnection(String sFinalQuery,Pagination pagination,Long id_area)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Diccionario_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Diccionario_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdGrupoWithConnection(String sFinalQuery,Pagination pagination,Long id_grupo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrupo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrupo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grupo,Diccionario_util.IDGRUPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrupo);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdGrupo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdGrupo(String sFinalQuery,Pagination pagination,Long id_grupo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidGrupo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidGrupo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_grupo,Diccionario_util.IDGRUPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidGrupo);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdGrupo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Diccionario_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Diccionario_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdTipoWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Diccionario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo,Diccionario_util.IDTIPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipo);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipo(String sFinalQuery,Pagination pagination,Long id_tipo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo,Diccionario_util.IDTIPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipo);

			Diccionario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			diccionarios=diccionarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Diccionario_util.refrescarFKsDescripciones(this.diccionarios);
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
			if(Diccionario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,DiccionarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Diccionario diccionario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Diccionario_util.IS_CON_AUDITORIA) {
				if(diccionario.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DiccionarioDataAccess.TABLENAME, diccionario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Diccionario_util.IS_CON_AUDITORIA_DETALLE) {
						////Diccionario_logic.registrarAuditoriaDetalles(connexion,diccionario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(diccionario.getIsDeleted()) {
					/*if(!diccionario.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,DiccionarioDataAccess.TABLENAME, diccionario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Diccionario_logic.registrarAuditoriaDetalles(connexion,diccionario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DiccionarioDataAccess.TABLENAME, diccionario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(diccionario.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DiccionarioDataAccess.TABLENAME, diccionario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Diccionario_util.IS_CON_AUDITORIA_DETALLE) {
						////Diccionario_logic.registrarAuditoriaDetalles(connexion,diccionario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Diccionario diccionario)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(diccionario.getIsNew()||!diccionario.getid_grupo().equals(diccionario.getDiccionarioOriginal().getid_grupo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().getid_grupo()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().getid_grupo().toString();
				}
				if(diccionario.getid_grupo()!=null)
				{
					strValorNuevo=diccionario.getid_grupo().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.IDGRUPO,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.getid_tipo().equals(diccionario.getDiccionarioOriginal().getid_tipo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().getid_tipo()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().getid_tipo().toString();
				}
				if(diccionario.getid_tipo()!=null)
				{
					strValorNuevo=diccionario.getid_tipo().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.IDTIPO,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.getid_area().equals(diccionario.getDiccionarioOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().getid_area()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().getid_area().toString();
				}
				if(diccionario.getid_area()!=null)
				{
					strValorNuevo=diccionario.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.getid_nivel().equals(diccionario.getDiccionarioOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().getid_nivel()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().getid_nivel().toString();
				}
				if(diccionario.getid_nivel()!=null)
				{
					strValorNuevo=diccionario.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.getexpresion().equals(diccionario.getDiccionarioOriginal().getexpresion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().getexpresion()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().getexpresion();
				}
				if(diccionario.getexpresion()!=null)
				{
					strValorNuevo=diccionario.getexpresion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.EXPRESION,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.gettraduccion1().equals(diccionario.getDiccionarioOriginal().gettraduccion1()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().gettraduccion1()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().gettraduccion1();
				}
				if(diccionario.gettraduccion1()!=null)
				{
					strValorNuevo=diccionario.gettraduccion1() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.TRADUCCION1,strValorActual,strValorNuevo);
			}	
			
			if(diccionario.getIsNew()||!diccionario.gettraduccion2().equals(diccionario.getDiccionarioOriginal().gettraduccion2()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(diccionario.getDiccionarioOriginal().gettraduccion2()!=null)
				{
					strValorActual=diccionario.getDiccionarioOriginal().gettraduccion2();
				}
				if(diccionario.gettraduccion2()!=null)
				{
					strValorNuevo=diccionario.gettraduccion2() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DiccionarioConstantesFunciones.TRADUCCION2,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Diccionario diccionario) throws Exception {

		if(!diccionario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(diccionario,true);
		}
	}

	public void saveRelaciones(Diccionario diccionario)throws Exception {

		if(!diccionario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(diccionario,false);
		}
	}

	public void saveRelacionesBase(Diccionario diccionario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Diccionario-saveRelacionesWithConnection");}
	

			this.setDiccionario(diccionario);

			if(true) {

				//Diccionario_logic_add.updateRelacionesToSave(diccionario,this);

				if((diccionario.getIsNew()||diccionario.getIsChanged())&&!diccionario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(diccionario.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//Diccionario_logic_add.updateRelacionesToSaveAfter(diccionario,this);

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
			ArrayList<Classe> classes=Diccionario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Diccionario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setDiccionario(Diccionario newDiccionario) {
		this.diccionario = newDiccionario;
	}
	
	public Diccionario_data getDiccionarioDataAccess() {
		return diccionarioDataAccess;
	}
	
	public void setDiccionarioDataAccess(Diccionario_data newdiccionarioDataAccess) {
		this.diccionarioDataAccess = newdiccionarioDataAccess;
	}

	public void setDiccionarios(List<Diccionario> newDiccionarios) {
		this.diccionarios = newDiccionarios;
	}
	
	public Object getDiccionarioObject() {	
		this.diccionarioObject=this.diccionarioDataAccess.getEntityObject();
		return this.diccionarioObject;
	}
		
	public void setDiccionarioObject(Object newDiccionarioObject) {
		this.diccionarioObject = newDiccionarioObject;
	}
	
	public List<Object> getDiccionariosObject() {		
		this.diccionariosObject=this.diccionarioDataAccess.getEntitiesObject();
		return this.diccionariosObject;
	}
		
	public void setDiccionariosObject(List<Object> newDiccionariosObject) {
		this.diccionariosObject = newDiccionariosObject;
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
