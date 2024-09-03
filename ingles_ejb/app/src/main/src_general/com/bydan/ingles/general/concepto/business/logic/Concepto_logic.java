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
package com.bydan.ingles.general.concepto.business.logic;


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
import com.bydan.ingles.general.concepto.util.*;
import com.bydan.ingles.general.concepto.util.Concepto_util;
import com.bydan.ingles.general.concepto.util.Concepto_param_return;
//import com.bydan.ingles.general.concepto.util.ConceptoParameterGeneral;
import com.bydan.ingles.general.concepto.business.entity.Concepto;
//import com.bydan.ingles.general.concepto.business.logic.Concepto_logic_add;
import com.bydan.ingles.general.concepto.business.data.*;
import com.bydan.ingles.general.concepto.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.general.conceptodetalle.business.entity.ConceptoDetalle;
import com.bydan.ingles.general.conceptodetalle.business.data.ConceptoDetalle_data;
import com.bydan.ingles.general.conceptodetalle.business.logic.ConceptoDetalle_logic;
import com.bydan.ingles.general.conceptodetalle.util.ConceptoDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class Concepto_logic  extends GeneralEntityLogic implements Concepto_logicI {
	static Logger logger = Logger.getLogger("Concepto_logic.class");	

	protected Concepto_data conceptoDataAccess; 	
	protected Concepto concepto;
	protected List<Concepto> conceptos;
	protected Object conceptoObject;	
	protected List<Object> conceptosObject;
	
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
	
	
	
	
	
	
	public Concepto_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.conceptoDataAccess = new Concepto_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Concepto_data.ActualizarQueries();
			
			//this.conceptoDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.conceptos= new ArrayList<Concepto>();
			this.concepto= new Concepto();
			
			this.conceptoObject=new Object();
			this.conceptosObject=new ArrayList<Object>();
				
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
			
			this.conceptoDataAccess.setConnexionType(this.connexionType);
			this.conceptoDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Concepto_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.conceptoDataAccess = new Concepto_data();
			this.conceptos= new ArrayList<Concepto>();
			this.concepto= new Concepto();
			this.conceptoObject=new Object();
			this.conceptosObject=new ArrayList<Object>();
			
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
			
			this.conceptoDataAccess.setConnexionType(this.connexionType);
			this.conceptoDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Concepto getConcepto() throws Exception {	
		//Concepto_logic_add.checkConceptoToGet(concepto,this.datosCliente,this.arrDatoGeneral);
		//Concepto_logic_add.updateConceptoToGet(concepto,this.arrDatoGeneral);
		
		return concepto;
	}
	
	public List<Concepto> getConceptos() throws Exception {		
		if(this.conceptos==null) {
			this.conceptos= new ArrayList<Concepto>();
		}
		
		this.quitarsNulos();
		
		//Concepto_logic_add.checkConceptoToGets(conceptos,this.datosCliente,this.arrDatoGeneral);
		
		for (Concepto conceptoLocal: conceptos ) {
			//Concepto_logic_add.updateConceptoToGet(conceptoLocal,this.arrDatoGeneral);
		}
		
		return conceptos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.conceptoDataAccess!=null) {
			this.conceptoDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			conceptoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			conceptoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		concepto = new  Concepto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			concepto=conceptoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
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
		concepto = new  Concepto();
		  		  
        try {
			
			concepto=conceptoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		concepto = new  Concepto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			concepto=conceptoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
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
		concepto = new  Concepto();
		  		  
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
		concepto = new  Concepto();
		  		  
        try {
			
			concepto=conceptoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		concepto = new  Concepto();
		  		  
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
		concepto = new  Concepto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =conceptoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		concepto = new  Concepto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=conceptoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		concepto = new  Concepto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =conceptoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		concepto = new  Concepto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=conceptoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		concepto = new  Concepto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =conceptoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		concepto = new  Concepto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=conceptoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		  		  
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
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		conceptos = new  ArrayList<Concepto>();
		  		  
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
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		concepto = new  Concepto();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			concepto=conceptoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(concepto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
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
		concepto = new  Concepto();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			concepto=conceptoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(concepto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		  		  
        try {
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		conceptos = new  ArrayList<Concepto>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
		conceptos = new  ArrayList<Concepto>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(conceptos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Concepto concepto) throws Exception {
		Boolean estaValidado=false;
		
		if(concepto.getIsNew() || concepto.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Concepto> Conceptos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Concepto conceptoLocal:conceptos) {				
			estaValidadoObjeto=this.validarGuardar(conceptoLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Concepto> Conceptos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(conceptos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Concepto Concepto) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(concepto)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Concepto concepto) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+concepto.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"concepto","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Concepto_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Concepto_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Concepto_logic_add.checkConceptoToSave(this.concepto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Concepto_logic_add.updateConceptoToSave(this.concepto,this.arrDatoGeneral);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.concepto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Concepto_util.permiteMantenimiento(this.concepto) && this.validarGuardar(this.concepto)) {
				Concepto_data.save(this.concepto, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Concepto_util.refrescarFKsDescripciones(this.concepto);				
			}

			//Concepto_logic_add.checkConceptoToSaveAfter(this.concepto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.concepto.getIsDeleted()) {
				this.concepto=null;
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
			
			//Concepto_logic_add.checkConceptoToSave(this.concepto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Concepto_logic_add.updateConceptoToSave(this.concepto,this.arrDatoGeneral);
			
			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.concepto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Concepto_util.permiteMantenimiento(this.concepto) && this.validarGuardar(this.concepto)) {			
				Concepto_data.save(this.concepto, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Concepto_util.refrescarFKsDescripciones(this.concepto);				
			}
			
			//Concepto_logic_add.checkConceptoToSaveAfter(this.concepto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.concepto.getIsDeleted()) {
				this.concepto=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Concepto_logic_add.checkConceptoToSaves(conceptos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosConcepto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Concepto conceptoLocal:conceptos) {		
				
				if(!Concepto_util.permiteMantenimiento(conceptoLocal)) {
					continue;
				}
				
				//Concepto_logic_add.updateConceptoToSave(conceptoLocal,this.arrDatoGeneral);
	        	
				Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),conceptoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(conceptoLocal)) {
					Concepto_data.save(conceptoLocal, connexion);				
				} else {
					validadoTodosConcepto=false;
				}
			}
			
			if(!validadoTodosConcepto) {
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
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}
			
			//Concepto_logic_add.checkConceptoToSavesAfter(conceptos,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Concepto_logic_add.checkConceptoToSaves(conceptos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosConcepto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Concepto conceptoLocal:conceptos) {				
				if(!Concepto_util.permiteMantenimiento(conceptoLocal)) {
					continue;
				}
				
				//Concepto_logic_add.updateConceptoToSave(conceptoLocal,this.arrDatoGeneral);
	        	
				Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),conceptoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(conceptoLocal)) {				
					Concepto_data.save(conceptoLocal, connexion);				
				} else {
					validadoTodosConcepto=false;
				}
			}
			
			if(!validadoTodosConcepto) {
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
				
				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}

			//Concepto_logic_add.checkConceptoToSavesAfter(conceptos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Concepto_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Concepto> conceptos,Concepto_param_return conceptoParameterGeneral)throws Exception {
		 try {	
			Concepto_param_return conceptoReturnGeneral=new Concepto_param_return();
	
			
			return conceptoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Concepto_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Concepto> conceptos,Concepto_param_return conceptoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Concepto_param_return conceptoReturnGeneral=new Concepto_param_return();
	
			
			this.connexion.commit();
			
			return conceptoReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Concepto_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Concepto> conceptos,Concepto concepto,Concepto_param_return conceptoParameterGeneral,Boolean isEsNuevoConcepto,ArrayList<Classe> clases)throws Exception {
		 try {	
			Concepto_param_return conceptoReturnGeneral=new Concepto_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				conceptoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return conceptoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Concepto_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Concepto> conceptos,Concepto concepto,Concepto_param_return conceptoParameterGeneral,Boolean isEsNuevoConcepto,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Concepto_param_return conceptoReturnGeneral=new Concepto_param_return();
	
			conceptoReturnGeneral.setConcepto(concepto);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				conceptoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return conceptoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Concepto_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Concepto_param_return conceptoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Concepto_param_return conceptoReturnGeneral=new Concepto_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.conceptos=new ArrayList<Concepto>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.concepto=new Concepto();
				
				
				if(conColumnasBase) {this.concepto.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.concepto.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.concepto.setcodigo(arrColumnas[iColumn++]);
				this.concepto.setnombre(arrColumnas[iColumn++]);
				this.concepto.setdescripcion(arrColumnas[iColumn++]);
				
				this.conceptos.add(this.concepto);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			conceptoReturnGeneral.setConRetornoEstaProcesado(true);
			conceptoReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return conceptoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Concepto> conceptosAux= new ArrayList<Concepto>();
		
		for(Concepto concepto:conceptos) {
			if(!concepto.getIsDeleted()) {
				conceptosAux.add(concepto);
			}
		}
		
		conceptos=conceptosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Concepto> conceptosAux= new ArrayList<Concepto>();
		
		for(Concepto concepto : this.conceptos) {
			if(concepto==null) {
				conceptosAux.add(concepto);
			}
		}
		
		//this.conceptos=conceptosAux;
		
		this.conceptos.removeAll(conceptosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(concepto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((concepto.getIsDeleted() || (concepto.getIsChanged()&&!concepto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=conceptoDataAccess.getSetVersionRow(connexion,concepto.getId());
				
				if(!concepto.getVersionRow().equals(timestamp)) {	
					concepto.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				concepto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(concepto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((concepto.getIsDeleted() || (concepto.getIsChanged()&&!concepto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=conceptoDataAccess.getSetVersionRow(connexion,concepto.getId());
			
			try {							
				if(!concepto.getVersionRow().equals(timestamp)) {	
					concepto.setVersionRow(timestamp);
				}
				
				concepto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(conceptos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Concepto conceptoAux:conceptos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(conceptoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(conceptoAux.getIsDeleted() || (conceptoAux.getIsChanged()&&!conceptoAux.getIsNew())) {
						
						timestamp=conceptoDataAccess.getSetVersionRow(connexion,conceptoAux.getId());
						
						if(!concepto.getVersionRow().equals(timestamp)) {	
							conceptoAux.setVersionRow(timestamp);
						}
								
						conceptoAux.setIsChangedAuxiliar(false);														
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
		if(conceptos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Concepto conceptoAux:conceptos) {
					if(conceptoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(conceptoAux.getIsDeleted() || (conceptoAux.getIsChanged()&&!conceptoAux.getIsNew())) {
						
						timestamp=conceptoDataAccess.getSetVersionRow(connexion,conceptoAux.getId());
						
						if(!conceptoAux.getVersionRow().equals(timestamp)) {	
							conceptoAux.setVersionRow(timestamp);
						}
						
													
						conceptoAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			ConceptoDetalle_logic conceptodetalleLogic=new ConceptoDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyConceptoWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(ConceptoDetalle.class));
											
			

			conceptodetalleLogic.setConnexion(this.getConnexion());
			conceptodetalleLogic.setDatosCliente(this.datosCliente);
			conceptodetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Concepto concepto:this.conceptos) {
				

				classes=new ArrayList<Classe>();
				classes=ConceptoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				conceptodetalleLogic.setConceptoDetalles(concepto.conceptodetalles);
				conceptodetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Concepto concepto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Concepto_logic_add.updateConceptoToGet(concepto,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));

				if(this.isConDeep) {
					ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(this.connexion);
					conceptodetalleLogic.setConceptoDetalles(concepto.getConceptoDetalles());
					ArrayList<Classe> classesLocal=ConceptoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					conceptodetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					ConceptoDetalle_util.refrescarFKsDescripciones(conceptodetalleLogic.getConceptoDetalles());
					concepto.setConceptoDetalles(conceptodetalleLogic.getConceptoDetalles());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ConceptoDetalle.class));
			concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));

		for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
			ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(connexion);
			conceptodetalleLogic.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));

				for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
					ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(connexion);
					conceptodetalleLogic.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(ConceptoDetalle.class));
			concepto.setConceptoDetalles(conceptoDataAccess.getConceptoDetalles(connexion,concepto));

			for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
				ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(connexion);
				conceptodetalleLogic.deepLoad(conceptodetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Concepto concepto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//Concepto_logic_add.updateConceptoToSave(concepto,this.arrDatoGeneral);
			
Concepto_data.save(concepto, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
			conceptodetalle.setid_concepto(concepto.getId());
			ConceptoDetalle_data.save(conceptodetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
					conceptodetalle.setid_concepto(concepto.getId());
					ConceptoDetalle_data.save(conceptodetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
			ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(connexion);
			conceptodetalle.setid_concepto(concepto.getId());
			ConceptoDetalle_data.save(conceptodetalle,connexion);
			conceptodetalleLogic.deepSave(conceptodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {

			if(clas.clas.equals(ConceptoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(ConceptoDetalle conceptodetalle:concepto.getConceptoDetalles()) {
					ConceptoDetalle_logic conceptodetalleLogic= new ConceptoDetalle_logic(connexion);
					conceptodetalle.setid_concepto(concepto.getId());
					ConceptoDetalle_data.save(conceptodetalle,connexion);
					conceptodetalleLogic.deepSave(conceptodetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(Concepto.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(concepto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Concepto_util.refrescarFKsDescripciones(concepto);
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
			this.deepLoad(this.concepto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Concepto.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(conceptos!=null) {
				for(Concepto concepto:conceptos) {
					this.deepLoad(concepto,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Concepto_util.refrescarFKsDescripciones(conceptos);
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
			if(conceptos!=null) {
				for(Concepto concepto:conceptos) {
					this.deepLoad(concepto,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Concepto_util.refrescarFKsDescripciones(conceptos);
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
			this.getNewConnexionToDeep(Concepto.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(concepto,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(Concepto.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(conceptos!=null) {
				for(Concepto concepto:conceptos) {
					this.deepSave(concepto,isDeep,deepLoadType,clases);
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
			if(conceptos!=null) {
				for(Concepto concepto:conceptos) {
					this.deepSave(concepto,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Concepto_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+codigo+"%",Concepto_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorCodigo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Concepto_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Concepto_util.refrescarFKsDescripciones(this.conceptos);
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
			parameterSelectionGeneralNombre.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+nombre+"%",Concepto_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			Concepto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorNombre","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			conceptos=conceptoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				Concepto_util.refrescarFKsDescripciones(this.conceptos);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorCodigoWithConnection(String codigo)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo,Concepto_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			concepto=conceptoDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorCodigo(String codigo)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralCodigo= new ParameterSelectionGeneral();
			parameterSelectionGeneralCodigo.setParameterSelectionGeneralEqual(ParameterType.STRING,codigo,Concepto_util.CODIGO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralCodigo);

			concepto=conceptoDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getPorNombreWithConnection(String nombre)throws Exception {
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Concepto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Concepto_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			concepto=conceptoDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Concepto_util.refrescarFKsDescripciones(this.concepto);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getPorNombre(String nombre)throws Exception {
		try {

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			ParameterSelectionGeneral parameterSelectionGeneralNombre= new ParameterSelectionGeneral();
			parameterSelectionGeneralNombre.setParameterSelectionGeneralEqual(ParameterType.STRING,nombre,Concepto_util.NOMBRE,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralNombre);

			concepto=conceptoDataAccess.getEntity(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoad(this.concepto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());

				Concepto_util.refrescarFKsDescripciones(this.concepto);
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
			if(Concepto_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Concepto concepto,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Concepto_util.IS_CON_AUDITORIA) {
				if(concepto.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDataAccess.TABLENAME, concepto.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Concepto_util.IS_CON_AUDITORIA_DETALLE) {
						////Concepto_logic.registrarAuditoriaDetalles(connexion,concepto,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(concepto.getIsDeleted()) {
					/*if(!concepto.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,ConceptoDataAccess.TABLENAME, concepto.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Concepto_logic.registrarAuditoriaDetalles(connexion,concepto,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDataAccess.TABLENAME, concepto.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(concepto.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,ConceptoDataAccess.TABLENAME, concepto.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Concepto_util.IS_CON_AUDITORIA_DETALLE) {
						////Concepto_logic.registrarAuditoriaDetalles(connexion,concepto,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Concepto concepto)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(concepto.getIsNew()||!concepto.getcodigo().equals(concepto.getConceptoOriginal().getcodigo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(concepto.getConceptoOriginal().getcodigo()!=null)
				{
					strValorActual=concepto.getConceptoOriginal().getcodigo();
				}
				if(concepto.getcodigo()!=null)
				{
					strValorNuevo=concepto.getcodigo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoConstantesFunciones.CODIGO,strValorActual,strValorNuevo);
			}	
			
			if(concepto.getIsNew()||!concepto.getnombre().equals(concepto.getConceptoOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(concepto.getConceptoOriginal().getnombre()!=null)
				{
					strValorActual=concepto.getConceptoOriginal().getnombre();
				}
				if(concepto.getnombre()!=null)
				{
					strValorNuevo=concepto.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
			
			if(concepto.getIsNew()||!concepto.getdescripcion().equals(concepto.getConceptoOriginal().getdescripcion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(concepto.getConceptoOriginal().getdescripcion()!=null)
				{
					strValorActual=concepto.getConceptoOriginal().getdescripcion();
				}
				if(concepto.getdescripcion()!=null)
				{
					strValorNuevo=concepto.getdescripcion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),ConceptoConstantesFunciones.DESCRIPCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(Concepto concepto,List<ConceptoDetalle> conceptodetalles) throws Exception {

		if(!concepto.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(concepto,conceptodetalles,true);
		}
	}

	public void saveRelaciones(Concepto concepto,List<ConceptoDetalle> conceptodetalles)throws Exception {

		if(!concepto.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(concepto,conceptodetalles,false);
		}
	}

	public void saveRelacionesBase(Concepto concepto,List<ConceptoDetalle> conceptodetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("Concepto-saveRelacionesWithConnection");}
	
			concepto.setConceptoDetalles(conceptodetalles);

			this.setConcepto(concepto);

			if(true) {

				//Concepto_logic_add.updateRelacionesToSave(concepto,this);

				if((concepto.getIsNew()||concepto.getIsChanged())&&!concepto.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(conceptodetalles);

				} else if(concepto.getIsDeleted()) {
					this.saveRelacionesDetalles(conceptodetalles);
					this.save();
				}

				//Concepto_logic_add.updateRelacionesToSaveAfter(concepto,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			ConceptoDetalle_util.InicializarGeneralEntityAuxiliares(conceptodetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<ConceptoDetalle> conceptodetalles)throws Exception {
		try {
	

			Long idConceptoActual=this.getConcepto().getId();

			ConceptoDetalle_logic conceptodetalleLogic_Desde_Concepto=new ConceptoDetalle_logic();
			conceptodetalleLogic_Desde_Concepto.setConceptoDetalles(conceptodetalles);

			conceptodetalleLogic_Desde_Concepto.setConnexion(this.getConnexion());
			conceptodetalleLogic_Desde_Concepto.setDatosCliente(this.datosCliente);

			for(ConceptoDetalle conceptodetalle_Desde_Concepto:conceptodetalleLogic_Desde_Concepto.getConceptoDetalles()) {
				conceptodetalle_Desde_Concepto.setid_concepto(idConceptoActual);
			}

			conceptodetalleLogic_Desde_Concepto.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Concepto_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Concepto_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setConcepto(Concepto newConcepto) {
		this.concepto = newConcepto;
	}
	
	public Concepto_data getConceptoDataAccess() {
		return conceptoDataAccess;
	}
	
	public void setConceptoDataAccess(Concepto_data newconceptoDataAccess) {
		this.conceptoDataAccess = newconceptoDataAccess;
	}

	public void setConceptos(List<Concepto> newConceptos) {
		this.conceptos = newConceptos;
	}
	
	public Object getConceptoObject() {	
		this.conceptoObject=this.conceptoDataAccess.getEntityObject();
		return this.conceptoObject;
	}
		
	public void setConceptoObject(Object newConceptoObject) {
		this.conceptoObject = newConceptoObject;
	}
	
	public List<Object> getConceptosObject() {		
		this.conceptosObject=this.conceptoDataAccess.getEntitiesObject();
		return this.conceptosObject;
	}
		
	public void setConceptosObject(List<Object> newConceptosObject) {
		this.conceptosObject = newConceptosObject;
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
