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
package com.bydan.ingles.seguridad.datogeneralusuario.business.logic;


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
import com.bydan.ingles.seguridad.datogeneralusuario.util.*;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_util;
import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuario_param_return;
//import com.bydan.ingles.seguridad.datogeneralusuario.util.DatoGeneralUsuarioParameterGeneral;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.DatoGeneralUsuario;
//import com.bydan.ingles.seguridad.datogeneralusuario.business.logic.DatoGeneralUsuario_logic_add;
import com.bydan.ingles.seguridad.datogeneralusuario.business.data.*;
import com.bydan.ingles.seguridad.datogeneralusuario.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.usuario.business.data.Usuario_data;
import com.bydan.ingles.seguridad.usuario.business.logic.Usuario_logic;

import com.bydan.ingles.seguridad.pais.business.entity.Pais;
import com.bydan.ingles.seguridad.pais.business.data.Pais_data;
import com.bydan.ingles.seguridad.pais.business.logic.Pais_logic;

import com.bydan.ingles.seguridad.provincia.business.entity.Provincia;
import com.bydan.ingles.seguridad.provincia.business.data.Provincia_data;
import com.bydan.ingles.seguridad.provincia.business.logic.Provincia_logic;

import com.bydan.ingles.seguridad.ciudad.business.entity.Ciudad;
import com.bydan.ingles.seguridad.ciudad.business.data.Ciudad_data;
import com.bydan.ingles.seguridad.ciudad.business.logic.Ciudad_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class DatoGeneralUsuario_logic  extends GeneralEntityLogic implements DatoGeneralUsuario_logicI {
	static Logger logger = Logger.getLogger("DatoGeneralUsuario_logic.class");	

	protected DatoGeneralUsuario_data datogeneralusuarioDataAccess; 	
	protected DatoGeneralUsuario datogeneralusuario;
	protected List<DatoGeneralUsuario> datogeneralusuarios;
	protected Object datogeneralusuarioObject;	
	protected List<Object> datogeneralusuariosObject;
	
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
	
	
	
	
	
	
	public DatoGeneralUsuario_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.datogeneralusuarioDataAccess = new DatoGeneralUsuario_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			DatoGeneralUsuario_data.ActualizarQueries();
			
			//this.datogeneralusuarioDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
			this.datogeneralusuario= new DatoGeneralUsuario();
			
			this.datogeneralusuarioObject=new Object();
			this.datogeneralusuariosObject=new ArrayList<Object>();
				
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
			
			this.datogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			this.datogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public DatoGeneralUsuario_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.datogeneralusuarioDataAccess = new DatoGeneralUsuario_data();
			this.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
			this.datogeneralusuario= new DatoGeneralUsuario();
			this.datogeneralusuarioObject=new Object();
			this.datogeneralusuariosObject=new ArrayList<Object>();
			
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
			
			this.datogeneralusuarioDataAccess.setConnexionType(this.connexionType);
			this.datogeneralusuarioDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public DatoGeneralUsuario getDatoGeneralUsuario() throws Exception {	
		//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToGet(datogeneralusuario,this.datosCliente,this.arrDatoGeneral);
		//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToGet(datogeneralusuario,this.arrDatoGeneral);
		
		return datogeneralusuario;
	}
	
	public List<DatoGeneralUsuario> getDatoGeneralUsuarios() throws Exception {		
		if(this.datogeneralusuarios==null) {
			this.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
		}
		
		this.quitarsNulos();
		
		//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToGets(datogeneralusuarios,this.datosCliente,this.arrDatoGeneral);
		
		for (DatoGeneralUsuario datogeneralusuarioLocal: datogeneralusuarios ) {
			//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToGet(datogeneralusuarioLocal,this.arrDatoGeneral);
		}
		
		return datogeneralusuarios;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.datogeneralusuarioDataAccess!=null) {
			this.datogeneralusuarioDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			datogeneralusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			datogeneralusuarioDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
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
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
        try {
			
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
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
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
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
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
        try {
			
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		datogeneralusuario = new  DatoGeneralUsuario();
		  		  
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
		datogeneralusuario = new  DatoGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =datogeneralusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		datogeneralusuario = new  DatoGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=datogeneralusuarioDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		datogeneralusuario = new  DatoGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =datogeneralusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		datogeneralusuario = new  DatoGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=datogeneralusuarioDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		datogeneralusuario = new  DatoGeneralUsuario();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =datogeneralusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		datogeneralusuario = new  DatoGeneralUsuario();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=datogeneralusuarioDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		datogeneralusuario = new  DatoGeneralUsuario();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(datogeneralusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
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
		datogeneralusuario = new  DatoGeneralUsuario();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuario=datogeneralusuarioDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(datogeneralusuario);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		  		  
        try {
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
		datogeneralusuarios = new  ArrayList<DatoGeneralUsuario>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(datogeneralusuarios);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(DatoGeneralUsuario datogeneralusuario) throws Exception {
		Boolean estaValidado=false;
		
		if(datogeneralusuario.getIsNew() || datogeneralusuario.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<DatoGeneralUsuario> DatoGeneralUsuarios) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuarios) {				
			estaValidadoObjeto=this.validarGuardar(datogeneralusuarioLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<DatoGeneralUsuario> DatoGeneralUsuarios) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(datogeneralusuarios)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(DatoGeneralUsuario DatoGeneralUsuario) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(datogeneralusuario)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(DatoGeneralUsuario datogeneralusuario) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+datogeneralusuario.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"datogeneralusuario","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(DatoGeneralUsuario_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSave(this.datogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToSave(this.datogeneralusuario,this.arrDatoGeneral);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.datogeneralusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(DatoGeneralUsuario_util.permiteMantenimiento(this.datogeneralusuario) && this.validarGuardar(this.datogeneralusuario)) {
				DatoGeneralUsuario_data.save(this.datogeneralusuario, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);				
			}

			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSaveAfter(this.datogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.datogeneralusuario.getIsDeleted()) {
				this.datogeneralusuario=null;
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
			
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSave(this.datogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToSave(this.datogeneralusuario,this.arrDatoGeneral);
			
			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.datogeneralusuario,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(DatoGeneralUsuario_util.permiteMantenimiento(this.datogeneralusuario) && this.validarGuardar(this.datogeneralusuario)) {			
				DatoGeneralUsuario_data.save(this.datogeneralusuario, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.datogeneralusuario,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);				
			}
			
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSaveAfter(this.datogeneralusuario,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.datogeneralusuario.getIsDeleted()) {
				this.datogeneralusuario=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSaves(datogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosDatoGeneralUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuarios) {		
				
				if(!DatoGeneralUsuario_util.permiteMantenimiento(datogeneralusuarioLocal)) {
					continue;
				}
				
				//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToSave(datogeneralusuarioLocal,this.arrDatoGeneral);
	        	
				DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),datogeneralusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(datogeneralusuarioLocal)) {
					DatoGeneralUsuario_data.save(datogeneralusuarioLocal, connexion);				
				} else {
					validadoTodosDatoGeneralUsuario=false;
				}
			}
			
			if(!validadoTodosDatoGeneralUsuario) {
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
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}
			
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSavesAfter(datogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSaves(datogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosDatoGeneralUsuario=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuarios) {				
				if(!DatoGeneralUsuario_util.permiteMantenimiento(datogeneralusuarioLocal)) {
					continue;
				}
				
				//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToSave(datogeneralusuarioLocal,this.arrDatoGeneral);
	        	
				DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),datogeneralusuarioLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(datogeneralusuarioLocal)) {				
					DatoGeneralUsuario_data.save(datogeneralusuarioLocal, connexion);				
				} else {
					validadoTodosDatoGeneralUsuario=false;
				}
			}
			
			if(!validadoTodosDatoGeneralUsuario) {
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
				
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}

			//DatoGeneralUsuario_logic_add.checkDatoGeneralUsuarioToSavesAfter(datogeneralusuarios,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public DatoGeneralUsuario_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario_param_return datogeneralusuarioParameterGeneral)throws Exception {
		 try {	
			DatoGeneralUsuario_param_return datogeneralusuarioReturnGeneral=new DatoGeneralUsuario_param_return();
	
			
			return datogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public DatoGeneralUsuario_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario_param_return datogeneralusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			DatoGeneralUsuario_param_return datogeneralusuarioReturnGeneral=new DatoGeneralUsuario_param_return();
	
			
			this.connexion.commit();
			
			return datogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public DatoGeneralUsuario_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,DatoGeneralUsuario_param_return datogeneralusuarioParameterGeneral,Boolean isEsNuevoDatoGeneralUsuario,ArrayList<Classe> clases)throws Exception {
		 try {	
			DatoGeneralUsuario_param_return datogeneralusuarioReturnGeneral=new DatoGeneralUsuario_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				datogeneralusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return datogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public DatoGeneralUsuario_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<DatoGeneralUsuario> datogeneralusuarios,DatoGeneralUsuario datogeneralusuario,DatoGeneralUsuario_param_return datogeneralusuarioParameterGeneral,Boolean isEsNuevoDatoGeneralUsuario,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			DatoGeneralUsuario_param_return datogeneralusuarioReturnGeneral=new DatoGeneralUsuario_param_return();
	
			datogeneralusuarioReturnGeneral.setDatoGeneralUsuario(datogeneralusuario);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				datogeneralusuarioReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return datogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public DatoGeneralUsuario_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,DatoGeneralUsuario_param_return datogeneralusuarioParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			DatoGeneralUsuario_param_return datogeneralusuarioReturnGeneral=new DatoGeneralUsuario_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.datogeneralusuario=new DatoGeneralUsuario();
				
				

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.datogeneralusuario.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.datogeneralusuario.setcedula(arrColumnas[iColumn++]);
			this.datogeneralusuario.setapellidos(arrColumnas[iColumn++]);
			this.datogeneralusuario.setnombres(arrColumnas[iColumn++]);
			this.datogeneralusuario.settelefono(arrColumnas[iColumn++]);
			this.datogeneralusuario.settelefono_movil(arrColumnas[iColumn++]);
			this.datogeneralusuario.sete_mail(arrColumnas[iColumn++]);
			this.datogeneralusuario.seturl(arrColumnas[iColumn++]);
				this.datogeneralusuario.setfecha_nacimiento(Funciones.ConvertToDate(arrColumnas[iColumn++]));
			this.datogeneralusuario.setdireccion(arrColumnas[iColumn++]);
				
				this.datogeneralusuarios.add(this.datogeneralusuario);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			datogeneralusuarioReturnGeneral.setConRetornoEstaProcesado(true);
			datogeneralusuarioReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return datogeneralusuarioReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<DatoGeneralUsuario> datogeneralusuariosAux= new ArrayList<DatoGeneralUsuario>();
		
		for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
			if(!datogeneralusuario.getIsDeleted()) {
				datogeneralusuariosAux.add(datogeneralusuario);
			}
		}
		
		datogeneralusuarios=datogeneralusuariosAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<DatoGeneralUsuario> datogeneralusuariosAux= new ArrayList<DatoGeneralUsuario>();
		
		for(DatoGeneralUsuario datogeneralusuario : this.datogeneralusuarios) {
			if(datogeneralusuario==null) {
				datogeneralusuariosAux.add(datogeneralusuario);
			}
		}
		
		//this.datogeneralusuarios=datogeneralusuariosAux;
		
		this.datogeneralusuarios.removeAll(datogeneralusuariosAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(datogeneralusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((datogeneralusuario.getIsDeleted() || (datogeneralusuario.getIsChanged()&&!datogeneralusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=datogeneralusuarioDataAccess.getSetVersionRow(connexion,datogeneralusuario.getId());
				
				if(!datogeneralusuario.getVersionRow().equals(timestamp)) {	
					datogeneralusuario.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				datogeneralusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(datogeneralusuario.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((datogeneralusuario.getIsDeleted() || (datogeneralusuario.getIsChanged()&&!datogeneralusuario.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=datogeneralusuarioDataAccess.getSetVersionRow(connexion,datogeneralusuario.getId());
			
			try {							
				if(!datogeneralusuario.getVersionRow().equals(timestamp)) {	
					datogeneralusuario.setVersionRow(timestamp);
				}
				
				datogeneralusuario.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(datogeneralusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(datogeneralusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(datogeneralusuarioAux.getIsDeleted() || (datogeneralusuarioAux.getIsChanged()&&!datogeneralusuarioAux.getIsNew())) {
						
						timestamp=datogeneralusuarioDataAccess.getSetVersionRow(connexion,datogeneralusuarioAux.getId());
						
						if(!datogeneralusuario.getVersionRow().equals(timestamp)) {	
							datogeneralusuarioAux.setVersionRow(timestamp);
						}
								
						datogeneralusuarioAux.setIsChangedAuxiliar(false);														
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
		if(datogeneralusuarios!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
					if(datogeneralusuarioAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(datogeneralusuarioAux.getIsDeleted() || (datogeneralusuarioAux.getIsChanged()&&!datogeneralusuarioAux.getIsNew())) {
						
						timestamp=datogeneralusuarioDataAccess.getSetVersionRow(connexion,datogeneralusuarioAux.getId());
						
						if(!datogeneralusuarioAux.getVersionRow().equals(timestamp)) {	
							datogeneralusuarioAux.setVersionRow(timestamp);
						}
						
													
						datogeneralusuarioAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public DatoGeneralUsuario_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalUsuario,String finalQueryGlobalPais,String finalQueryGlobalProvincia,String finalQueryGlobalCiudad) throws Exception {
		DatoGeneralUsuario_param_return  datogeneralusuario_return =new DatoGeneralUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-cargarCombosLoteForeignKeyDatoGeneralUsuarioWithConnection");
			
			this.connexion.begin();
			
			datogeneralusuario_return =new DatoGeneralUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			datogeneralusuario_return.setusuariosFK(usuariosForeignKey);


			List<Pais> paissForeignKey=new ArrayList<Pais>();
			Pais_logic paisLogic=new Pais_logic();
			paisLogic.setConnexion(this.connexion);
			paisLogic.getPaisDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPais.equals("NONE")) {
				paisLogic.getTodos(finalQueryGlobalPais,new Pagination());
				paissForeignKey=paisLogic.getPaiss();
			}

			datogeneralusuario_return.setpaissFK(paissForeignKey);


			List<Provincia> provinciasForeignKey=new ArrayList<Provincia>();
			Provincia_logic provinciaLogic=new Provincia_logic();
			provinciaLogic.setConnexion(this.connexion);
			provinciaLogic.getProvinciaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				provinciaLogic.getTodos(finalQueryGlobalProvincia,new Pagination());
				provinciasForeignKey=provinciaLogic.getProvincias();
			}

			datogeneralusuario_return.setprovinciasFK(provinciasForeignKey);


			List<Ciudad> ciudadsForeignKey=new ArrayList<Ciudad>();
			Ciudad_logic ciudadLogic=new Ciudad_logic();
			ciudadLogic.setConnexion(this.connexion);
			ciudadLogic.getCiudadDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				ciudadLogic.getTodos(finalQueryGlobalCiudad,new Pagination());
				ciudadsForeignKey=ciudadLogic.getCiudads();
			}

			datogeneralusuario_return.setciudadsFK(ciudadsForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return datogeneralusuario_return;
	}
	
	public DatoGeneralUsuario_param_return cargarCombosLoteFK(String finalQueryGlobalUsuario,String finalQueryGlobalPais,String finalQueryGlobalProvincia,String finalQueryGlobalCiudad) throws Exception {
		DatoGeneralUsuario_param_return  datogeneralusuario_return =new DatoGeneralUsuario_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			datogeneralusuario_return =new DatoGeneralUsuario_param_return();
			
			

			List<Usuario> usuariosForeignKey=new ArrayList<Usuario>();
			Usuario_logic usuarioLogic=new Usuario_logic();
			usuarioLogic.setConnexion(this.connexion);
			usuarioLogic.getUsuarioDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				usuarioLogic.getTodos(finalQueryGlobalUsuario,new Pagination());
				usuariosForeignKey=usuarioLogic.getUsuarios();
			}

			datogeneralusuario_return.setusuariosFK(usuariosForeignKey);


			List<Pais> paissForeignKey=new ArrayList<Pais>();
			Pais_logic paisLogic=new Pais_logic();
			paisLogic.setConnexion(this.connexion);
			paisLogic.getPaisDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPais.equals("NONE")) {
				paisLogic.getTodos(finalQueryGlobalPais,new Pagination());
				paissForeignKey=paisLogic.getPaiss();
			}

			datogeneralusuario_return.setpaissFK(paissForeignKey);


			List<Provincia> provinciasForeignKey=new ArrayList<Provincia>();
			Provincia_logic provinciaLogic=new Provincia_logic();
			provinciaLogic.setConnexion(this.connexion);
			provinciaLogic.getProvinciaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				provinciaLogic.getTodos(finalQueryGlobalProvincia,new Pagination());
				provinciasForeignKey=provinciaLogic.getProvincias();
			}

			datogeneralusuario_return.setprovinciasFK(provinciasForeignKey);


			List<Ciudad> ciudadsForeignKey=new ArrayList<Ciudad>();
			Ciudad_logic ciudadLogic=new Ciudad_logic();
			ciudadLogic.setConnexion(this.connexion);
			ciudadLogic.getCiudadDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				ciudadLogic.getTodos(finalQueryGlobalCiudad,new Pagination());
				ciudadsForeignKey=ciudadLogic.getCiudads();
			}

			datogeneralusuario_return.setciudadsFK(ciudadsForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return datogeneralusuario_return;
	}
	
	
	public void deepLoad(DatoGeneralUsuario datogeneralusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToGet(datogeneralusuario,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
		datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
		datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
		datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
				continue;
			}

			if(clas.clas.equals(Pais.class)) {
				datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
				continue;
			}

			if(clas.clas.equals(Provincia.class)) {
				datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
				continue;
			}

			if(clas.clas.equals(Ciudad.class)) {
				datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Ciudad.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(datogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
		Pais_logic paisLogic= new Pais_logic(connexion);
		paisLogic.deepLoad(datogeneralusuario.getPais(),isDeep,deepLoadType,clases);
				
		datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
		Provincia_logic provinciaLogic= new Provincia_logic(connexion);
		provinciaLogic.deepLoad(datogeneralusuario.getProvincia(),isDeep,deepLoadType,clases);
				
		datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
		Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
		ciudadLogic.deepLoad(datogeneralusuario.getCiudad(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepLoad(datogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Pais.class)) {
				datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
				Pais_logic paisLogic= new Pais_logic(connexion);
				paisLogic.deepLoad(datogeneralusuario.getPais(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Provincia.class)) {
				datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
				Provincia_logic provinciaLogic= new Provincia_logic(connexion);
				provinciaLogic.deepLoad(datogeneralusuario.getProvincia(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Ciudad.class)) {
				datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
				Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
				ciudadLogic.deepLoad(datogeneralusuario.getCiudad(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setUsuario(datogeneralusuarioDataAccess.getUsuario(connexion,datogeneralusuario));
			Usuario_logic usuarioLogic= new Usuario_logic(connexion);
			usuarioLogic.deepLoad(datogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Pais.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setPais(datogeneralusuarioDataAccess.getPais(connexion,datogeneralusuario));
			Pais_logic paisLogic= new Pais_logic(connexion);
			paisLogic.deepLoad(datogeneralusuario.getPais(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Provincia.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setProvincia(datogeneralusuarioDataAccess.getProvincia(connexion,datogeneralusuario));
			Provincia_logic provinciaLogic= new Provincia_logic(connexion);
			provinciaLogic.deepLoad(datogeneralusuario.getProvincia(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Ciudad.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			datogeneralusuario.setCiudad(datogeneralusuarioDataAccess.getCiudad(connexion,datogeneralusuario));
			Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
			ciudadLogic.deepLoad(datogeneralusuario.getCiudad(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(DatoGeneralUsuario datogeneralusuario,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//DatoGeneralUsuario_logic_add.updateDatoGeneralUsuarioToSave(datogeneralusuario,this.arrDatoGeneral);
			
DatoGeneralUsuario_data.save(datogeneralusuario, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(datogeneralusuario.getUsuario(),connexion);

		Pais_data.save(datogeneralusuario.getPais(),connexion);

		Provincia_data.save(datogeneralusuario.getProvincia(),connexion);

		Ciudad_data.save(datogeneralusuario.getCiudad(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(datogeneralusuario.getUsuario(),connexion);
				continue;
			}

			if(clas.clas.equals(Pais.class)) {
				Pais_data.save(datogeneralusuario.getPais(),connexion);
				continue;
			}

			if(clas.clas.equals(Provincia.class)) {
				Provincia_data.save(datogeneralusuario.getProvincia(),connexion);
				continue;
			}

			if(clas.clas.equals(Ciudad.class)) {
				Ciudad_data.save(datogeneralusuario.getCiudad(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Usuario_data.save(datogeneralusuario.getUsuario(),connexion);
		Usuario_logic usuarioLogic= new Usuario_logic(connexion);
		usuarioLogic.deepLoad(datogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);
				

		Pais_data.save(datogeneralusuario.getPais(),connexion);
		Pais_logic paisLogic= new Pais_logic(connexion);
		paisLogic.deepLoad(datogeneralusuario.getPais(),isDeep,deepLoadType,clases);
				

		Provincia_data.save(datogeneralusuario.getProvincia(),connexion);
		Provincia_logic provinciaLogic= new Provincia_logic(connexion);
		provinciaLogic.deepLoad(datogeneralusuario.getProvincia(),isDeep,deepLoadType,clases);
				

		Ciudad_data.save(datogeneralusuario.getCiudad(),connexion);
		Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
		ciudadLogic.deepLoad(datogeneralusuario.getCiudad(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Usuario.class)) {
				Usuario_data.save(datogeneralusuario.getUsuario(),connexion);
				Usuario_logic usuarioLogic= new Usuario_logic(connexion);
				usuarioLogic.deepSave(datogeneralusuario.getUsuario(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Pais.class)) {
				Pais_data.save(datogeneralusuario.getPais(),connexion);
				Pais_logic paisLogic= new Pais_logic(connexion);
				paisLogic.deepSave(datogeneralusuario.getPais(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Provincia.class)) {
				Provincia_data.save(datogeneralusuario.getProvincia(),connexion);
				Provincia_logic provinciaLogic= new Provincia_logic(connexion);
				provinciaLogic.deepSave(datogeneralusuario.getProvincia(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Ciudad.class)) {
				Ciudad_data.save(datogeneralusuario.getCiudad(),connexion);
				Ciudad_logic ciudadLogic= new Ciudad_logic(connexion);
				ciudadLogic.deepSave(datogeneralusuario.getCiudad(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(DatoGeneralUsuario.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuario);
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
			this.deepLoad(this.datogeneralusuario,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuario);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(DatoGeneralUsuario.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(datogeneralusuarios!=null) {
				for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
					this.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarios);
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
			if(datogeneralusuarios!=null) {
				for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
					this.deepLoad(datogeneralusuario,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					DatoGeneralUsuario_util.refrescarFKsDescripciones(datogeneralusuarios);
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
			this.getNewConnexionToDeep(DatoGeneralUsuario.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(DatoGeneralUsuario.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(datogeneralusuarios!=null) {
				for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
					this.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
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
			if(datogeneralusuarios!=null) {
				for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
					this.deepSave(datogeneralusuario,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdCiudadWithConnection(String sFinalQuery,Pagination pagination,Long id_ciudad)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidCiudad= new ParameterSelectionGeneral();
			parameterSelectionGeneralidCiudad.setParameterSelectionGeneralEqual(ParameterType.LONG,id_ciudad,DatoGeneralUsuario_util.IDCIUDAD,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidCiudad);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdCiudad","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdCiudad(String sFinalQuery,Pagination pagination,Long id_ciudad)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidCiudad= new ParameterSelectionGeneral();
			parameterSelectionGeneralidCiudad.setParameterSelectionGeneralEqual(ParameterType.LONG,id_ciudad,DatoGeneralUsuario_util.IDCIUDAD,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidCiudad);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdCiudad","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdPaisWithConnection(String sFinalQuery,Pagination pagination,Long id_pais)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPais= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPais.setParameterSelectionGeneralEqual(ParameterType.LONG,id_pais,DatoGeneralUsuario_util.IDPAIS,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPais);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPais","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
			parameterSelectionGeneralidPais.setParameterSelectionGeneralEqual(ParameterType.LONG,id_pais,DatoGeneralUsuario_util.IDPAIS,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPais);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPais","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidProvincia= new ParameterSelectionGeneral();
			parameterSelectionGeneralidProvincia.setParameterSelectionGeneralEqual(ParameterType.LONG,id_provincia,DatoGeneralUsuario_util.IDPROVINCIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidProvincia);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdProvincia","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
			parameterSelectionGeneralidProvincia.setParameterSelectionGeneralEqual(ParameterType.LONG,id_provincia,DatoGeneralUsuario_util.IDPROVINCIA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidProvincia);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdProvincia","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdUsuarioWithConnection(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,DatoGeneralUsuario.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralid= new ParameterSelectionGeneral();
			parameterSelectionGeneralid.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,DatoGeneralUsuario_util.ID,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralid);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdUsuario(String sFinalQuery,Pagination pagination,Long id_usuario)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralid= new ParameterSelectionGeneral();
			parameterSelectionGeneralid.setParameterSelectionGeneralEqual(ParameterType.LONG,id_usuario,DatoGeneralUsuario_util.ID,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralid);

			DatoGeneralUsuario_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdUsuario","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			datogeneralusuarios=datogeneralusuarioDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				DatoGeneralUsuario_util.refrescarFKsDescripciones(this.datogeneralusuarios);
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
			if(DatoGeneralUsuario_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,DatoGeneralUsuarioDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,DatoGeneralUsuario datogeneralusuario,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(DatoGeneralUsuario_util.IS_CON_AUDITORIA) {
				if(datogeneralusuario.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DatoGeneralUsuarioDataAccess.TABLENAME, datogeneralusuario.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(DatoGeneralUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////DatoGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,datogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(datogeneralusuario.getIsDeleted()) {
					/*if(!datogeneralusuario.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,DatoGeneralUsuarioDataAccess.TABLENAME, datogeneralusuario.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////DatoGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,datogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DatoGeneralUsuarioDataAccess.TABLENAME, datogeneralusuario.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(datogeneralusuario.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,DatoGeneralUsuarioDataAccess.TABLENAME, datogeneralusuario.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(DatoGeneralUsuario_util.IS_CON_AUDITORIA_DETALLE) {
						////DatoGeneralUsuario_logic.registrarAuditoriaDetalles(connexion,datogeneralusuario,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,DatoGeneralUsuario datogeneralusuario)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getid_pais().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_pais()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_pais()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_pais().toString();
				}
				if(datogeneralusuario.getid_pais()!=null)
				{
					strValorNuevo=datogeneralusuario.getid_pais().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.IDPAIS,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getid_provincia().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_provincia()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_provincia()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_provincia().toString();
				}
				if(datogeneralusuario.getid_provincia()!=null)
				{
					strValorNuevo=datogeneralusuario.getid_provincia().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.IDPROVINCIA,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getid_ciudad().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_ciudad()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_ciudad()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getid_ciudad().toString();
				}
				if(datogeneralusuario.getid_ciudad()!=null)
				{
					strValorNuevo=datogeneralusuario.getid_ciudad().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.IDCIUDAD,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getcedula().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getcedula()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getcedula()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getcedula();
				}
				if(datogeneralusuario.getcedula()!=null)
				{
					strValorNuevo=datogeneralusuario.getcedula() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.CEDULA,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getapellidos().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getapellidos()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getapellidos()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getapellidos();
				}
				if(datogeneralusuario.getapellidos()!=null)
				{
					strValorNuevo=datogeneralusuario.getapellidos() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.APELLIDOS,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getnombres().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getnombres()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getnombres()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getnombres();
				}
				if(datogeneralusuario.getnombres()!=null)
				{
					strValorNuevo=datogeneralusuario.getnombres() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.NOMBRES,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.gettelefono().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono();
				}
				if(datogeneralusuario.gettelefono()!=null)
				{
					strValorNuevo=datogeneralusuario.gettelefono() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.TELEFONO,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.gettelefono_movil().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono_movil()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono_movil()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().gettelefono_movil();
				}
				if(datogeneralusuario.gettelefono_movil()!=null)
				{
					strValorNuevo=datogeneralusuario.gettelefono_movil() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.TELEFONOMOVIL,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.gete_mail().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().gete_mail()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().gete_mail()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().gete_mail();
				}
				if(datogeneralusuario.gete_mail()!=null)
				{
					strValorNuevo=datogeneralusuario.gete_mail() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.EMAIL,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.geturl().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().geturl()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().geturl()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().geturl();
				}
				if(datogeneralusuario.geturl()!=null)
				{
					strValorNuevo=datogeneralusuario.geturl() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.URL,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getfecha_nacimiento().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getfecha_nacimiento()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getfecha_nacimiento()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getfecha_nacimiento().toString();
				}
				if(datogeneralusuario.getfecha_nacimiento()!=null)
				{
					strValorNuevo=datogeneralusuario.getfecha_nacimiento().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.FECHANACIMIENTO,strValorActual,strValorNuevo);
			}	
			
			if(datogeneralusuario.getIsNew()||!datogeneralusuario.getdireccion().equals(datogeneralusuario.getDatoGeneralUsuarioOriginal().getdireccion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(datogeneralusuario.getDatoGeneralUsuarioOriginal().getdireccion()!=null)
				{
					strValorActual=datogeneralusuario.getDatoGeneralUsuarioOriginal().getdireccion();
				}
				if(datogeneralusuario.getdireccion()!=null)
				{
					strValorNuevo=datogeneralusuario.getdireccion() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),DatoGeneralUsuarioConstantesFunciones.DIRECCION,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(DatoGeneralUsuario datogeneralusuario) throws Exception {

		if(!datogeneralusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(datogeneralusuario,true);
		}
	}

	public void saveRelaciones(DatoGeneralUsuario datogeneralusuario)throws Exception {

		if(!datogeneralusuario.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(datogeneralusuario,false);
		}
	}

	public void saveRelacionesBase(DatoGeneralUsuario datogeneralusuario,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("DatoGeneralUsuario-saveRelacionesWithConnection");}
	

			this.setDatoGeneralUsuario(datogeneralusuario);

				if((datogeneralusuario.getIsNew()||datogeneralusuario.getIsChanged())&&!datogeneralusuario.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(datogeneralusuario.getIsDeleted()) {
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
			ArrayList<Classe> classes=DatoGeneralUsuario_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=DatoGeneralUsuario_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setDatoGeneralUsuario(DatoGeneralUsuario newDatoGeneralUsuario) {
		this.datogeneralusuario = newDatoGeneralUsuario;
	}
	
	public DatoGeneralUsuario_data getDatoGeneralUsuarioDataAccess() {
		return datogeneralusuarioDataAccess;
	}
	
	public void setDatoGeneralUsuarioDataAccess(DatoGeneralUsuario_data newdatogeneralusuarioDataAccess) {
		this.datogeneralusuarioDataAccess = newdatogeneralusuarioDataAccess;
	}

	public void setDatoGeneralUsuarios(List<DatoGeneralUsuario> newDatoGeneralUsuarios) {
		this.datogeneralusuarios = newDatoGeneralUsuarios;
	}
	
	public Object getDatoGeneralUsuarioObject() {	
		this.datogeneralusuarioObject=this.datogeneralusuarioDataAccess.getEntityObject();
		return this.datogeneralusuarioObject;
	}
		
	public void setDatoGeneralUsuarioObject(Object newDatoGeneralUsuarioObject) {
		this.datogeneralusuarioObject = newDatoGeneralUsuarioObject;
	}
	
	public List<Object> getDatoGeneralUsuariosObject() {		
		this.datogeneralusuariosObject=this.datogeneralusuarioDataAccess.getEntitiesObject();
		return this.datogeneralusuariosObject;
	}
		
	public void setDatoGeneralUsuariosObject(List<Object> newDatoGeneralUsuariosObject) {
		this.datogeneralusuariosObject = newDatoGeneralUsuariosObject;
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
