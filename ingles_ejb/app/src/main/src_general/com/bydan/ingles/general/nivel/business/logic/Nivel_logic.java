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
package com.bydan.ingles.general.nivel.business.logic;


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
import com.bydan.ingles.general.nivel.util.*;
import com.bydan.ingles.general.nivel.util.Nivel_util;
import com.bydan.ingles.general.nivel.util.Nivel_param_return;
//import com.bydan.ingles.general.nivel.util.NivelParameterGeneral;
import com.bydan.ingles.general.nivel.business.entity.Nivel;
//import com.bydan.ingles.general.nivel.business.logic.Nivel_logic_add;
import com.bydan.ingles.general.nivel.business.data.*;
import com.bydan.ingles.general.nivel.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


//REL


import com.bydan.ingles.gramatica.pronun.business.entity.Pronun;
import com.bydan.ingles.gramatica.pronun.business.data.Pronun_data;
import com.bydan.ingles.gramatica.pronun.business.logic.Pronun_logic;
import com.bydan.ingles.gramatica.pronun.util.Pronun_util;

import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.business.data.VerboIrregular_data;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.data.Expresion_data;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.general.diccionario.business.entity.Diccionario;
import com.bydan.ingles.general.diccionario.business.data.Diccionario_data;
import com.bydan.ingles.general.diccionario.business.logic.Diccionario_logic;
import com.bydan.ingles.general.diccionario.util.Diccionario_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.VerboCompuesto_data;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;

import com.bydan.ingles.gramatica.grammar.business.entity.Grammar;
import com.bydan.ingles.gramatica.grammar.business.data.Grammar_data;
import com.bydan.ingles.gramatica.grammar.business.logic.Grammar_logic;
import com.bydan.ingles.gramatica.grammar.util.Grammar_util;

//REL DETALLES


import com.bydan.ingles.gramatica.pronundetalle.business.entity.PronunDetalle;
import com.bydan.ingles.gramatica.pronundetalle.business.logic.PronunDetalle_logic;

import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;










@SuppressWarnings({"unused"})
public class Nivel_logic  extends GeneralEntityLogic implements Nivel_logicI {
	static Logger logger = Logger.getLogger("Nivel_logic.class");	

	protected Nivel_data nivelDataAccess; 	
	protected Nivel nivel;
	protected List<Nivel> nivels;
	protected Object nivelObject;	
	protected List<Object> nivelsObject;
	
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
	
	
	
	
	
	
	public Nivel_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.nivelDataAccess = new Nivel_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			Nivel_data.ActualizarQueries();
			
			//this.nivelDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.nivels= new ArrayList<Nivel>();
			this.nivel= new Nivel();
			
			this.nivelObject=new Object();
			this.nivelsObject=new ArrayList<Object>();
				
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
			
			this.nivelDataAccess.setConnexionType(this.connexionType);
			this.nivelDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public Nivel_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.nivelDataAccess = new Nivel_data();
			this.nivels= new ArrayList<Nivel>();
			this.nivel= new Nivel();
			this.nivelObject=new Object();
			this.nivelsObject=new ArrayList<Object>();
			
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
			
			this.nivelDataAccess.setConnexionType(this.connexionType);
			this.nivelDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public Nivel getNivel() throws Exception {	
		//Nivel_logic_add.checkNivelToGet(nivel,this.datosCliente,this.arrDatoGeneral);
		//Nivel_logic_add.updateNivelToGet(nivel,this.arrDatoGeneral);
		
		return nivel;
	}
	
	public List<Nivel> getNivels() throws Exception {		
		if(this.nivels==null) {
			this.nivels= new ArrayList<Nivel>();
		}
		
		this.quitarsNulos();
		
		//Nivel_logic_add.checkNivelToGets(nivels,this.datosCliente,this.arrDatoGeneral);
		
		for (Nivel nivelLocal: nivels ) {
			//Nivel_logic_add.updateNivelToGet(nivelLocal,this.arrDatoGeneral);
		}
		
		return nivels;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.nivelDataAccess!=null) {
			this.nivelDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			nivelDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			nivelDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		nivel = new  Nivel();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			nivel=nivelDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
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
		nivel = new  Nivel();
		  		  
        try {
			
			nivel=nivelDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		nivel = new  Nivel();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			nivel=nivelDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
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
		nivel = new  Nivel();
		  		  
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
		nivel = new  Nivel();
		  		  
        try {
			
			nivel=nivelDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		nivel = new  Nivel();
		  		  
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
		nivel = new  Nivel();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =nivelDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		nivel = new  Nivel();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=nivelDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		nivel = new  Nivel();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =nivelDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		nivel = new  Nivel();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=nivelDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		nivel = new  Nivel();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =nivelDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		nivel = new  Nivel();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=nivelDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		nivels = new  ArrayList<Nivel>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
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
		nivels = new  ArrayList<Nivel>();
		  		  
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
		nivels = new  ArrayList<Nivel>();
		  		  
        try {			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		nivels = new  ArrayList<Nivel>();
		  		  
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
		nivels = new  ArrayList<Nivel>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
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
		nivels = new  ArrayList<Nivel>();
		  		  
        try {
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
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
		nivels = new  ArrayList<Nivel>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
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
		nivels = new  ArrayList<Nivel>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		nivel = new  Nivel();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivel=nivelDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(nivel);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
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
		nivel = new  Nivel();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivel=nivelDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(nivel);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivel);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		nivels = new  ArrayList<Nivel>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
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
		nivels = new  ArrayList<Nivel>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			nivels=nivelDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(nivels);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(Nivel nivel) throws Exception {
		Boolean estaValidado=false;
		
		if(nivel.getIsNew() || nivel.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<Nivel> Nivels) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(Nivel nivelLocal:nivels) {				
			estaValidadoObjeto=this.validarGuardar(nivelLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<Nivel> Nivels) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(nivels)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(Nivel Nivel) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(nivel)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(Nivel nivel) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+nivel.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"nivel","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(Nivel_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(Nivel_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//Nivel_logic_add.checkNivelToSave(this.nivel,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Nivel_logic_add.updateNivelToSave(this.nivel,this.arrDatoGeneral);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.nivel,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Nivel_util.permiteMantenimiento(this.nivel) && this.validarGuardar(this.nivel)) {
				Nivel_data.save(this.nivel, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Nivel_util.refrescarFKsDescripciones(this.nivel);				
			}

			//Nivel_logic_add.checkNivelToSaveAfter(this.nivel,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.nivel.getIsDeleted()) {
				this.nivel=null;
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
			
			//Nivel_logic_add.checkNivelToSave(this.nivel,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//Nivel_logic_add.updateNivelToSave(this.nivel,this.arrDatoGeneral);
			
			Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.nivel,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(Nivel_util.permiteMantenimiento(this.nivel) && this.validarGuardar(this.nivel)) {			
				Nivel_data.save(this.nivel, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.nivel,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				Nivel_util.refrescarFKsDescripciones(this.nivel);				
			}
			
			//Nivel_logic_add.checkNivelToSaveAfter(this.nivel,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.nivel.getIsDeleted()) {
				this.nivel=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//Nivel_logic_add.checkNivelToSaves(nivels,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosNivel=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Nivel nivelLocal:nivels) {		
				
				if(!Nivel_util.permiteMantenimiento(nivelLocal)) {
					continue;
				}
				
				//Nivel_logic_add.updateNivelToSave(nivelLocal,this.arrDatoGeneral);
	        	
				Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),nivelLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(nivelLocal)) {
					Nivel_data.save(nivelLocal, connexion);				
				} else {
					validadoTodosNivel=false;
				}
			}
			
			if(!validadoTodosNivel) {
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
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
			}
			
			//Nivel_logic_add.checkNivelToSavesAfter(nivels,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//Nivel_logic_add.checkNivelToSaves(nivels,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosNivel=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(Nivel nivelLocal:nivels) {				
				if(!Nivel_util.permiteMantenimiento(nivelLocal)) {
					continue;
				}
				
				//Nivel_logic_add.updateNivelToSave(nivelLocal,this.arrDatoGeneral);
	        	
				Nivel_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),nivelLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(nivelLocal)) {				
					Nivel_data.save(nivelLocal, connexion);				
				} else {
					validadoTodosNivel=false;
				}
			}
			
			if(!validadoTodosNivel) {
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
				
				Nivel_util.refrescarFKsDescripciones(this.nivels);
			}

			//Nivel_logic_add.checkNivelToSavesAfter(nivels,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Nivel_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Nivel> nivels,Nivel_param_return nivelParameterGeneral)throws Exception {
		 try {	
			Nivel_param_return nivelReturnGeneral=new Nivel_param_return();
	
			
			return nivelReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public Nivel_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<Nivel> nivels,Nivel_param_return nivelParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			Nivel_param_return nivelReturnGeneral=new Nivel_param_return();
	
			
			this.connexion.commit();
			
			return nivelReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Nivel_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Nivel> nivels,Nivel nivel,Nivel_param_return nivelParameterGeneral,Boolean isEsNuevoNivel,ArrayList<Classe> clases)throws Exception {
		 try {	
			Nivel_param_return nivelReturnGeneral=new Nivel_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				nivelReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return nivelReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public Nivel_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<Nivel> nivels,Nivel nivel,Nivel_param_return nivelParameterGeneral,Boolean isEsNuevoNivel,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			Nivel_param_return nivelReturnGeneral=new Nivel_param_return();
	
			nivelReturnGeneral.setNivel(nivel);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				nivelReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return nivelReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public Nivel_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,Nivel_param_return nivelParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			Nivel_param_return nivelReturnGeneral=new Nivel_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.nivels=new ArrayList<Nivel>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.nivel=new Nivel();
				
				
				if(conColumnasBase) {this.nivel.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.nivel.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.nivel.setnombre(arrColumnas[iColumn++]);
				
				this.nivels.add(this.nivel);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			nivelReturnGeneral.setConRetornoEstaProcesado(true);
			nivelReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return nivelReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<Nivel> nivelsAux= new ArrayList<Nivel>();
		
		for(Nivel nivel:nivels) {
			if(!nivel.getIsDeleted()) {
				nivelsAux.add(nivel);
			}
		}
		
		nivels=nivelsAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<Nivel> nivelsAux= new ArrayList<Nivel>();
		
		for(Nivel nivel : this.nivels) {
			if(nivel==null) {
				nivelsAux.add(nivel);
			}
		}
		
		//this.nivels=nivelsAux;
		
		this.nivels.removeAll(nivelsAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(nivel.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((nivel.getIsDeleted() || (nivel.getIsChanged()&&!nivel.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=nivelDataAccess.getSetVersionRow(connexion,nivel.getId());
				
				if(!nivel.getVersionRow().equals(timestamp)) {	
					nivel.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				nivel.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(nivel.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((nivel.getIsDeleted() || (nivel.getIsChanged()&&!nivel.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=nivelDataAccess.getSetVersionRow(connexion,nivel.getId());
			
			try {							
				if(!nivel.getVersionRow().equals(timestamp)) {	
					nivel.setVersionRow(timestamp);
				}
				
				nivel.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(nivels!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(Nivel nivelAux:nivels) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(nivelAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(nivelAux.getIsDeleted() || (nivelAux.getIsChanged()&&!nivelAux.getIsNew())) {
						
						timestamp=nivelDataAccess.getSetVersionRow(connexion,nivelAux.getId());
						
						if(!nivel.getVersionRow().equals(timestamp)) {	
							nivelAux.setVersionRow(timestamp);
						}
								
						nivelAux.setIsChangedAuxiliar(false);														
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
		if(nivels!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(Nivel nivelAux:nivels) {
					if(nivelAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(nivelAux.getIsDeleted() || (nivelAux.getIsChanged()&&!nivelAux.getIsNew())) {
						
						timestamp=nivelDataAccess.getSetVersionRow(connexion,nivelAux.getId());
						
						if(!nivelAux.getVersionRow().equals(timestamp)) {	
							nivelAux.setVersionRow(timestamp);
						}
						
													
						nivelAux.setIsChangedAuxiliar(false);														
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
		
		
			Pronun_logic pronunLogic=new Pronun_logic();
			VerboIrregular_logic verboirregularLogic=new VerboIrregular_logic();
			Expresion_logic expresionLogic=new Expresion_logic();
			Diccionario_logic diccionarioLogic=new Diccionario_logic();
			VerboCompuesto_logic verbocompuestoLogic=new VerboCompuesto_logic();
			Vocabulario_logic vocabularioLogic=new Vocabulario_logic();
			Grammar_logic grammarLogic=new Grammar_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,Nivel.class.getSimpleName()+"-cargarRelacionesLoteForeignKeyNivelWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(Pronun.class));
			classes.add(new Classe(VerboIrregular.class));
			classes.add(new Classe(Expresion.class));
			classes.add(new Classe(Diccionario.class));
			classes.add(new Classe(VerboCompuesto.class));
			classes.add(new Classe(Vocabulario.class));
			classes.add(new Classe(Grammar.class));
											
			

			pronunLogic.setConnexion(this.getConnexion());
			pronunLogic.setDatosCliente(this.datosCliente);
			pronunLogic.setIsConRefrescarForeignKeys(true);

			verboirregularLogic.setConnexion(this.getConnexion());
			verboirregularLogic.setDatosCliente(this.datosCliente);
			verboirregularLogic.setIsConRefrescarForeignKeys(true);

			expresionLogic.setConnexion(this.getConnexion());
			expresionLogic.setDatosCliente(this.datosCliente);
			expresionLogic.setIsConRefrescarForeignKeys(true);

			diccionarioLogic.setConnexion(this.getConnexion());
			diccionarioLogic.setDatosCliente(this.datosCliente);
			diccionarioLogic.setIsConRefrescarForeignKeys(true);

			verbocompuestoLogic.setConnexion(this.getConnexion());
			verbocompuestoLogic.setDatosCliente(this.datosCliente);
			verbocompuestoLogic.setIsConRefrescarForeignKeys(true);

			vocabularioLogic.setConnexion(this.getConnexion());
			vocabularioLogic.setDatosCliente(this.datosCliente);
			vocabularioLogic.setIsConRefrescarForeignKeys(true);

			grammarLogic.setConnexion(this.getConnexion());
			grammarLogic.setDatosCliente(this.datosCliente);
			grammarLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(Nivel nivel:this.nivels) {
				

				classes=new ArrayList<Classe>();
				classes=Pronun_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				pronunLogic.setPronuns(nivel.pronuns);
				pronunLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verboirregularLogic.setVerboIrregulars(nivel.verboirregulars);
				verboirregularLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				expresionLogic.setExpresions(nivel.expresions);
				expresionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Diccionario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				diccionarioLogic.setDiccionarios(nivel.diccionarios);
				diccionarioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verbocompuestoLogic.setVerboCompuestos(nivel.verbocompuestos);
				verbocompuestoLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				vocabularioLogic.setVocabularios(nivel.vocabularios);
				vocabularioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Grammar_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				grammarLogic.setGrammars(nivel.grammars);
				grammarLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(Nivel nivel,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//Nivel_logic_add.updateNivelToGet(nivel,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));
		nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));
		nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));
		nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));
		nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));
		nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));
		nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));

				if(this.isConDeep) {
					Pronun_logic pronunLogic= new Pronun_logic(this.connexion);
					pronunLogic.setPronuns(nivel.getPronuns());
					ArrayList<Classe> classesLocal=Pronun_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					pronunLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Pronun_util.refrescarFKsDescripciones(pronunLogic.getPronuns());
					nivel.setPronuns(pronunLogic.getPronuns());
				}

				continue;
			}

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));

				if(this.isConDeep) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(this.connexion);
					verboirregularLogic.setVerboIrregulars(nivel.getVerboIrregulars());
					ArrayList<Classe> classesLocal=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verboirregularLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboIrregular_util.refrescarFKsDescripciones(verboirregularLogic.getVerboIrregulars());
					nivel.setVerboIrregulars(verboirregularLogic.getVerboIrregulars());
				}

				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));

				if(this.isConDeep) {
					Expresion_logic expresionLogic= new Expresion_logic(this.connexion);
					expresionLogic.setExpresions(nivel.getExpresions());
					ArrayList<Classe> classesLocal=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					expresionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Expresion_util.refrescarFKsDescripciones(expresionLogic.getExpresions());
					nivel.setExpresions(expresionLogic.getExpresions());
				}

				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));

				if(this.isConDeep) {
					Diccionario_logic diccionarioLogic= new Diccionario_logic(this.connexion);
					diccionarioLogic.setDiccionarios(nivel.getDiccionarios());
					ArrayList<Classe> classesLocal=Diccionario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					diccionarioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Diccionario_util.refrescarFKsDescripciones(diccionarioLogic.getDiccionarios());
					nivel.setDiccionarios(diccionarioLogic.getDiccionarios());
				}

				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));

				if(this.isConDeep) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(this.connexion);
					verbocompuestoLogic.setVerboCompuestos(nivel.getVerboCompuestos());
					ArrayList<Classe> classesLocal=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verbocompuestoLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboCompuesto_util.refrescarFKsDescripciones(verbocompuestoLogic.getVerboCompuestos());
					nivel.setVerboCompuestos(verbocompuestoLogic.getVerboCompuestos());
				}

				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));

				if(this.isConDeep) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(this.connexion);
					vocabularioLogic.setVocabularios(nivel.getVocabularios());
					ArrayList<Classe> classesLocal=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					vocabularioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Vocabulario_util.refrescarFKsDescripciones(vocabularioLogic.getVocabularios());
					nivel.setVocabularios(vocabularioLogic.getVocabularios());
				}

				continue;
			}

			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));

				if(this.isConDeep) {
					Grammar_logic grammarLogic= new Grammar_logic(this.connexion);
					grammarLogic.setGrammars(nivel.getGrammars());
					ArrayList<Classe> classesLocal=Grammar_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					grammarLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Grammar_util.refrescarFKsDescripciones(grammarLogic.getGrammars());
					nivel.setGrammars(grammarLogic.getGrammars());
				}

				continue;
			}
		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Pronun.class));
			nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregular.class));
			nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Expresion.class));
			nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Diccionario.class));
			nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuesto.class));
			nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Vocabulario.class));
			nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Grammar.class));
			nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {


		nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));

		for(Pronun pronun:nivel.getPronuns()) {
			Pronun_logic pronunLogic= new Pronun_logic(connexion);
			pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
		}

		nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));

		for(VerboIrregular verboirregular:nivel.getVerboIrregulars()) {
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
		}

		nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));

		for(Expresion expresion:nivel.getExpresions()) {
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
		}

		nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));

		for(Diccionario diccionario:nivel.getDiccionarios()) {
			Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
			diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
		}

		nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));

		for(VerboCompuesto verbocompuesto:nivel.getVerboCompuestos()) {
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
		}

		nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));

		for(Vocabulario vocabulario:nivel.getVocabularios()) {
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
		}

		nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));

		for(Grammar grammar:nivel.getGrammars()) {
			Grammar_logic grammarLogic= new Grammar_logic(connexion);
			grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));

				for(Pronun pronun:nivel.getPronuns()) {
					Pronun_logic pronunLogic= new Pronun_logic(connexion);
					pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));

				for(VerboIrregular verboirregular:nivel.getVerboIrregulars()) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
					verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));

				for(Expresion expresion:nivel.getExpresions()) {
					Expresion_logic expresionLogic= new Expresion_logic(connexion);
					expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));

				for(Diccionario diccionario:nivel.getDiccionarios()) {
					Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
					diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));

				for(VerboCompuesto verbocompuesto:nivel.getVerboCompuestos()) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
					verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));

				for(Vocabulario vocabulario:nivel.getVocabularios()) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
					vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));

				for(Grammar grammar:nivel.getGrammars()) {
					Grammar_logic grammarLogic= new Grammar_logic(connexion);
					grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
				}
				continue;
			}

		}
	}
	else if(deepLoadType.equals(DeepLoadType.EXCLUDE)) {


		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Pronun.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Pronun.class));
			nivel.setPronuns(nivelDataAccess.getPronuns(connexion,nivel));

			for(Pronun pronun:nivel.getPronuns()) {
				Pronun_logic pronunLogic= new Pronun_logic(connexion);
				pronunLogic.deepLoad(pronun,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboIrregular.class));
			nivel.setVerboIrregulars(nivelDataAccess.getVerboIrregulars(connexion,nivel));

			for(VerboIrregular verboirregular:nivel.getVerboIrregulars()) {
				VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
				verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Expresion.class));
			nivel.setExpresions(nivelDataAccess.getExpresions(connexion,nivel));

			for(Expresion expresion:nivel.getExpresions()) {
				Expresion_logic expresionLogic= new Expresion_logic(connexion);
				expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Diccionario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Diccionario.class));
			nivel.setDiccionarios(nivelDataAccess.getDiccionarios(connexion,nivel));

			for(Diccionario diccionario:nivel.getDiccionarios()) {
				Diccionario_logic diccionarioLogic= new Diccionario_logic(connexion);
				diccionarioLogic.deepLoad(diccionario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(VerboCompuesto.class));
			nivel.setVerboCompuestos(nivelDataAccess.getVerboCompuestos(connexion,nivel));

			for(VerboCompuesto verbocompuesto:nivel.getVerboCompuestos()) {
				VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
				verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Vocabulario.class));
			nivel.setVocabularios(nivelDataAccess.getVocabularios(connexion,nivel));

			for(Vocabulario vocabulario:nivel.getVocabularios()) {
				Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
				vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
			}
		}

		existe=false;

		for(Classe clas:clases) {
			if(clas.clas.equals(Grammar.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				existe=true;
				break;
			}
		}

		if(!existe) {
			clases.add(new Classe(Grammar.class));
			nivel.setGrammars(nivelDataAccess.getGrammars(connexion,nivel));

			for(Grammar grammar:nivel.getGrammars()) {
				Grammar_logic grammarLogic= new Grammar_logic(connexion);
				grammarLogic.deepLoad(grammar,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(Nivel nivel,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}	
	}
	
	public void deepLoadWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Nivel.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(nivel,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Nivel_util.refrescarFKsDescripciones(nivel);
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
			this.deepLoad(this.nivel,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				Nivel_util.refrescarFKsDescripciones(this.nivel);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(Nivel.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(nivels!=null) {
				for(Nivel nivel:nivels) {
					this.deepLoad(nivel,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					Nivel_util.refrescarFKsDescripciones(nivels);
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
			if(nivels!=null) {
				for(Nivel nivel:nivels) {
					this.deepLoad(nivel,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					Nivel_util.refrescarFKsDescripciones(nivels);
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
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		} finally {
			;
		}
	}
	
	
	
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,String sProcesoBusqueda,String sDetalleProcesoBusqueda,QueryWhereSelectParameters queryWhereSelectParameters,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Nivel_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,NivelDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,Nivel nivel,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(Nivel_util.IS_CON_AUDITORIA) {
				if(nivel.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NivelDataAccess.TABLENAME, nivel.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Nivel_util.IS_CON_AUDITORIA_DETALLE) {
						////Nivel_logic.registrarAuditoriaDetalles(connexion,nivel,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(nivel.getIsDeleted()) {
					/*if(!nivel.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,NivelDataAccess.TABLENAME, nivel.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////Nivel_logic.registrarAuditoriaDetalles(connexion,nivel,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NivelDataAccess.TABLENAME, nivel.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(nivel.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,NivelDataAccess.TABLENAME, nivel.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(Nivel_util.IS_CON_AUDITORIA_DETALLE) {
						////Nivel_logic.registrarAuditoriaDetalles(connexion,nivel,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,Nivel nivel)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(nivel.getIsNew()||!nivel.getnombre().equals(nivel.getNivelOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(nivel.getNivelOriginal().getnombre()!=null)
				{
					strValorActual=nivel.getNivelOriginal().getnombre();
				}
				if(nivel.getnombre()!=null)
				{
					strValorNuevo=nivel.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),NivelConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Nivel_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=Nivel_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	

	public void setNivel(Nivel newNivel) {
		this.nivel = newNivel;
	}
	
	public Nivel_data getNivelDataAccess() {
		return nivelDataAccess;
	}
	
	public void setNivelDataAccess(Nivel_data newnivelDataAccess) {
		this.nivelDataAccess = newnivelDataAccess;
	}

	public void setNivels(List<Nivel> newNivels) {
		this.nivels = newNivels;
	}
	
	public Object getNivelObject() {	
		this.nivelObject=this.nivelDataAccess.getEntityObject();
		return this.nivelObject;
	}
		
	public void setNivelObject(Object newNivelObject) {
		this.nivelObject = newNivelObject;
	}
	
	public List<Object> getNivelsObject() {		
		this.nivelsObject=this.nivelDataAccess.getEntitiesObject();
		return this.nivelsObject;
	}
		
	public void setNivelsObject(List<Object> newNivelsObject) {
		this.nivelsObject = newNivelsObject;
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
