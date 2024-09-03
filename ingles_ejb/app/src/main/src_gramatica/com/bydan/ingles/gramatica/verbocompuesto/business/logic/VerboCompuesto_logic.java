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
package com.bydan.ingles.gramatica.verbocompuesto.business.logic;


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
import com.bydan.ingles.gramatica.verbocompuesto.util.*;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_param_return;
//import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuestoParameterGeneral;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
//import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic_add;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.*;
import com.bydan.ingles.gramatica.verbocompuesto.business.entity.*;

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


import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.data.VerboCompuestoDetalle_data;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;
import com.bydan.ingles.gramatica.verbocompuestodetalle.util.VerboCompuestoDetalle_util;

//REL DETALLES











@SuppressWarnings({"unused"})
public class VerboCompuesto_logic  extends GeneralEntityLogic implements VerboCompuesto_logicI {
	static Logger logger = Logger.getLogger("VerboCompuesto_logic.class");	

	protected VerboCompuesto_data verbocompuestoDataAccess; 	
	protected VerboCompuesto verbocompuesto;
	protected List<VerboCompuesto> verbocompuestos;
	protected Object verbocompuestoObject;	
	protected List<Object> verbocompuestosObject;
	
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
	
	
	
	
	
	
	public VerboCompuesto_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.verbocompuestoDataAccess = new VerboCompuesto_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			VerboCompuesto_data.ActualizarQueries();
			
			//this.verbocompuestoDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.verbocompuestos= new ArrayList<VerboCompuesto>();
			this.verbocompuesto= new VerboCompuesto();
			
			this.verbocompuestoObject=new Object();
			this.verbocompuestosObject=new ArrayList<Object>();
				
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
			
			this.verbocompuestoDataAccess.setConnexionType(this.connexionType);
			this.verbocompuestoDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public VerboCompuesto_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.verbocompuestoDataAccess = new VerboCompuesto_data();
			this.verbocompuestos= new ArrayList<VerboCompuesto>();
			this.verbocompuesto= new VerboCompuesto();
			this.verbocompuestoObject=new Object();
			this.verbocompuestosObject=new ArrayList<Object>();
			
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
			
			this.verbocompuestoDataAccess.setConnexionType(this.connexionType);
			this.verbocompuestoDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public VerboCompuesto getVerboCompuesto() throws Exception {	
		//VerboCompuesto_logic_add.checkVerboCompuestoToGet(verbocompuesto,this.datosCliente,this.arrDatoGeneral);
		//VerboCompuesto_logic_add.updateVerboCompuestoToGet(verbocompuesto,this.arrDatoGeneral);
		
		return verbocompuesto;
	}
	
	public List<VerboCompuesto> getVerboCompuestos() throws Exception {		
		if(this.verbocompuestos==null) {
			this.verbocompuestos= new ArrayList<VerboCompuesto>();
		}
		
		this.quitarsNulos();
		
		//VerboCompuesto_logic_add.checkVerboCompuestoToGets(verbocompuestos,this.datosCliente,this.arrDatoGeneral);
		
		for (VerboCompuesto verbocompuestoLocal: verbocompuestos ) {
			//VerboCompuesto_logic_add.updateVerboCompuestoToGet(verbocompuestoLocal,this.arrDatoGeneral);
		}
		
		return verbocompuestos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.verbocompuestoDataAccess!=null) {
			this.verbocompuestoDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			verbocompuestoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			verbocompuestoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		verbocompuesto = new  VerboCompuesto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
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
		verbocompuesto = new  VerboCompuesto();
		  		  
        try {
			
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		verbocompuesto = new  VerboCompuesto();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
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
		verbocompuesto = new  VerboCompuesto();
		  		  
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
		verbocompuesto = new  VerboCompuesto();
		  		  
        try {
			
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		verbocompuesto = new  VerboCompuesto();
		  		  
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
		verbocompuesto = new  VerboCompuesto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =verbocompuestoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuesto = new  VerboCompuesto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=verbocompuestoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verbocompuesto = new  VerboCompuesto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =verbocompuestoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuesto = new  VerboCompuesto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=verbocompuestoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		verbocompuesto = new  VerboCompuesto();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =verbocompuestoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		verbocompuesto = new  VerboCompuesto();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=verbocompuestoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		verbocompuesto = new  VerboCompuesto();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuesto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
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
		verbocompuesto = new  VerboCompuesto();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuesto=verbocompuestoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(verbocompuesto);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		  		  
        try {
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
		verbocompuestos = new  ArrayList<VerboCompuesto>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(verbocompuestos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(VerboCompuesto verbocompuesto) throws Exception {
		Boolean estaValidado=false;
		
		if(verbocompuesto.getIsNew() || verbocompuesto.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<VerboCompuesto> VerboCompuestos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(VerboCompuesto verbocompuestoLocal:verbocompuestos) {				
			estaValidadoObjeto=this.validarGuardar(verbocompuestoLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<VerboCompuesto> VerboCompuestos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verbocompuestos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(VerboCompuesto VerboCompuesto) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(verbocompuesto)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(VerboCompuesto verbocompuesto) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+verbocompuesto.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"verbocompuesto","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(VerboCompuesto_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(VerboCompuesto_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//VerboCompuesto_logic_add.checkVerboCompuestoToSave(this.verbocompuesto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboCompuesto_logic_add.updateVerboCompuestoToSave(this.verbocompuesto,this.arrDatoGeneral);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verbocompuesto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboCompuesto_util.permiteMantenimiento(this.verbocompuesto) && this.validarGuardar(this.verbocompuesto)) {
				VerboCompuesto_data.save(this.verbocompuesto, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);				
			}

			//VerboCompuesto_logic_add.checkVerboCompuestoToSaveAfter(this.verbocompuesto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.verbocompuesto.getIsDeleted()) {
				this.verbocompuesto=null;
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
			
			//VerboCompuesto_logic_add.checkVerboCompuestoToSave(this.verbocompuesto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//VerboCompuesto_logic_add.updateVerboCompuestoToSave(this.verbocompuesto,this.arrDatoGeneral);
			
			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.verbocompuesto,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(VerboCompuesto_util.permiteMantenimiento(this.verbocompuesto) && this.validarGuardar(this.verbocompuesto)) {			
				VerboCompuesto_data.save(this.verbocompuesto, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.verbocompuesto,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);				
			}
			
			//VerboCompuesto_logic_add.checkVerboCompuestoToSaveAfter(this.verbocompuesto,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.verbocompuesto.getIsDeleted()) {
				this.verbocompuesto=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//VerboCompuesto_logic_add.checkVerboCompuestoToSaves(verbocompuestos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosVerboCompuesto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboCompuesto verbocompuestoLocal:verbocompuestos) {		
				
				if(!VerboCompuesto_util.permiteMantenimiento(verbocompuestoLocal)) {
					continue;
				}
				
				//VerboCompuesto_logic_add.updateVerboCompuestoToSave(verbocompuestoLocal,this.arrDatoGeneral);
	        	
				VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verbocompuestoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verbocompuestoLocal)) {
					VerboCompuesto_data.save(verbocompuestoLocal, connexion);				
				} else {
					validadoTodosVerboCompuesto=false;
				}
			}
			
			if(!validadoTodosVerboCompuesto) {
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
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}
			
			//VerboCompuesto_logic_add.checkVerboCompuestoToSavesAfter(verbocompuestos,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//VerboCompuesto_logic_add.checkVerboCompuestoToSaves(verbocompuestos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosVerboCompuesto=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(VerboCompuesto verbocompuestoLocal:verbocompuestos) {				
				if(!VerboCompuesto_util.permiteMantenimiento(verbocompuestoLocal)) {
					continue;
				}
				
				//VerboCompuesto_logic_add.updateVerboCompuestoToSave(verbocompuestoLocal,this.arrDatoGeneral);
	        	
				VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),verbocompuestoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(verbocompuestoLocal)) {				
					VerboCompuesto_data.save(verbocompuestoLocal, connexion);				
				} else {
					validadoTodosVerboCompuesto=false;
				}
			}
			
			if(!validadoTodosVerboCompuesto) {
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
				
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
			}

			//VerboCompuesto_logic_add.checkVerboCompuestoToSavesAfter(verbocompuestos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboCompuesto_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboCompuesto> verbocompuestos,VerboCompuesto_param_return verbocompuestoParameterGeneral)throws Exception {
		 try {	
			VerboCompuesto_param_return verbocompuestoReturnGeneral=new VerboCompuesto_param_return();
	
			
			return verbocompuestoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public VerboCompuesto_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<VerboCompuesto> verbocompuestos,VerboCompuesto_param_return verbocompuestoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuesto_param_return verbocompuestoReturnGeneral=new VerboCompuesto_param_return();
	
			
			this.connexion.commit();
			
			return verbocompuestoReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboCompuesto_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,VerboCompuesto_param_return verbocompuestoParameterGeneral,Boolean isEsNuevoVerboCompuesto,ArrayList<Classe> clases)throws Exception {
		 try {	
			VerboCompuesto_param_return verbocompuestoReturnGeneral=new VerboCompuesto_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verbocompuestoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return verbocompuestoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public VerboCompuesto_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<VerboCompuesto> verbocompuestos,VerboCompuesto verbocompuesto,VerboCompuesto_param_return verbocompuestoParameterGeneral,Boolean isEsNuevoVerboCompuesto,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuesto_param_return verbocompuestoReturnGeneral=new VerboCompuesto_param_return();
	
			verbocompuestoReturnGeneral.setVerboCompuesto(verbocompuesto);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				verbocompuestoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return verbocompuestoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public VerboCompuesto_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,VerboCompuesto_param_return verbocompuestoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			VerboCompuesto_param_return verbocompuestoReturnGeneral=new VerboCompuesto_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.verbocompuestos=new ArrayList<VerboCompuesto>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.verbocompuesto=new VerboCompuesto();
				
				
				if(conColumnasBase) {this.verbocompuesto.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.verbocompuesto.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.verbocompuesto.setinfinitivo(arrColumnas[iColumn++]);
				this.verbocompuesto.setparte1(arrColumnas[iColumn++]);
				this.verbocompuesto.setparte2(arrColumnas[iColumn++]);
				this.verbocompuesto.setpasado(arrColumnas[iColumn++]);
				this.verbocompuesto.setparticipio(arrColumnas[iColumn++]);
				this.verbocompuesto.settraduccion(arrColumnas[iColumn++]);
				this.verbocompuesto.setpronunciacion(arrColumnas[iColumn++]);
				
				this.verbocompuestos.add(this.verbocompuesto);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			verbocompuestoReturnGeneral.setConRetornoEstaProcesado(true);
			verbocompuestoReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return verbocompuestoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<VerboCompuesto> verbocompuestosAux= new ArrayList<VerboCompuesto>();
		
		for(VerboCompuesto verbocompuesto:verbocompuestos) {
			if(!verbocompuesto.getIsDeleted()) {
				verbocompuestosAux.add(verbocompuesto);
			}
		}
		
		verbocompuestos=verbocompuestosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<VerboCompuesto> verbocompuestosAux= new ArrayList<VerboCompuesto>();
		
		for(VerboCompuesto verbocompuesto : this.verbocompuestos) {
			if(verbocompuesto==null) {
				verbocompuestosAux.add(verbocompuesto);
			}
		}
		
		//this.verbocompuestos=verbocompuestosAux;
		
		this.verbocompuestos.removeAll(verbocompuestosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(verbocompuesto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((verbocompuesto.getIsDeleted() || (verbocompuesto.getIsChanged()&&!verbocompuesto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=verbocompuestoDataAccess.getSetVersionRow(connexion,verbocompuesto.getId());
				
				if(!verbocompuesto.getVersionRow().equals(timestamp)) {	
					verbocompuesto.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				verbocompuesto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(verbocompuesto.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((verbocompuesto.getIsDeleted() || (verbocompuesto.getIsChanged()&&!verbocompuesto.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=verbocompuestoDataAccess.getSetVersionRow(connexion,verbocompuesto.getId());
			
			try {							
				if(!verbocompuesto.getVersionRow().equals(timestamp)) {	
					verbocompuesto.setVersionRow(timestamp);
				}
				
				verbocompuesto.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(verbocompuestos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(verbocompuestoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verbocompuestoAux.getIsDeleted() || (verbocompuestoAux.getIsChanged()&&!verbocompuestoAux.getIsNew())) {
						
						timestamp=verbocompuestoDataAccess.getSetVersionRow(connexion,verbocompuestoAux.getId());
						
						if(!verbocompuesto.getVersionRow().equals(timestamp)) {	
							verbocompuestoAux.setVersionRow(timestamp);
						}
								
						verbocompuestoAux.setIsChangedAuxiliar(false);														
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
		if(verbocompuestos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(VerboCompuesto verbocompuestoAux:verbocompuestos) {
					if(verbocompuestoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(verbocompuestoAux.getIsDeleted() || (verbocompuestoAux.getIsChanged()&&!verbocompuestoAux.getIsNew())) {
						
						timestamp=verbocompuestoDataAccess.getSetVersionRow(connexion,verbocompuestoAux.getId());
						
						if(!verbocompuestoAux.getVersionRow().equals(timestamp)) {	
							verbocompuestoAux.setVersionRow(timestamp);
						}
						
													
						verbocompuestoAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public VerboCompuesto_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		VerboCompuesto_param_return  verbocompuesto_return =new VerboCompuesto_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-cargarCombosLoteForeignKeyVerboCompuestoWithConnection");
			
			this.connexion.begin();
			
			verbocompuesto_return =new VerboCompuesto_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			verbocompuesto_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			verbocompuesto_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			verbocompuesto_return.setnivelsFK(nivelsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return verbocompuesto_return;
	}
	
	public VerboCompuesto_param_return cargarCombosLoteFK(String finalQueryGlobalArea,String finalQueryGlobalSubArea,String finalQueryGlobalNivel) throws Exception {
		VerboCompuesto_param_return  verbocompuesto_return =new VerboCompuesto_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			verbocompuesto_return =new VerboCompuesto_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			verbocompuesto_return.setareasFK(areasForeignKey);


			List<SubArea> subareasForeignKey=new ArrayList<SubArea>();
			SubArea_logic subareaLogic=new SubArea_logic();
			subareaLogic.setConnexion(this.connexion);
			subareaLogic.getSubAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalSubArea.equals("NONE")) {
				subareaLogic.getTodos(finalQueryGlobalSubArea,new Pagination());
				subareasForeignKey=subareaLogic.getSubAreas();
			}

			verbocompuesto_return.setsubareasFK(subareasForeignKey);


			List<Nivel> nivelsForeignKey=new ArrayList<Nivel>();
			Nivel_logic nivelLogic=new Nivel_logic();
			nivelLogic.setConnexion(this.connexion);
			nivelLogic.getNivelDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalNivel.equals("NONE")) {
				nivelLogic.getTodos(finalQueryGlobalNivel,new Pagination());
				nivelsForeignKey=nivelLogic.getNivels();
			}

			verbocompuesto_return.setnivelsFK(nivelsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return verbocompuesto_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VerboCompuestoDetalle_logic verbocompuestodetalleLogic=new VerboCompuestoDetalle_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyVerboCompuestoWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VerboCompuestoDetalle.class));
											
			

			verbocompuestodetalleLogic.setConnexion(this.getConnexion());
			verbocompuestodetalleLogic.setDatosCliente(this.datosCliente);
			verbocompuestodetalleLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(VerboCompuesto verbocompuesto:this.verbocompuestos) {
				

				classes=new ArrayList<Classe>();
				classes=VerboCompuestoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verbocompuestodetalleLogic.setVerboCompuestoDetalles(verbocompuesto.verbocompuestodetalles);
				verbocompuestodetalleLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(VerboCompuesto verbocompuesto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//VerboCompuesto_logic_add.updateVerboCompuestoToGet(verbocompuesto,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
		verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
		verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
		verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
				continue;
			}

			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));

				if(this.isConDeep) {
					VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(this.connexion);
					verbocompuestodetalleLogic.setVerboCompuestoDetalles(verbocompuesto.getVerboCompuestoDetalles());
					ArrayList<Classe> classesLocal=VerboCompuestoDetalle_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verbocompuestodetalleLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboCompuestoDetalle_util.refrescarFKsDescripciones(verbocompuestodetalleLogic.getVerboCompuestoDetalles());
					verbocompuesto.setVerboCompuestoDetalles(verbocompuestodetalleLogic.getVerboCompuestoDetalles());
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
			verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuestoDetalle.class));
			verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(verbocompuesto.getArea(),isDeep,deepLoadType,clases);
				
		verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(verbocompuesto.getSubArea(),isDeep,deepLoadType,clases);
				
		verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(verbocompuesto.getNivel(),isDeep,deepLoadType,clases);
				

		verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));

		for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
			VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
			verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(verbocompuesto.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepLoad(verbocompuesto.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepLoad(verbocompuesto.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));

				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
					VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
					verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
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
			verbocompuesto.setArea(verbocompuestoDataAccess.getArea(connexion,verbocompuesto));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(verbocompuesto.getArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(SubArea.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuesto.setSubArea(verbocompuestoDataAccess.getSubArea(connexion,verbocompuesto));
			SubArea_logic subareaLogic= new SubArea_logic(connexion);
			subareaLogic.deepLoad(verbocompuesto.getSubArea(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Nivel.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			verbocompuesto.setNivel(verbocompuestoDataAccess.getNivel(connexion,verbocompuesto));
			Nivel_logic nivelLogic= new Nivel_logic(connexion);
			nivelLogic.deepLoad(verbocompuesto.getNivel(),isDeep,deepLoadType,clases);
				
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuestoDetalle.class));
			verbocompuesto.setVerboCompuestoDetalles(verbocompuestoDataAccess.getVerboCompuestoDetalles(connexion,verbocompuesto));

			for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
				VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
				verbocompuestodetalleLogic.deepLoad(verbocompuestodetalle,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(VerboCompuesto verbocompuesto,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//VerboCompuesto_logic_add.updateVerboCompuestoToSave(verbocompuesto,this.arrDatoGeneral);
			
VerboCompuesto_data.save(verbocompuesto, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(verbocompuesto.getArea(),connexion);

		SubArea_data.save(verbocompuesto.getSubArea(),connexion);

		Nivel_data.save(verbocompuesto.getNivel(),connexion);

		for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
			verbocompuestodetalle.setid_verbo_compuesto(verbocompuesto.getId());
			VerboCompuestoDetalle_data.save(verbocompuestodetalle,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(verbocompuesto.getArea(),connexion);
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(verbocompuesto.getSubArea(),connexion);
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(verbocompuesto.getNivel(),connexion);
				continue;
			}


			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
					verbocompuestodetalle.setid_verbo_compuesto(verbocompuesto.getId());
					VerboCompuestoDetalle_data.save(verbocompuestodetalle,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(verbocompuesto.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(verbocompuesto.getArea(),isDeep,deepLoadType,clases);
				

		SubArea_data.save(verbocompuesto.getSubArea(),connexion);
		SubArea_logic subareaLogic= new SubArea_logic(connexion);
		subareaLogic.deepLoad(verbocompuesto.getSubArea(),isDeep,deepLoadType,clases);
				

		Nivel_data.save(verbocompuesto.getNivel(),connexion);
		Nivel_logic nivelLogic= new Nivel_logic(connexion);
		nivelLogic.deepLoad(verbocompuesto.getNivel(),isDeep,deepLoadType,clases);
				

		for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
			VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
			verbocompuestodetalle.setid_verbo_compuesto(verbocompuesto.getId());
			VerboCompuestoDetalle_data.save(verbocompuestodetalle,connexion);
			verbocompuestodetalleLogic.deepSave(verbocompuestodetalle,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(verbocompuesto.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(verbocompuesto.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(SubArea.class)) {
				SubArea_data.save(verbocompuesto.getSubArea(),connexion);
				SubArea_logic subareaLogic= new SubArea_logic(connexion);
				subareaLogic.deepSave(verbocompuesto.getSubArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Nivel.class)) {
				Nivel_data.save(verbocompuesto.getNivel(),connexion);
				Nivel_logic nivelLogic= new Nivel_logic(connexion);
				nivelLogic.deepSave(verbocompuesto.getNivel(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(VerboCompuestoDetalle.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuestoDetalle verbocompuestodetalle:verbocompuesto.getVerboCompuestoDetalles()) {
					VerboCompuestoDetalle_logic verbocompuestodetalleLogic= new VerboCompuestoDetalle_logic(connexion);
					verbocompuestodetalle.setid_verbo_compuesto(verbocompuesto.getId());
					VerboCompuestoDetalle_data.save(verbocompuestodetalle,connexion);
					verbocompuestodetalleLogic.deepSave(verbocompuestodetalle,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(VerboCompuesto.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboCompuesto_util.refrescarFKsDescripciones(verbocompuesto);
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
			this.deepLoad(this.verbocompuesto,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuesto);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(VerboCompuesto.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(verbocompuestos!=null) {
				for(VerboCompuesto verbocompuesto:verbocompuestos) {
					this.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					VerboCompuesto_util.refrescarFKsDescripciones(verbocompuestos);
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
			if(verbocompuestos!=null) {
				for(VerboCompuesto verbocompuesto:verbocompuestos) {
					this.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					VerboCompuesto_util.refrescarFKsDescripciones(verbocompuestos);
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
			this.getNewConnexionToDeep(VerboCompuesto.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(verbocompuesto,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(VerboCompuesto.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(verbocompuestos!=null) {
				for(VerboCompuesto verbocompuesto:verbocompuestos) {
					this.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
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
			if(verbocompuestos!=null) {
				for(VerboCompuesto verbocompuesto:verbocompuestos) {
					this.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralInfinitivo= new ParameterSelectionGeneral();
			parameterSelectionGeneralInfinitivo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+infinitivo+"%",VerboCompuesto_util.INFINITIVO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralInfinitivo);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorInfinitivo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			parameterSelectionGeneralInfinitivo.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+infinitivo+"%",VerboCompuesto_util.INFINITIVO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralInfinitivo);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorInfinitivo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralTraduccion= new ParameterSelectionGeneral();
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",VerboCompuesto_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			parameterSelectionGeneralTraduccion.setParameterSelectionGeneralLike(ParameterType.STRING,"%"+traduccion+"%",VerboCompuesto_util.TRADUCCION,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralTraduccion);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"BusquedaPorTraduccion","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,VerboCompuesto_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,VerboCompuesto_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidNivel= new ParameterSelectionGeneral();
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,VerboCompuesto_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			parameterSelectionGeneralidNivel.setParameterSelectionGeneralEqual(ParameterType.LONG,id_nivel,VerboCompuesto_util.IDNIVEL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidNivel);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdNivel","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,VerboCompuesto.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidSubArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,VerboCompuesto_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			parameterSelectionGeneralidSubArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_sub_area,VerboCompuesto_util.IDSUBAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidSubArea);

			VerboCompuesto_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdSubArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			verbocompuestos=verbocompuestoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				VerboCompuesto_util.refrescarFKsDescripciones(this.verbocompuestos);
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
			if(VerboCompuesto_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,VerboCompuesto verbocompuesto,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(VerboCompuesto_util.IS_CON_AUDITORIA) {
				if(verbocompuesto.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDataAccess.TABLENAME, verbocompuesto.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboCompuesto_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboCompuesto_logic.registrarAuditoriaDetalles(connexion,verbocompuesto,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(verbocompuesto.getIsDeleted()) {
					/*if(!verbocompuesto.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,VerboCompuestoDataAccess.TABLENAME, verbocompuesto.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////VerboCompuesto_logic.registrarAuditoriaDetalles(connexion,verbocompuesto,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDataAccess.TABLENAME, verbocompuesto.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(verbocompuesto.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,VerboCompuestoDataAccess.TABLENAME, verbocompuesto.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(VerboCompuesto_util.IS_CON_AUDITORIA_DETALLE) {
						////VerboCompuesto_logic.registrarAuditoriaDetalles(connexion,verbocompuesto,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,VerboCompuesto verbocompuesto)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getid_area().equals(verbocompuesto.getVerboCompuestoOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getid_area()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getid_area().toString();
				}
				if(verbocompuesto.getid_area()!=null)
				{
					strValorNuevo=verbocompuesto.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getid_sub_area().equals(verbocompuesto.getVerboCompuestoOriginal().getid_sub_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getid_sub_area()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getid_sub_area().toString();
				}
				if(verbocompuesto.getid_sub_area()!=null)
				{
					strValorNuevo=verbocompuesto.getid_sub_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.IDSUBAREA,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getid_nivel().equals(verbocompuesto.getVerboCompuestoOriginal().getid_nivel()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getid_nivel()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getid_nivel().toString();
				}
				if(verbocompuesto.getid_nivel()!=null)
				{
					strValorNuevo=verbocompuesto.getid_nivel().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.IDNIVEL,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getinfinitivo().equals(verbocompuesto.getVerboCompuestoOriginal().getinfinitivo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getinfinitivo()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getinfinitivo();
				}
				if(verbocompuesto.getinfinitivo()!=null)
				{
					strValorNuevo=verbocompuesto.getinfinitivo() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.INFINITIVO,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getparte1().equals(verbocompuesto.getVerboCompuestoOriginal().getparte1()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getparte1()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getparte1();
				}
				if(verbocompuesto.getparte1()!=null)
				{
					strValorNuevo=verbocompuesto.getparte1() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.PARTE1,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getparte2().equals(verbocompuesto.getVerboCompuestoOriginal().getparte2()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getparte2()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getparte2();
				}
				if(verbocompuesto.getparte2()!=null)
				{
					strValorNuevo=verbocompuesto.getparte2() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.PARTE2,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getpasado().equals(verbocompuesto.getVerboCompuestoOriginal().getpasado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getpasado()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getpasado();
				}
				if(verbocompuesto.getpasado()!=null)
				{
					strValorNuevo=verbocompuesto.getpasado() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.PASADO,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getparticipio().equals(verbocompuesto.getVerboCompuestoOriginal().getparticipio()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getparticipio()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getparticipio();
				}
				if(verbocompuesto.getparticipio()!=null)
				{
					strValorNuevo=verbocompuesto.getparticipio() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.PARTICIPIO,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.gettraduccion().equals(verbocompuesto.getVerboCompuestoOriginal().gettraduccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().gettraduccion()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().gettraduccion();
				}
				if(verbocompuesto.gettraduccion()!=null)
				{
					strValorNuevo=verbocompuesto.gettraduccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.TRADUCCION,strValorActual,strValorNuevo);
			}	
			
			if(verbocompuesto.getIsNew()||!verbocompuesto.getpronunciacion().equals(verbocompuesto.getVerboCompuestoOriginal().getpronunciacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(verbocompuesto.getVerboCompuestoOriginal().getpronunciacion()!=null)
				{
					strValorActual=verbocompuesto.getVerboCompuestoOriginal().getpronunciacion();
				}
				if(verbocompuesto.getpronunciacion()!=null)
				{
					strValorNuevo=verbocompuesto.getpronunciacion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),VerboCompuestoConstantesFunciones.PRONUNCIACION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(VerboCompuesto verbocompuesto,List<VerboCompuestoDetalle> verbocompuestodetalles) throws Exception {

		if(!verbocompuesto.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verbocompuesto,verbocompuestodetalles,true);
		}
	}

	public void saveRelaciones(VerboCompuesto verbocompuesto,List<VerboCompuestoDetalle> verbocompuestodetalles)throws Exception {

		if(!verbocompuesto.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(verbocompuesto,verbocompuestodetalles,false);
		}
	}

	public void saveRelacionesBase(VerboCompuesto verbocompuesto,List<VerboCompuestoDetalle> verbocompuestodetalles,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("VerboCompuesto-saveRelacionesWithConnection");}
	
			verbocompuesto.setVerboCompuestoDetalles(verbocompuestodetalles);

			this.setVerboCompuesto(verbocompuesto);

			if(true) {

				//VerboCompuesto_logic_add.updateRelacionesToSave(verbocompuesto,this);

				if((verbocompuesto.getIsNew()||verbocompuesto.getIsChanged())&&!verbocompuesto.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(verbocompuestodetalles);

				} else if(verbocompuesto.getIsDeleted()) {
					this.saveRelacionesDetalles(verbocompuestodetalles);
					this.save();
				}

				//VerboCompuesto_logic_add.updateRelacionesToSaveAfter(verbocompuesto,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			VerboCompuestoDetalle_util.InicializarGeneralEntityAuxiliares(verbocompuestodetalles,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<VerboCompuestoDetalle> verbocompuestodetalles)throws Exception {
		try {
	

			Long idVerboCompuestoActual=this.getVerboCompuesto().getId();

			VerboCompuestoDetalle_logic verbocompuestodetalleLogic_Desde_VerboCompuesto=new VerboCompuestoDetalle_logic();
			verbocompuestodetalleLogic_Desde_VerboCompuesto.setVerboCompuestoDetalles(verbocompuestodetalles);

			verbocompuestodetalleLogic_Desde_VerboCompuesto.setConnexion(this.getConnexion());
			verbocompuestodetalleLogic_Desde_VerboCompuesto.setDatosCliente(this.datosCliente);

			for(VerboCompuestoDetalle verbocompuestodetalle_Desde_VerboCompuesto:verbocompuestodetalleLogic_Desde_VerboCompuesto.getVerboCompuestoDetalles()) {
				verbocompuestodetalle_Desde_VerboCompuesto.setid_verbo_compuesto(idVerboCompuestoActual);
			}

			verbocompuestodetalleLogic_Desde_VerboCompuesto.saves();

		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboCompuesto_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=VerboCompuesto_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setVerboCompuesto(VerboCompuesto newVerboCompuesto) {
		this.verbocompuesto = newVerboCompuesto;
	}
	
	public VerboCompuesto_data getVerboCompuestoDataAccess() {
		return verbocompuestoDataAccess;
	}
	
	public void setVerboCompuestoDataAccess(VerboCompuesto_data newverbocompuestoDataAccess) {
		this.verbocompuestoDataAccess = newverbocompuestoDataAccess;
	}

	public void setVerboCompuestos(List<VerboCompuesto> newVerboCompuestos) {
		this.verbocompuestos = newVerboCompuestos;
	}
	
	public Object getVerboCompuestoObject() {	
		this.verbocompuestoObject=this.verbocompuestoDataAccess.getEntityObject();
		return this.verbocompuestoObject;
	}
		
	public void setVerboCompuestoObject(Object newVerboCompuestoObject) {
		this.verbocompuestoObject = newVerboCompuestoObject;
	}
	
	public List<Object> getVerboCompuestosObject() {		
		this.verbocompuestosObject=this.verbocompuestoDataAccess.getEntitiesObject();
		return this.verbocompuestosObject;
	}
		
	public void setVerboCompuestosObject(List<Object> newVerboCompuestosObject) {
		this.verbocompuestosObject = newVerboCompuestosObject;
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
