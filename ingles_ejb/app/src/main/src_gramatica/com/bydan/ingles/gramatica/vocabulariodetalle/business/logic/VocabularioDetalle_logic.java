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
package com.bydan.ingles.gramatica.vocabulariodetalle.business.logic;


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
import com.bydan.ingles.gramatica.vocabulariodetalle.util.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_util;
import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalle_param_return;
//import com.bydan.ingles.gramatica.vocabulariodetalle.util.VocabularioDetalleParameterGeneral;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
//import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic_add;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.data.*;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;

import com.bydan.ingles.gramatica.tipogrammardetalle.business.entity.TipoGrammarDetalle;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.data.TipoGrammarDetalle_data;
import com.bydan.ingles.gramatica.tipogrammardetalle.business.logic.TipoGrammarDetalle_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class VocabularioDetalle_logic  extends GeneralEntityLogic implements VocabularioDetalle_logicI {
	static Logger logger = Logger.getLogger("VocabularioDetalle_logic.class");	

	protected VocabularioDetalle_data vocabulariodetalleDataAccess; 	
	protected VocabularioDetalle vocabulariodetalle;
	protected List<VocabularioDetalle> vocabulariodetalles;
	protected Object vocabulariodetalleObject;	
	protected List<Object> vocabulariodetallesObject;
	
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
	
	
	
	
	
	
	public VocabularioDetalle_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.vocabulariodetalleDataAccess = new VocabularioDetalle_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			VocabularioDetalle_data.ActualizarQueries();
			
			//this.vocabulariodetalleDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.vocabulariodetalles= new ArrayList<VocabularioDetalle>();
			this.vocabulariodetalle= new VocabularioDetalle();
			
			this.vocabulariodetalleObject=new Object();
			this.vocabulariodetallesObject=new ArrayList<Object>();
				
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
			
			this.vocabulariodetalleDataAccess.setConnexionType(this.connexionType);
			this.vocabulariodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public VocabularioDetalle_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.vocabulariodetalleDataAccess = new VocabularioDetalle_data();
			this.vocabulariodetalles= new ArrayList<VocabularioDetalle>();
			this.vocabulariodetalle= new VocabularioDetalle();
			this.vocabulariodetalleObject=new Object();
			this.vocabulariodetallesObject=new ArrayList<Object>();
			
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
			
			this.vocabulariodetalleDataAccess.setConnexionType(this.connexionType);
			this.vocabulariodetalleDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public VocabularioDetalle getVocabularioDetalle() throws Exception {	
		//VocabularioDetalle_logic_add.checkVocabularioDetalleToGet(vocabulariodetalle,this.datosCliente,this.arrDatoGeneral);
		//VocabularioDetalle_logic_add.updateVocabularioDetalleToGet(vocabulariodetalle,this.arrDatoGeneral);
		
		return vocabulariodetalle;
	}
	
	public List<VocabularioDetalle> getVocabularioDetalles() throws Exception {		
		if(this.vocabulariodetalles==null) {
			this.vocabulariodetalles= new ArrayList<VocabularioDetalle>();
		}
		
		this.quitarsNulos();
		
		//VocabularioDetalle_logic_add.checkVocabularioDetalleToGets(vocabulariodetalles,this.datosCliente,this.arrDatoGeneral);
		
		for (VocabularioDetalle vocabulariodetalleLocal: vocabulariodetalles ) {
			//VocabularioDetalle_logic_add.updateVocabularioDetalleToGet(vocabulariodetalleLocal,this.arrDatoGeneral);
		}
		
		return vocabulariodetalles;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.vocabulariodetalleDataAccess!=null) {
			this.vocabulariodetalleDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			vocabulariodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			vocabulariodetalleDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
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
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
        try {
			
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
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
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
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
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
        try {
			
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		vocabulariodetalle = new  VocabularioDetalle();
		  		  
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
		vocabulariodetalle = new  VocabularioDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =vocabulariodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulariodetalle = new  VocabularioDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=vocabulariodetalleDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		vocabulariodetalle = new  VocabularioDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =vocabulariodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulariodetalle = new  VocabularioDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=vocabulariodetalleDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		vocabulariodetalle = new  VocabularioDetalle();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =vocabulariodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		vocabulariodetalle = new  VocabularioDetalle();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=vocabulariodetalleDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		vocabulariodetalle = new  VocabularioDetalle();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
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
		vocabulariodetalle = new  VocabularioDetalle();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalle=vocabulariodetalleDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalle);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		  		  
        try {
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
		vocabulariodetalles = new  ArrayList<VocabularioDetalle>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(vocabulariodetalles);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(VocabularioDetalle vocabulariodetalle) throws Exception {
		Boolean estaValidado=false;
		
		if(vocabulariodetalle.getIsNew() || vocabulariodetalle.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<VocabularioDetalle> VocabularioDetalles) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetalles) {				
			estaValidadoObjeto=this.validarGuardar(vocabulariodetalleLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<VocabularioDetalle> VocabularioDetalles) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(vocabulariodetalles)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(VocabularioDetalle VocabularioDetalle) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(vocabulariodetalle)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(VocabularioDetalle vocabulariodetalle) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+vocabulariodetalle.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"vocabulariodetalle","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(VocabularioDetalle_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(VocabularioDetalle_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSave(this.vocabulariodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VocabularioDetalle_logic_add.updateVocabularioDetalleToSave(this.vocabulariodetalle,this.arrDatoGeneral);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.vocabulariodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VocabularioDetalle_util.permiteMantenimiento(this.vocabulariodetalle) && this.validarGuardar(this.vocabulariodetalle)) {
				VocabularioDetalle_data.save(this.vocabulariodetalle, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);				
			}

			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSaveAfter(this.vocabulariodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.vocabulariodetalle.getIsDeleted()) {
				this.vocabulariodetalle=null;
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
			
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSave(this.vocabulariodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VocabularioDetalle_logic_add.updateVocabularioDetalleToSave(this.vocabulariodetalle,this.arrDatoGeneral);
			
			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.vocabulariodetalle,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VocabularioDetalle_util.permiteMantenimiento(this.vocabulariodetalle) && this.validarGuardar(this.vocabulariodetalle)) {			
				VocabularioDetalle_data.save(this.vocabulariodetalle, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.vocabulariodetalle,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);				
			}
			
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSaveAfter(this.vocabulariodetalle,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.vocabulariodetalle.getIsDeleted()) {
				this.vocabulariodetalle=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSaves(vocabulariodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVocabularioDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetalles) {		
				
				if(!VocabularioDetalle_util.permiteMantenimiento(vocabulariodetalleLocal)) {
					continue;
				}
				
				//VocabularioDetalle_logic_add.updateVocabularioDetalleToSave(vocabulariodetalleLocal,this.arrDatoGeneral);
	        	
				VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),vocabulariodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(vocabulariodetalleLocal)) {
					VocabularioDetalle_data.save(vocabulariodetalleLocal, connexion);				
				} else {
					validadoTodosVocabularioDetalle=false;
				}
			}
			
			if(!validadoTodosVocabularioDetalle) {
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
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}
			
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSavesAfter(vocabulariodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSaves(vocabulariodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVocabularioDetalle=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VocabularioDetalle vocabulariodetalleLocal:vocabulariodetalles) {				
				if(!VocabularioDetalle_util.permiteMantenimiento(vocabulariodetalleLocal)) {
					continue;
				}
				
				//VocabularioDetalle_logic_add.updateVocabularioDetalleToSave(vocabulariodetalleLocal,this.arrDatoGeneral);
	        	
				VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),vocabulariodetalleLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(vocabulariodetalleLocal)) {				
					VocabularioDetalle_data.save(vocabulariodetalleLocal, connexion);				
				} else {
					validadoTodosVocabularioDetalle=false;
				}
			}
			
			if(!validadoTodosVocabularioDetalle) {
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
				
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}

			//VocabularioDetalle_logic_add.checkVocabularioDetalleToSavesAfter(vocabulariodetalles,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VocabularioDetalle_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle_param_return vocabulariodetalleParameterGeneral)throws Exception {
		 try {	
			VocabularioDetalle_param_return vocabulariodetalleReturnGeneral=new VocabularioDetalle_param_return();
	
			
			return vocabulariodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VocabularioDetalle_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle_param_return vocabulariodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			VocabularioDetalle_param_return vocabulariodetalleReturnGeneral=new VocabularioDetalle_param_return();
	
			
			this.connexion.commit();
			
			return vocabulariodetalleReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VocabularioDetalle_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,VocabularioDetalle_param_return vocabulariodetalleParameterGeneral,Boolean isEsNuevoVocabularioDetalle,ArrayList<Classe> clases)throws Exception {
		 try {	
			VocabularioDetalle_param_return vocabulariodetalleReturnGeneral=new VocabularioDetalle_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				vocabulariodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return vocabulariodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public VocabularioDetalle_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VocabularioDetalle> vocabulariodetalles,VocabularioDetalle vocabulariodetalle,VocabularioDetalle_param_return vocabulariodetalleParameterGeneral,Boolean isEsNuevoVocabularioDetalle,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			VocabularioDetalle_param_return vocabulariodetalleReturnGeneral=new VocabularioDetalle_param_return();
	
			vocabulariodetalleReturnGeneral.setVocabularioDetalle(vocabulariodetalle);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				vocabulariodetalleReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return vocabulariodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VocabularioDetalle_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,VocabularioDetalle_param_return vocabulariodetalleParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			VocabularioDetalle_param_return vocabulariodetalleReturnGeneral=new VocabularioDetalle_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.vocabulariodetalles=new ArrayList<VocabularioDetalle>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.vocabulariodetalle=new VocabularioDetalle();
				
				
				if(conColumnasBase) {this.vocabulariodetalle.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.vocabulariodetalle.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.vocabulariodetalle.setidea(arrColumnas[iColumn++]);
				this.vocabulariodetalle.settraduccion(arrColumnas[iColumn++]);
				this.vocabulariodetalle.setpronunciacion(arrColumnas[iColumn++]);
				this.vocabulariodetalle.setdescripcion(arrColumnas[iColumn++]);
				
				this.vocabulariodetalles.add(this.vocabulariodetalle);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			vocabulariodetalleReturnGeneral.setConRetornoEstaProcesado(true);
			vocabulariodetalleReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return vocabulariodetalleReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<VocabularioDetalle> vocabulariodetallesAux= new ArrayList<VocabularioDetalle>();
		
		for(VocabularioDetalle vocabulariodetalle:vocabulariodetalles) {
			if(!vocabulariodetalle.getIsDeleted()) {
				vocabulariodetallesAux.add(vocabulariodetalle);
			}
		}
		
		vocabulariodetalles=vocabulariodetallesAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<VocabularioDetalle> vocabulariodetallesAux= new ArrayList<VocabularioDetalle>();
		
		for(VocabularioDetalle vocabulariodetalle : this.vocabulariodetalles) {
			if(vocabulariodetalle==null) {
				vocabulariodetallesAux.add(vocabulariodetalle);
			}
		}
		
		//this.vocabulariodetalles=vocabulariodetallesAux;
		
		this.vocabulariodetalles.removeAll(vocabulariodetallesAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(vocabulariodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((vocabulariodetalle.getIsDeleted() || (vocabulariodetalle.getIsChanged()&&!vocabulariodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=vocabulariodetalleDataAccess.getSetVersionRow(connexion,vocabulariodetalle.getId());
				
				if(!vocabulariodetalle.getVersionRow().equals(timestamp)) {	
					vocabulariodetalle.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				vocabulariodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(vocabulariodetalle.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((vocabulariodetalle.getIsDeleted() || (vocabulariodetalle.getIsChanged()&&!vocabulariodetalle.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=vocabulariodetalleDataAccess.getSetVersionRow(connexion,vocabulariodetalle.getId());
			
			try {							
				if(!vocabulariodetalle.getVersionRow().equals(timestamp)) {	
					vocabulariodetalle.setVersionRow(timestamp);
				}
				
				vocabulariodetalle.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(vocabulariodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetalles) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(vocabulariodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(vocabulariodetalleAux.getIsDeleted() || (vocabulariodetalleAux.getIsChanged()&&!vocabulariodetalleAux.getIsNew())) {
						
						timestamp=vocabulariodetalleDataAccess.getSetVersionRow(connexion,vocabulariodetalleAux.getId());
						
						if(!vocabulariodetalle.getVersionRow().equals(timestamp)) {	
							vocabulariodetalleAux.setVersionRow(timestamp);
						}
								
						vocabulariodetalleAux.setIsChangedAuxiliar(false);														
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
		if(vocabulariodetalles!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(VocabularioDetalle vocabulariodetalleAux:vocabulariodetalles) {
					if(vocabulariodetalleAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(vocabulariodetalleAux.getIsDeleted() || (vocabulariodetalleAux.getIsChanged()&&!vocabulariodetalleAux.getIsNew())) {
						
						timestamp=vocabulariodetalleDataAccess.getSetVersionRow(connexion,vocabulariodetalleAux.getId());
						
						if(!vocabulariodetalleAux.getVersionRow().equals(timestamp)) {	
							vocabulariodetalleAux.setVersionRow(timestamp);
						}
						
													
						vocabulariodetalleAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public VocabularioDetalle_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalVocabulario,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VocabularioDetalle_param_return  vocabulariodetalle_return =new VocabularioDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-cargarCombosLoteForeignKeyVocabularioDetalleWithConnection");
			
			this.connexion.begin();
			
			vocabulariodetalle_return =new VocabularioDetalle_param_return();
			
			

			List<Vocabulario> vocabulariosForeignKey=new ArrayList<Vocabulario>();
			Vocabulario_logic vocabularioLogic=new Vocabulario_logic();
			vocabularioLogic.setConnexion(this.connexion);
			vocabularioLogic.getVocabularioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVocabulario.equals("NONE")) {
				vocabularioLogic.getTodos(finalQueryGlobalVocabulario,new Pagination());
				vocabulariosForeignKey=vocabularioLogic.getVocabularios();
			}

			vocabulariodetalle_return.setvocabulariosFK(vocabulariosForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			vocabulariodetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return vocabulariodetalle_return;
	}
	
	public VocabularioDetalle_param_return cargarCombosLoteFK(String finalQueryGlobalVocabulario,String finalQueryGlobalTipoGrammarDetalle) throws Exception {
		VocabularioDetalle_param_return  vocabulariodetalle_return =new VocabularioDetalle_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			vocabulariodetalle_return =new VocabularioDetalle_param_return();
			
			

			List<Vocabulario> vocabulariosForeignKey=new ArrayList<Vocabulario>();
			Vocabulario_logic vocabularioLogic=new Vocabulario_logic();
			vocabularioLogic.setConnexion(this.connexion);
			vocabularioLogic.getVocabularioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalVocabulario.equals("NONE")) {
				vocabularioLogic.getTodos(finalQueryGlobalVocabulario,new Pagination());
				vocabulariosForeignKey=vocabularioLogic.getVocabularios();
			}

			vocabulariodetalle_return.setvocabulariosFK(vocabulariosForeignKey);


			List<TipoGrammarDetalle> tipogrammardetallesForeignKey=new ArrayList<TipoGrammarDetalle>();
			TipoGrammarDetalle_logic tipogrammardetalleLogic=new TipoGrammarDetalle_logic();
			tipogrammardetalleLogic.setConnexion(this.connexion);
			tipogrammardetalleLogic.getTipoGrammarDetalleDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalTipoGrammarDetalle.equals("NONE")) {
				tipogrammardetalleLogic.getTodos(finalQueryGlobalTipoGrammarDetalle,new Pagination());
				tipogrammardetallesForeignKey=tipogrammardetalleLogic.getTipoGrammarDetalles();
			}

			vocabulariodetalle_return.settipogrammardetallesFK(tipogrammardetallesForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return vocabulariodetalle_return;
	}
	
	
	public void deepLoad(VocabularioDetalle vocabulariodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//VocabularioDetalle_logic_add.updateVocabularioDetalleToGet(vocabulariodetalle,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
		vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
		Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
		vocabularioLogic.deepLoad(vocabulariodetalle.getVocabulario(),isDeep,deepLoadType,clases);
				
		vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(vocabulariodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
				Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
				vocabularioLogic.deepLoad(vocabulariodetalle.getVocabulario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepLoad(vocabulariodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulariodetalle.setVocabulario(vocabulariodetalleDataAccess.getVocabulario(connexion,vocabulariodetalle));
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabularioLogic.deepLoad(vocabulariodetalle.getVocabulario(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			vocabulariodetalle.setTipoGrammarDetalle(vocabulariodetalleDataAccess.getTipoGrammarDetalle(connexion,vocabulariodetalle));
			TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
			tipogrammardetalleLogic.deepLoad(vocabulariodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(VocabularioDetalle vocabulariodetalle,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//VocabularioDetalle_logic_add.updateVocabularioDetalleToSave(vocabulariodetalle,this.arrDatoGeneral);
			
VocabularioDetalle_data.save(vocabulariodetalle, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Vocabulario_data.save(vocabulariodetalle.getVocabulario(),connexion);

		TipoGrammarDetalle_data.save(vocabulariodetalle.getTipoGrammarDetalle(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				Vocabulario_data.save(vocabulariodetalle.getVocabulario(),connexion);
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(vocabulariodetalle.getTipoGrammarDetalle(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Vocabulario_data.save(vocabulariodetalle.getVocabulario(),connexion);
		Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
		vocabularioLogic.deepLoad(vocabulariodetalle.getVocabulario(),isDeep,deepLoadType,clases);
				

		TipoGrammarDetalle_data.save(vocabulariodetalle.getTipoGrammarDetalle(),connexion);
		TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
		tipogrammardetalleLogic.deepLoad(vocabulariodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)) {
				Vocabulario_data.save(vocabulariodetalle.getVocabulario(),connexion);
				Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
				vocabularioLogic.deepSave(vocabulariodetalle.getVocabulario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(TipoGrammarDetalle.class)) {
				TipoGrammarDetalle_data.save(vocabulariodetalle.getTipoGrammarDetalle(),connexion);
				TipoGrammarDetalle_logic tipogrammardetalleLogic= new TipoGrammarDetalle_logic(connexion);
				tipogrammardetalleLogic.deepSave(vocabulariodetalle.getTipoGrammarDetalle(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(VocabularioDetalle.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VocabularioDetalle_util.refrescarFKsDescripciones(vocabulariodetalle);
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
			this.deepLoad(this.vocabulariodetalle,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalle);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(VocabularioDetalle.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(vocabulariodetalles!=null) {
				for(VocabularioDetalle vocabulariodetalle:vocabulariodetalles) {
					this.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					VocabularioDetalle_util.refrescarFKsDescripciones(vocabulariodetalles);
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
			if(vocabulariodetalles!=null) {
				for(VocabularioDetalle vocabulariodetalle:vocabulariodetalles) {
					this.deepLoad(vocabulariodetalle,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					VocabularioDetalle_util.refrescarFKsDescripciones(vocabulariodetalles);
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
			this.getNewConnexionToDeep(VocabularioDetalle.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(vocabulariodetalle,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(VocabularioDetalle.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(vocabulariodetalles!=null) {
				for(VocabularioDetalle vocabulariodetalle:vocabulariodetalles) {
					this.deepSave(vocabulariodetalle,isDeep,deepLoadType,clases);
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
			if(vocabulariodetalles!=null) {
				for(VocabularioDetalle vocabulariodetalle:vocabulariodetalles) {
					this.deepSave(vocabulariodetalle,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdTipoGrammarDetalleWithConnection(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VocabularioDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdTipoGrammarDetalle(String sFinalQuery,Pagination pagination,Long id_tipo_grammar_detalle)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidTipoGrammarDetalle= new ParameterSelectionGeneral();
			parameterSelectionGeneralidTipoGrammarDetalle.setParameterSelectionGeneralEqual(ParameterType.LONG,id_tipo_grammar_detalle,VocabularioDetalle_util.IDTIPOGRAMMARDETALLE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidTipoGrammarDetalle);

			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdTipoGrammarDetalle","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdVocabularioWithConnection(String sFinalQuery,Pagination pagination,Long id_vocabulario)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VocabularioDetalle.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVocabulario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVocabulario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_vocabulario,VocabularioDetalle_util.IDVOCABULARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVocabulario);

			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVocabulario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdVocabulario(String sFinalQuery,Pagination pagination,Long id_vocabulario)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidVocabulario= new ParameterSelectionGeneral();
			parameterSelectionGeneralidVocabulario.setParameterSelectionGeneralEqual(ParameterType.LONG,id_vocabulario,VocabularioDetalle_util.IDVOCABULARIO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidVocabulario);

			VocabularioDetalle_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdVocabulario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			vocabulariodetalles=vocabulariodetalleDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VocabularioDetalle_util.refrescarFKsDescripciones(this.vocabulariodetalles);
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
			if(VocabularioDetalle_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDetalleDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,VocabularioDetalle vocabulariodetalle,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(VocabularioDetalle_util.IS_CON_AUDITORIA) {
				if(vocabulariodetalle.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDetalleDataAccess.TABLENAME, vocabulariodetalle.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VocabularioDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VocabularioDetalle_logic.registrarAuditoriaDetalles(connexion,vocabulariodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(vocabulariodetalle.getIsDeleted()) {
					/*if(!vocabulariodetalle.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VocabularioDetalleDataAccess.TABLENAME, vocabulariodetalle.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////VocabularioDetalle_logic.registrarAuditoriaDetalles(connexion,vocabulariodetalle,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDetalleDataAccess.TABLENAME, vocabulariodetalle.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(vocabulariodetalle.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VocabularioDetalleDataAccess.TABLENAME, vocabulariodetalle.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VocabularioDetalle_util.IS_CON_AUDITORIA_DETALLE) {
						////VocabularioDetalle_logic.registrarAuditoriaDetalles(connexion,vocabulariodetalle,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,VocabularioDetalle vocabulariodetalle)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.getid_vocabulario().equals(vocabulariodetalle.getVocabularioDetalleOriginal().getid_vocabulario()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().getid_vocabulario()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().getid_vocabulario().toString();
				}
				if(vocabulariodetalle.getid_vocabulario()!=null)
				{
					strValorNuevo=vocabulariodetalle.getid_vocabulario().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.IDVOCABULARIO,strValorActual,strValorNuevo);
			}	
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.getid_tipo_grammar_detalle().equals(vocabulariodetalle.getVocabularioDetalleOriginal().getid_tipo_grammar_detalle()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().getid_tipo_grammar_detalle()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().getid_tipo_grammar_detalle().toString();
				}
				if(vocabulariodetalle.getid_tipo_grammar_detalle()!=null)
				{
					strValorNuevo=vocabulariodetalle.getid_tipo_grammar_detalle().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.IDTIPOGRAMMARDETALLE,strValorActual,strValorNuevo);
			}	
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.getidea().equals(vocabulariodetalle.getVocabularioDetalleOriginal().getidea()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().getidea()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().getidea();
				}
				if(vocabulariodetalle.getidea()!=null)
				{
					strValorNuevo=vocabulariodetalle.getidea() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.IDEA,strValorActual,strValorNuevo);
			}	
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.gettraduccion().equals(vocabulariodetalle.getVocabularioDetalleOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().gettraduccion()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().gettraduccion();
				}
				if(vocabulariodetalle.gettraduccion()!=null)
				{
					strValorNuevo=vocabulariodetalle.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.getpronunciacion().equals(vocabulariodetalle.getVocabularioDetalleOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().getpronunciacion()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().getpronunciacion();
				}
				if(vocabulariodetalle.getpronunciacion()!=null)
				{
					strValorNuevo=vocabulariodetalle.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
			
			if(vocabulariodetalle.getIsNew()||!vocabulariodetalle.getdescripcion().equals(vocabulariodetalle.getVocabularioDetalleOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(vocabulariodetalle.getVocabularioDetalleOriginal().getdescripcion()!=null)
				{
					strValorActual=vocabulariodetalle.getVocabularioDetalleOriginal().getdescripcion();
				}
				if(vocabulariodetalle.getdescripcion()!=null)
				{
					strValorNuevo=vocabulariodetalle.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VocabularioDetalleConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(VocabularioDetalle vocabulariodetalle) throws Exception {

		if(!vocabulariodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(vocabulariodetalle,true);
		}
	}

	public void saveRelaciones(VocabularioDetalle vocabulariodetalle)throws Exception {

		if(!vocabulariodetalle.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(vocabulariodetalle,false);
		}
	}

	public void saveRelacionesBase(VocabularioDetalle vocabulariodetalle,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("VocabularioDetalle-saveRelacionesWithConnection");}
	

			this.setVocabularioDetalle(vocabulariodetalle);

			if(true) {

				//VocabularioDetalle_logic_add.updateRelacionesToSave(vocabulariodetalle,this);

				if((vocabulariodetalle.getIsNew()||vocabulariodetalle.getIsChanged())&&!vocabulariodetalle.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(vocabulariodetalle.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//VocabularioDetalle_logic_add.updateRelacionesToSaveAfter(vocabulariodetalle,this);

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
			ArrayList<Classe> classes=VocabularioDetalle_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VocabularioDetalle_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVocabularioDetalle(VocabularioDetalle newVocabularioDetalle) {
		this.vocabulariodetalle = newVocabularioDetalle;
	}
	
	public VocabularioDetalle_data getVocabularioDetalleDataAccess() {
		return vocabulariodetalleDataAccess;
	}
	
	public void setVocabularioDetalleDataAccess(VocabularioDetalle_data newvocabulariodetalleDataAccess) {
		this.vocabulariodetalleDataAccess = newvocabulariodetalleDataAccess;
	}

	public void setVocabularioDetalles(List<VocabularioDetalle> newVocabularioDetalles) {
		this.vocabulariodetalles = newVocabularioDetalles;
	}
	
	public Object getVocabularioDetalleObject() {	
		this.vocabulariodetalleObject=this.vocabulariodetalleDataAccess.getEntityObject();
		return this.vocabulariodetalleObject;
	}
		
	public void setVocabularioDetalleObject(Object newVocabularioDetalleObject) {
		this.vocabulariodetalleObject = newVocabularioDetalleObject;
	}
	
	public List<Object> getVocabularioDetallesObject() {		
		this.vocabulariodetallesObject=this.vocabulariodetalleDataAccess.getEntitiesObject();
		return this.vocabulariodetallesObject;
	}
		
	public void setVocabularioDetallesObject(List<Object> newVocabularioDetallesObject) {
		this.vocabulariodetallesObject = newVocabularioDetallesObject;
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
