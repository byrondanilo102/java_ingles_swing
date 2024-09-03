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
package com.bydan.ingles.gramatica.vocabulario.business.logic;


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
import com.bydan.ingles.gramatica.vocabulario.util.*;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_param_return;
//import com.bydan.ingles.gramatica.vocabulario.util.VocabularioParameterGeneral;
import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
//import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic_add;
import com.bydan.ingles.gramatica.vocabulario.business.data.*;
import com.bydan.ingles.gramatica.vocabulario.business.entity.*;

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


import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.VocabularioDetalle_data;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Vocabulario_logic  extends GeneralEntityLogic implements Vocabulario_logicI {
	static Logger logger = Logger.getLogger("Vocabulario_logic.class");	

	protected Vocabulario_data vocabularioDataAccess; 	
	protected Vocabulario vocabulario;
	protected List<Vocabulario> vocabularios;
	protected Object vocabularioObject;	
	protected List<Object> vocabulariosObject;
	
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
	
	
	
	
	
	
	public Vocabulario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.vocabularioDataAccess = new Vocabulario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Vocabulario_data.ActualizarQueries();
			
			//this.vocabularioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.vocabularios= new ArrayList<Vocabulario>();
			this.vocabulario= new Vocabulario();
			
			this.vocabularioObject=new Object();
			this.vocabulariosObject=new ArrayList<Object>();
				
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
			
			this.vocabularioDataAccess.setConnexionType(this.connexionType);
			this.vocabularioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Vocabulario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.vocabularioDataAccess = new Vocabulario_data();
			this.vocabularios= new ArrayList<Vocabulario>();
			this.vocabulario= new Vocabulario();
			this.vocabularioObject=new Object();
			this.vocabulariosObject=new ArrayList<Object>();
			
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
			
			this.vocabularioDataAccess.setConnexionType(this.connexionType);
			this.vocabularioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Vocabulario getVocabulario() throws Exception {	
		//Vocabulario_logic_add.checkVocabularioToGet(vocabulario,this.datosCliente,this.arrDatoGeneral);
		//Vocabulario_logic_add.updateVocabularioToGet(vocabulario,this.arrDatoGeneral);
		
		return vocabulario;
	}
	
	public List<Vocabulario> getVocabularios() throws Exception {		
		if(this.vocabularios==null) {
			this.vocabularios= new ArrayList<Vocabulario>();
		}
		
		this.quitarsNulos();
		
		//Vocabulario_logic_add.checkVocabularioToGets(vocabularios,this.datosCliente,this.arrDatoGeneral);
		
		for (Vocabulario vocabularioLocal: vocabularios ) {
			//Vocabulario_logic_add.updateVocabularioToGet(vocabularioLocal,this.arrDatoGeneral);
		}
		
		return vocabularios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.vocabularioDataAccess!=null) {
			this.vocabularioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			vocabularioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			vocabularioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		vocabulario = new  Vocabulario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			vocabulario=vocabularioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
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
		vocabulario = new  Vocabulario();
		  		  
        try {
			
			vocabulario=vocabularioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		vocabulario = new  Vocabulario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			vocabulario=vocabularioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
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
		vocabulario = new  Vocabulario();
		  		  
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
		vocabulario = new  Vocabulario();
		  		  
        try {
			
			vocabulario=vocabularioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		vocabulario = new  Vocabulario();
		  		  
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
		vocabulario = new  Vocabulario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =vocabularioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulario = new  Vocabulario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=vocabularioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		vocabulario = new  Vocabulario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =vocabularioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulario = new  Vocabulario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=vocabularioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		vocabulario = new  Vocabulario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =vocabularioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulario = new  Vocabulario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=vocabularioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
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
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
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
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		vocabulario = new  Vocabulario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulario=vocabularioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
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
		vocabulario = new  Vocabulario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulario=vocabularioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		  		  
        try {
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		vocabularios = new  ArrayList<Vocabulario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
		vocabularios = new  ArrayList<Vocabulario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(vocabularios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Vocabulario vocabulario) throws Exception {
		Boolean estaValidado=false;
		
		if(vocabulario.getIsNew() || vocabulario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Vocabulario> Vocabularios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Vocabulario vocabularioLocal:vocabularios) {				
			estaValidadoObjeto=this.validarGuardar(vocabularioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Vocabulario> Vocabularios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(vocabularios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Vocabulario Vocabulario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(vocabulario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Vocabulario vocabulario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+vocabulario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"vocabulario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Vocabulario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Vocabulario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Vocabulario_logic_add.checkVocabularioToSave(this.vocabulario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Vocabulario_logic_add.updateVocabularioToSave(this.vocabulario,this.arrDatoGeneral);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.vocabulario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Vocabulario_util.permiteMantenimiento(this.vocabulario) && this.validarGuardar(this.vocabulario)) {
				Vocabulario_data.save(this.vocabulario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);				
			}

			//Vocabulario_logic_add.checkVocabularioToSaveAfter(this.vocabulario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.vocabulario.getIsDeleted()) {
				this.vocabulario=null;
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
			
			//Vocabulario_logic_add.checkVocabularioToSave(this.vocabulario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Vocabulario_logic_add.updateVocabularioToSave(this.vocabulario,this.arrDatoGeneral);
			
			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.vocabulario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Vocabulario_util.permiteMantenimiento(this.vocabulario) && this.validarGuardar(this.vocabulario)) {			
				Vocabulario_data.save(this.vocabulario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.vocabulario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);				
			}
			
			//Vocabulario_logic_add.checkVocabularioToSaveAfter(this.vocabulario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.vocabulario.getIsDeleted()) {
				this.vocabulario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Vocabulario_logic_add.checkVocabularioToSaves(vocabularios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVocabulario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Vocabulario vocabularioLocal:vocabularios) {		
				
				if(!Vocabulario_util.permiteMantenimiento(vocabularioLocal)) {
					continue;
				}
				
				//Vocabulario_logic_add.updateVocabularioToSave(vocabularioLocal,this.arrDatoGeneral);
	        	
				Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),vocabularioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(vocabularioLocal)) {
					Vocabulario_data.save(vocabularioLocal, connexion);				
				} else {
					validadoTodosVocabulario=false;
				}
			}
			
			if(!validadoTodosVocabulario) {
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
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}
			
			//Vocabulario_logic_add.checkVocabularioToSavesAfter(vocabularios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Vocabulario_logic_add.checkVocabularioToSaves(vocabularios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVocabulario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Vocabulario vocabularioLocal:vocabularios) {				
				if(!Vocabulario_util.permiteMantenimiento(vocabularioLocal)) {
					continue;
				}
				
				//Vocabulario_logic_add.updateVocabularioToSave(vocabularioLocal,this.arrDatoGeneral);
	        	
				Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),vocabularioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(vocabularioLocal)) {				
					Vocabulario_data.save(vocabularioLocal, connexion);				
				} else {
					validadoTodosVocabulario=false;
				}
			}
			
			if(!validadoTodosVocabulario) {
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
				
				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
			}

			//Vocabulario_logic_add.checkVocabularioToSavesAfter(vocabularios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Vocabulario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Vocabulario> vocabularios,Vocabulario_param_return vocabularioParameterGeneral)throws Exception {
		 try {	
			Vocabulario_param_return vocabularioReturnGeneral=new Vocabulario_param_return();
	
			
			return vocabularioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Vocabulario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Vocabulario> vocabularios,Vocabulario_param_return vocabularioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Vocabulario_param_return vocabularioReturnGeneral=new Vocabulario_param_return();
	
			
			this.connexion.commit();
			
			return vocabularioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Vocabulario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Vocabulario> vocabularios,Vocabulario vocabulario,Vocabulario_param_return vocabularioParameterGeneral,Boolean isEsNuevoVocabulario,ArrayList<Classe> clases)throws Exception {
		 try {	
			Vocabulario_param_return vocabularioReturnGeneral=new Vocabulario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				vocabularioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return vocabularioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Vocabulario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Vocabulario> vocabularios,Vocabulario vocabulario,Vocabulario_param_return vocabularioParameterGeneral,Boolean isEsNuevoVocabulario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Vocabulario_param_return vocabularioReturnGeneral=new Vocabulario_param_return();
	
			vocabularioReturnGeneral.setVocabulario(vocabulario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				vocabularioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return vocabularioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Vocabulario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Vocabulario_param_return vocabularioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Vocabulario_param_return vocabularioReturnGeneral=new Vocabulario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.vocabularios=new ArrayList<Vocabulario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.vocabulario=new Vocabulario();
				
				
				if(conColumnasBase) {this.vocabulario.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.vocabulario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.vocabulario.setnombre(arrColumnas[iColumn++]);
				this.vocabulario.settraduccion(arrColumnas[iColumn++]);
				this.vocabulario.setpronunciacion(arrColumnas[iColumn++]);
				
				this.vocabularios.add(this.vocabulario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			vocabularioReturnGeneral.setConRetornoEstaProcesado(true);
			vocabularioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return vocabularioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Vocabulario> vocabulariosAux= new ArrayList<Vocabulario>();
		
		for(Vocabulario vocabulario:vocabularios) {
			if(!vocabulario.getIsDeleted()) {
				vocabulariosAux.add(vocabulario);
			}
		}
		
		vocabularios=vocabulariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Vocabulario> vocabulariosAux= new ArrayList<Vocabulario>();
		
		for(Vocabulario vocabulario : this.vocabularios) {
			if(vocabulario==null) {
				vocabulariosAux.add(vocabulario);
			}
		}
		
		//this.vocabularios=vocabulariosAux;
		
		this.vocabularios.removeAll(vocabulariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(vocabulario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((vocabulario.getIsDeleted() || (vocabulario.getIsChanged()&&!vocabulario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=vocabularioDataAccess.getSetVersionRow(connexion,vocabulario.getId());
				
				if(!vocabulario.getVersionRow().equals(timestamp)) {	
					vocabulario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				vocabulario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(vocabulario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((vocabulario.getIsDeleted() || (vocabulario.getIsChanged()&&!vocabulario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=vocabularioDataAccess.getSetVersionRow(connexion,vocabulario.getId());
			
			try {							
				if(!vocabulario.getVersionRow().equals(timestamp)) {	
					vocabulario.setVersionRow(timestamp);
				}
				
				vocabulario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(vocabularios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Vocabulario vocabularioAux:vocabularios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(vocabularioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(vocabularioAux.getIsDeleted() || (vocabularioAux.getIsChanged()&&!vocabularioAux.getIsNew())) {
						
						timestamp=vocabularioDataAccess.getSetVersionRow(connexion,vocabularioAux.getId());
						
						if(!vocabulario.getVersionRow().equals(timestamp)) {	
							vocabularioAux.setVersionRow(timestamp);
						}
								
						vocabularioAux.setIsChangedAuxiliar(false);														
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
		if(vocabularios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Vocabulario vocabularioAux:vocabularios) {
					if(vocabularioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(vocabularioAux.getIsDeleted() || (vocabularioAux.getIsChanged()&&!vocabularioAux.getIsNew())) {
						
						timestamp=vocabularioDataAccess.getSetVersionRow(connexion,vocabularioAux.getId());
						
						if(!vocabularioAux.getVersionRow().equals(timestamp)) {	
							vocabularioAux.setVersionRow(timestamp);
						}
						
													
						vocabularioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public Vocabulario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		Vocabulario_param_return  vocabulario_return =new Vocabulario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-cargarCombosLoteForeignKeyVocabularioWithConnection");
			
			this.connexion.begin();
			
			vocabulario_return =new Vocabulario_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			vocabulario_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			vocabulario_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			vocabulario_return.setnivelsFK(nivelsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return vocabulario_return;
	}
	
	public Vocabulario_param_return cargarCombosLoteFK(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		Vocabulario_param_return  vocabulario_return =new Vocabulario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			vocabulario_return =new Vocabulario_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			vocabulario_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			vocabulario_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			vocabulario_return.setnivelsFK(nivelsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return vocabulario_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VocabularioDetalle_logic vocabulariodetalleLogic=new VocabularioDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyVocabularioWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VocabularioDetalle.class));
											
			

			vocabulariodetalleLogic.setConnexion(this.getConnexion());
			vocabulariodetalleLogic.setDatosCliente(this.datosCliente);
			vocabulariodetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Vocabulario vocabulario:this.vocabularios) {
				

				classes=new ArrayList<Classe>();
				classes=VocabularioDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				vocabulariodetalleLogic.setVocabularioDetalles(vocabulario.vocabulariodetalles);
				vocabulariodetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Vocabulario vocabulario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Vocabulario_logic_add.updateVocabularioToGet(vocabulario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
		vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
		vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
		vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
				continue;
			}

			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));

				if(this.isConDeep) {
					VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(this.connexion);
					vocabulariodetalleLogic.setVocabularioDetalles(vocabulario.getVocabularioDetalles());
					ArrayList<Classe> classesLocal=VocabularioDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					vocabulariodetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VocabularioDetalle_util.refrescarFKsDescripciones(vocabulariodetalleLogic.getVocabularioDetalles());
					vocabulario.setVocabularioDetalles(vocabulariodetalleLogic.getVocabularioDetalles());
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
			vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VocabularioDetalle.class));
			vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(vocabulario.getArea(),isDeep,deepLoadType,clases);
				
		vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(vocabulario.getSubArea(),isDeep,deepLoadType,clases);
				
		vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(vocabulario.getNivel(),isDeep,deepLoadType,clases);
				

		vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));

		for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
			VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
			vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(vocabulario.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepLoad(vocabulario.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(vocabulario.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));

				for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
					VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
					vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
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
			vocabulario.setArea(vocabularioDataAccess.getArea(connexion,vocabulario));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(vocabulario.getArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulario.setSubArea(vocabularioDataAccess.getSubArea(connexion,vocabulario));
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subareaLogic.deepLoad(vocabulario.getSubArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulario.setNivel(vocabularioDataAccess.getNivel(connexion,vocabulario));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(vocabulario.getNivel(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VocabularioDetalle.class));
			vocabulario.setVocabularioDetalles(vocabularioDataAccess.getVocabularioDetalles(connexion,vocabulario));

			for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
				VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
				vocabulariodetalleLogic.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Vocabulario vocabulario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Vocabulario_logic_add.updateVocabularioToSave(vocabulario,this.arrDatoGeneral);
			
Vocabulario_data.save(vocabulario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(vocabulario.getArea(),connexion);

		SubArea_data.save(vocabulario.getSubArea(),connexion);

		Nivel_data.save(vocabulario.getNivel(),connexion);

		for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
			vocabulariodetalle.setid_vocabulario(vocabulario.getId());
			VocabularioDetalle_data.save(vocabulariodetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(vocabulario.getArea(),connexion);
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(vocabulario.getSubArea(),connexion);
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(vocabulario.getNivel(),connexion);
				continue;
			}


			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
					vocabulariodetalle.setid_vocabulario(vocabulario.getId());
					VocabularioDetalle_data.save(vocabulariodetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(vocabulario.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(vocabulario.getArea(),isDeep,deepLoadType,clases);
				

		SubArea_data.save(vocabulario.getSubArea(),connexion);
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(vocabulario.getSubArea(),isDeep,deepLoadType,clases);
				

		Nivel_data.save(vocabulario.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(vocabulario.getNivel(),isDeep,deepLoadType,clases);
				

		for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
			VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
			vocabulariodetalle.setid_vocabulario(vocabulario.getId());
			VocabularioDetalle_data.save(vocabulariodetalle,connexion);
			vocabulariodetalleLogic.deepSave(vocabulariodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(vocabulario.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(vocabulario.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(vocabulario.getSubArea(),connexion);
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepSave(vocabulario.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(vocabulario.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(vocabulario.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(VocabularioDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VocabularioDetalle vocabulariodetalle:vocabulario.getVocabularioDetalles()) {
					VocabularioDetalle_logic vocabulariodetalleLogic= new VocabularioDetalle_logic(connexion);
					vocabulariodetalle.setid_vocabulario(vocabulario.getId());
					VocabularioDetalle_data.save(vocabulariodetalle,connexion);
					vocabulariodetalleLogic.deepSave(vocabulariodetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Vocabulario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(vocabulario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Vocabulario_util.refrescarFKsDescripciones(vocabulario);
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
			this.deepLoad(this.vocabulario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Vocabulario_util.refrescarFKsDescripciones(this.vocabulario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Vocabulario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(vocabularios!=null) {
				for(Vocabulario vocabulario:vocabularios) {
					this.deepLoad(vocabulario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Vocabulario_util.refrescarFKsDescripciones(vocabularios);
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
			if(vocabularios!=null) {
				for(Vocabulario vocabulario:vocabularios) {
					this.deepLoad(vocabulario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Vocabulario_util.refrescarFKsDescripciones(vocabularios);
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
			this.getNewConnexionToDeep(Vocabulario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(vocabulario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Vocabulario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(vocabularios!=null) {
				for(Vocabulario vocabulario:vocabularios) {
					this.deepSave(vocabulario,isDeep,deepLoadType,clases);
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
			if(vocabularios!=null) {
				for(Vocabulario vocabulario:vocabularios) {
					this.deepSave(vocabulario,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Vocabulario_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Vocabulario_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralTraduccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",Vocabulario_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",Vocabulario_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Vocabulario_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,Vocabulario_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Vocabulario_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,Vocabulario_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Vocabulario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSubArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,Vocabulario_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,Vocabulario_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			Vocabulario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabularios=vocabularioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Vocabulario_util.refrescarFKsDescripciones(this.vocabularios);
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
			if(Vocabulario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Vocabulario vocabulario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Vocabulario_util.IS_CON_AUDITORIA) {
				if(vocabulario.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDataAccess.TABLENAME, vocabulario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Vocabulario_util.IS_CON_AUDITORIA_DETALLE) {
						////Vocabulario_logic.registrarAuditoriaDetalles(connexion,vocabulario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(vocabulario.getIsDeleted()) {
					/*if(!vocabulario.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VocabularioDataAccess.TABLENAME, vocabulario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Vocabulario_logic.registrarAuditoriaDetalles(connexion,vocabulario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDataAccess.TABLENAME, vocabulario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(vocabulario.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDataAccess.TABLENAME, vocabulario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Vocabulario_util.IS_CON_AUDITORIA_DETALLE) {
						////Vocabulario_logic.registrarAuditoriaDetalles(connexion,vocabulario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Vocabulario vocabulario)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(vocabulario.getIsNew()||!vocabulario.getid_area().equals(vocabulario.getVocabularioOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().getid_area()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().getid_area().toString();
				}
				if(vocabulario.getid_area()!=null)
				{
					strValorNuevo=vocabulario.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(vocabulario.getIsNew()||!vocabulario.getid_sub_area().equals(vocabulario.getVocabularioOriginal().getid_sub_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().getid_sub_area()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().getid_sub_area().toString();
				}
				if(vocabulario.getid_sub_area()!=null)
				{
					strValorNuevo=vocabulario.getid_sub_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.IDSUBAREA,strValorActual,strValorNuevo);
			}	
			
			if(vocabulario.getIsNew()||!vocabulario.getid_nivel().equals(vocabulario.getVocabularioOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().getid_nivel()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().getid_nivel().toString();
				}
				if(vocabulario.getid_nivel()!=null)
				{
					strValorNuevo=vocabulario.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(vocabulario.getIsNew()||!vocabulario.getnombre().equals(vocabulario.getVocabularioOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().getnombre()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().getnombre();
				}
				if(vocabulario.getnombre()!=null)
				{
					strValorNuevo=vocabulario.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(vocabulario.getIsNew()||!vocabulario.gettraduccion().equals(vocabulario.getVocabularioOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().gettraduccion()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().gettraduccion();
				}
				if(vocabulario.gettraduccion()!=null)
				{
					strValorNuevo=vocabulario.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(vocabulario.getIsNew()||!vocabulario.getpronunciacion().equals(vocabulario.getVocabularioOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulario.getVocabularioOriginal().getpronunciacion()!=null)
				{
					strValorActual=vocabulario.getVocabularioOriginal().getpronunciacion();
				}
				if(vocabulario.getpronunciacion()!=null)
				{
					strValorNuevo=vocabulario.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Vocabulario vocabulario,List<VocabularioDetalle> vocabulariodetalles) throws Exception {

		if(!vocabulario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(vocabulario,vocabulariodetalles,true);
		}
	}

	public void saveRelaciones(Vocabulario vocabulario,List<VocabularioDetalle> vocabulariodetalles)throws Exception {

		if(!vocabulario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(vocabulario,vocabulariodetalles,false);
		}
	}

	public void saveRelacionesBase(Vocabulario vocabulario,List<VocabularioDetalle> vocabulariodetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Vocabulario-saveRelacionesWithConnection");}
	
			vocabulario.setVocabularioDetalles(vocabulariodetalles);

			this.setVocabulario(vocabulario);

			if(true) {

				//Vocabulario_logic_add.updateRelacionesToSave(vocabulario,this);

				if((vocabulario.getIsNew()||vocabulario.getIsChanged())&&!vocabulario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(vocabulariodetalles);

				} else if(vocabulario.getIsDeleted()) {
					this.saveRelacionesDetalles(vocabulariodetalles);
					this.save();
				}

				//Vocabulario_logic_add.updateRelacionesToSaveAfter(vocabulario,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			VocabularioDetalle_util.InicializarGeneralEntityAuxiliares(vocabulariodetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<VocabularioDetalle> vocabulariodetalles)throws Exception {
		try {
	

			Long idVocabularioActual=this.getVocabulario().getId();

			VocabularioDetalle_logic vocabulariodetalleLogic_Desde_Vocabulario=new VocabularioDetalle_logic();
			vocabulariodetalleLogic_Desde_Vocabulario.setVocabularioDetalles(vocabulariodetalles);

			vocabulariodetalleLogic_Desde_Vocabulario.setConnexion(this.getConnexion());
			vocabulariodetalleLogic_Desde_Vocabulario.setDatosCliente(this.datosCliente);

			for(VocabularioDetalle vocabulariodetalle_Desde_Vocabulario:vocabulariodetalleLogic_Desde_Vocabulario.getVocabularioDetalles()) {
				vocabulariodetalle_Desde_Vocabulario.setid_vocabulario(idVocabularioActual);
			}

			vocabulariodetalleLogic_Desde_Vocabulario.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Vocabulario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Vocabulario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVocabulario(Vocabulario newVocabulario) {
		this.vocabulario = newVocabulario;
	}
	
	public Vocabulario_data getVocabularioDataAccess() {
		return vocabularioDataAccess;
	}
	
	public void setVocabularioDataAccess(Vocabulario_data newvocabularioDataAccess) {
		this.vocabularioDataAccess = newvocabularioDataAccess;
	}

	public void setVocabularios(List<Vocabulario> newVocabularios) {
		this.vocabularios = newVocabularios;
	}
	
	public Object getVocabularioObject() {	
		this.vocabularioObject=this.vocabularioDataAccess.getEntityObject();
		return this.vocabularioObject;
	}
		
	public void setVocabularioObject(Object newVocabularioObject) {
		this.vocabularioObject = newVocabularioObject;
	}
	
	public List<Object> getVocabulariosObject() {		
		this.vocabulariosObject=this.vocabularioDataAccess.getEntitiesObject();
		return this.vocabulariosObject;
	}
		
	public void setVocabulariosObject(List<Object> newVocabulariosObject) {
		this.vocabulariosObject = newVocabulariosObject;
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
