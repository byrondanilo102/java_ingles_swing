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
package com.bydan.ingles.seguridad.perfilcampo.business.logic;


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
import com.bydan.ingles.seguridad.perfilcampo.util.*;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_util;
import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampo_param_return;
//import com.bydan.ingles.seguridad.perfilcampo.util.PerfilCampoParameterGeneral;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.PerfilCampo;
//import com.bydan.ingles.seguridad.perfilcampo.business.logic.PerfilCampo_logic_add;
import com.bydan.ingles.seguridad.perfilcampo.business.data.*;
import com.bydan.ingles.seguridad.perfilcampo.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.seguridad.perfil.business.entity.Perfil;
import com.bydan.ingles.seguridad.perfil.business.data.Perfil_data;
import com.bydan.ingles.seguridad.perfil.business.logic.Perfil_logic;

import com.bydan.ingles.seguridad.campo.business.entity.Campo;
import com.bydan.ingles.seguridad.campo.business.data.Campo_data;
import com.bydan.ingles.seguridad.campo.business.logic.Campo_logic;

//REL


//REL DETALLES











@SuppressWarnings({"unused"})
public class PerfilCampo_logic  extends GeneralEntityLogic implements PerfilCampo_logicI {
	static Logger logger = Logger.getLogger("PerfilCampo_logic.class");	

	protected PerfilCampo_data perfilcampoDataAccess; 	
	protected PerfilCampo perfilcampo;
	protected List<PerfilCampo> perfilcampos;
	protected Object perfilcampoObject;	
	protected List<Object> perfilcamposObject;
	
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
	
	
	
	
	
	
	public PerfilCampo_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.perfilcampoDataAccess = new PerfilCampo_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			PerfilCampo_data.ActualizarQueries();
			
			//this.perfilcampoDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.perfilcampos= new ArrayList<PerfilCampo>();
			this.perfilcampo= new PerfilCampo();
			
			this.perfilcampoObject=new Object();
			this.perfilcamposObject=new ArrayList<Object>();
				
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
			
			this.perfilcampoDataAccess.setConnexionType(this.connexionType);
			this.perfilcampoDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public PerfilCampo_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.perfilcampoDataAccess = new PerfilCampo_data();
			this.perfilcampos= new ArrayList<PerfilCampo>();
			this.perfilcampo= new PerfilCampo();
			this.perfilcampoObject=new Object();
			this.perfilcamposObject=new ArrayList<Object>();
			
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
			
			this.perfilcampoDataAccess.setConnexionType(this.connexionType);
			this.perfilcampoDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public PerfilCampo getPerfilCampo() throws Exception {	
		//PerfilCampo_logic_add.checkPerfilCampoToGet(perfilcampo,this.datosCliente,this.arrDatoGeneral);
		//PerfilCampo_logic_add.updatePerfilCampoToGet(perfilcampo,this.arrDatoGeneral);
		
		return perfilcampo;
	}
	
	public List<PerfilCampo> getPerfilCampos() throws Exception {		
		if(this.perfilcampos==null) {
			this.perfilcampos= new ArrayList<PerfilCampo>();
		}
		
		this.quitarsNulos();
		
		//PerfilCampo_logic_add.checkPerfilCampoToGets(perfilcampos,this.datosCliente,this.arrDatoGeneral);
		
		for (PerfilCampo perfilcampoLocal: perfilcampos ) {
			//PerfilCampo_logic_add.updatePerfilCampoToGet(perfilcampoLocal,this.arrDatoGeneral);
		}
		
		return perfilcampos;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.perfilcampoDataAccess!=null) {
			this.perfilcampoDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			perfilcampoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			perfilcampoDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		perfilcampo = new  PerfilCampo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilcampo=perfilcampoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
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
		perfilcampo = new  PerfilCampo();
		  		  
        try {
			
			perfilcampo=perfilcampoDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		perfilcampo = new  PerfilCampo();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			perfilcampo=perfilcampoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
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
		perfilcampo = new  PerfilCampo();
		  		  
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
		perfilcampo = new  PerfilCampo();
		  		  
        try {
			
			perfilcampo=perfilcampoDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		perfilcampo = new  PerfilCampo();
		  		  
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
		perfilcampo = new  PerfilCampo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =perfilcampoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilcampo = new  PerfilCampo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=perfilcampoDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilcampo = new  PerfilCampo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =perfilcampoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilcampo = new  PerfilCampo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=perfilcampoDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		perfilcampo = new  PerfilCampo();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =perfilcampoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		perfilcampo = new  PerfilCampo();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=perfilcampoDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		perfilcampo = new  PerfilCampo();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampo=perfilcampoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilcampo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
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
		perfilcampo = new  PerfilCampo();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampo=perfilcampoDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(perfilcampo);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		  		  
        try {
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		perfilcampos = new  ArrayList<PerfilCampo>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
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
		perfilcampos = new  ArrayList<PerfilCampo>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(perfilcampos);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(PerfilCampo perfilcampo) throws Exception {
		Boolean estaValidado=false;
		
		if(perfilcampo.getIsNew() || perfilcampo.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<PerfilCampo> PerfilCampos) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(PerfilCampo perfilcampoLocal:perfilcampos) {				
			estaValidadoObjeto=this.validarGuardar(perfilcampoLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<PerfilCampo> PerfilCampos) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilcampos)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(PerfilCampo PerfilCampo) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(perfilcampo)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(PerfilCampo perfilcampo) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+perfilcampo.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"perfilcampo","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(PerfilCampo_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(PerfilCampo_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//PerfilCampo_logic_add.checkPerfilCampoToSave(this.perfilcampo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilCampo_logic_add.updatePerfilCampoToSave(this.perfilcampo,this.arrDatoGeneral);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilcampo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilCampo_util.permiteMantenimiento(this.perfilcampo) && this.validarGuardar(this.perfilcampo)) {
				PerfilCampo_data.save(this.perfilcampo, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);				
			}

			//PerfilCampo_logic_add.checkPerfilCampoToSaveAfter(this.perfilcampo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.perfilcampo.getIsDeleted()) {
				this.perfilcampo=null;
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
			
			//PerfilCampo_logic_add.checkPerfilCampoToSave(this.perfilcampo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//PerfilCampo_logic_add.updatePerfilCampoToSave(this.perfilcampo,this.arrDatoGeneral);
			
			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.perfilcampo,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(PerfilCampo_util.permiteMantenimiento(this.perfilcampo) && this.validarGuardar(this.perfilcampo)) {			
				PerfilCampo_data.save(this.perfilcampo, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.perfilcampo,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);				
			}
			
			//PerfilCampo_logic_add.checkPerfilCampoToSaveAfter(this.perfilcampo,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.perfilcampo.getIsDeleted()) {
				this.perfilcampo=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//PerfilCampo_logic_add.checkPerfilCampoToSaves(perfilcampos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosPerfilCampo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilCampo perfilcampoLocal:perfilcampos) {		
				
				if(!PerfilCampo_util.permiteMantenimiento(perfilcampoLocal)) {
					continue;
				}
				
				//PerfilCampo_logic_add.updatePerfilCampoToSave(perfilcampoLocal,this.arrDatoGeneral);
	        	
				PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilcampoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilcampoLocal)) {
					PerfilCampo_data.save(perfilcampoLocal, connexion);				
				} else {
					validadoTodosPerfilCampo=false;
				}
			}
			
			if(!validadoTodosPerfilCampo) {
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
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}
			
			//PerfilCampo_logic_add.checkPerfilCampoToSavesAfter(perfilcampos,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//PerfilCampo_logic_add.checkPerfilCampoToSaves(perfilcampos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosPerfilCampo=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(PerfilCampo perfilcampoLocal:perfilcampos) {				
				if(!PerfilCampo_util.permiteMantenimiento(perfilcampoLocal)) {
					continue;
				}
				
				//PerfilCampo_logic_add.updatePerfilCampoToSave(perfilcampoLocal,this.arrDatoGeneral);
	        	
				PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),perfilcampoLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(perfilcampoLocal)) {				
					PerfilCampo_data.save(perfilcampoLocal, connexion);				
				} else {
					validadoTodosPerfilCampo=false;
				}
			}
			
			if(!validadoTodosPerfilCampo) {
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
				
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}

			//PerfilCampo_logic_add.checkPerfilCampoToSavesAfter(perfilcampos,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilCampo_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilCampo> perfilcampos,PerfilCampo_param_return perfilcampoParameterGeneral)throws Exception {
		 try {	
			PerfilCampo_param_return perfilcampoReturnGeneral=new PerfilCampo_param_return();
	
			
			return perfilcampoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public PerfilCampo_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<PerfilCampo> perfilcampos,PerfilCampo_param_return perfilcampoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilCampo_param_return perfilcampoReturnGeneral=new PerfilCampo_param_return();
	
			
			this.connexion.commit();
			
			return perfilcampoReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilCampo_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,PerfilCampo_param_return perfilcampoParameterGeneral,Boolean isEsNuevoPerfilCampo,ArrayList<Classe> clases)throws Exception {
		 try {	
			PerfilCampo_param_return perfilcampoReturnGeneral=new PerfilCampo_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilcampoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return perfilcampoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public PerfilCampo_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<PerfilCampo> perfilcampos,PerfilCampo perfilcampo,PerfilCampo_param_return perfilcampoParameterGeneral,Boolean isEsNuevoPerfilCampo,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			PerfilCampo_param_return perfilcampoReturnGeneral=new PerfilCampo_param_return();
	
			perfilcampoReturnGeneral.setPerfilCampo(perfilcampo);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				perfilcampoReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return perfilcampoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public PerfilCampo_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,PerfilCampo_param_return perfilcampoParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			PerfilCampo_param_return perfilcampoReturnGeneral=new PerfilCampo_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.perfilcampos=new ArrayList<PerfilCampo>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.perfilcampo=new PerfilCampo();
				
				
				if(conColumnasBase) {this.perfilcampo.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.perfilcampo.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.perfilcampo.settodo(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilcampo.setingreso(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilcampo.setmodificacion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilcampo.seteliminacion(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilcampo.setconsulta(Boolean.parseBoolean(arrColumnas[iColumn++]));
				this.perfilcampo.setestado(Boolean.parseBoolean(arrColumnas[iColumn++]));
				
				this.perfilcampos.add(this.perfilcampo);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			perfilcampoReturnGeneral.setConRetornoEstaProcesado(true);
			perfilcampoReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return perfilcampoReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<PerfilCampo> perfilcamposAux= new ArrayList<PerfilCampo>();
		
		for(PerfilCampo perfilcampo:perfilcampos) {
			if(!perfilcampo.getIsDeleted()) {
				perfilcamposAux.add(perfilcampo);
			}
		}
		
		perfilcampos=perfilcamposAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<PerfilCampo> perfilcamposAux= new ArrayList<PerfilCampo>();
		
		for(PerfilCampo perfilcampo : this.perfilcampos) {
			if(perfilcampo==null) {
				perfilcamposAux.add(perfilcampo);
			}
		}
		
		//this.perfilcampos=perfilcamposAux;
		
		this.perfilcampos.removeAll(perfilcamposAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(perfilcampo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((perfilcampo.getIsDeleted() || (perfilcampo.getIsChanged()&&!perfilcampo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=perfilcampoDataAccess.getSetVersionRow(connexion,perfilcampo.getId());
				
				if(!perfilcampo.getVersionRow().equals(timestamp)) {	
					perfilcampo.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				perfilcampo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(perfilcampo.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((perfilcampo.getIsDeleted() || (perfilcampo.getIsChanged()&&!perfilcampo.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=perfilcampoDataAccess.getSetVersionRow(connexion,perfilcampo.getId());
			
			try {							
				if(!perfilcampo.getVersionRow().equals(timestamp)) {	
					perfilcampo.setVersionRow(timestamp);
				}
				
				perfilcampo.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(perfilcampos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(PerfilCampo perfilcampoAux:perfilcampos) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(perfilcampoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilcampoAux.getIsDeleted() || (perfilcampoAux.getIsChanged()&&!perfilcampoAux.getIsNew())) {
						
						timestamp=perfilcampoDataAccess.getSetVersionRow(connexion,perfilcampoAux.getId());
						
						if(!perfilcampo.getVersionRow().equals(timestamp)) {	
							perfilcampoAux.setVersionRow(timestamp);
						}
								
						perfilcampoAux.setIsChangedAuxiliar(false);														
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
		if(perfilcampos!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(PerfilCampo perfilcampoAux:perfilcampos) {
					if(perfilcampoAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(perfilcampoAux.getIsDeleted() || (perfilcampoAux.getIsChanged()&&!perfilcampoAux.getIsNew())) {
						
						timestamp=perfilcampoDataAccess.getSetVersionRow(connexion,perfilcampoAux.getId());
						
						if(!perfilcampoAux.getVersionRow().equals(timestamp)) {	
							perfilcampoAux.setVersionRow(timestamp);
						}
						
													
						perfilcampoAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public PerfilCampo_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalPerfil,String finalQueryGlobalCampo) throws Exception {
		PerfilCampo_param_return  perfilcampo_return =new PerfilCampo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-cargarCombosLoteForeignKeyPerfilCampoWithConnection");
			
			this.connexion.begin();
			
			perfilcampo_return =new PerfilCampo_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilcampo_return.setperfilsFK(perfilsForeignKey);


			List<Campo> camposForeignKey=new ArrayList<Campo>();
			Campo_logic campoLogic=new Campo_logic();
			campoLogic.setConnexion(this.connexion);
			campoLogic.getCampoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalCampo.equals("NONE")) {
				campoLogic.getTodos(finalQueryGlobalCampo,new Pagination());
				camposForeignKey=campoLogic.getCampos();
			}

			perfilcampo_return.setcamposFK(camposForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return perfilcampo_return;
	}
	
	public PerfilCampo_param_return cargarCombosLoteFK(String finalQueryGlobalPerfil,String finalQueryGlobalCampo) throws Exception {
		PerfilCampo_param_return  perfilcampo_return =new PerfilCampo_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			perfilcampo_return =new PerfilCampo_param_return();
			
			

			List<Perfil> perfilsForeignKey=new ArrayList<Perfil>();
			Perfil_logic perfilLogic=new Perfil_logic();
			perfilLogic.setConnexion(this.connexion);
			perfilLogic.getPerfilDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				perfilLogic.getTodos(finalQueryGlobalPerfil,new Pagination());
				perfilsForeignKey=perfilLogic.getPerfils();
			}

			perfilcampo_return.setperfilsFK(perfilsForeignKey);


			List<Campo> camposForeignKey=new ArrayList<Campo>();
			Campo_logic campoLogic=new Campo_logic();
			campoLogic.setConnexion(this.connexion);
			campoLogic.getCampoDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalCampo.equals("NONE")) {
				campoLogic.getTodos(finalQueryGlobalCampo,new Pagination());
				camposForeignKey=campoLogic.getCampos();
			}

			perfilcampo_return.setcamposFK(camposForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return perfilcampo_return;
	}
	
	
	public void deepLoad(PerfilCampo perfilcampo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//PerfilCampo_logic_add.updatePerfilCampoToGet(perfilcampo,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
		perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
				continue;
			}

			if(clas.clas.equals(Campo.class)) {
				perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
		}
		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Campo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilcampo.getPerfil(),isDeep,deepLoadType,clases);
				
		perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
		Campo_logic campoLogic= new Campo_logic(connexion);
		campoLogic.deepLoad(perfilcampo.getCampo(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepLoad(perfilcampo.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Campo.class)) {
				perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
				Campo_logic campoLogic= new Campo_logic(connexion);
				campoLogic.deepLoad(perfilcampo.getCampo(),isDeep,deepLoadType,clases);				
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilcampo.setPerfil(perfilcampoDataAccess.getPerfil(connexion,perfilcampo));
			Perfil_logic perfilLogic= new Perfil_logic(connexion);
			perfilLogic.deepLoad(perfilcampo.getPerfil(),isDeep,deepLoadType,clases);
				
		}

		existe=false;


		for(Classe clas:clases) {
			if(clas.clas.equals(Campo.class)) {
				existe=true;
				break;
			}
				
		}

		if(!existe) {
			perfilcampo.setCampo(perfilcampoDataAccess.getCampo(connexion,perfilcampo));
			Campo_logic campoLogic= new Campo_logic(connexion);
			campoLogic.deepLoad(perfilcampo.getCampo(),isDeep,deepLoadType,clases);
				
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(PerfilCampo perfilcampo,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//PerfilCampo_logic_add.updatePerfilCampoToSave(perfilcampo,this.arrDatoGeneral);
			
PerfilCampo_data.save(perfilcampo, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilcampo.getPerfil(),connexion);

		Campo_data.save(perfilcampo.getCampo(),connexion);
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilcampo.getPerfil(),connexion);
				continue;
			}

			if(clas.clas.equals(Campo.class)) {
				Campo_data.save(perfilcampo.getCampo(),connexion);
				continue;
			}

		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Perfil_data.save(perfilcampo.getPerfil(),connexion);
		Perfil_logic perfilLogic= new Perfil_logic(connexion);
		perfilLogic.deepLoad(perfilcampo.getPerfil(),isDeep,deepLoadType,clases);
				

		Campo_data.save(perfilcampo.getCampo(),connexion);
		Campo_logic campoLogic= new Campo_logic(connexion);
		campoLogic.deepLoad(perfilcampo.getCampo(),isDeep,deepLoadType,clases);
				
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Perfil.class)) {
				Perfil_data.save(perfilcampo.getPerfil(),connexion);
				Perfil_logic perfilLogic= new Perfil_logic(connexion);
				perfilLogic.deepSave(perfilcampo.getPerfil(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(Campo.class)) {
				Campo_data.save(perfilcampo.getCampo(),connexion);
				Campo_logic campoLogic= new Campo_logic(connexion);
				campoLogic.deepSave(perfilcampo.getCampo(),isDeep,deepLoadType,clases);				
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
			this.getNewConnexionToDeep(PerfilCampo.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(perfilcampo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilCampo_util.refrescarFKsDescripciones(perfilcampo);
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
			this.deepLoad(this.perfilcampo,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampo);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(PerfilCampo.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(perfilcampos!=null) {
				for(PerfilCampo perfilcampo:perfilcampos) {
					this.deepLoad(perfilcampo,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					PerfilCampo_util.refrescarFKsDescripciones(perfilcampos);
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
			if(perfilcampos!=null) {
				for(PerfilCampo perfilcampo:perfilcampos) {
					this.deepLoad(perfilcampo,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					PerfilCampo_util.refrescarFKsDescripciones(perfilcampos);
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
			this.getNewConnexionToDeep(PerfilCampo.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(perfilcampo,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(PerfilCampo.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(perfilcampos!=null) {
				for(PerfilCampo perfilcampo:perfilcampos) {
					this.deepSave(perfilcampo,isDeep,deepLoadType,clases);
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
			if(perfilcampos!=null) {
				for(PerfilCampo perfilcampo:perfilcampos) {
					this.deepSave(perfilcampo,isDeep,deepLoadType,clases);
				}		
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	public void getsFK_IdCampoWithConnection(String sFinalQuery,Pagination pagination,Long id_campo)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidCampo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidCampo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_campo,PerfilCampo_util.IDCAMPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidCampo);

			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdCampo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdCampo(String sFinalQuery,Pagination pagination,Long id_campo)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidCampo= new ParameterSelectionGeneral();
			parameterSelectionGeneralidCampo.setParameterSelectionGeneralEqual(ParameterType.LONG,id_campo,PerfilCampo_util.IDCAMPO,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidCampo);

			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdCampo","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	public void getsFK_IdPerfilWithConnection(String sFinalQuery,Pagination pagination,Long id_perfil)throws Exception {
		try
		{
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,PerfilCampo.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilCampo_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}


			this.connexion.commit();
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
			this.connexion.close();
		}
	}

	public void getsFK_IdPerfil(String sFinalQuery,Pagination pagination,Long id_perfil)throws Exception {
		try
		{

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidPerfil= new ParameterSelectionGeneral();
			parameterSelectionGeneralidPerfil.setParameterSelectionGeneralEqual(ParameterType.LONG,id_perfil,PerfilCampo_util.IDPERFIL,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidPerfil);

			PerfilCampo_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdPerfil","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			perfilcampos=perfilcampoDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				PerfilCampo_util.refrescarFKsDescripciones(this.perfilcampos);
			}

		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		} finally {
		}
	}

	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PerfilCampo_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				//auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilCampoDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,PerfilCampo perfilcampo,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		//Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		//auditoriaLogicAdditional.setConnexion(connexion);
		//AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(PerfilCampo_util.IS_CON_AUDITORIA) {
				if(perfilcampo.getIsNew()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilCampoDataAccess.TABLENAME, perfilcampo.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilCampo_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilCampo_logic.registrarAuditoriaDetalles(connexion,perfilcampo,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(perfilcampo.getIsDeleted()) {
					/*if(!perfilcampo.getIsExpired()) {
						//auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,PerfilCampoDataAccess.TABLENAME, perfilcampo.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						//PerfilCampo_logic.registrarAuditoriaDetalles(connexion,perfilcampo,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilCampoDataAccess.TABLENAME, perfilcampo.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(perfilcampo.getIsChanged()) {
					//auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,PerfilCampoDataAccess.TABLENAME, perfilcampo.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(PerfilCampo_util.IS_CON_AUDITORIA_DETALLE) {
						//PerfilCampo_logic.registrarAuditoriaDetalles(connexion,perfilcampo,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,PerfilCampo perfilcampo)throws Exception {		
		//AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		//auditoriaDetalleLogicAdditional.setConnexion(connexion);
		//AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(perfilcampo.getIsNew()||!perfilcampo.getid_perfil().equals(perfilcampo.getPerfilCampoOriginal().getid_perfil()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getid_perfil()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getid_perfil().toString();
				}
				if(perfilcampo.getid_perfil()!=null)
				{
					strValorNuevo=perfilcampo.getid_perfil().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.IDPERFIL,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.getid_campo().equals(perfilcampo.getPerfilCampoOriginal().getid_campo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getid_campo()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getid_campo().toString();
				}
				if(perfilcampo.getid_campo()!=null)
				{
					strValorNuevo=perfilcampo.getid_campo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.IDCAMPO,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.gettodo().equals(perfilcampo.getPerfilCampoOriginal().gettodo()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().gettodo()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().gettodo().toString();
				}
				if(perfilcampo.gettodo()!=null)
				{
					strValorNuevo=perfilcampo.gettodo().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.TODO,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.getingreso().equals(perfilcampo.getPerfilCampoOriginal().getingreso()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getingreso()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getingreso().toString();
				}
				if(perfilcampo.getingreso()!=null)
				{
					strValorNuevo=perfilcampo.getingreso().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.INGRESO,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.getmodificacion().equals(perfilcampo.getPerfilCampoOriginal().getmodificacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getmodificacion()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getmodificacion().toString();
				}
				if(perfilcampo.getmodificacion()!=null)
				{
					strValorNuevo=perfilcampo.getmodificacion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.MODIFICACION,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.geteliminacion().equals(perfilcampo.getPerfilCampoOriginal().geteliminacion()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().geteliminacion()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().geteliminacion().toString();
				}
				if(perfilcampo.geteliminacion()!=null)
				{
					strValorNuevo=perfilcampo.geteliminacion().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.ELIMINACION,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.getconsulta().equals(perfilcampo.getPerfilCampoOriginal().getconsulta()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getconsulta()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getconsulta().toString();
				}
				if(perfilcampo.getconsulta()!=null)
				{
					strValorNuevo=perfilcampo.getconsulta().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.CONSULTA,strValorActual,strValorNuevo);
			}	
			
			if(perfilcampo.getIsNew()||!perfilcampo.getestado().equals(perfilcampo.getPerfilCampoOriginal().getestado()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(perfilcampo.getPerfilCampoOriginal().getestado()!=null)
				{
					strValorActual=perfilcampo.getPerfilCampoOriginal().getestado().toString();
				}
				if(perfilcampo.getestado()!=null)
				{
					strValorNuevo=perfilcampo.getestado().toString() ;
				}

				//auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),PerfilCampoConstantesFunciones.ESTADO,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(PerfilCampo perfilcampo) throws Exception {

		if(!perfilcampo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilcampo,true);
		}
	}

	public void saveRelaciones(PerfilCampo perfilcampo)throws Exception {

		if(!perfilcampo.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(perfilcampo,false);
		}
	}

	public void saveRelacionesBase(PerfilCampo perfilcampo,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("PerfilCampo-saveRelacionesWithConnection");}
	

			this.setPerfilCampo(perfilcampo);

			if(true) {

				//PerfilCampo_logic_add.updateRelacionesToSave(perfilcampo,this);

				if((perfilcampo.getIsNew()||perfilcampo.getIsChanged())&&!perfilcampo.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles();

				} else if(perfilcampo.getIsDeleted()) {
					this.saveRelacionesDetalles();
					this.save();
				}

				//PerfilCampo_logic_add.updateRelacionesToSaveAfter(perfilcampo,this);

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
			ArrayList<Classe> classes=PerfilCampo_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=PerfilCampo_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setPerfilCampo(PerfilCampo newPerfilCampo) {
		this.perfilcampo = newPerfilCampo;
	}
	
	public PerfilCampo_data getPerfilCampoDataAccess() {
		return perfilcampoDataAccess;
	}
	
	public void setPerfilCampoDataAccess(PerfilCampo_data newperfilcampoDataAccess) {
		this.perfilcampoDataAccess = newperfilcampoDataAccess;
	}

	public void setPerfilCampos(List<PerfilCampo> newPerfilCampos) {
		this.perfilcampos = newPerfilCampos;
	}
	
	public Object getPerfilCampoObject() {	
		this.perfilcampoObject=this.perfilcampoDataAccess.getEntityObject();
		return this.perfilcampoObject;
	}
		
	public void setPerfilCampoObject(Object newPerfilCampoObject) {
		this.perfilcampoObject = newPerfilCampoObject;
	}
	
	public List<Object> getPerfilCamposObject() {		
		this.perfilcamposObject=this.perfilcampoDataAccess.getEntitiesObject();
		return this.perfilcamposObject;
	}
		
	public void setPerfilCamposObject(List<Object> newPerfilCamposObject) {
		this.perfilcamposObject = newPerfilCamposObject;
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
