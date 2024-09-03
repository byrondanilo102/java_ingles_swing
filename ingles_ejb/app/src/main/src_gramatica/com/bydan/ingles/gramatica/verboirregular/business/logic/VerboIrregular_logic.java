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
package com.bydan.ingles.gramatica.verboirregular.business.logic;


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
import com.bydan.ingles.gramatica.verboirregular.util.*;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_param_return;
//import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregularParameterGeneral;
import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
//import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic_add;
import com.bydan.ingles.gramatica.verboirregular.business.data.*;
import com.bydan.ingles.gramatica.verboirregular.business.entity.*;

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


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.data.VerboIrregularDetalle_data;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;
import com.bydan.ingles.gramatica.verboirregulardetalle.util.VerboIrregularDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class VerboIrregular_logic  extends GeneralEntityLogic implements VerboIrregular_logicI {
	static Logger logger = Logger.getLogger("VerboIrregular_logic.class");	

	protected VerboIrregular_data verboirregularDataAccess; 	
	protected VerboIrregular verboirregular;
	protected List<VerboIrregular> verboirregulars;
	protected Object verboirregularObject;	
	protected List<Object> verboirregularsObject;
	
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
	
	
	
	
	
	
	public VerboIrregular_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.verboirregularDataAccess = new VerboIrregular_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			VerboIrregular_data.ActualizarQueries();
			
			//this.verboirregularDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.verboirregulars= new ArrayList<VerboIrregular>();
			this.verboirregular= new VerboIrregular();
			
			this.verboirregularObject=new Object();
			this.verboirregularsObject=new ArrayList<Object>();
				
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
			
			this.verboirregularDataAccess.setConnexionType(this.connexionType);
			this.verboirregularDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public VerboIrregular_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.verboirregularDataAccess = new VerboIrregular_data();
			this.verboirregulars= new ArrayList<VerboIrregular>();
			this.verboirregular= new VerboIrregular();
			this.verboirregularObject=new Object();
			this.verboirregularsObject=new ArrayList<Object>();
			
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
			
			this.verboirregularDataAccess.setConnexionType(this.connexionType);
			this.verboirregularDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public VerboIrregular getVerboIrregular() throws Exception {	
		//VerboIrregular_logic_add.checkVerboIrregularToGet(verboirregular,this.datosCliente,this.arrDatoGeneral);
		//VerboIrregular_logic_add.updateVerboIrregularToGet(verboirregular,this.arrDatoGeneral);
		
		return verboirregular;
	}
	
	public List<VerboIrregular> getVerboIrregulars() throws Exception {		
		if(this.verboirregulars==null) {
			this.verboirregulars= new ArrayList<VerboIrregular>();
		}
		
		this.quitarsNulos();
		
		//VerboIrregular_logic_add.checkVerboIrregularToGets(verboirregulars,this.datosCliente,this.arrDatoGeneral);
		
		for (VerboIrregular verboirregularLocal: verboirregulars ) {
			//VerboIrregular_logic_add.updateVerboIrregularToGet(verboirregularLocal,this.arrDatoGeneral);
		}
		
		return verboirregulars;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.verboirregularDataAccess!=null) {
			this.verboirregularDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			verboirregularDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			verboirregularDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		verboirregular = new  VerboIrregular();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verboirregular=verboirregularDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
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
		verboirregular = new  VerboIrregular();
		  		  
        try {
			
			verboirregular=verboirregularDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		verboirregular = new  VerboIrregular();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verboirregular=verboirregularDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
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
		verboirregular = new  VerboIrregular();
		  		  
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
		verboirregular = new  VerboIrregular();
		  		  
        try {
			
			verboirregular=verboirregularDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		verboirregular = new  VerboIrregular();
		  		  
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
		verboirregular = new  VerboIrregular();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =verboirregularDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregular = new  VerboIrregular();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=verboirregularDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verboirregular = new  VerboIrregular();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =verboirregularDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregular = new  VerboIrregular();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=verboirregularDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verboirregular = new  VerboIrregular();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =verboirregularDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verboirregular = new  VerboIrregular();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=verboirregularDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		verboirregular = new  VerboIrregular();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregular=verboirregularDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregular);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
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
		verboirregular = new  VerboIrregular();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregular=verboirregularDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verboirregular);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		  		  
        try {
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		verboirregulars = new  ArrayList<VerboIrregular>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
		verboirregulars = new  ArrayList<VerboIrregular>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verboirregulars);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(VerboIrregular verboirregular) throws Exception {
		Boolean estaValidado=false;
		
		if(verboirregular.getIsNew() || verboirregular.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<VerboIrregular> VerboIrregulars) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(VerboIrregular verboirregularLocal:verboirregulars) {				
			estaValidadoObjeto=this.validarGuardar(verboirregularLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<VerboIrregular> VerboIrregulars) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verboirregulars)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(VerboIrregular VerboIrregular) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verboirregular)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(VerboIrregular verboirregular) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+verboirregular.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"verboirregular","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(VerboIrregular_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(VerboIrregular_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//VerboIrregular_logic_add.checkVerboIrregularToSave(this.verboirregular,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboIrregular_logic_add.updateVerboIrregularToSave(this.verboirregular,this.arrDatoGeneral);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verboirregular,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboIrregular_util.permiteMantenimiento(this.verboirregular) && this.validarGuardar(this.verboirregular)) {
				VerboIrregular_data.save(this.verboirregular, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);				
			}

			//VerboIrregular_logic_add.checkVerboIrregularToSaveAfter(this.verboirregular,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.verboirregular.getIsDeleted()) {
				this.verboirregular=null;
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
			
			//VerboIrregular_logic_add.checkVerboIrregularToSave(this.verboirregular,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboIrregular_logic_add.updateVerboIrregularToSave(this.verboirregular,this.arrDatoGeneral);
			
			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verboirregular,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboIrregular_util.permiteMantenimiento(this.verboirregular) && this.validarGuardar(this.verboirregular)) {			
				VerboIrregular_data.save(this.verboirregular, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verboirregular,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);				
			}
			
			//VerboIrregular_logic_add.checkVerboIrregularToSaveAfter(this.verboirregular,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.verboirregular.getIsDeleted()) {
				this.verboirregular=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//VerboIrregular_logic_add.checkVerboIrregularToSaves(verboirregulars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVerboIrregular=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboIrregular verboirregularLocal:verboirregulars) {		
				
				if(!VerboIrregular_util.permiteMantenimiento(verboirregularLocal)) {
					continue;
				}
				
				//VerboIrregular_logic_add.updateVerboIrregularToSave(verboirregularLocal,this.arrDatoGeneral);
	        	
				VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verboirregularLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verboirregularLocal)) {
					VerboIrregular_data.save(verboirregularLocal, connexion);				
				} else {
					validadoTodosVerboIrregular=false;
				}
			}
			
			if(!validadoTodosVerboIrregular) {
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
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}
			
			//VerboIrregular_logic_add.checkVerboIrregularToSavesAfter(verboirregulars,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//VerboIrregular_logic_add.checkVerboIrregularToSaves(verboirregulars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVerboIrregular=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboIrregular verboirregularLocal:verboirregulars) {				
				if(!VerboIrregular_util.permiteMantenimiento(verboirregularLocal)) {
					continue;
				}
				
				//VerboIrregular_logic_add.updateVerboIrregularToSave(verboirregularLocal,this.arrDatoGeneral);
	        	
				VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verboirregularLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verboirregularLocal)) {				
					VerboIrregular_data.save(verboirregularLocal, connexion);				
				} else {
					validadoTodosVerboIrregular=false;
				}
			}
			
			if(!validadoTodosVerboIrregular) {
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
				
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}

			//VerboIrregular_logic_add.checkVerboIrregularToSavesAfter(verboirregulars,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboIrregular_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboIrregular> verboirregulars,VerboIrregular_param_return verboirregularParameterGeneral)throws Exception {
		 try {	
			VerboIrregular_param_return verboirregularReturnGeneral=new VerboIrregular_param_return();
	
			
			return verboirregularReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboIrregular_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboIrregular> verboirregulars,VerboIrregular_param_return verboirregularParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregular_param_return verboirregularReturnGeneral=new VerboIrregular_param_return();
	
			
			this.connexion.commit();
			
			return verboirregularReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboIrregular_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,VerboIrregular_param_return verboirregularParameterGeneral,Boolean isEsNuevoVerboIrregular,ArrayList<Classe> clases)throws Exception {
		 try {	
			VerboIrregular_param_return verboirregularReturnGeneral=new VerboIrregular_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verboirregularReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return verboirregularReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public VerboIrregular_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboIrregular> verboirregulars,VerboIrregular verboirregular,VerboIrregular_param_return verboirregularParameterGeneral,Boolean isEsNuevoVerboIrregular,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregular_param_return verboirregularReturnGeneral=new VerboIrregular_param_return();
	
			verboirregularReturnGeneral.setVerboIrregular(verboirregular);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verboirregularReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return verboirregularReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboIrregular_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,VerboIrregular_param_return verboirregularParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			VerboIrregular_param_return verboirregularReturnGeneral=new VerboIrregular_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.verboirregulars=new ArrayList<VerboIrregular>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.verboirregular=new VerboIrregular();
				
				
				if(conColumnasBase) {this.verboirregular.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.verboirregular.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.verboirregular.setinfinitivo(arrColumnas[iColumn++]);
				this.verboirregular.setpasado(arrColumnas[iColumn++]);
				this.verboirregular.setparticipio(arrColumnas[iColumn++]);
				this.verboirregular.settraduccion(arrColumnas[iColumn++]);
				this.verboirregular.setpronunciacion(arrColumnas[iColumn++]);
				
				this.verboirregulars.add(this.verboirregular);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			verboirregularReturnGeneral.setConRetornoEstaProcesado(true);
			verboirregularReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return verboirregularReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<VerboIrregular> verboirregularsAux= new ArrayList<VerboIrregular>();
		
		for(VerboIrregular verboirregular:verboirregulars) {
			if(!verboirregular.getIsDeleted()) {
				verboirregularsAux.add(verboirregular);
			}
		}
		
		verboirregulars=verboirregularsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<VerboIrregular> verboirregularsAux= new ArrayList<VerboIrregular>();
		
		for(VerboIrregular verboirregular : this.verboirregulars) {
			if(verboirregular==null) {
				verboirregularsAux.add(verboirregular);
			}
		}
		
		//this.verboirregulars=verboirregularsAux;
		
		this.verboirregulars.removeAll(verboirregularsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(verboirregular.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((verboirregular.getIsDeleted() || (verboirregular.getIsChanged()&&!verboirregular.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=verboirregularDataAccess.getSetVersionRow(connexion,verboirregular.getId());
				
				if(!verboirregular.getVersionRow().equals(timestamp)) {	
					verboirregular.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				verboirregular.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(verboirregular.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((verboirregular.getIsDeleted() || (verboirregular.getIsChanged()&&!verboirregular.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=verboirregularDataAccess.getSetVersionRow(connexion,verboirregular.getId());
			
			try {							
				if(!verboirregular.getVersionRow().equals(timestamp)) {	
					verboirregular.setVersionRow(timestamp);
				}
				
				verboirregular.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(verboirregulars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(VerboIrregular verboirregularAux:verboirregulars) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(verboirregularAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verboirregularAux.getIsDeleted() || (verboirregularAux.getIsChanged()&&!verboirregularAux.getIsNew())) {
						
						timestamp=verboirregularDataAccess.getSetVersionRow(connexion,verboirregularAux.getId());
						
						if(!verboirregular.getVersionRow().equals(timestamp)) {	
							verboirregularAux.setVersionRow(timestamp);
						}
								
						verboirregularAux.setIsChangedAuxiliar(false);														
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
		if(verboirregulars!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(VerboIrregular verboirregularAux:verboirregulars) {
					if(verboirregularAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verboirregularAux.getIsDeleted() || (verboirregularAux.getIsChanged()&&!verboirregularAux.getIsNew())) {
						
						timestamp=verboirregularDataAccess.getSetVersionRow(connexion,verboirregularAux.getId());
						
						if(!verboirregularAux.getVersionRow().equals(timestamp)) {	
							verboirregularAux.setVersionRow(timestamp);
						}
						
													
						verboirregularAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public VerboIrregular_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		VerboIrregular_param_return  verboirregular_return =new VerboIrregular_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-cargarCombosLoteForeignKeyVerboIrregularWithConnection");
			
			this.connexion.begin();
			
			verboirregular_return =new VerboIrregular_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			verboirregular_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			verboirregular_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			verboirregular_return.setnivelsFK(nivelsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return verboirregular_return;
	}
	
	public VerboIrregular_param_return cargarCombosLoteFK(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		VerboIrregular_param_return  verboirregular_return =new VerboIrregular_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			verboirregular_return =new VerboIrregular_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			verboirregular_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			verboirregular_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			verboirregular_return.setnivelsFK(nivelsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return verboirregular_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VerboIrregularDetalle_logic verboirregulardetalleLogic=new VerboIrregularDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyVerboIrregularWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VerboIrregularDetalle.class));
											
			

			verboirregulardetalleLogic.setConnexion(this.getConnexion());
			verboirregulardetalleLogic.setDatosCliente(this.datosCliente);
			verboirregulardetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(VerboIrregular verboirregular:this.verboirregulars) {
				

				classes=new ArrayList<Classe>();
				classes=VerboIrregularDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verboirregulardetalleLogic.setVerboIrregularDetalles(verboirregular.verboirregulardetalles);
				verboirregulardetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(VerboIrregular verboirregular,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//VerboIrregular_logic_add.updateVerboIrregularToGet(verboirregular,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
		verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
		verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
		verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
				continue;
			}

			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));

				if(this.isConDeep) {
					VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(this.connexion);
					verboirregulardetalleLogic.setVerboIrregularDetalles(verboirregular.getVerboIrregularDetalles());
					ArrayList<Classe> classesLocal=VerboIrregularDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verboirregulardetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboIrregularDetalle_util.refrescarFKsDescripciones(verboirregulardetalleLogic.getVerboIrregularDetalles());
					verboirregular.setVerboIrregularDetalles(verboirregulardetalleLogic.getVerboIrregularDetalles());
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
			verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregularDetalle.class));
			verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(verboirregular.getArea(),isDeep,deepLoadType,clases);
				
		verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(verboirregular.getSubArea(),isDeep,deepLoadType,clases);
				
		verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(verboirregular.getNivel(),isDeep,deepLoadType,clases);
				

		verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));

		for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
			VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
			verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(verboirregular.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepLoad(verboirregular.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(verboirregular.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));

				for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
					VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
					verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
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
			verboirregular.setArea(verboirregularDataAccess.getArea(connexion,verboirregular));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(verboirregular.getArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregular.setSubArea(verboirregularDataAccess.getSubArea(connexion,verboirregular));
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subareaLogic.deepLoad(verboirregular.getSubArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verboirregular.setNivel(verboirregularDataAccess.getNivel(connexion,verboirregular));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(verboirregular.getNivel(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregularDetalle.class));
			verboirregular.setVerboIrregularDetalles(verboirregularDataAccess.getVerboIrregularDetalles(connexion,verboirregular));

			for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
				VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
				verboirregulardetalleLogic.deepLoad(verboirregulardetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(VerboIrregular verboirregular,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//VerboIrregular_logic_add.updateVerboIrregularToSave(verboirregular,this.arrDatoGeneral);
			
VerboIrregular_data.save(verboirregular, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(verboirregular.getArea(),connexion);

		SubArea_data.save(verboirregular.getSubArea(),connexion);

		Nivel_data.save(verboirregular.getNivel(),connexion);

		for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
			verboirregulardetalle.setid_verbo_irregular(verboirregular.getId());
			VerboIrregularDetalle_data.save(verboirregulardetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(verboirregular.getArea(),connexion);
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(verboirregular.getSubArea(),connexion);
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(verboirregular.getNivel(),connexion);
				continue;
			}


			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
					verboirregulardetalle.setid_verbo_irregular(verboirregular.getId());
					VerboIrregularDetalle_data.save(verboirregulardetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(verboirregular.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(verboirregular.getArea(),isDeep,deepLoadType,clases);
				

		SubArea_data.save(verboirregular.getSubArea(),connexion);
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(verboirregular.getSubArea(),isDeep,deepLoadType,clases);
				

		Nivel_data.save(verboirregular.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(verboirregular.getNivel(),isDeep,deepLoadType,clases);
				

		for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
			VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
			verboirregulardetalle.setid_verbo_irregular(verboirregular.getId());
			VerboIrregularDetalle_data.save(verboirregulardetalle,connexion);
			verboirregulardetalleLogic.deepSave(verboirregulardetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(verboirregular.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(verboirregular.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(verboirregular.getSubArea(),connexion);
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepSave(verboirregular.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(verboirregular.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(verboirregular.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(VerboIrregularDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregularDetalle verboirregulardetalle:verboirregular.getVerboIrregularDetalles()) {
					VerboIrregularDetalle_logic verboirregulardetalleLogic= new VerboIrregularDetalle_logic(connexion);
					verboirregulardetalle.setid_verbo_irregular(verboirregular.getId());
					VerboIrregularDetalle_data.save(verboirregulardetalle,connexion);
					verboirregulardetalleLogic.deepSave(verboirregulardetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(VerboIrregular.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(verboirregular,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboIrregular_util.refrescarFKsDescripciones(verboirregular);
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
			this.deepLoad(this.verboirregular,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregular);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(VerboIrregular.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(verboirregulars!=null) {
				for(VerboIrregular verboirregular:verboirregulars) {
					this.deepLoad(verboirregular,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					VerboIrregular_util.refrescarFKsDescripciones(verboirregulars);
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
			if(verboirregulars!=null) {
				for(VerboIrregular verboirregular:verboirregulars) {
					this.deepLoad(verboirregular,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					VerboIrregular_util.refrescarFKsDescripciones(verboirregulars);
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
			this.getNewConnexionToDeep(VerboIrregular.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(verboirregular,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(VerboIrregular.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(verboirregulars!=null) {
				for(VerboIrregular verboirregular:verboirregulars) {
					this.deepSave(verboirregular,isDeep,deepLoadType,clases);
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
			if(verboirregulars!=null) {
				for(VerboIrregular verboirregular:verboirregulars) {
					this.deepSave(verboirregular,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsBusquedaPorInfinitivoWithConnection(String sFinalQuery,Pagination pagination,String infinitivo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralInfinitivo= new ParameterSelectionGeneral();
			parameterSelectionGeneralInfinitivo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+infinitivo+"%",VerboIrregular_util.INFINITIVO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralInfinitivo);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorInfinitivo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsBusquedaPorInfinitivo(String sFinalQuery,Pagination pagination,String infinitivo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralInfinitivo= new ParameterSelectionGeneral();
			parameterSelectionGeneralInfinitivo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+infinitivo+"%",VerboIrregular_util.INFINITIVO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralInfinitivo);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorInfinitivo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralTraduccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",VerboIrregular_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",VerboIrregular_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,VerboIrregular_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,VerboIrregular_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,VerboIrregular_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,VerboIrregular_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboIrregular.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSubArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,VerboIrregular_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,VerboIrregular_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			VerboIrregular_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verboirregulars=verboirregularDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboIrregular_util.refrescarFKsDescripciones(this.verboirregulars);
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
			if(VerboIrregular_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,VerboIrregular verboirregular,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(VerboIrregular_util.IS_CON_AUDITORIA) {
				if(verboirregular.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDataAccess.TABLENAME, verboirregular.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboIrregular_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboIrregular_logic.registrarAuditoriaDetalles(connexion,verboirregular,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(verboirregular.getIsDeleted()) {
					/*if(!verboirregular.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VerboIrregularDataAccess.TABLENAME, verboirregular.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////VerboIrregular_logic.registrarAuditoriaDetalles(connexion,verboirregular,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDataAccess.TABLENAME, verboirregular.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(verboirregular.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboIrregularDataAccess.TABLENAME, verboirregular.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboIrregular_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboIrregular_logic.registrarAuditoriaDetalles(connexion,verboirregular,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,VerboIrregular verboirregular)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(verboirregular.getIsNew()||!verboirregular.getid_area().equals(verboirregular.getVerboIrregularOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getid_area()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getid_area().toString();
				}
				if(verboirregular.getid_area()!=null)
				{
					strValorNuevo=verboirregular.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getid_sub_area().equals(verboirregular.getVerboIrregularOriginal().getid_sub_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getid_sub_area()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getid_sub_area().toString();
				}
				if(verboirregular.getid_sub_area()!=null)
				{
					strValorNuevo=verboirregular.getid_sub_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.IDSUBAREA,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getid_nivel().equals(verboirregular.getVerboIrregularOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getid_nivel()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getid_nivel().toString();
				}
				if(verboirregular.getid_nivel()!=null)
				{
					strValorNuevo=verboirregular.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getinfinitivo().equals(verboirregular.getVerboIrregularOriginal().getinfinitivo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getinfinitivo()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getinfinitivo();
				}
				if(verboirregular.getinfinitivo()!=null)
				{
					strValorNuevo=verboirregular.getinfinitivo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.INFINITIVO,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getpasado().equals(verboirregular.getVerboIrregularOriginal().getpasado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getpasado()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getpasado();
				}
				if(verboirregular.getpasado()!=null)
				{
					strValorNuevo=verboirregular.getpasado() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.PASADO,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getparticipio().equals(verboirregular.getVerboIrregularOriginal().getparticipio()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getparticipio()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getparticipio();
				}
				if(verboirregular.getparticipio()!=null)
				{
					strValorNuevo=verboirregular.getparticipio() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.PARTICIPIO,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.gettraduccion().equals(verboirregular.getVerboIrregularOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().gettraduccion()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().gettraduccion();
				}
				if(verboirregular.gettraduccion()!=null)
				{
					strValorNuevo=verboirregular.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(verboirregular.getIsNew()||!verboirregular.getpronunciacion().equals(verboirregular.getVerboIrregularOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verboirregular.getVerboIrregularOriginal().getpronunciacion()!=null)
				{
					strValorActual=verboirregular.getVerboIrregularOriginal().getpronunciacion();
				}
				if(verboirregular.getpronunciacion()!=null)
				{
					strValorNuevo=verboirregular.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboIrregularConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(VerboIrregular verboirregular,List<VerboIrregularDetalle> verboirregulardetalles) throws Exception {

		if(!verboirregular.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verboirregular,verboirregulardetalles,true);
		}
	}

	public void saveRelaciones(VerboIrregular verboirregular,List<VerboIrregularDetalle> verboirregulardetalles)throws Exception {

		if(!verboirregular.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verboirregular,verboirregulardetalles,false);
		}
	}

	public void saveRelacionesBase(VerboIrregular verboirregular,List<VerboIrregularDetalle> verboirregulardetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("VerboIrregular-saveRelacionesWithConnection");}
	
			verboirregular.setVerboIrregularDetalles(verboirregulardetalles);

			this.setVerboIrregular(verboirregular);

			if(true) {

				//VerboIrregular_logic_add.updateRelacionesToSave(verboirregular,this);

				if((verboirregular.getIsNew()||verboirregular.getIsChanged())&&!verboirregular.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(verboirregulardetalles);

				} else if(verboirregular.getIsDeleted()) {
					this.saveRelacionesDetalles(verboirregulardetalles);
					this.save();
				}

				//VerboIrregular_logic_add.updateRelacionesToSaveAfter(verboirregular,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			VerboIrregularDetalle_util.InicializarGeneralEntityAuxiliares(verboirregulardetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<VerboIrregularDetalle> verboirregulardetalles)throws Exception {
		try {
	

			Long idVerboIrregularActual=this.getVerboIrregular().getId();

			VerboIrregularDetalle_logic verboirregulardetalleLogic_Desde_VerboIrregular=new VerboIrregularDetalle_logic();
			verboirregulardetalleLogic_Desde_VerboIrregular.setVerboIrregularDetalles(verboirregulardetalles);

			verboirregulardetalleLogic_Desde_VerboIrregular.setConnexion(this.getConnexion());
			verboirregulardetalleLogic_Desde_VerboIrregular.setDatosCliente(this.datosCliente);

			for(VerboIrregularDetalle verboirregulardetalle_Desde_VerboIrregular:verboirregulardetalleLogic_Desde_VerboIrregular.getVerboIrregularDetalles()) {
				verboirregulardetalle_Desde_VerboIrregular.setid_verbo_irregular(idVerboIrregularActual);
			}

			verboirregulardetalleLogic_Desde_VerboIrregular.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboIrregular_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboIrregular_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVerboIrregular(VerboIrregular newVerboIrregular) {
		this.verboirregular = newVerboIrregular;
	}
	
	public VerboIrregular_data getVerboIrregularDataAccess() {
		return verboirregularDataAccess;
	}
	
	public void setVerboIrregularDataAccess(VerboIrregular_data newverboirregularDataAccess) {
		this.verboirregularDataAccess = newverboirregularDataAccess;
	}

	public void setVerboIrregulars(List<VerboIrregular> newVerboIrregulars) {
		this.verboirregulars = newVerboIrregulars;
	}
	
	public Object getVerboIrregularObject() {	
		this.verboirregularObject=this.verboirregularDataAccess.getEntityObject();
		return this.verboirregularObject;
	}
		
	public void setVerboIrregularObject(Object newVerboIrregularObject) {
		this.verboirregularObject = newVerboIrregularObject;
	}
	
	public List<Object> getVerboIrregularsObject() {		
		this.verboirregularsObject=this.verboirregularDataAccess.getEntitiesObject();
		return this.verboirregularsObject;
	}
		
	public void setVerboIrregularsObject(List<Object> newVerboIrregularsObject) {
		this.verboirregularsObject = newVerboIrregularsObject;
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
