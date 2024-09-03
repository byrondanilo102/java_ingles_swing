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
package com.bydan.ingles.general.subarea.business.logic;


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
import com.bydan.ingles.general.subarea.util.*;
import com.bydan.ingles.general.subarea.util.SubArea_util;
import com.bydan.ingles.general.subarea.util.SubArea_param_return;
//import com.bydan.ingles.general.subarea.util.SubAreaParameterGeneral;
import com.bydan.ingles.general.subarea.business.entity.SubArea;
//import com.bydan.ingles.general.subarea.business.logic.SubArea_logic_add;
import com.bydan.ingles.general.subarea.business.data.*;
import com.bydan.ingles.general.subarea.business.entity.*;

/*import com.bydan.ingles.seguridad.business.entity.*;*/

import com.bydan.ingles.seguridad.opcion.business.entity.Opcion;
import com.bydan.ingles.seguridad.modulo.business.entity.Modulo;
import com.bydan.ingles.seguridad.usuario.business.entity.Usuario;
import com.bydan.ingles.seguridad.parametrogeneralusuario.business.entity.ParametroGeneralUsuario;

//FK


import com.bydan.ingles.general.area.business.entity.Area;
import com.bydan.ingles.general.area.business.data.Area_data;
import com.bydan.ingles.general.area.business.logic.Area_logic;

//REL


import com.bydan.ingles.gramatica.verboirregular.business.entity.VerboIrregular;
import com.bydan.ingles.gramatica.verboirregular.business.data.VerboIrregular_data;
import com.bydan.ingles.gramatica.verboirregular.business.logic.VerboIrregular_logic;
import com.bydan.ingles.gramatica.verboirregular.util.VerboIrregular_util;

import com.bydan.ingles.gramatica.expresion.business.entity.Expresion;
import com.bydan.ingles.gramatica.expresion.business.data.Expresion_data;
import com.bydan.ingles.gramatica.expresion.business.logic.Expresion_logic;
import com.bydan.ingles.gramatica.expresion.util.Expresion_util;

import com.bydan.ingles.gramatica.verbocompuesto.business.entity.VerboCompuesto;
import com.bydan.ingles.gramatica.verbocompuesto.business.data.VerboCompuesto_data;
import com.bydan.ingles.gramatica.verbocompuesto.business.logic.VerboCompuesto_logic;
import com.bydan.ingles.gramatica.verbocompuesto.util.VerboCompuesto_util;

import com.bydan.ingles.gramatica.vocabulario.business.entity.Vocabulario;
import com.bydan.ingles.gramatica.vocabulario.business.data.Vocabulario_data;
import com.bydan.ingles.gramatica.vocabulario.business.logic.Vocabulario_logic;
import com.bydan.ingles.gramatica.vocabulario.util.Vocabulario_util;

//REL DETALLES


import com.bydan.ingles.gramatica.verboirregulardetalle.business.entity.VerboIrregularDetalle;
import com.bydan.ingles.gramatica.verboirregulardetalle.business.logic.VerboIrregularDetalle_logic;

import com.bydan.ingles.gramatica.expresiondetalle.business.entity.ExpresionDetalle;
import com.bydan.ingles.gramatica.expresiondetalle.business.logic.ExpresionDetalle_logic;

import com.bydan.ingles.gramatica.verbocompuestodetalle.business.entity.VerboCompuestoDetalle;
import com.bydan.ingles.gramatica.verbocompuestodetalle.business.logic.VerboCompuestoDetalle_logic;

import com.bydan.ingles.gramatica.vocabulariodetalle.business.entity.VocabularioDetalle;
import com.bydan.ingles.gramatica.vocabulariodetalle.business.logic.VocabularioDetalle_logic;










@SuppressWarnings({"unused"})
public class SubArea_logic  extends GeneralEntityLogic implements SubArea_logicI {
	static Logger logger = Logger.getLogger("SubArea_logic.class");	

	protected SubArea_data subareaDataAccess; 	
	protected SubArea subarea;
	protected List<SubArea> subareas;
	protected Object subareaObject;	
	protected List<Object> subareasObject;
	
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
	
	
	
	
	
	
	public SubArea_logic()throws SQLException,Exception {
		super();
		
		try	{						
			this.subareaDataAccess = new SubArea_data();
			
			//ACTUALIZAR QUERIES DE VARIABLES ESTATICAS
			SubArea_data.ActualizarQueries();
			
			//this.subareaDataAccess.connexion=this.connexion;//VA EN DATAACCESS
			
			this.subareas= new ArrayList<SubArea>();
			this.subarea= new SubArea();
			
			this.subareaObject=new Object();
			this.subareasObject=new ArrayList<Object>();
				
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
			
			this.subareaDataAccess.setConnexionType(this.connexionType);
			this.subareaDataAccess.setParameterDbType(this.parameterDbType);
			
			
	
			
			
			
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}	 
    }
	
	public SubArea_logic(Connexion newConnexion)throws Exception {
		super(newConnexion);
		
		try	{						
			//this.connexion=newConnexion;
			
			this.subareaDataAccess = new SubArea_data();
			this.subareas= new ArrayList<SubArea>();
			this.subarea= new SubArea();
			this.subareaObject=new Object();
			this.subareasObject=new ArrayList<Object>();
			
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
			
			this.subareaDataAccess.setConnexionType(this.connexionType);
			this.subareaDataAccess.setParameterDbType(this.parameterDbType);
			
			
			
			
			
						
			this.stringBuilder=new StringBuilder();
			this.conMostrarMensajesStringBuilder=true;
			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
	  	}	 
    }
	
	public SubArea getSubArea() throws Exception {	
		//SubArea_logic_add.checkSubAreaToGet(subarea,this.datosCliente,this.arrDatoGeneral);
		//SubArea_logic_add.updateSubAreaToGet(subarea,this.arrDatoGeneral);
		
		return subarea;
	}
	
	public List<SubArea> getSubAreas() throws Exception {		
		if(this.subareas==null) {
			this.subareas= new ArrayList<SubArea>();
		}
		
		this.quitarsNulos();
		
		//SubArea_logic_add.checkSubAreaToGets(subareas,this.datosCliente,this.arrDatoGeneral);
		
		for (SubArea subareaLocal: subareas ) {
			//SubArea_logic_add.updateSubAreaToGet(subareaLocal,this.arrDatoGeneral);
		}
		
		return subareas;
	}
	
	public void setDatosCliente(DatosCliente datosCliente) {		
		this.datosCliente = datosCliente;
		
		if(this.subareaDataAccess!=null) {
			this.subareaDataAccess.setDatosCliente(datosCliente);
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
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-executeQueryWithConnection");
			
			this.connexion.begin();	
					
			subareaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
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
			subareaDataAccess.executeQuery(connexion, sQueryExecute);   	       	 
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(Long id) throws Exception {
		subarea = new  SubArea();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			subarea=subareaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
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
		subarea = new  SubArea();
		  		  
        try {
			
			subarea=subareaDataAccess.getEntity(connexion, id);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public void getEntityWithConnection(QueryWhereSelectParameters queryWhereSelectParameters) throws Exception {
		subarea = new  SubArea();
		  		  
        try {
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();	
					
			subarea=subareaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
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
		subarea = new  SubArea();
		  		  
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
		subarea = new  SubArea();
		  		  
        try {
			
			subarea=subareaDataAccess.getEntity(connexion, queryWhereSelectParameters);   	       	 
			
			if(this.isConDeep) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntity(String sFinalQuery) throws Exception {
		subarea = new  SubArea();
		  		  
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
		subarea = new  SubArea();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntityDatoGeneralMinimoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMinimo =subareaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		subarea = new  SubArea();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		DatoGeneralMinimo datoGeneralMinimo = new DatoGeneralMinimo();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMinimo=subareaDataAccess.getEntityDatoGeneralMinimoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMinimo;
	}
	
	public ArrayList<DatoGeneral> getEntitiesDatoGeneralGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		subarea = new  SubArea();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesDatoGeneralGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGenerals =subareaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		subarea = new  SubArea();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneral> datoGenerals = new ArrayList<DatoGeneral>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGenerals=subareaDataAccess.getEntitiesDatoGeneralGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGenerals;
	}
	
	public ArrayList<DatoGeneralMaximo> getEntitiesDatoGeneralMaximoGenericoWithConnection(String sSelectQuery,String sFinalQuery,ArrayList<Classe> classes) throws Exception {
		subarea = new  SubArea();
		  
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
						
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesDatoGeneralMaximoGenericoWithConnection");
			
			this.connexion.begin();	
			
			datoGeneralMaximos =subareaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 
			
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
		subarea = new  SubArea();
		
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		ArrayList<DatoGeneralMaximo> datoGeneralMaximos = new ArrayList<DatoGeneralMaximo>();
		
        try {
			
			queryWhereSelectParameters.setSelectQuery(sSelectQuery);			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			datoGeneralMaximos=subareaDataAccess.getEntitiesDatoGeneralMaximoGenerico(connexion, queryWhereSelectParameters,classes);   	       	 			
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
		
		return datoGeneralMaximos;
	}

	public void getEntitiesWithConnection(QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		subareas = new  ArrayList<SubArea>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		  		  
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
		subareas = new  ArrayList<SubArea>();
		  		  
        try {			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIES","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion, queryWhereSelectParameters);    	       	 			
		
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntities(String sFinalQuery)throws Exception {	
		subareas = new  ArrayList<SubArea>();
		  		  
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
		subareas = new  ArrayList<SubArea>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		  		  
        try {
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getEntityWithConnection(String sQuerySelect,String sFinalQuery,List<String> listColumns,DeepLoadType deepLoadType,Boolean conMapGenerico)throws Exception {	
		subarea = new  SubArea();
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntityWithConnection");
			
			this.connexion.begin();			
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subarea=subareaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(subarea);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
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
		subarea = new  SubArea();
		 
		QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters();
		
        try {
			
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESWITHSELECT","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subarea=subareaDataAccess.getEntity(connexion,sQuerySelect, queryWhereSelectParameters,listColumns,deepLoadType,conMapGenerico);    	       	 
			
			this.validarGuardarManejar(subarea);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subarea);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	
	public void getEntitiesSimpleQueryBuildWithConnection(String sQuerySelect,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {	
		subareas = new  ArrayList<SubArea>();
		  		  
        try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getEntitiesSimpleQueryBuildWithConnection");
			
			this.connexion.begin();			
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		  		  
        try {
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"GETENTITIESSIMPLEQUERY","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntitiesSimpleQueryBuild(connexion,sQuerySelect, queryWhereSelectParameters);    	       	 
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public void getTodosWithConnection(String sFinalQuery,Pagination pagination)throws Exception {
		subareas = new  ArrayList<SubArea>();
		
		try {
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getTodosWithConnection");
			
			this.connexion.begin();			
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
		subareas = new  ArrayList<SubArea>();
		
		try {
			
			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters("");	
			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"TODOS","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			subareas=subareaDataAccess.getEntities(connexion,queryWhereSelectParameters);				
			
			this.validarGuardarManejar(subareas);
			
			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}
			
		} catch(Exception e) {	
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}		
	}
	
	public Boolean validarGuardar(SubArea subarea) throws Exception {
		Boolean estaValidado=false;
		
		if(subarea.getIsNew() || subarea.getIsChanged()) { 
			
				estaValidado=true;
		} else {
			estaValidado=true;
		}
		
		return estaValidado;
	}
	
	public Boolean validarGuardar(List<SubArea> SubAreas) throws Exception {
		Boolean estaValidado=true;
		Boolean estaValidadoObjeto=false;
		
		for(SubArea subareaLocal:subareas) {				
			estaValidadoObjeto=this.validarGuardar(subareaLocal);
			
			if(!estaValidadoObjeto) {
				if(estaValidado) {
					estaValidado=false;
				}
			}
		}
		
		return estaValidado;
	}
	
	public void validarGuardarManejar(List<SubArea> SubAreas) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(subareas)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void validarGuardarManejar(SubArea SubArea) throws Exception {	
		if(Constantes2.IS_DEVELOPING_VALIDACION_DATOS_TRAER) {
			if(!this.validarGuardar(subarea)) {
				//SE GENERA EXCEPTION
				if(this.conMostrarMensajesStringBuilder) {
					this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
				}
			}
		}
	}
	
	public void guardarInvalidValues(SubArea subarea) throws Exception {
		String sCampo="";
		String sMensajeCampo="";
		String sMensaje="";
		String sIdMensaje="";
		
		sIdMensaje="\r\nID="+subarea.getId();
		sMensaje+=sIdMensaje;		
		
		
		if(!sMensaje.equals("")) {
			this.stringBuilder.append(sMensaje);	
		}		
	}	
	
	public void manejarMensajesStringBuilder(String sMensajeExcepcion) throws Exception {
		String sMensajeDetalleExcepcion="";
		
		sMensajeDetalleExcepcion=this.stringBuilder.toString();
		
		if(!sMensajeDetalleExcepcion.equals("")) {
			
			Funciones.manageException(logger,this.stringBuilder,this.datosCliente.getDatosExportar().getsPath(),"subarea","validar_datos");
			
			if(ConstantesMensajes.CON_MOSTRAR_MENSAJES_DETALLE) {
				throw new Exception(SubArea_util.S_CLASS_WEB_TITULO + sMensajeDetalleExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			} else {
				throw new Exception(SubArea_util.S_CLASS_WEB_TITULO + sMensajeExcepcion);//ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS
			}
		}
	}
	
	public void saveWithConnection()throws Exception {	
		try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-saveWithConnection");
			
			this.connexion.begin();			
			
			//SubArea_logic_add.checkSubAreaToSave(this.subarea,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SubArea_logic_add.updateSubAreaToSave(this.subarea,this.arrDatoGeneral);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.subarea,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			//TEMPORAL
			//this.getSetVersionRow();
			
			
			this.stringBuilder=new StringBuilder();
			
			if(SubArea_util.permiteMantenimiento(this.subarea) && this.validarGuardar(this.subarea)) {
				SubArea_data.save(this.subarea, connexion);	    	       	 
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}
			
			if(this.isConDeep) {
				this.deepSave(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				SubArea_util.refrescarFKsDescripciones(this.subarea);				
			}

			//SubArea_logic_add.checkSubAreaToSaveAfter(this.subarea,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SOLO FUNCIONA PARA ACTUALIZAR Y CON CONNEXION
			this.getSetVersionRow();
			
			this.connexion.commit();			
			
			if(this.subarea.getIsDeleted()) {
				this.subarea=null;
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
			
			//SubArea_logic_add.checkSubAreaToSave(this.subarea,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//SubArea_logic_add.updateSubAreaToSave(this.subarea,this.arrDatoGeneral);
			
			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),this.subarea,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
			
			
			this.stringBuilder=new StringBuilder();
			
			if(SubArea_util.permiteMantenimiento(this.subarea) && this.validarGuardar(this.subarea)) {			
				SubArea_data.save(this.subarea, connexion);	    	       	 			
			} else {
				//SE GENERA EXCEPTION
				if(this.invalidValues!=null && this.invalidValues.size()>0) {
					if(this.conMostrarMensajesStringBuilder) {
						this.manejarMensajesStringBuilder(ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONDATOS);	
					}
				}
			}

			if(this.isConDeep) {
				this.deepSave(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
			}
			
			if(this.isConDeepLoad) {
				this.deepLoad(this.subarea,this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases());
					
				SubArea_util.refrescarFKsDescripciones(this.subarea);				
			}
			
			//SubArea_logic_add.checkSubAreaToSaveAfter(this.subarea,this.datosCliente,connexion,this.arrDatoGeneral);
			
			if(this.subarea.getIsDeleted()) {
				this.subarea=null;
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-savesWithConnection");
			
			this.connexion.begin();			
			
			//SubArea_logic_add.checkSubAreaToSaves(subareas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			//TEMPORAL
			//this.getSetVersionRows();
			
			Boolean validadoTodosSubArea=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(SubArea subareaLocal:subareas) {		
				
				if(!SubArea_util.permiteMantenimiento(subareaLocal)) {
					continue;
				}
				
				//SubArea_logic_add.updateSubAreaToSave(subareaLocal,this.arrDatoGeneral);
	        	
				SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),subareaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(subareaLocal)) {
					SubArea_data.save(subareaLocal, connexion);				
				} else {
					validadoTodosSubArea=false;
				}
			}
			
			if(!validadoTodosSubArea) {
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
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}
			
			//SubArea_logic_add.checkSubAreaToSavesAfter(subareas,this.datosCliente,connexion,this.arrDatoGeneral);
					
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
			//SubArea_logic_add.checkSubAreaToSaves(subareas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			Boolean validadoTodosSubArea=true;
			this.stringBuilder=new StringBuilder();
			
	   		for(SubArea subareaLocal:subareas) {				
				if(!SubArea_util.permiteMantenimiento(subareaLocal)) {
					continue;
				}
				
				//SubArea_logic_add.updateSubAreaToSave(subareaLocal,this.arrDatoGeneral);
	        	
				SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),subareaLocal,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());
	   
				
				if(this.validarGuardar(subareaLocal)) {				
					SubArea_data.save(subareaLocal, connexion);				
				} else {
					validadoTodosSubArea=false;
				}
			}
			
			if(!validadoTodosSubArea) {
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
				
				SubArea_util.refrescarFKsDescripciones(this.subareas);
			}

			//SubArea_logic_add.checkSubAreaToSavesAfter(subareas,this.datosCliente,connexion,this.arrDatoGeneral);
			
			this.quitarsEliminados();
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public SubArea_param_return procesarAccions(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<SubArea> subareas,SubArea_param_return subareaParameterGeneral)throws Exception {
		 try {	
			SubArea_param_return subareaReturnGeneral=new SubArea_param_return();
	
			
			return subareaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
	
	public SubArea_param_return procesarAccionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,String sProceso,List<SubArea> subareas,SubArea_param_return subareaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-procesarAccionsWithConnection");
			
			this.connexion.begin();			
			
			SubArea_param_return subareaReturnGeneral=new SubArea_param_return();
	
			
			this.connexion.commit();
			
			return subareaReturnGeneral;
			
		} catch(Exception e) {
			
			this.connexion.rollback();
			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public SubArea_param_return procesarEventos(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<SubArea> subareas,SubArea subarea,SubArea_param_return subareaParameterGeneral,Boolean isEsNuevoSubArea,ArrayList<Classe> clases)throws Exception {
		 try {	
			SubArea_param_return subareaReturnGeneral=new SubArea_param_return();
	
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				subareaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			return subareaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			;
		}
	}
		
	public SubArea_param_return procesarEventosWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,Opcion opcionActual,Usuario usuarioActual,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,List<SubArea> subareas,SubArea subarea,SubArea_param_return subareaParameterGeneral,Boolean isEsNuevoSubArea,ArrayList<Classe> clases)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-procesarEventosWithConnection");
			
			this.connexion.begin();			
			
			SubArea_param_return subareaReturnGeneral=new SubArea_param_return();
	
			subareaReturnGeneral.setSubArea(subarea);
			
			//SI ES PARA FORMULARIO-> NUEVO PREPARAR, RECARGAR POR DEFECTO FORMULARIO (PARA MANEJAR VALORES POR DEFECTO)
			if(eventoGlobalTipo.equals(EventoGlobalTipo.FORM_RECARGAR) && controlTipo.equals(ControlTipo.FORM) 
				&& eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW) 
				&& sTipo.equals("FORM")) {
				
				subareaReturnGeneral.setConRecargarPropiedades(true);
			}
			
			
			this.connexion.commit();
			
			return subareaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public SubArea_param_return procesarImportacionsWithConnection(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,List<DatoGeneralMinimo> datoGeneralMinimos,SubArea_param_return subareaParameterGeneral)throws Exception {				
		 try {	
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-procesarImportacionsWithConnection");
			
			this.connexion.begin();			
			
			SubArea_param_return subareaReturnGeneral=new SubArea_param_return();
			
			Boolean esPrimero=true;			
			Boolean conColumnasBase=true;//SIEMPRE
			String sDelimiter=Funciones2.getTipoDelimiter(parametroGeneralUsuario);
			String sLinea="";
			String[] arrColumnas=null;//new String[5];
			Integer iColumn=0;			
			
			this.subareas=new ArrayList<SubArea>();
			
			for(DatoGeneralMinimo datoGeneralMinimo:datoGeneralMinimos) {
				
				iColumn=0;
				
				if(esPrimero && parametroGeneralUsuario.getcon_exportar_cabecera()) {
					esPrimero=false;
					continue;
				}
				
				sLinea=datoGeneralMinimo.getsDescripcion();
				arrColumnas=sLinea.split(sDelimiter);
				
				this.subarea=new SubArea();
				
				
				if(conColumnasBase) {this.subarea.setId(Long.parseLong(arrColumnas[iColumn++]));}

				if(parametroGeneralUsuario.getcon_exportar_campo_version()){
				this.subarea.setVersionRow(Timestamp.valueOf(arrColumnas[iColumn++]));
				}

				this.subarea.setnombre(arrColumnas[iColumn++]);
				
				this.subareas.add(this.subarea);
				
			}
			
			this.saves();
			
			this.connexion.commit();
			
			subareaReturnGeneral.setConRetornoEstaProcesado(true);
			subareaReturnGeneral.setsMensajeProceso("IMPORTADO CORRECTAMENTE");
			
			return subareaReturnGeneral;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();
		}
	}
	
	public void quitarsEliminados() throws Exception {				
		
		List<SubArea> subareasAux= new ArrayList<SubArea>();
		
		for(SubArea subarea:subareas) {
			if(!subarea.getIsDeleted()) {
				subareasAux.add(subarea);
			}
		}
		
		subareas=subareasAux;
	}
	
	public void quitarsNulos() throws Exception {				
		
		List<SubArea> subareasAux= new ArrayList<SubArea>();
		
		for(SubArea subarea : this.subareas) {
			if(subarea==null) {
				subareasAux.add(subarea);
			}
		}
		
		//this.subareas=subareasAux;
		
		this.subareas.removeAll(subareasAux);
	}
	
	public void getSetVersionRowWithConnection()throws Exception {	
		//VERIFICA EL OBJETO NO IMPORTA ESTADO			
		if(subarea.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {
		  	//TEMPORAL
			//if((subarea.getIsDeleted() || (subarea.getIsChanged()&&!subarea.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=null;
			
			try {	
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();					
				
				timestamp=subareaDataAccess.getSetVersionRow(connexion,subarea.getId());
				
				if(!subarea.getVersionRow().equals(timestamp)) {	
					subarea.setVersionRow(timestamp);
				}
				
				this.connexion.commit();									
				
				subarea.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				this.connexion.rollback();			
				
				throw e;
				
	      	} finally {
				this.connexion.close();			
			}
		}
	}
	
	private void getSetVersionRow()throws Exception {	
		
		if(subarea.getIsChangedAuxiliar() && Constantes.IS_SET_VERSION_ROW_UPDATE) {		
		//TEMPORAL
		//if((subarea.getIsDeleted() || (subarea.getIsChanged()&&!subarea.getIsNew()))&& Constantes.IS_SET_VERSION_ROW_UPDATE) {
			Timestamp timestamp=subareaDataAccess.getSetVersionRow(connexion,subarea.getId());
			
			try {							
				if(!subarea.getVersionRow().equals(timestamp)) {	
					subarea.setVersionRow(timestamp);
				}
				
				subarea.setIsChangedAuxiliar(false);
				
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public void getSetVersionRowsWithConnection()throws Exception {	
		if(subareas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {
				Timestamp timestamp=null;
				
				this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory);
				
				this.connexion.begin();
				
				for(SubArea subareaAux:subareas) {
					//VERIFICA EL OBJETO NO IMPORTA ESTADO										
					//if(subareaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(subareaAux.getIsDeleted() || (subareaAux.getIsChanged()&&!subareaAux.getIsNew())) {
						
						timestamp=subareaDataAccess.getSetVersionRow(connexion,subareaAux.getId());
						
						if(!subarea.getVersionRow().equals(timestamp)) {	
							subareaAux.setVersionRow(timestamp);
						}
								
						subareaAux.setIsChangedAuxiliar(false);														
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
		if(subareas!=null && Constantes.IS_SET_VERSION_ROW_UPDATE)	{
			
			try {	
				Timestamp timestamp=null;
				
				for(SubArea subareaAux:subareas) {
					if(subareaAux.getIsChangedAuxiliar()) {
					//TEMPORAL
					//if(subareaAux.getIsDeleted() || (subareaAux.getIsChanged()&&!subareaAux.getIsNew())) {
						
						timestamp=subareaDataAccess.getSetVersionRow(connexion,subareaAux.getId());
						
						if(!subareaAux.getVersionRow().equals(timestamp)) {	
							subareaAux.setVersionRow(timestamp);
						}
						
													
						subareaAux.setIsChangedAuxiliar(false);														
					}
				}
					
			} catch(Exception e) {
				throw e;
				
	      	} finally {
				;			
			}
		}
	}
	
	public SubArea_param_return cargarCombosLoteFKWithConnection(String finalQueryGlobalArea) throws Exception {
		SubArea_param_return  subarea_return =new SubArea_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-cargarCombosLoteForeignKeySubAreaWithConnection");
			
			this.connexion.begin();
			
			subarea_return =new SubArea_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			subarea_return.setareasFK(areasForeignKey);

			
			this.connexion.commit();			
			
		} catch(Exception e) {
			this.connexion.rollback();			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			this.connexion.close();	
		}
		
		return subarea_return;
	}
	
	public SubArea_param_return cargarCombosLoteFK(String finalQueryGlobalArea) throws Exception {
		SubArea_param_return  subarea_return =new SubArea_param_return();
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		ArrayList<String> arrClasses=new ArrayList<String>();
		Classe classe=new Classe();
		DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");
		
		try {						
			subarea_return =new SubArea_param_return();
			
			

			List<Area> areasForeignKey=new ArrayList<Area>();
			Area_logic areaLogic=new Area_logic();
			areaLogic.setConnexion(this.connexion);
			areaLogic.getAreaDataAccess().setIsForFKData(true);

			if(!finalQueryGlobalArea.equals("NONE")) {
				areaLogic.getTodos(finalQueryGlobalArea,new Pagination());
				areasForeignKey=areaLogic.getAreas();
			}

			subarea_return.setareasFK(areasForeignKey);
						
			
		} catch(Exception e) {			
			Funciones.manageException(logger,e);
			throw e;
			
      	} finally {
			
		}
		
		return subarea_return;
	}
	
	public void cargarRelacionesLoteFKWithConnection() throws Exception {
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		
			VerboIrregular_logic verboirregularLogic=new VerboIrregular_logic();
			Expresion_logic expresionLogic=new Expresion_logic();
			VerboCompuesto_logic verbocompuestoLogic=new VerboCompuesto_logic();
			Vocabulario_logic vocabularioLogic=new Vocabulario_logic();
		
		try {
			
			this.connexion=this.connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-cargarRelacionesLoteForeignKeySubAreaWithConnection");
			
			this.connexion.begin();
			
			
			classes.add(new Classe(VerboIrregular.class));
			classes.add(new Classe(Expresion.class));
			classes.add(new Classe(VerboCompuesto.class));
			classes.add(new Classe(Vocabulario.class));
											
			

			verboirregularLogic.setConnexion(this.getConnexion());
			verboirregularLogic.setDatosCliente(this.datosCliente);
			verboirregularLogic.setIsConRefrescarForeignKeys(true);

			expresionLogic.setConnexion(this.getConnexion());
			expresionLogic.setDatosCliente(this.datosCliente);
			expresionLogic.setIsConRefrescarForeignKeys(true);

			verbocompuestoLogic.setConnexion(this.getConnexion());
			verbocompuestoLogic.setDatosCliente(this.datosCliente);
			verbocompuestoLogic.setIsConRefrescarForeignKeys(true);

			vocabularioLogic.setConnexion(this.getConnexion());
			vocabularioLogic.setDatosCliente(this.datosCliente);
			vocabularioLogic.setIsConRefrescarForeignKeys(true);
			
			this.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
			
			for(SubArea subarea:this.subareas) {
				

				classes=new ArrayList<Classe>();
				classes=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verboirregularLogic.setVerboIrregulars(subarea.verboirregulars);
				verboirregularLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				expresionLogic.setExpresions(subarea.expresions);
				expresionLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				verbocompuestoLogic.setVerboCompuestos(subarea.verbocompuestos);
				verbocompuestoLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");

				classes=new ArrayList<Classe>();
				classes=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);

				vocabularioLogic.setVocabularios(subarea.vocabularios);
				vocabularioLogic.deepLoads(false, DeepLoadType.INCLUDE, classes, "");
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
	
	public void deepLoad(SubArea subarea,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {
		Boolean existe=false;
		
		try {
			//SubArea_logic_add.updateSubAreaToGet(subarea,this.arrDatoGeneral);
			
if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
		subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));
		subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));
		subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));
		subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
				continue;
			}

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));

				if(this.isConDeep) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(this.connexion);
					verboirregularLogic.setVerboIrregulars(subarea.getVerboIrregulars());
					ArrayList<Classe> classesLocal=VerboIrregular_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verboirregularLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboIrregular_util.refrescarFKsDescripciones(verboirregularLogic.getVerboIrregulars());
					subarea.setVerboIrregulars(verboirregularLogic.getVerboIrregulars());
				}

				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));

				if(this.isConDeep) {
					Expresion_logic expresionLogic= new Expresion_logic(this.connexion);
					expresionLogic.setExpresions(subarea.getExpresions());
					ArrayList<Classe> classesLocal=Expresion_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					expresionLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Expresion_util.refrescarFKsDescripciones(expresionLogic.getExpresions());
					subarea.setExpresions(expresionLogic.getExpresions());
				}

				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));

				if(this.isConDeep) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(this.connexion);
					verbocompuestoLogic.setVerboCompuestos(subarea.getVerboCompuestos());
					ArrayList<Classe> classesLocal=VerboCompuesto_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					verbocompuestoLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					VerboCompuesto_util.refrescarFKsDescripciones(verbocompuestoLogic.getVerboCompuestos());
					subarea.setVerboCompuestos(verbocompuestoLogic.getVerboCompuestos());
				}

				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));

				if(this.isConDeep) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(this.connexion);
					vocabularioLogic.setVocabularios(subarea.getVocabularios());
					ArrayList<Classe> classesLocal=Vocabulario_util.getClassesFKsOf(new ArrayList<Classe>(),DeepLoadType.NONE);
					vocabularioLogic.deepLoads(false,DeepLoadType.INCLUDE, classesLocal,"");
					Vocabulario_util.refrescarFKsDescripciones(vocabularioLogic.getVocabularios());
					subarea.setVocabularios(vocabularioLogic.getVocabularios());
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
			subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
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
			subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));
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
			subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));
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
			subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));
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
			subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));
		}
	}
}
else {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(subarea.getArea(),isDeep,deepLoadType,clases);
				

		subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));

		for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
		}

		subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));

		for(Expresion expresion:subarea.getExpresions()) {
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
		}

		subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));

		for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
		}

		subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));

		for(Vocabulario vocabulario:subarea.getVocabularios()) {
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepLoad(subarea.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}

			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));

				for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
					verboirregularLogic.deepLoad(verboirregular,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));

				for(Expresion expresion:subarea.getExpresions()) {
					Expresion_logic expresionLogic= new Expresion_logic(connexion);
					expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));

				for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
					verbocompuestoLogic.deepLoad(verbocompuesto,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;
				subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));

				for(Vocabulario vocabulario:subarea.getVocabularios()) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
					vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
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
			subarea.setArea(subareaDataAccess.getArea(connexion,subarea));
			Area_logic areaLogic= new Area_logic(connexion);
			areaLogic.deepLoad(subarea.getArea(),isDeep,deepLoadType,clases);
				
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
			subarea.setVerboIrregulars(subareaDataAccess.getVerboIrregulars(connexion,subarea));

			for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
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
			subarea.setExpresions(subareaDataAccess.getExpresions(connexion,subarea));

			for(Expresion expresion:subarea.getExpresions()) {
				Expresion_logic expresionLogic= new Expresion_logic(connexion);
				expresionLogic.deepLoad(expresion,isDeep,deepLoadType,clases);
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
			subarea.setVerboCompuestos(subareaDataAccess.getVerboCompuestos(connexion,subarea));

			for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
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
			subarea.setVocabularios(subareaDataAccess.getVocabularios(connexion,subarea));

			for(Vocabulario vocabulario:subarea.getVocabularios()) {
				Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
				vocabularioLogic.deepLoad(vocabulario,isDeep,deepLoadType,clases);
			}
		}
	}
}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
  		}		
	}
	
	public void deepSave(SubArea subarea,Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases)throws Exception {		
		Boolean existe=false;		
		try {
			//SubArea_logic_add.updateSubAreaToSave(subarea,this.arrDatoGeneral);
			
SubArea_data.save(subarea, connexion);

if(!isDeep) {

	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(subarea.getArea(),connexion);

		for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
			verboirregular.setid_sub_area(subarea.getId());
			VerboIrregular_data.save(verboirregular,connexion);
		}

		for(Expresion expresion:subarea.getExpresions()) {
			expresion.setid_sub_area(subarea.getId());
			Expresion_data.save(expresion,connexion);
		}

		for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
			verbocompuesto.setid_sub_area(subarea.getId());
			VerboCompuesto_data.save(verbocompuesto,connexion);
		}

		for(Vocabulario vocabulario:subarea.getVocabularios()) {
			vocabulario.setid_sub_area(subarea.getId());
			Vocabulario_data.save(vocabulario,connexion);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(subarea.getArea(),connexion);
				continue;
			}


			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
					verboirregular.setid_sub_area(subarea.getId());
					VerboIrregular_data.save(verboirregular,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Expresion expresion:subarea.getExpresions()) {
					expresion.setid_sub_area(subarea.getId());
					Expresion_data.save(expresion,connexion);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
					verbocompuesto.setid_sub_area(subarea.getId());
					VerboCompuesto_data.save(verbocompuesto,connexion);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Vocabulario vocabulario:subarea.getVocabularios()) {
					vocabulario.setid_sub_area(subarea.getId());
					Vocabulario_data.save(vocabulario,connexion);
				}
				continue;
			}
		}
	}

	}
else {
	if(deepLoadType.equals(DeepLoadType.NONE)) {

		Area_data.save(subarea.getArea(),connexion);
		Area_logic areaLogic= new Area_logic(connexion);
		areaLogic.deepLoad(subarea.getArea(),isDeep,deepLoadType,clases);
				

		for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
			VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
			verboirregular.setid_sub_area(subarea.getId());
			VerboIrregular_data.save(verboirregular,connexion);
			verboirregularLogic.deepSave(verboirregular,isDeep,deepLoadType,clases);
		}

		for(Expresion expresion:subarea.getExpresions()) {
			Expresion_logic expresionLogic= new Expresion_logic(connexion);
			expresion.setid_sub_area(subarea.getId());
			Expresion_data.save(expresion,connexion);
			expresionLogic.deepSave(expresion,isDeep,deepLoadType,clases);
		}

		for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
			VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
			verbocompuesto.setid_sub_area(subarea.getId());
			VerboCompuesto_data.save(verbocompuesto,connexion);
			verbocompuestoLogic.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
		}

		for(Vocabulario vocabulario:subarea.getVocabularios()) {
			Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
			vocabulario.setid_sub_area(subarea.getId());
			Vocabulario_data.save(vocabulario,connexion);
			vocabularioLogic.deepSave(vocabulario,isDeep,deepLoadType,clases);
		}
	}
	 else 	if(deepLoadType.equals(DeepLoadType.INCLUDE)) {

		for(Classe clas:clases) {
			if(clas.clas.equals(Area.class)) {
				Area_data.save(subarea.getArea(),connexion);
				Area_logic areaLogic= new Area_logic(connexion);
				areaLogic.deepSave(subarea.getArea(),isDeep,deepLoadType,clases);				
				continue;
			}


			if(clas.clas.equals(VerboIrregular.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboIrregular verboirregular:subarea.getVerboIrregulars()) {
					VerboIrregular_logic verboirregularLogic= new VerboIrregular_logic(connexion);
					verboirregular.setid_sub_area(subarea.getId());
					VerboIrregular_data.save(verboirregular,connexion);
					verboirregularLogic.deepSave(verboirregular,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Expresion.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Expresion expresion:subarea.getExpresions()) {
					Expresion_logic expresionLogic= new Expresion_logic(connexion);
					expresion.setid_sub_area(subarea.getId());
					Expresion_data.save(expresion,connexion);
					expresionLogic.deepSave(expresion,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(VerboCompuesto.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(VerboCompuesto verbocompuesto:subarea.getVerboCompuestos()) {
					VerboCompuesto_logic verbocompuestoLogic= new VerboCompuesto_logic(connexion);
					verbocompuesto.setid_sub_area(subarea.getId());
					VerboCompuesto_data.save(verbocompuesto,connexion);
					verbocompuestoLogic.deepSave(verbocompuesto,isDeep,deepLoadType,clases);
				}
				continue;
			}

			if(clas.clas.equals(Vocabulario.class)&&clas.blnActivo) {
				clas.blnActivo=false;

				for(Vocabulario vocabulario:subarea.getVocabularios()) {
					Vocabulario_logic vocabularioLogic= new Vocabulario_logic(connexion);
					vocabulario.setid_sub_area(subarea.getId());
					Vocabulario_data.save(vocabulario,connexion);
					vocabularioLogic.deepSave(vocabulario,isDeep,deepLoadType,clases);
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
			this.getNewConnexionToDeep(SubArea.class.getSimpleName()+"-deepLoadWithConnection");
			
			this.deepLoad(subarea,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				SubArea_util.refrescarFKsDescripciones(subarea);
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
			this.deepLoad(this.subarea,isDeep,deepLoadType,clases);	
			
			if(this.isConRefrescarForeignKeys) {
				SubArea_util.refrescarFKsDescripciones(this.subarea);
			}
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
			
  		}
	}
	
	public void deepLoadsWithConnection(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje)throws Exception {		
		try {
			this.getNewConnexionToDeep(SubArea.class.getSimpleName()+"-deepLoadsWithConnection");
			
			if(subareas!=null) {
				for(SubArea subarea:subareas) {
					this.deepLoad(subarea,isDeep,deepLoadType,clases);
				}	
				
				if(this.isConRefrescarForeignKeys) {
					SubArea_util.refrescarFKsDescripciones(subareas);
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
			if(subareas!=null) {
				for(SubArea subarea:subareas) {
					this.deepLoad(subarea,isDeep,deepLoadType,clases);
				}	
						
				if(this.isConRefrescarForeignKeys) {
					SubArea_util.refrescarFKsDescripciones(subareas);
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
			this.getNewConnexionToDeep(SubArea.class.getSimpleName()+"-deepSaveWithConnection");
			
			this.deepSave(subarea,isDeep,deepLoadType,clases);	
			
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
			this.getNewConnexionToDeep(SubArea.class.getSimpleName()+"-deepSavesWithConnection");
			
			if(subareas!=null) {
				for(SubArea subarea:subareas) {
					this.deepSave(subarea,isDeep,deepLoadType,clases);
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
			if(subareas!=null) {
				for(SubArea subarea:subareas) {
					this.deepSave(subarea,isDeep,deepLoadType,clases);
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
			this.connexion=connexion.getNewConnexion(this.connexionType,this.parameterDbType,this.entityManagerFactory,SubArea.class.getSimpleName()+"-getBusquedaIndice");
			this.connexion.begin();

			QueryWhereSelectParameters queryWhereSelectParameters=new QueryWhereSelectParameters(ParameterDbType.MYSQL,"");

			queryWhereSelectParameters.setPagination(pagination);
			queryWhereSelectParameters.setFinalQuery(sFinalQuery);

			ParameterSelectionGeneral parameterSelectionGeneralidArea= new ParameterSelectionGeneral();
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,SubArea_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			subareas=subareaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
			parameterSelectionGeneralidArea.setParameterSelectionGeneralEqual(ParameterType.LONG,id_area,SubArea_util.IDAREA,ParameterTypeOperator.NONE);
			queryWhereSelectParameters.addParameter(parameterSelectionGeneralidArea);

			SubArea_logic.registrarAuditoria(this.connexion,datosCliente.getIdUsuario(),"FK_IdArea","",queryWhereSelectParameters,datosCliente.getsUsuarioPC(),datosCliente.getsNamePC(),datosCliente.getsIPPC());

			subareas=subareaDataAccess.getEntities(connexion,queryWhereSelectParameters);


			if(this.isConDeep) {
				this.deepLoads(this.datosDeep.getIsDeep(),this.datosDeep.getDeepLoadType(), this.datosDeep.getClases(),this.datosDeep.getSTituloMensaje());

				SubArea_util.refrescarFKsDescripciones(this.subareas);
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
			if(SubArea_util.IS_CON_AUDITORIA) {
				String sDetalleBusqueda=sDetalleProcesoBusqueda+Funciones.getDetalleBusqueda(queryWhereSelectParameters);
				
				////auditoriaLogicAdditional.registrarNuevaAuditoriaBusqueda(Constantes.LIDSISTEMAACTUAL,idUsuario,SubAreaDataAccess.TABLENAME, 0L, Constantes.SAUDITORIABUSCAR,sProcesoBusqueda,sUsuarioPC,sNamePC,sIPPC,new Date(),sDetalleBusqueda);														
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
	
	public static void registrarAuditoria(Connexion connexion,Long idUsuario,SubArea subarea,String sUsuarioPC,String sNamePC,String sIPPC)throws Exception {
		////Auditoria_logic_add auditoriaLogicAdditional=new Auditoria_logic_add();
		////auditoriaLogicAdditional.setConnexion(connexion);
		////AuditoriaDataAccess.SCHEMA="bydan_ingles";
		
		try {
			if(SubArea_util.IS_CON_AUDITORIA) {
				if(subarea.getIsNew()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SubAreaDataAccess.TABLENAME, subarea.getId(), Constantes.SAUDITORIAINSERTAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(SubArea_util.IS_CON_AUDITORIA_DETALLE) {
						////SubArea_logic.registrarAuditoriaDetalles(connexion,subarea,auditoriaLogicAdditional.getAuditoria());
					}
				} else if(subarea.getIsDeleted()) {
					/*if(!subarea.getIsExpired()) {
						////auditoriaLogicAdditional.RegistrarNuevaAuditoria(Constantes.getLOidSistemaActual(),idUsuario,SubAreaDataAccess.TABLENAME, subarea.getId(), Constantes.getSAuditoriaEliminarLogicamente(),"",sUsuarioPC,sNamePC,sIPPC,Timestamp.valueOf(Funciones.getStringMySqlCurrentDateTime()),"");
						////SubArea_logic.registrarAuditoriaDetalles(connexion,subarea,auditoriaLogicAdditional.getAuditoria());
					} else {*/
						////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SubAreaDataAccess.TABLENAME, subarea.getId(), Constantes.SAUDITORIAELIMINARFISICAMENTE,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					//}
				} else if(subarea.getIsChanged()) {
					////auditoriaLogicAdditional.registrarNuevaAuditoria(Constantes.LIDSISTEMAACTUAL,idUsuario,SubAreaDataAccess.TABLENAME, subarea.getId(), Constantes.SAUDITORIAACTUALIZAR,"",sUsuarioPC,sNamePC,sIPPC,new Date(),"");
					
					if(SubArea_util.IS_CON_AUDITORIA_DETALLE) {
						////SubArea_logic.registrarAuditoriaDetalles(connexion,subarea,auditoriaLogicAdditional.getAuditoria());
					}
				}
			}
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}		
	}
		private static void registrarAuditoriaDetalles(Connexion connexion,SubArea subarea)throws Exception {		
		////AuditoriaDetalle_logic_add auditoriaDetalleLogicAdditional= new AuditoriaDetalle_logic_add(); 
		////auditoriaDetalleLogicAdditional.setConnexion(connexion);
		////AuditoriaDetalle_data.SCHEMA="bydan_ingles";
		
		String strValorActual=null;
		String strValorNuevo=null;
		
			
			if(subarea.getIsNew()||!subarea.getid_area().equals(subarea.getSubAreaOriginal().getid_area()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(subarea.getSubAreaOriginal().getid_area()!=null)
				{
					strValorActual=subarea.getSubAreaOriginal().getid_area().toString();
				}
				if(subarea.getid_area()!=null)
				{
					strValorNuevo=subarea.getid_area().toString() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SubAreaConstantesFunciones.IDAREA,strValorActual,strValorNuevo);
			}	
			
			if(subarea.getIsNew()||!subarea.getnombre().equals(subarea.getSubAreaOriginal().getnombre()))
			{
				strValorActual=null;
				strValorNuevo=null;

				if(subarea.getSubAreaOriginal().getnombre()!=null)
				{
					strValorActual=subarea.getSubAreaOriginal().getnombre();
				}
				if(subarea.getnombre()!=null)
				{
					strValorNuevo=subarea.getnombre() ;
				}

				////auditoriaDetalleLogicAdditional.registrarNuevaAuditoriaDetalle(auditoriaObj.getId(),SubAreaConstantesFunciones.NOMBRE,strValorActual,strValorNuevo);
			}	
	}
	
	
	
	
	
		
	
	
	

	public void saveRelacionesWithConnection(SubArea subarea,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<VerboCompuesto> verbocompuestos,List<Vocabulario> vocabularios) throws Exception {

		if(!subarea.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(subarea,verboirregulars,expresions,verbocompuestos,vocabularios,true);
		}
	}

	public void saveRelaciones(SubArea subarea,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<VerboCompuesto> verbocompuestos,List<Vocabulario> vocabularios)throws Exception {

		if(!subarea.getsType().contains(Constantes2.S_TOTALES)) {
			this.saveRelacionesBase(subarea,verboirregulars,expresions,verbocompuestos,vocabularios,false);
		}
	}

	public void saveRelacionesBase(SubArea subarea,List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<VerboCompuesto> verbocompuestos,List<Vocabulario> vocabularios,Boolean conConexion)throws Exception {
		try {
			if(conConexion) {this.getNewConnexionToDeep("SubArea-saveRelacionesWithConnection");}
	
			subarea.setVerboIrregulars(verboirregulars);
			subarea.setExpresions(expresions);
			subarea.setVerboCompuestos(verbocompuestos);
			subarea.setVocabularios(vocabularios);

			this.setSubArea(subarea);

			if(true) {

				//SubArea_logic_add.updateRelacionesToSave(subarea,this);

				if((subarea.getIsNew()||subarea.getIsChanged())&&!subarea.getIsDeleted()) {
					this.save();
					this.saveRelacionesDetalles(verboirregulars,expresions,verbocompuestos,vocabularios);

				} else if(subarea.getIsDeleted()) {
					this.saveRelacionesDetalles(verboirregulars,expresions,verbocompuestos,vocabularios);
					this.save();
				}

				//SubArea_logic_add.updateRelacionesToSaveAfter(subarea,this);

			} else {
				throw new Exception("LOS DATOS SON INVALIDOS");
			}

			if(conConexion) {this.connexion.commit();}

		} catch(Exception e) {
			
			VerboIrregular_util.InicializarGeneralEntityAuxiliares(verboirregulars,true,true);
			Expresion_util.InicializarGeneralEntityAuxiliares(expresions,true,true);
			VerboCompuesto_util.InicializarGeneralEntityAuxiliares(verbocompuestos,true,true);
			Vocabulario_util.InicializarGeneralEntityAuxiliares(vocabularios,true,true);

			if(conConexion){this.connexion.rollback();}
			Funciones.manageException(logger,e);
			throw e;

		} finally {
			if(conConexion){this.closeNewConnexionToDeep();}
		}
	}
	
	
	private void saveRelacionesDetalles(List<VerboIrregular> verboirregulars,List<Expresion> expresions,List<VerboCompuesto> verbocompuestos,List<Vocabulario> vocabularios)throws Exception {
		try {
	

			Long idSubAreaActual=this.getSubArea().getId();

			VerboIrregular_logic verboirregularLogic_Desde_SubArea=new VerboIrregular_logic();
			verboirregularLogic_Desde_SubArea.setVerboIrregulars(verboirregulars);

			verboirregularLogic_Desde_SubArea.setConnexion(this.getConnexion());
			verboirregularLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

			for(VerboIrregular verboirregular_Desde_SubArea:verboirregularLogic_Desde_SubArea.getVerboIrregulars()) {
				verboirregular_Desde_SubArea.setid_sub_area(idSubAreaActual);

				verboirregularLogic_Desde_SubArea.setVerboIrregular(verboirregular_Desde_SubArea);
				verboirregularLogic_Desde_SubArea.save();

				Long idVerboIrregularActual=verboirregular_Desde_SubArea.getId();

				VerboIrregularDetalle_logic verboirregulardetalleLogic_Desde_VerboIrregular=new VerboIrregularDetalle_logic();

				if(verboirregular_Desde_SubArea.getVerboIrregularDetalles()==null){
					verboirregular_Desde_SubArea.setVerboIrregularDetalles(new ArrayList<VerboIrregularDetalle>());
				}

				verboirregulardetalleLogic_Desde_VerboIrregular.setVerboIrregularDetalles(verboirregular_Desde_SubArea.getVerboIrregularDetalles());

				verboirregulardetalleLogic_Desde_VerboIrregular.setConnexion(this.getConnexion());
				verboirregulardetalleLogic_Desde_VerboIrregular.setDatosCliente(this.datosCliente);

				for(VerboIrregularDetalle verboirregulardetalle_Desde_VerboIrregular:verboirregulardetalleLogic_Desde_VerboIrregular.getVerboIrregularDetalles()) {
					verboirregulardetalle_Desde_VerboIrregular.setid_verbo_irregular(idVerboIrregularActual);
				}

				verboirregulardetalleLogic_Desde_VerboIrregular.saves();
			}


			Expresion_logic expresionLogic_Desde_SubArea=new Expresion_logic();
			expresionLogic_Desde_SubArea.setExpresions(expresions);

			expresionLogic_Desde_SubArea.setConnexion(this.getConnexion());
			expresionLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

			for(Expresion expresion_Desde_SubArea:expresionLogic_Desde_SubArea.getExpresions()) {
				expresion_Desde_SubArea.setid_sub_area(idSubAreaActual);

				expresionLogic_Desde_SubArea.setExpresion(expresion_Desde_SubArea);
				expresionLogic_Desde_SubArea.save();

				Long idExpresionActual=expresion_Desde_SubArea.getId();

				ExpresionDetalle_logic expresiondetalleLogic_Desde_Expresion=new ExpresionDetalle_logic();

				if(expresion_Desde_SubArea.getExpresionDetalles()==null){
					expresion_Desde_SubArea.setExpresionDetalles(new ArrayList<ExpresionDetalle>());
				}

				expresiondetalleLogic_Desde_Expresion.setExpresionDetalles(expresion_Desde_SubArea.getExpresionDetalles());

				expresiondetalleLogic_Desde_Expresion.setConnexion(this.getConnexion());
				expresiondetalleLogic_Desde_Expresion.setDatosCliente(this.datosCliente);

				for(ExpresionDetalle expresiondetalle_Desde_Expresion:expresiondetalleLogic_Desde_Expresion.getExpresionDetalles()) {
					expresiondetalle_Desde_Expresion.setid_expresion(idExpresionActual);
				}

				expresiondetalleLogic_Desde_Expresion.saves();
			}


			VerboCompuesto_logic verbocompuestoLogic_Desde_SubArea=new VerboCompuesto_logic();
			verbocompuestoLogic_Desde_SubArea.setVerboCompuestos(verbocompuestos);

			verbocompuestoLogic_Desde_SubArea.setConnexion(this.getConnexion());
			verbocompuestoLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

			for(VerboCompuesto verbocompuesto_Desde_SubArea:verbocompuestoLogic_Desde_SubArea.getVerboCompuestos()) {
				verbocompuesto_Desde_SubArea.setid_sub_area(idSubAreaActual);

				verbocompuestoLogic_Desde_SubArea.setVerboCompuesto(verbocompuesto_Desde_SubArea);
				verbocompuestoLogic_Desde_SubArea.save();

				Long idVerboCompuestoActual=verbocompuesto_Desde_SubArea.getId();

				VerboCompuestoDetalle_logic verbocompuestodetalleLogic_Desde_VerboCompuesto=new VerboCompuestoDetalle_logic();

				if(verbocompuesto_Desde_SubArea.getVerboCompuestoDetalles()==null){
					verbocompuesto_Desde_SubArea.setVerboCompuestoDetalles(new ArrayList<VerboCompuestoDetalle>());
				}

				verbocompuestodetalleLogic_Desde_VerboCompuesto.setVerboCompuestoDetalles(verbocompuesto_Desde_SubArea.getVerboCompuestoDetalles());

				verbocompuestodetalleLogic_Desde_VerboCompuesto.setConnexion(this.getConnexion());
				verbocompuestodetalleLogic_Desde_VerboCompuesto.setDatosCliente(this.datosCliente);

				for(VerboCompuestoDetalle verbocompuestodetalle_Desde_VerboCompuesto:verbocompuestodetalleLogic_Desde_VerboCompuesto.getVerboCompuestoDetalles()) {
					verbocompuestodetalle_Desde_VerboCompuesto.setid_verbo_compuesto(idVerboCompuestoActual);
				}

				verbocompuestodetalleLogic_Desde_VerboCompuesto.saves();
			}


			Vocabulario_logic vocabularioLogic_Desde_SubArea=new Vocabulario_logic();
			vocabularioLogic_Desde_SubArea.setVocabularios(vocabularios);

			vocabularioLogic_Desde_SubArea.setConnexion(this.getConnexion());
			vocabularioLogic_Desde_SubArea.setDatosCliente(this.datosCliente);

			for(Vocabulario vocabulario_Desde_SubArea:vocabularioLogic_Desde_SubArea.getVocabularios()) {
				vocabulario_Desde_SubArea.setid_sub_area(idSubAreaActual);

				vocabularioLogic_Desde_SubArea.setVocabulario(vocabulario_Desde_SubArea);
				vocabularioLogic_Desde_SubArea.save();

				Long idVocabularioActual=vocabulario_Desde_SubArea.getId();

				VocabularioDetalle_logic vocabulariodetalleLogic_Desde_Vocabulario=new VocabularioDetalle_logic();

				if(vocabulario_Desde_SubArea.getVocabularioDetalles()==null){
					vocabulario_Desde_SubArea.setVocabularioDetalles(new ArrayList<VocabularioDetalle>());
				}

				vocabulariodetalleLogic_Desde_Vocabulario.setVocabularioDetalles(vocabulario_Desde_SubArea.getVocabularioDetalles());

				vocabulariodetalleLogic_Desde_Vocabulario.setConnexion(this.getConnexion());
				vocabulariodetalleLogic_Desde_Vocabulario.setDatosCliente(this.datosCliente);

				for(VocabularioDetalle vocabulariodetalle_Desde_Vocabulario:vocabulariodetalleLogic_Desde_Vocabulario.getVocabularioDetalles()) {
					vocabulariodetalle_Desde_Vocabulario.setid_vocabulario(idVocabularioActual);
				}

				vocabulariodetalleLogic_Desde_Vocabulario.saves();
			}


		} catch(Exception e) {


			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	//IF MAX CODE
			
	public static ArrayList<Classe> getClassesFKsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=SubArea_util.getClassesFKsOf(classesP,deepLoadType);	
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	public static ArrayList<Classe> getClassesRelsOf(ArrayList<Classe> classesP,DeepLoadType deepLoadType)throws Exception {
		try {
			ArrayList<Classe> classes=SubArea_util.getClassesRelsOf(classesP,deepLoadType);				
			
			
			return classes;
			
		} catch(Exception e) {
			Funciones.manageException(logger,e);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	

	public void setSubArea(SubArea newSubArea) {
		this.subarea = newSubArea;
	}
	
	public SubArea_data getSubAreaDataAccess() {
		return subareaDataAccess;
	}
	
	public void setSubAreaDataAccess(SubArea_data newsubareaDataAccess) {
		this.subareaDataAccess = newsubareaDataAccess;
	}

	public void setSubAreas(List<SubArea> newSubAreas) {
		this.subareas = newSubAreas;
	}
	
	public Object getSubAreaObject() {	
		this.subareaObject=this.subareaDataAccess.getEntityObject();
		return this.subareaObject;
	}
		
	public void setSubAreaObject(Object newSubAreaObject) {
		this.subareaObject = newSubAreaObject;
	}
	
	public List<Object> getSubAreasObject() {		
		this.subareasObject=this.subareaDataAccess.getEntitiesObject();
		return this.subareasObject;
	}
		
	public void setSubAreasObject(List<Object> newSubAreasObject) {
		this.subareasObject = newSubAreasObject;
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
